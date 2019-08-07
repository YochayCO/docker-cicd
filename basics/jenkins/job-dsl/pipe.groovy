pipelineJob('boilerplate-pipeline') {
    def repo = 'https://github.com/YochayCO/docker-cicd.git'

    triggers {
        scm('H/5 * * * *')
    }

    definition {
        cpsScm {
            cps {
                git {
                    remote { url(repo) }
                    branches('master')
                    scriptPath('misc/Jenkinsfile')
                    extensions {}
                    // git('https://github.com/YochayCO/docker-cicd.git')
                    // script(readFileFromWorkspace('./basics/misc/Jenkinsfile'))
                }
            }
        }
    }
}