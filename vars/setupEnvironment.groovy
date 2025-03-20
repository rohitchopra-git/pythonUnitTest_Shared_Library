def call() {
            sh 'python3 -m venv venv'
            sh '. venv/bin/activate && pip install pytest pytest-html'
        }
