languages = new XmlSlurper().parse('languages.xml')
println "Languages and authors"

languages.language.each{ language -> 
	println "${language.@name} -- ${language.author[0].text()}"
}
