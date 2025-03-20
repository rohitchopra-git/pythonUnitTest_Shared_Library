def call(String pytestHtmlReport) {
    sh ". venv/bin/activate && pip install pytest pytest --html=${pytestHtmlReport} || true"
}
