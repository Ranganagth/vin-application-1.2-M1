FROM openjdk:8 
EXPOSE 8081
ADD target/M1_Service_v1_2.jar M1_Service_v1_2.jar
ENTRYPOINT [ "java","-jar","/M1_Service_v1_2.jar"] 
