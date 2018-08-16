#!/bin/sh
cd `dirname $0`
ROOT_PATH=`pwd`
java -Xms256M -Xmx1024M -cp .:$ROOT_PATH:$ROOT_PATH/../lib/routines.jar:$ROOT_PATH/../lib/TalendSAX.jar:$ROOT_PATH/../lib/dom4j-1.6.1.jar:$ROOT_PATH/../lib/jakarta-oro-2.0.8.jar:$ROOT_PATH/../lib/log4j-1.2.16.jar:$ROOT_PATH/../lib/mysql-connector-java-5.1.30-bin.jar:$ROOT_PATH/../lib/talend_file_enhanced_20070724.jar:$ROOT_PATH/../lib/talendcsv.jar:$ROOT_PATH/../lib/xercesImpl.jar:$ROOT_PATH/importnatura2000_0_1.jar:$ROOT_PATH/rdfnatura2000andsdfxml_0_1.jar: local_project.importnatura2000_0_1.importNatura2000  --context=Default "$@" 