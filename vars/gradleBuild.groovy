def call() {

    echo "Building application..."

    sh "./gradlew clean build -x test"
}