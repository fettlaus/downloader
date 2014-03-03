Free Software Downloader
========================

Java EE Downloader to manage and download freely available software.


Installation
============

### Quickstart
To try the application on an embedded server just run
```mvn package embedded-glassfish:run```
from the command line.


### Not-So-Quick Start
To deploy the application to a live server, do a ```mvn package``` and 
deploy the war to your server or configure the ```dev.properties``` accordingly 
and let maven do the deployment to a glassfish for you.

Keep in mind, that the Derby10 database has to be specified as a JTA datasource 
named ```__default```. If you want to change this behavior you have to edit the ```persistence.xml```.