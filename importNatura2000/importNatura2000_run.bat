%~d0
cd %~dp0
java -Xms256M -Xmx1024M -cp .;../lib/routines.jar;../lib/log4j-1.2.16.jar;../lib/dom4j-1.6.1.jar;../lib/xercesImpl.jar;../lib/talendcsv.jar;../lib/mysql-connector-java-5.1.30-bin.jar;../lib/jakarta-oro-2.0.8.jar;../lib/talend_file_enhanced_20070724.jar;../lib/TalendSAX.jar;importnatura2000_0_1.jar;rdfnatura2000andsdfxml_0_1.jar; local_project.importnatura2000_0_1.importNatura2000 --context=Default %* 