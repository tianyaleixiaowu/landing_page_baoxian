FROM daocloud.io/brave8/maven-jdk8

ADD landing_page_baoxian-0.0.1-SNAPSHOT.jar /tmp/app.jar
VOLUME /tmp
ENV LANG en_US.UTF-8
ENV LANGUAGE en_US:en
ENV LC_ALL en_US.UTF-8
ENV TZ Asia/Shanghai
EXPOSE 8080
ENTRYPOINT ["java","-jar","/tmp/app.jar"]