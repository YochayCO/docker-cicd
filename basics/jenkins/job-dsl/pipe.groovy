pipelineJob('boilerplate-pipeline') {
    def repo = 'https://github.com/YochayCO/docker-cicd.git'

    triggers {
        scm('H/5 * * * *')
    }

    definition {
        cpsScm {
            scm {
                git {
                    remote { url(repo) }
                    branches('master')
                    scriptPath('./basics/misc/Jenkinsfile')
                    extensions {}
                }
            }
        }
    }
}

pipelineJob('more-pipe') {
    def repo = 'https://github.com/YochayCO/docker-cicd.git'

    triggers {
        scm('H/5 * * * *')
    }

    definition {
        cpsScm {
            scm {
                git {
                    remote { url(repo) }
                    branches('master')
                    scriptPath('./basics/misc/Jenkinsfile.v2')
                    extensions {}
                }
            }
        }
    }
}