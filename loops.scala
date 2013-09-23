def rubyStyleForLoop {
	println("for loop using Ruby-Style iteration")
	args.foreach { arg =>
		println(arg)
	}
}

rubyStyleForLoop

def forLoop{
	println( "for loop using Java-Style iteration")
	for(i <- 0 until args.length) {
		println(args(i))
	}
}

forLoop