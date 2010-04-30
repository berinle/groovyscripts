
/**
 * Created by IntelliJ IDEA.
 * User: berinle
 * Date: Apr 19, 2010
 * Time: 8:34:31 PM
 * To change this template use File | Settings | File Templates.
 */

def a = []
(1..1000).each { a << "$it" }

println a
println a.reverse()

println "\n\n"

(1..10).each{ i ->
  def start = (i-1) * 100
  def end = start + 100

  def subList = a.reverse().subList(start, end)
  println subList
  println "*******************"
}

//or you could just use the closure
a.reverseEach { print "$it "}