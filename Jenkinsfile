pipeline {
    agent any

    tools {
        maven 'maven3' // Make sure this matches your Maven Global Tool Configuration
        jdk 'java11'   // Make sure you have a JDK configured in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/kruthikav04/simple-java-app.git'
            }
        }

        stage('Build') {
            steps {
                // Clean and package the Maven project
                sh 'mvn clean package'
            }
        }

        stage('Run Application') {
            steps {
                // Run the generated JAR file
                sh 'java -jar target/simple-java-app-1.0-SNAPSHOT.jar'
            }
        }
    }

    post {
        always {
            echo 'Pipeline finished.'
        }
    }
}
