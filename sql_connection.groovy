@Grapes([
	@Grab('org.slf4j:slf4j-simple:1.5.11'),
	@Grab('mysql:mysql-connector-java:5.1.12'),
	@GrabConfig(systemClassLoader = true)
])

import org.slf4j.*
import groovy.sql.*

def log = LoggerFactory.getLogger('samplescript')

log.info 'Initialize SQL'

def uname = args[0]
def pass = args[1]

def sql = Sql.newInstance('jdbc:mysql://localhost/cbp', uname, pass, 'com.mysql.jdbc.Driver')

log.info "Got sql connection ${sql}"

log.info "auto commit status: ${sql.connection.autoCommit}"