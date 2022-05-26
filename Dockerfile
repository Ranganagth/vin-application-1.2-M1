FROM openjdk:8 
EXPOSE 8080
ADD target/M1_Service_v1_2.jar M1_Service_v1_2.jar
ENTRYPOINT [ "java","-jar","/m1_service_v1_2.jar"] 
