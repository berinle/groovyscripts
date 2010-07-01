//new FileWriter('output.txt').withWriter{ writer -> writer.write('b') }
/*def str = "Hello, world!"
for(x in str)
println x*/


class Customer{
	String name
}

def locked(Closure c){
	println "Transaction lock"
	transactionLock()
	c.call()
	transactionRelease()
	println "Transaction release"	
}

def updateCustomer(id, c){
	println "Updating customer $id"
	Customer customer = getCustomerRecord(id)
	println "Customer name was ${customer?.name}"
	c.call(customer)
	println "Customer name is now ${customer?.name}"
	println "Save customer record"
	saveCustomerRecord(customer)
}

def transactionLock(){}
def transactionRelease(){}
def saveCustomerRecord(Customer c){ println "Saving customer record..." }

Customer getCustomerRecord(id){ 
	return new Customer(name:"Segun") 
}

locked {
	updateCustomer(123){ customer -> customer?.name = "Bayo" }
}