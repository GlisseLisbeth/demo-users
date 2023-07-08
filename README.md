# demo-users
App Demo with Docker, MySQL and Spring Boot Version Java 17 in Dockerfile optimized

**Important**
localhost -> host.docker.internal

**Deploying with Docker**
Create a docker image by using the docker build command

    docker build -t users .
Create a docker container by running

    docker run -p 8080:8080 users

  **Additional:**
**Deleting all containers in a stopped state**

    docker container prune

**Deleting all images**

    docker rmi $(docker images -a -q)
