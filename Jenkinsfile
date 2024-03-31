pipeline {
    agent any
    stages {
        stage('Cleaning Stage') {
            steps {
                    bat "mvn clean"
            }
        }
        stage('Testing Stage') {
            steps {
                    bat "mvn test"
            }
        }
        stage('Packaging Stage') {
            steps {
                    bat "mvn package"
            }
        }
        stage('Consolidate Results Stage') {
            steps {
                    input("Do you want to capture the results?")
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archive 'target/*.jar'
            }
        }

        stage('Parallel Execution Stage') {
            steps {
                parallel(
                    a:{
                        bat "mvn package"
                    },
                    b:{
                        bat "mvn package"
                    },
                    c:{
                        bat "mvn package"
                    }                    
                )
            }
        }
    }
}
