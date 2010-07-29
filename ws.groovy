@Grab('org.codehaus.groovy.modules:groovyws:0.5.2')
import groovyx.net.ws.WSClient

proxy = new WSClient("http://localhost:8090/redlight/services/home?wsdl", this.class.classLoader)

proxy.initialize()

proxy.soapCall()

println "Done with soap call!"