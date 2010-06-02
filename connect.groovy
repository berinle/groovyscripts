import groovy.jmx.builder.*
import java.rmi.registry.LocateRegistry

//LocateRegistry.createRegistry(9520)

println "trying to do some jmx connection..."
def jmx = new JmxBuilder()
def client = jmx.client(
	host:"0.0.0.0", 
	port:9520, 
	protocol:'rmi',
	properties:[
		"authenticate":true,
		"passwordFile":"/Users/berinle/devtools/terracotta/jmxremote.password",
		"accessFile":"/Users/berinle/devtools/terracotta/jmxremote.access",
		"sslEnabled":false
	])

//def client = jmx.connectorClient(host:"127.0.0.1", port:9520, protocol:"jmxmp")
client.connect()
//client.getMBeanServerConnection()
//List SUPPORTED_PROTOCOLS = ["rmi", "jrmp", "iiop", "jmxmp"]
print "done connecting!"

//String url = "service:jmx:${protocol}:///jndi/${protocol}://${host}:${port}/jmxrmi"


/*2010-04-20 17:28:08,222 INFO - Available Max Runtime Memory: 496MB
2010-04-20 17:28:11,108 INFO - JMX Server started. Available at URL[service:jmx:jmxmp://0.0.0.0:9520]
2010-04-20 17:28:12,337 INFO - Terracotta Server instance has started up as ACTIVE node on 0.0.0.0:9510 successfully, and is now ready for work.*/

/*
2010-06-01 22:41:56,812 INFO - JMX Server started. Authentication ON - Available at URL[Service:jmx:rmi:///jndi/rmi://0.0.0.0:9520/jmxrmi]
2010-06-01 22:41:56,947 INFO - Credentials: /Users/berinle/devtools/terracotta/jmxremote.password /Users/berinle/devtools/terracotta/jmxremote.access

*/