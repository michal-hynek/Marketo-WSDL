# Generate Java Classes

Run the following command from the command line to generate Java classes:

wsimport -keep -d java http://app.marketo.com/soap/mktows/2_1?WSDL -XadditionalHeaders

The URL contains the API version number so it's going to change with every API release.  The command will generate classes in the directory specified by "-d" parameter.  In the example above, the classes will be in "java" directory that's located in the current directory.
