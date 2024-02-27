class Dog extends Pet
{
	public String name;// There must be an extra attribute of the child class which is unique and not in parent class(Pet). in this case we defined name
	Dog(String n) // Constructor of dog class 
	{
		this.name=n; 
	}
	String Get_name()    // Function to get the name of the Dog 
	{
		return this.name;  // To return the name of dog
	}
	
}