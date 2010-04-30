
/**
 * Created by IntelliJ IDEA.
 * User: berinle
 * Date: Apr 29, 2010
 * Time: 8:42:43 PM
 * To change this template use File | Settings | File Templates.
 */
def myList = []
def nameArr = []
('a'..'z').each{ nameArr << "$it"}

def fnameArr = (50..999)
println fnameArr

def r = new Random()

(1..100).each{ i ->
  myList << new Person(fname:fnameArr[r.nextInt(fnameArr.size())], lname:nameArr[r.nextInt(nameArr.size())], age:i)
}

println myList

def fc = [comparator: {a,b -> a.fname.equals(b.fname)? 0: a.fname < b.fname ? -1: 1 }] as Comparator

myList.sort(fc)

(1..10).each{ i ->
  def start = (i-1) * 10
  def end = start + 10

  def subList = myList.subList(start, end)
  println subList
  println "*******************"
}