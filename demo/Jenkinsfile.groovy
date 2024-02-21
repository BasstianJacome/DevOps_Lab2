pipeline {

    agent any


    stages {
        stage('Build') {
            steps {
                // Checkout source code from repository
                checkout scm

                // Build Maven project
                sh 'mvn clean package'
            }


        }
    }
}