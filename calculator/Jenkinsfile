pipeline {
    agent any 
    stages {
        stage('Compile') {
            steps {
                dir('calculator') {
                    sh 'mvn compile'
                }
            }
        }
        stage('Test') {
            steps {
                dir('calculator') {
                    sh 'mvn test'
                }
            }
        }
        stage('Package') {
            steps {
                dir('calculator') {
                    sh 'mvn package'
                }
            }
        }
    }
}