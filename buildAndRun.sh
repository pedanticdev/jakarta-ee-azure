#!/bin/sh
mvn clean package && docker build -t com.pedantic/hello-jakarta-docker .
docker rm -f hello-jakarta-docker || true && docker run -d -p 8080:8080 -p 4848:4848 --name hello-jakarta-docker com.pedantic/hello-jakarta-docker 
