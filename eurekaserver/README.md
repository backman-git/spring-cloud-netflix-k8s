## Image build step

```
./gradlew jib --image=tp6han/simple-eureka-server
```

## use minikube to run service and pods
```bash
kubectl apply -f deployments.yml

minikube ip
#192.168.99.101

kubectl get svc
#my-eureka-server   NodePort    10.101.144.186   <none>        8080:31969/TCP   3m35s

curl 192.168.99.101:31969
#or chebk it on browser
```