Thread.start{
	[1..9]*.each{ i ->
		sleep (10*i)
		println i
	}
}

Thread.start{
	["three", "two", "one", "liftoff"].each{ i ->
		sleep(100)
		println i
	}
}