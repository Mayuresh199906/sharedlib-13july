def call(){
  def pom = readMavenPom file: 'pom.xml'
  def version = pom.version
  def repoName = "ai-leads"
  if(version.endsWith("SNAPSHOT")){
    repoName = "ai-leads-SNAPSHOT"
  }
  nexusArtifactUploader artifacts: [[artifactId: 'ai-leads', classifier: '', file: 'target/ai-leads.war', type: 'war']], credentialsId: 'newnexus', groupId: 'in.javahome', nexusUrl: '172.31.13.16:8081', nexusVersion: 'nexus3', protocol: 'http', repository: repoName , version: version       
}
