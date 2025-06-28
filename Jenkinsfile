pipeline {
    agent any

    environment {
        IMAGE_NAME = "vineeth9121/empmgntimg"
        TAG = "latest"
    }

    tools {
        maven 'maven'
    }

    stages {
        stage('Checkout Code') {
            steps {
                git url: 'https://github.com/vineeth11111/EmpMgntDockerJenkins.git', credentialsId: 'github-creds'
            }
        }

        stage('Build App') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t $IMAGE_NAME:$TAG .'
            }
        }

        stage('Push to Docker Hub') {
            steps {
                withDockerRegistry('', 'dockerhub-creds') {
                    sh 'docker push $IMAGE_NAME:$TAG'
                }
            }
        }

        stage('Deploy Container') {
            steps {
                sh '''
                    docker stop springboot-app || true
                    docker rm springboot-app || true
                    docker run -d -p 8080:8080 --name springboot-app $IMAGE_NAME:$TAG
                '''
            }
        }
    }
}
