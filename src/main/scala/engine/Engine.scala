package engine

import engine.tools.Fib

object Engine {
	def main(args: Array[String]) {
		println(s"Fib(10)=${Fib.fib(10)}")
	}
}