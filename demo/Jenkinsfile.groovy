pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        // Add more stages as needed for deployment, testing, etc.
    }
}