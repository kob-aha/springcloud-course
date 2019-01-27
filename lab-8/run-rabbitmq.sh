#!/bin/bash

#docker run -p 4369:4369/tcp \
#	-p 5671:5671/tcp \
#	-p 5672:5672/tcp \
#	-p 25672:25672/tcp \
#	-p 15672:15672 \
#	-d --rm --name some-rabbit rabbitmq:3

docker run -d --hostname my-rabbit --name some-rabbit -p 15672:15672 -p 5672:5672 rabbitmq:3-management
