@Grapes(
  //@Grab("log4j:log4j:1.2.15")
@Grab(group='log4j', module='log4j', version='1.2.16', transitive=false)
)

import org.apache.log4j.*

org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger("mylogger")
def x
println "hello"

log.debug("this is a DEBUG message")
log.info("this is an INFO message")