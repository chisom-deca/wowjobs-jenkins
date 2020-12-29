pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('Cortex-viewjob-Backend-Client-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'git@github.com:tardisone/Cortex-Viewjob-Backend-Client.git'
                    }
                    branch 'feature-jenkins '
                }
            }
        }
    }
}