@Library('sharedlib') _
sayHello('Bethel')
 
pipeline {
    agent any
 
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/bethelthomas/JenkinsDemo.git'
            }
        }
 
        stage('Build Docker Image') {
            steps {
                script {
                    echo "Connecting to Minikube Docker..."
                    bat 'minikube docker-env | powershell -Command Invoke-Expression'
                    echo "Building Docker image..."
                    bat 'docker build -t jenkins-demo-app:latest .'
                }
            }
        }
 
        stage('Deploy to Kubernetes') {
            steps {
                echo "Deploying to Minikube..."
                bat 'kubectl apply -f k8s-deployment.yaml'
            }
        }
 
        stage('Check Deployment') {
            steps {
                bat 'kubectl get pods'
                bat 'kubectl get svc'
            }
        }
    }
}