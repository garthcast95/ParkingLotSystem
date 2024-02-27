class Cat extends Pet
{
	public String color;  // There must be an extra attribute of the child class which is unique and not in parent class(Pet)
	Cat(String Col)
	{
		this.color=Col; // We define the color of cat as an extra attribute 
	}
	String Get_color()  // Function to get the color of the pet
	{
		return color; 
	}
}