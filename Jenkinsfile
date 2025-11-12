@Library('sharedlib') _
pipeline {
    agent any
 
    stages {
        stage('Greet') {
            steps {
                sayHello('Bethel')
            }
        }
        stage('Build') {
            steps {
                buildApp()
            }
        }
        stage('Deploy') {
            steps {
                deployToK8s()
            }
        }
    }
}
