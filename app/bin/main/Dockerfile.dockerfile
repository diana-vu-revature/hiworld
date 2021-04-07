FROM postgres
ENV POSTGRES_USER hiworld
ENV POSTGRES_PASSWORD password
COPY app/src/main/resources/schema.sql /docker-entrypoint-initdb.d/
EXPOSE 5432