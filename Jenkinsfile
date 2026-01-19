pipeline {
    agent any

    tools {
        maven 'Maven3'
    }

    stages {
        stage('Checkout') {
            steps {
                echo '📥 Cloning repository...'
                checkout scm
            }
        }

        // ========== BUILD ==========
        stage('Build All Services') {
            parallel {
                stage('Build Anggota') {
                    steps {
                        dir('anggota') {
                            echo '🔨 Building Anggota Service...'
                            bat 'mvn clean package -DskipTests'
                        }
                    }
                }

                stage('Build Buku') {
                    steps {
                        dir('buku') {
                            echo '🔨 Building Buku Service...'
                            bat 'mvn clean package -DskipTests'
                        }
                    }
                }

                stage('Build Peminjaman') {
                    steps {
                        dir('peminjaman') {
                            echo '🔨 Building Peminjaman Service...'
                            bat 'mvn clean package -DskipTests'
                        }
                    }
                }

                stage('Build Pengembalian') {
                    steps {
                        dir('pengembalian') {
                            echo '🔨 Building Pengembalian Service...'
                            bat 'mvn clean package -DskipTests'
                        }
                    }
                }
            }
        }

        // ========== TEST ==========
        stage('Test All Services') {
            parallel {
                stage('Test Anggota') {
                    steps {
                        dir('anggota') {
                            echo '🧪 Testing Anggota Service...'
                            bat 'mvn test'
                        }
                    }
                }

                stage('Test Buku') {
                    steps {
                        dir('buku') {
                            echo '🧪 Testing Buku Service...'
                            bat 'mvn test'
                        }
                    }
                }

                stage('Test Peminjaman') {
                    steps {
                        dir('peminjaman') {
                            echo '🧪 Testing Peminjaman Service...'
                            bat 'mvn test'
                        }
                    }
                }

                stage('Test Pengembalian') {
                    steps {
                        dir('pengembalian') {
                            echo '🧪 Testing Pengembalian Service...'
                            bat 'mvn test'
                        }
                    }
                }
            }
        }
    }

    post {
        success {
            echo '✅ BUILD & TEST SUCCESSFUL'
        }
        failure {
            echo '❌ BUILD OR TEST FAILED'
        }
    }
}
