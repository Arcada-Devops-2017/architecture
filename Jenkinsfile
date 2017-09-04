pipeline {
    agent any
    stages {
        stage('Deploy'){
            steps {
                sh '''
                    cd infra
                    aws cloudformation update-stack --stack-name infra --template-body file://stack.yml
                    aws cloudformation wait stack-update-complete --stack-name infra
                    ansible-playbook -i ec2.py setup.yml
                '''
            }
        }
    }
}