pipeline {
    agent any

    tools {
        maven "M3"
    }
    stages{
        stage("Git Clone"){
            steps{
            git  branch:"main",
            url: 'https://github.com/Sairam2317flutterDeveloper/SpringRestAPI.git'
        }
        }
        stage("Mvn Build"){
            steps{
                sh "mvn clean package"
            }
        }
        stage("Verify Dockerfile") {
    steps {
        sh "echo CURRENT_DIR:"
        sh "pwd"
        sh "echo FILES:"
        sh "ls -la"
        sh "echo SEARCH_DOCKERFILE:"
        sh "find . -name Dockerfile"
    }
}
         
         stage("Docker Image Build"){
            steps{
                sh "docker build -t spring:latest ."
            }
        }
         stage("Container Build"){
            steps{
                sh "docker stop springProject "
                sh "docker rm springProject"
                sh "docker run -d -p 8181:8080 --name springProject spring:latest"
            }
        }
    }
    post{
        success{
            echo "build suceessfully"
            echo "app is deployed int port 8181"
            
        }
        failure{
            echo "build failure"
            echo "check jenkins for the error explanation"
        }
    }
    
    
}
