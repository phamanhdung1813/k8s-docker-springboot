FROM openjdk:8
EXPOSE 8080
ADD target/k8s-springboot-mysql.jar k8s-springboot-mysql.jar
ENTRYPOINT ["java","-jar","k8s-springboot-mysql.jar"]
