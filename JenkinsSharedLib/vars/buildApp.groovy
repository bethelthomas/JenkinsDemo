def call() {
    echo "Building Docker image..."
    sh 'docker build -t bethelthomas/JenkinsDemo:latest .'
    echo "Pushing Docker image to Docker Hub..."
    sh 'docker push bethelthomas/JenkinsDemo:latest'
}