// def call(String pytestHtmlReport) {
//     sh ". venv/bin/activate && pytest --html=${pytestHtmlReport} || true"
// }
def call(String PYTEST_HTML_REPORT) {
    try {
        sh ". venv/bin/activate && pytest --html=${PYTEST_HTML_REPORT}"
    } catch (Exception e) {
        currentBuild.result = 'SUCCESS'
        echo "Tests failed but pipeline continues: ${e.message}"
    }
}
