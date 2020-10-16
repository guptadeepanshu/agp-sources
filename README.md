# agp-sources
Since Android Gradle Plugin sources aren't available easily on github, I created
this repository to automatically download and update the sources. Each commit
contains a stable release of the plugin.

![auto-update](https://github.com/guptadeepanshu/agp-sources/workflows/auto-update/badge.svg)

## Limitations
* Canary, beta and rc releases are skipped in order to keep things simpler and
clean. See [jrodbx/agp-sources](https://github.com/jrodbx/agp-sources) for these.
* Older cherrypick releases may not be updated everytime.

## Updating sources
A github workflow should run every week to download one release. To pull the
changes manually, update the version in `version.txt` file. Or preferably, run
`check_update.py` to get the next version to be downloaded. Then run
`./gradlew dumpSources` to download it. Check the changes into source control.

The `dumpSources` Gradle task will automatically download AGP and its transitive
dependencies from the Google repository and unzip them from your local Gradle
cache directory.

## Credit
The repository was initially forked from https://github.com/jrodbx/agp-sources.
The idea to use gradle to download sources and significant chunk of code in
`build.gradle` has been taken from that repository.

However since the repository contains multiple versions on the latest commit,
search yields results from all versions. This makes it harder to find what one
is looking for.

This repository solves that issue because the search will yield results only
from the latest version. Also, a history is useful to know in which version a
certain change was made.
