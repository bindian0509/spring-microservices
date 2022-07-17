cd ../eureka-server/  && mvn spring-boot:build-image && docker push docker.io/bindian0509/eureka-server

cd ../config-server/  && mvn spring-boot:build-image && docker push docker.io/bindian0509/config-server

cd ../api-gateway/  && mvn spring-boot:build-image && docker push docker.io/bindian0509/api-gateway

cd ../address-service/  && mvn spring-boot:build-image && docker push docker.io/bindian0509/address-service

cd ../student-service/  && mvn spring-boot:build-image && docker push docker.io/bindian0509/student-service

echo "you can run docker compose now"
