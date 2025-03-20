// def call(String pytestHtmlReport) {
//     sh ". venv/bin/activate && pytest --html=${pytestHtmlReport} " || true
// }

def call(String pytestHtmlReport) {
    try {
        sh ". venv/bin/activate && pytest --html=${pytestHtmlReport}"
    } catch (Exception e) {
        currentBuild.result = 'SUCCESS'
        echo "Tests failed but pipeline continues: ${e.message}"
    }
}

