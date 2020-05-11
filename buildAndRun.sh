#!/bin/sh
mvn clean package && docker build -t it.tss.pw/pw-diallo .
docker rm -f pw-diallo || true && docker run -d -p 8080:8080 -p 4848:4848 --name pw-diallo it.tss.pw/pw-diallo 
