def call(groupId,repoName,artifactId,version){
  sh"curl -u admin: admin -0 http://13.201.77.91:8081/repository/${repoName}/${groupId}/${artifactId}/${version}/${artifactId}.war"
}
