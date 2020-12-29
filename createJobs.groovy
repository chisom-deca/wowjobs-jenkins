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
                        url 'https://github.com/tardisone/Cortex-Viewjob-Backend-Client'
                    }
                    branch 'cortex-viewjob-backend-client-chisom-deca-check-permissions'
                }
            }
        }
    }
}