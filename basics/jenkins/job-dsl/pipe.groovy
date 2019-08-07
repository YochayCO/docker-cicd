pipelineJob('boilerplate-pipeline') {
    definition {
        cpsScm {
            cps {
                git('https://github.com/YochayCO/docker-cicd.git')
                script(readFileFromWorkspace('./basics/misc/Jenkinsfile'))
                sandbox()
            }
        }
    }
}