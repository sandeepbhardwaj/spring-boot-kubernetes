# spring-boot-kubernetes
Spring boot microservices on Kubernetes

Setup Environment
```
To be able to work with the docker daemon on your mac/linux host use the docker-env command in your shell:
$> eval $(minikube docker-env)

Create a namespace to work in that you can delete when finished to easily clean up
$> kubectl create namespace spring-cloud-on-kubernetes

Update your Kubernetes config to use this new namespace by default
$> kubectl config set-context $(kubectl config current-context) --namespace=spring-cloud-on-kubernetes

Create a Kubernetes deployment by running the kubectl create command 
$> kubectl create deployment <deployment-name> --image=<docker-image> 

Validate it with kubectl get all
$>kubectl get all

If you are running minikube you won’t get a real loadbalancer and can run minikube service example-service --url to get an IP/Port combo that should work
$> minikube service department-service --url
"OR"
$> minikube service list
```
Deploy project
```
$> kubectl create -f deploy/deployment.yml

$> kubectl get pods

$> kubectl get svc
```