println "starting..."
def closure = { println "run this" }
//Timer.runAfter(5){ println "run this"}
Timer.runAfter(5000 as int, closure)
println "ending"