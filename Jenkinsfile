pipeline {
    agent any
 tools {
        maven 'mvn'
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', credentialsId: 'git-token', url: 'https://github.com/ashinde90/sonar_demo.git'
            }
        }

        stage('SonarQube analysis') {
            steps {
                withSonarQubeEnv('sonar') {
                    sh 'mvn clean package sonar:sonar'
                }
            }
        }
        stage("Quality gate") {
            steps {
                timeout(time: 1, unit: 'MINUTES') {
                waitForQualityGate abortPipeline: true
              }
            }
        }
    }
}