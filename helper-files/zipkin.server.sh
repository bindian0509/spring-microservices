# can be started as docker container
docker run -d -p 9411:9411 openzipkin/zipkin

# or via local java
curl -sSL https://zipkin.io/quickstart.sh | bash -s
java -jar zipkin.jar

# url - http://localhost:9411/zipkin/