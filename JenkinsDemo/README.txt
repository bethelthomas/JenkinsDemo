1️⃣ Install Jenkins, Git, Minikube, and kubectl
2️⃣ Run PowerShell as Admin and start Minikube:
    minikube start --driver=hyperv
    minikube docker-env | Invoke-Expression
3️⃣ Push JenkinsDemo folder to your GitHub:
    cd JenkinsDemo
    git init
    git add .
    git commit -m "Initial commit"
    git branch -M main
    git remote add origin https://github.com/bethelthomas/JenkinsDemo.git
    git push -u origin main
4️⃣ In Jenkins:
    - Create new Pipeline job
    - Select "Pipeline script from SCM"
    - SCM: Git → URL: https://github.com/bethelthomas/JenkinsDemo.git
    - Branch: main
    - Save and Build Now
5️⃣ To test:
    minikube service jenkins-demo-service
 