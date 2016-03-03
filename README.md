# eunisNatura2000importer

The project is a Talend Open Studio Job 6.1.1 which replicates and streamline the import procedure published here:
https://taskman.eionet.europa.eu/projects/biodiversity/wiki/How_to_update_the_Natura2000_sites

usage:

sh ./importNatura2000_run.sh

No input is needed as database credentials are read from "/var/local/build/eea.eunis/local.properties" file
Temporary files are written in System.getProperty("java.io.tmpdir")/natura2000import directory (/tmp//natura2000import in linux)

TODO: logging compatible with greylog
