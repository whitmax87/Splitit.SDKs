FROM maven:3.6.3-jdk-11

#COPY ./entrypoint.sh /entrypoint.sh

# Using docker to cache dependancy downloads
# They shouldn't change often, so this will speed up the process
WORKDIR /src/
COPY ./pom.xml .
RUN mvn clean package -Dmaven.main.skip -Dmaven.test.skip && rm -r target

# Building the library
COPY . .
RUN mvn clean package -Dmaven.test.skip

COPY ./entrypoint.sh /entrypoint.sh

ENTRYPOINT [ "/entrypoint.sh" ]