import com.calypso.VersionUtils

def call(String version) {

    VersionUtils.createTag(this, version)

    echo "Created Git tag: ${version}"
}