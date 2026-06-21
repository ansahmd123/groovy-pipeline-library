package com.calypso

class GitUtils {

    static String getBranchName(script) {
        return script.env.BRANCH_NAME ?: "local"
    }

    static String getCommitId(script) {
        return script.sh(
                script: "git rev-parse --short HEAD",
                returnStdout: true
        ).trim()
    }

}
