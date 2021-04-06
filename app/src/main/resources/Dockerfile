FROM postgres
ENV POSTGRES_USER hiworld
ENV POSTGRES_PASSWORD password
ADD schema.sql /docker-entrypoint-initdb.docker
EXPOSE 5432