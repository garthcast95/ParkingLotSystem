import java.util.*;

//Driver Class or Main Function
//driver class
public class FINAL
{
	public static void main(String args[])
	{

		Scanner a=new Scanner(System.in);   // To take input from user



		System.out.println("M E N U");// Menu for user interaction with pet
		System.out.println("*************************************************");
		System.out.println("****** Choose one of the pet given below  ******");
		System.out.println("Press 1 for Dog ");
		System.out.println("Press 2 for Cat");
		int opt=a.nextInt();

		switch(opt)   // Switch statement to select the option entered by the user
		{
		case(1):   // If user enter 1 then the code in case 1 will run
		{
			Dog d=new Dog("German Shepherd");   // object of the dog class which is a child class of pet
			int a1=-1;  // while condition. This loop will run until the value of a1 remains equal to 1
			do  // do-while loop for showing the menu again and again
			{
			//Since we have selected dog so, we will create an object of dog class which is a derived class

			Scanner input= new Scanner(System.in);    //System.in is a standard input stream

			System.out.println("M E N U");
			System.out.println("*************************************************");
			System.out.println("****** Choose one of the following options ******");
			System.out.println("1. Play Outside");
			System.out.println("2. Feed Pet");
			System.out.println("3. Shower");
			System.out.println("4. Ignore Pet");
			System.out.println("Enter your option please ");

			//1. INTERACT
			//a. PLAY Outside with Pet (INC: MOOD, DEC: ENERGY, MOOD, HYGEINE)
			//b. RUB PET (INC: ENERGY, MOOD)
			//c. SCOLD PET (DEC MOOD)
			//2. FEED (INC HUNGER BY 1)
			//3. SHOWER (INC HYGEINE TO MAX)
			//4. IGNORE PET (DEC EVERYTHING)

			int option= input.nextInt();   // To prompt the user to enter his option from the shown menu
			switch(option) // Again switch statement to prompt the user to select the option of his desire
			{
				case(1):
					int a2=-1; // variable to check the condition of do-while loop which is starting from the next line
					do {

					System.out.println("M E N U");
					System.out.println("*************************************************");
					System.out.println("****** Choose one of the following options ******");
					System.out.println("Press 'a' to Play Outside");
					System.out.println("Press 'b' to Rub Pet");
					System.out.println("Press 'c' to Scold Pet");
					char ch = input.next().charAt(0); // To take a character input from the user
					switch(ch) // Again switch statement to prompt the user again to select the option
					{
						case('a'):
							int b1=-1; // variable to check the condition of do-while loop
							do {
							d.Inc_Mood();  // calls the function from pet class and increase the mood by 1
							d.Inc_Hunger(); // calls the function from pet class and increase the Hunger by 1
							d.Dec_Hygiene();// calls the function from pet class and decrease the hygiene by 1
							d.Dec_Energy();//// calls the function from pet class and decrease the Energy by 1
							d.View_Status(d.Get_name()); // Function of pet class to check the current status of the pet
							System.out.println("Press 1 to play outside again with pet");
							System.out.println("Press 2 to go to Main Menu ");
							System.out.println("Press 0 to terminate the program");
							int temp1=input.nextInt();// A temporary variable to store the input value entered by user
							if(temp1==0)
							{
								System.out.println("The Program has been Terminated");
								System.exit(0);// To exit the program
							}
							if(temp1==1) // A temporary variable to check the input from the user
							{
								a2=1;     // set the outer while loop condition true
								b1=temp1;
							}
							if(temp1==2)// To terminate the current do-while loop and go back to main menu
							{
								b1=-1;
								a2=-1;
								a1=temp1;
							}
							}while(b1==1);
							break;
						case('b'):
							int b2=-1;
						do {
							d.Inc_Energy();
							d.Inc_Mood();
							d.View_Status(d.Get_name());  // view the status of pet while d.get_name gets the name of the pet from child class(dog)
							System.out.println("Press 1 to rub the pet again");
							System.out.println("Press 2 to go to Main Menu ");
							System.out.println("Press 0 to terminate the program");
							int temp2=input.nextInt();
							if(temp2==0)
							{
								System.out.println("The Program has been Terminated");
								System.exit(0);
							}
							if(temp2==1)
							{
								a2=1;
								b2=temp2;
							}
							if(temp2==2)
							{
								b2=-1;
								a2=-1;
								a1=temp2;
							}
						}while(b2==1);
							break;
						case('c'):
							int b3=-1;
						do {
							d.Dec_Mood();
							d.View_Status(d.Get_name());
							System.out.println("Press 1 to Scold the pet again");
							System.out.println("Press 2 to go to Main Menu ");
							System.out.println("Press 0 to terminate the program");
							int temp3=input.nextInt();
							if(temp3==0)
							{
								System.out.println("The Program has been Terminated");
								System.exit(0);
							}
							if(temp3==1)
							{
								a2=1;
								a1=-1;
								b3=temp3;
							}
							if(temp3==2)
							{
								b3=-1;
								a2=-1;
								a1=temp3;
							}
						}while(b3==1);  // do-while (condition) loop.
						default:
							System.out.println("Invalid Input");

					}


					break;
					}while(a2==1);
				case(2):
					int a4=-1;  //variable to check the while loop condition
					do {
					d.Inc_Hunger();
					d.View_Status(d.Get_name());
					System.out.println("Press 1 to Feed pet again");
					System.out.println("Press 2 to go to Main Menu ");
					System.out.println("Press 0 to terminate the program");
					int temp1=input.nextInt();
					if(temp1==0)
					{
						System.out.println("The Program has been Terminated");
						System.exit(0);
					}
					if(temp1==1)
					{
						a4=temp1;
					}
					if(temp1==2)
					{
						a4=-1;
						a1=2;
					}
					}while(a4==1);

					break;
				case(3):
				int a5=-1;

				do
				{

						d.Set_MaxHygiene();
						d.View_Status(d.Get_name());
						System.out.println("Press 1 to shower the pet again");
						System.out.println("Press 2 to go to Main Menu ");
						System.out.println("Press 0 to terminate the program");
						int temp1=input.nextInt();
						if(temp1==0)
						{
							System.out.println("The Program has been Terminated");
							System.exit(0);
						}
						if(temp1==1)
						{
							a5=temp1;
						}                           // All the description is given above. Actually the things are repeating
						if(temp1==2)
						{
							a5=-1;
							a1=temp1;
						}
				}while(a5==1);

					break;
				case(4):
					int a6=-1;
				do {
					d.Ignore();
					d.View_Status(d.Get_name());
					System.out.println("Press 1 to Ignore the pet again");
					System.out.println("Press 2 to go to Main Menu ");
					System.out.println("Press 0 to terminate the program");
					int temp1=input.nextInt();
					if(temp1==0)
					{
						System.out.println("The Program has been Terminated");
						System.exit(0);
					}
					if(temp1==1)
					{
						a6=temp1;
					}
					if(temp1==2)
					{
						a6=-1;
						a1=temp1;
					}
				}while(a6==1);
					break;


				default:
					System.out.println("Invalid Input");
					System.out.println("Press 2 to go to Main Menu ");
					System.out.println("Press 0 to terminate the program");
					int temp1=input.nextInt();
					if(temp1==0)
					{
						System.out.println("The Program has been Terminated");
						System.exit(0);
					}

					if(temp1==2)
					{
						a1=temp1;
					}
					break;

			}

			break;// Case 1 break;
		}while(a1==2);
	}// Case 1 ends here

		case(2)://CALL CAT
		{
			{
				//Since we have selected Cat so, we will create an object of cat class which is a derived class
				Cat c =new Cat("White");  // object of cat class
				int again=-1;  // to repeat the menu again and again until user desires.
				do
				{
				Scanner input= new Scanner(System.in);    //System.in is a standard input stream
				System. out. flush();
				System.out.println("M E N U");
				System.out.println("****** Choose one of the following options ******");
				System.out.println("1. Play Outside");
				System.out.println("2. Rub Pet");
				System.out.println("3.Shower");
				System.out.println("4. Ignore Pet");
				System.out.println("Enter your option please ");
				//1. INTERACT
				//a. PLAY Outside with Pet (INC: MOOD, DEC: ENERGY, MOOD, HYGEINE)
				//b. RUB PET (INC: ENERGY, MOOD)
				//c. SCOLD PET (DEC MOOD)
				//2. FEED (INC HUNGER BY 1)
				//3. SHOWER (INC HYGEINE TO MAX)
				//4. IGNORE PET (DEC EVERYTHING)
				int option= input.nextInt();
				switch(option)
				{
					case(1):
						int c1=-1;
					do {


						System. out. flush();
						System.out.println("M E N U");
						System.out.println("****** Choose one of the following options ******");
						System.out.println("Press 'a' to Play Outside");
						System.out.println("Press 'b' to Rub Pet");
						System.out.println("Press 'c' to Scold Pet");
						char ch = input.next().charAt(0);

						switch(ch)
						{
							case('a'):
								int c3=-1;
								do {
								c.Inc_Mood();
								c.Inc_Hunger();
								c.Dec_Hygiene();
								c.Dec_Energy();
								c.View_Status(c.Get_color());
								System.out.println("Press 1 to interact again with pet");
								System.out.println("Press 2 to go to Main Menu ");
								System.out.println("Press 0 to terminate the program");
								int temp1=input.nextInt();
								if(temp1==0)
								{
									System.out.println("The Program has been Terminated");
									System.exit(0);
								}
								if(temp1==1)
								{
									c3=temp1;
								}
								if(temp1==2)
								{
									again=temp1;
								}
								}while(c3==1);

								break;
							case('b'):
								int c4=-1;
							do {
								c.Inc_Energy();
								c.Inc_Mood();
								c.View_Status(c.Get_color());
								System.out.println("Press 1 to interact again with pet");
								System.out.println("Press 2 to go to Main Menu ");
								System.out.println("Press 0 to terminate the program");
								int temp1=input.nextInt();
								if(temp1==0)
								{
									System.out.println("The Program has been Terminated");
									System.exit(0);
								}
								if(temp1==1)
								{
									c4=temp1;
								}
								if(temp1==2)
								{
									c4=-1;
									again=temp1;
								}
								}while(c4==1);
								break;
							case('c'):
								int c5=-1;
							do {
								c.Dec_Mood();
								c.View_Status(c.Get_color());
								System.out.println("Press 1 to interact again with pet");
								System.out.println("Press 2 to go to Main Menu ");
								System.out.println("Press 0 to terminate the program");
								int temp1=input.nextInt();
								if(temp1==0)
								{
									System.out.println("The Program has been Terminated");
									System.exit(0);
								}
								if(temp1==1)
								{
									c5=temp1;
								}
								if(temp1==2)
								{
									c5=-1;
									again=temp1;
								}
								}while(c5==1);
								break;

							default:
								System.out.println("Invalid Input");
						}

					}while(c1==1);

						break;
					case(2):
						int f1=-1;
					do {
						c.Inc_Hunger();
						c.View_Status(c.Get_color());
						System.out.println("Press 1 to interact feed Your Cat");
						System.out.println("Press 2 to go to Main Menu ");
						System.out.println("Press 0 to terminate the program");
						int temp1=input.nextInt();
						if(temp1==0)
						{
							System.out.println("The Program has been Terminated");
							System.exit(0);
						}
						if(temp1==1)
						{
							f1=temp1;
						}
						if(temp1==2)
						{
							f1=-1;
							again=temp1;
						}
						}while(f1==1);
						break;
					case(3):
						int f2=-1;
					do {
						c.Set_MaxHygiene();
						c.View_Status(c.Get_color());
						System.out.println("Press 1 to Shower your Cat");
						System.out.println("Press 2 to go to Main Menu ");
						System.out.println("Press 0 to terminate the program");
						int temp1=input.nextInt();
						if(temp1==0)
						{
							System.out.println("The Program has been Terminated");
							System.exit(0);
						}
						if(temp1==1)
						{
							f2=temp1;
						}
						if(temp1==2)
						{
							f2=-1;
							again=temp1;
						}
						}while(f2==1);
						break;
					case(4):

						c.Ignore();
						c.View_Status(c.Get_color());

						System.out.println("Press 2 to go to Main Menu ");
						System.out.println("Press 0 to terminate the program");
						int temp1=input.nextInt();
						if(temp1==0)
						{
							System.out.println("The Program has been Terminated");
							System.exit(0);
						}

						if(temp1==2)
						{
							again=temp1;
						}

						break;


					default:
						System.out.println("Invalid Input");

						System.out.println("Press 2 to go to Main Menu ");
						System.out.println("Press 0 to terminate the program");
						int temp2=input.nextInt();
						if(temp2==0)
						{
							System.out.println("The Program has been Terminated");
							System.exit(0);
						}

						if(temp2==2)
						{
							again=temp2;
						}


				}
				}
				while(again==1);
				break;// Case 2 break;
			}// Case 2 ends here

		}

		default:
			System.out.println("Invalid Input");
		}//First Switch statement ends here
	}//Main ends here
}
