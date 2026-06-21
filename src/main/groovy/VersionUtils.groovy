
package com.calypso

class VersionUtils {

    static String generateVersion(script) {

        String buildNumber = script.env.BUILD_NUMBER ?: "0"

        String commitId = script.sh(
                script: "git rev-parse --short HEAD",
                returnStdout: true
        ).trim()

        return "1.0.${buildNumber}-${commitId}"
    }

    static void createTag(script, String version) {

        script.sh """
            git tag ${version}
        """
    }

    static void pushTag(script, String version) {

        script.sh """
            git push origin ${version}
        """
    }

}