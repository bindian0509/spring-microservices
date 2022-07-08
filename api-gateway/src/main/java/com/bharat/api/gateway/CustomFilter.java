package com.bharat.api.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/*
 * @author bharat.verma
 * @created Friday, 08 July 2022
 */
@Configuration
public class CustomFilter implements GlobalFilter {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        logger.info("# this microservice was called : "+request.getURI());

        if(request.getURI().equals("/api/student")) {
            logger.info("# student microservice was called : "+request.getURI());
        }
        logger.info("# Pre Filter -> Authorization equals to : "+request.getHeaders().getFirst("Authorization"));
        return chain.filter(exchange).then(Mono.fromRunnable(()-> {
            ServerHttpResponse response = exchange.getResponse();
            logger.info("# Post Filter equals to : "+response.getStatusCode());
         }));
    }
}
