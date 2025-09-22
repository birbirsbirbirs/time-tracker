```shell
docker image tag time-tracker:2.0.0 sgrg007/time-tracker:2.0.0
```
```shell
docker image push sgrg007/time-tracker:2.0.0
```

```shell
docker run -e spring.datasource.url=jdbc:postgresql://192.168.0.54:5432/mydatabase \
  -e server.port=8081 \
  -p 8081:8081 \
  time-tracker:2.0.0 
```
---
### f server
```shell
docker run -d -e spring.datasource.url=jdbc:postgresql://192.168.0.216:5432/mydatabase \
  -e server.port=8080 \
  -p 8080:8080 \
  time-tracker:2.0.0 
```
