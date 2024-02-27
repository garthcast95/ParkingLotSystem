
public class Pet
{
	private String[] Hunger = {"Starving", "Famished", "Hungry", "Fine","Satiated","Bloated"};// Attributes array of the pet
	int Hunger_Index;// We will traverse these arrays with their corresponding variables to access their indexes
	private String[] Hygiene= {"Needs Shower","Smelly","Clean"};// Attributes array of the pet
	int Hygiene_Index;// We will traverse these arrays with their corresponding variables to access their indexes
	private String[] Energy= {"Sleepy","Drowzy","Restless","Awake","Energized"};// Attributes array of the pet
	int Energy_Index;// We will traverse these arrays with their corresponding variables to access their indexes
	private String[] Mood= {"Depressed","Unhappy","Content","Happy","Cheerful","Joyful"};// Attributes array of the pet
	int Mood_Index;// We will traverse these arrays with their corresponding variables to access their indexes


	public Pet()  //Constructor for pet class. It is automatically called when object of the child class is initiated in main function
	{
		this.Hunger_Index=3; // just randomly defined the starting values of the object
		this.Hygiene_Index=2;//set the index value of hygiene to 2
		this.Energy_Index=3;// set the index value of energy to 3
		this.Mood_Index=3;// set the index value to mood to 3
	}

	void Inc_Hunger() // A function to increase the hunger by 1 each time called.
	{
		if(Hunger_Index>Hunger.length)   // Hunger.length gets the total number of elements present in that array
			// since in hunger array 6 elements are present so its length will be 6
		{
			Hunger_Index=Hunger.length-1;
			System.out.println("The pet is already Bloated");
		}
		else if(Hunger_Index>=0 & Hunger_Index<Hunger.length) // since in hunger array 6 elements are present so its length will be 6
		{
			this.Hunger_Index+=1; // increases the hunger value by 1
		}
	}

	void Dec_Hunger() // This function decreases the hunger value by 1
	{
		if(this.Hunger_Index==0)
		{
			this.Hunger_Index=0;
		}

		else if(this.Hunger_Index>=1 & this.Hunger_Index<Hunger.length)// To check the index value either it is in the range of array or not
		{
			this.Hunger_Index-=1;
		}

		else
		{
			System.out.println("The pet is already starving");
		}
	}

	void Inc_Hygiene() // This function increases the hygiene by 1
	{
		if(Hygiene_Index>Hygiene.length)
		{
			Hygiene_Index=Hygiene.length-1;
			System.out.println("The pet is already Bloated");
		}
		else if(Hygiene_Index>=0 & Hygiene_Index<Hygiene.length) // To check the index value either it is in the range of array or not
		{
			this.Hygiene_Index+=1;
		}
	}

	void Dec_Hygiene() // This function decreases the hygiene by 1
	{
		if(this.Hygiene_Index==0)
		{
			this.Hygiene_Index=0;
		}

		else if(this.Hygiene_Index>=1 & this.Hygiene_Index<Hygiene.length)// To check the index value either it is in the range of array or not
		{
			this.Hygiene_Index-=1;
		}

		else
		{
			System.out.println("The pet already needs a shower");
		}
	}
	void Inc_Energy()   // This function increases the energy by 1
	{
		if(Energy_Index>Energy.length)
		{
			Energy_Index=Energy.length-1;
			System.out.println("");
		}
		else if(Energy_Index>=0 & Energy_Index<Energy.length) // // To check the index value either it is in the range of array or not
		{
			this.Energy_Index+=1;
		}
	}

	void Dec_Energy()   // This function decreases the energy by 1
	{
		if(this.Energy_Index==0)
		{
			this.Energy_Index=0;
		}

		else if(this.Energy_Index>=1 & this.Energy_Index<Energy.length)// // To check the index value either it is in the range of array or not
		{
			this.Energy_Index-=1;
		}

		else
		{
			System.out.println("");
		}
	}

	void Inc_Mood() // This function increases the mood by 1
	{
		if(Mood_Index>Mood.length)
		{
			Mood_Index=Mood.length-1;
			System.out.println("");
		}
		else if(Mood_Index>=0 & Mood_Index<Hunger.length) // To check the index value either it is in the range of array or not
		{
			this.Mood_Index+=1;
		}
	}

	void Dec_Mood() // This function decreases the mood by 1
	{
		if(this.Mood_Index==0)
		{
			this.Mood_Index=0;
		}

		else if(this.Mood_Index>=1 & this.Mood_Index<Mood.length)// To check the index value either it is in the range of array or not
		{
			this.Mood_Index-=1;
		}

		else
		{
			System.out.println("");
		}
	}
	String Get_Energy() // To check the status of the pet this function is called to get current energy status of the pet
	{
		return Energy[Energy_Index]; // return the energy status of the pet
	}
	String Get_Mood() // To check the status of the pet this function is called to get current mood status of the pet
	{
		return Mood[Mood_Index];
	}
	String Get_Hygiene()// To check the status of the pet this function is called to get current hygiene status of the pet
	{
		return Hygiene[Hygiene_Index];
	}
	String Get_Hunger() // To check the status of the pet this function is called to get current hunger status of the pet
	{
		return Hunger[Hunger_Index];
	}
	void Set_MaxHygiene()// To set the hygiene index value maximum.
	{
		Hygiene_Index=Hygiene.length-1;
	}
	void Ignore() // This function sets all the values of the pet attribute to their minimum which will be present at zero index of each array
	{
		Hygiene_Index=0;
		Hunger_Index=0;
		Energy_Index=0;
		Mood_Index=0;
	}
	void View_Status(String name) // The function to check the status of pet
	{
		if(Hygiene_Index>Hygiene.length) // checks either our index is going out of bound if so
		{
			Hygiene_Index=Hygiene.length-1;// sets its value and keeps the value in the given domain
		}
		if(Hunger_Index>Hunger.length)// checks either our index is going out of bound if so
		{
			Hunger_Index=Hunger.length-1;// sets its value and keeps the value in the given domain
		}
		if(Mood_Index>Mood.length)// checks either our index is going out of bound if so
		{
			Mood_Index=Mood.length-1;// sets its value and keeps the value in the given domain
		}
		if(Energy_Index>Energy.length)// checks either our index is going out of bound if so
		{
			Energy_Index=Energy.length-1;// sets its value and keeps the value in the given domain
		}
		// The below line returns the current status/ values of the pet
		System.out.println("Your "+name+" is "+Hunger[Hunger_Index]+ " ,  "+Hygiene[Hygiene_Index]+"  ,"+ Mood[Mood_Index]+"  and "+Energy[Energy_Index]);
	}
}




