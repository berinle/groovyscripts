
Thread.start{
	println "Starting thread"
	println "Going to sleep for 2 secs.."
	sleep(2000)	
	println "Exiting"
}

Thread.startDaemon{
	println "starting daemon thread"
	sleep(5000)
	println "finishing daemon..."
}