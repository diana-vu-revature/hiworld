FROM postgres
ENV POSTGRES_USER hiworld
ENV POSTGRES_PASSWORD password
ADD app/src/main/resources/schema.sql /docker-entrypoint-initdb.docker
EXPOSE 5432