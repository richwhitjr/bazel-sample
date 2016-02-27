package engine.tools

object Fib {
	def fib(n: Int): Int = n match {
  	case 0 | 1 => n
  	case _ => fib(n-1) + fib(n-2)
	}
}