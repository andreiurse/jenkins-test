node {
   stage('Build') {
   checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/andreiurse/jenkins-test.git']]])
      // Run the maven build
      if (isUnix()) {
         sh "'${mvnHome}/bin/mvn' clean install"
      } else {
         bat(/"${mvnHome}\bin\mvn" clean install/)
      }
   }
   stage('Results') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archive 'target/*.jar'
   }
   stage('Upload to nexus') {
        currentBuild.result = 'SUCCESS'
        timeout(time: 10, unit: 'SECONDS') {
            input 'Publish to Nexus?'
        }
        nexusArtifactUploader artifacts: [[artifactId: 'jenkins-test', classifier: '', file: '\\target\\jenkins-test.war', type: 'war']],
                              credentialsId: '08bc4c16-10f0-499a-bad4-2daab5e0bc2e',
                              groupId: 'org.jenkins.test',
                              nexusUrl: 'localhost:8081',
                              nexusVersion: 'nexus3',
                              protocol: 'http',
                              repository: 'maven-test',
                              version: '2.1.' + env.BUILD_NUMBER
   }
}