# eunisNatura2000importer

The project is a Talend Open Studio Job 7.0.1 which replicates and streamline the import procedure published here:
https://taskman.eionet.europa.eu/projects/biodiversity/wiki/How_to_update_the_Natura2000_sites

usage:

sh ./importNatura2000_run.sh

you can override the default values by passing the parameters:

sh ./importNatura2000_run.sh --context_param localProperties=/build/local.properties --context_param eunisctl=/usr/local/bin/eunisctl-1.0-SNAPSHOT-jar-with-dependencies.jar --context_param natura2000importer=/usr/local/bin/natura2000importer-1.0-SNAPSHOT-jar-with-dependencies.jar --context_param skipService=0 --context_param delete=1

If not set, default is:
-localProperties /var/local/build/eea.eunis/local.properties
-eunisctl "/build/tools/eunisctl/target/eunisctl-1.0-SNAPSHOT-jar-with-dependencies.jar"
-natura2000importer "/usr/local/bin/natura2000importer-1.0-SNAPSHOT-jar-with-dependencies.jar"
-skipService 0
-delete 0 (*delete = 1 will automatically enable skipService)

Temporary files are written in System.getProperty("java.io.tmpdir")/natura2000import directory (/tmp/natura2000import in linux)

TODO: logging compatible with graylog
