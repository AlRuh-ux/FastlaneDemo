pipeline {
    agent any

    stages {
        stage('Clone Repo') {
            steps {
                echo 'Cloning repository...'
            }
        }

        stage('Build App') {
            steps {
                echo 'Building Android app using Gradle...'
                bat 'gradlew assembleDebug'
            }
        }

        stage('Run Fastlane') {
            steps {
                echo 'Running Fastlane...'
                bat 'fastlane android build'
            }
        }

        stage('Archive APK') {
            steps {
                echo 'Saving APK as artifact...'
                archiveArtifacts artifacts: '**/*.apk', fingerprint: true
            }
        }
    }
}
