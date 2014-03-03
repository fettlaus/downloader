Free Software Downloader
========================

Java EE Downloader to manage and download freely available software.


Installation
============
To try the application on an embedded server just run
```mvn package embedded-glassfish:run```
from the command line.

To deploy the application to a live server, do a ```mvn package``` and 
deploy the war to your server or configure the _dev.properties_ accordingly 
and let maven do the deployment to a glassfish for you.