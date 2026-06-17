pipeline{
agent any
tools
{
maven "Maven"
}
stages{
stage("Checkpoint")
{
steps{
git branch:'master',url:'https://github.com/Samiksha201104/MyGuavaP.git'
}}
stage("Build")
{
steps{
sh 'mvn clean install'
}}
stage("test")
{
steps{
sh 'mvn test'
}}
stage('Run App')
{
steps
{
sh 'mvn exec:java -Dexec.mainClass="com.example" '
}}}
post
{
success{
echo 'Build success'
}
failure{
echo 'failure'
}}}
