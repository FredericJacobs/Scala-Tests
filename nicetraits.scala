// Woot, Scala has traits which are like Ruby Mixins or a Java Interface (plus implementation)

class Person(val name: String)

trait Nice {
	def greet() = println("Howdily doodily.")
}

class Character(override val name:String) extends Person(name) with Nice

val flanders = new Character("Ned")