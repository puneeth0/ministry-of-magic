pipeline {
    agent any
    tools{
        maven 'maven_3_8_8'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/puneeth0/ministry-of-magic']]])
                bat 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    bat 'docker build -t puneeth0/ministry-of-magic .'
                }
            }
        }
        stage('Push docker image to Hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhubpwd')]) {
                        bat 'docker login -u puneeth0 -p puni@P4175'
                    }
                    bat 'docker push puneeth0/ministry-of-magic'
                    }
                }
            }
        stage('Deploy to k8s'){
             steps{
                script{
                    kubernetesDeploy configs: 'deployment.yaml,service.yaml', kubeconfigId: 'k8sconfigpwd'
                }
             }
         }
    }
}