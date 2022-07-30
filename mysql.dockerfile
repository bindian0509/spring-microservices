FROM mysql:5.7

MAINTAINER bindian0509@gmail.com

ENV MYSQL_DATABASE "university"
ENV MYSQL_ROOT_PASSWORD "root"
ENV MYSQL_ROOT_HOST '%'

ADD ./data/university.db.sql /docker-entrypoint-initdb.d

EXPOSE 3306