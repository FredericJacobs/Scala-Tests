// Scala doesn't have so called class methods, instead you define a singleton using the object keyword. This strategy is called companion objects

// YOU CAN HAVE AN OBJECT AND CLASS DEFINITION WITH THE SAME NAMES

object TrueRing {
	def rule = println("To rule them all")
}
TrueRing.rule