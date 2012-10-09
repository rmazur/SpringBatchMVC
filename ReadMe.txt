Author: Unice Gwe Mbuamuh

Do the following to load System Properties used in the Spring Batch configurations

1.) Place the properties file in the properties directory, in one of your application server configuration directories.
2.) Add the following into /jboss-eap-5.1/jboss-as/server/"profile"/deploy/properties-service.xml:

<mbean code="org.jboss.varia.property.SystemPropertiesService" 
	 name="jboss:type=Service,name=SystemProperties">

<attribute name="URLList">
      ./"directory in which properties file is found"/"Properties filename"
    </attribute>

  </mbean>