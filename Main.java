import java.util.Scanner; // To take input
import java.io.*; // Standard input output operations
import java.util.Random; // To generate random variable for Parking Level


public class Main {

	static void Append_At_End(String Line,String filename) throws IOException // Opens the file and write the line at the end of file
	{
	    BufferedWriter writer = new BufferedWriter(
	                                new FileWriter(filename, true)  //Set true for append mode
	                            );
	    writer.newLine();   //Add new line
	    writer.write(Line);  // Write new line at the end
	    writer.close(); // Close the file
	}

	// Driver Function
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Customer customer=new Customer();// Created an object of customer class to access its attributes and methods
		Resident resident=new Resident();// Created an object of Resident class to access its attributes and methods
		int count=0; // a variable to count the total number of customers
		try {
			count=customer.Load_Customer_Data(); // Loads and counts the customers in the customer file
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Load the customer data and count their number



		Scanner a=new Scanner(System.in);   // To take input from user

		System.out.println("M E N U");// Menu
		System.out.println("****** Choose one of the option given below  ******");
		System.out.println("Press 1 for Customer ");
		System.out.println("Press 2 for Resident");
		System.out.println("Press 3 for Cashier");

		int option=a.nextInt(); // input
		switch(option) // Switch statement to choose the one of the above option
		{
		case(1):  // case 1 will run if user chooses 1
			int Tick_id=count+1; // Get the total number of customers and adds 1 and assign it to new Ticket id for customer
			String checkin="05/03/2020"; // Check_in
			// create instance of Random class
	        Random rand = new Random(); // Random number for Parking Level
			int rand_int1 = rand.nextInt(3); // To create random parking Level
			String Lev = Integer.toString(rand_int1); // Convert an integer to string
			System.out.println("TicketID: "+Tick_id); // print
			System.out.println("Check_in_date= "+checkin);
			System.out.println("Parking Level is "+Lev);
			String tick=Integer.toString(Tick_id);// integer to string to store in file
			String Line=tick+","+checkin+","+","+"0"+Lev; // making a larger starting by combining all smaller strings
			Append_At_End(Line,"Customer.txt"); // Appends the larger string at the end of file


			break;
		case(2):
			System.out.println("Enter Permit ID");// Permit id for resident
			int permit=a.nextInt(); // takes input
			if(resident.Check_Permit(permit)==true) // Check if permit id is authentic by checking in resident file
			{
				Random rand2 = new Random();  //Random number generating
				int rand_int2 = rand2.nextInt(3); // To create random parking Level
				String Level = Integer.toString(rand_int2); // integer to string conversion
				String checkin_Resident="05/03/2020"; // Check in date
				String perid=Integer.toString(permit); // conversion
				String newline=perid+","+checkin_Resident+","+resident.Get_Name()+","+Level;//Combine to make a line
				resident.Update_Resi_Checkin(newline);// update the resident file
				System.out.println("You are authorized. You can check now. Your parking Level is "+Level);
			}

			else
			{
				System.out.println("You are not Resident. ");
				System.exit(0);
			}
			break;
		case(3):
			System.out.println("Enter Pin : "); // input
			int Pin=a.nextInt();// Takes integer
			if(Pin==12345)// check the pin if valid or not
			{
				int total=resident.Total_Residents(); // Gets total number of residents
				Cashier cashier=new Cashier(Pin,total*20); // creates the object of cashier class
				System.out.println("M E N U");// Menu for user interaction with pet
				System.out.println("****** Choose one of the option given below  ******");
				System.out.println("Press 1 to Manage Residents : ");
				System.out.println("Press 2 to Check_in  Resident/Customer :");
				System.out.println("Press 3 to Check_out Resident/Customer :");
				System.out.println("Press 4 to Show All Residents :");
				System.out.println("Press 5 to Show all current checked_in :  ");
				System.out.println("Press 6 to show Total Sales :  ");

				int option2=a.nextInt(); // second option menu
				switch(option2)
				{
				case(1):

					System.out.println("Press 1 to add Resident : ");
					System.out.println("Press 2 to add Customer : ");
					int option3=a.nextInt(); // option menu
					switch(option3)
					{
					case(1):
						int New_Permit_id=resident.Total_Residents()+1; // Generates new permit id
						String newpermit= Integer.toString(New_Permit_id);// convert into string from integer
						String IssueDate="01/01/2020";
						System.out.println("Enter th name of Resident: ");
						String name=a.nextLine(); // Get the string
						String Lines=newpermit+","+ IssueDate+","+name;  //makes a larger line
						Append_At_End(Lines,"Resident.txt"); // Appends the line in the resident file
						Append_At_End(Lines,"Recents.txt");// Appends the line in the recents file
						break;
					case(2):
						int TicetId=customer.Load_Customer_Data()+1; // Gets ticket id
						String newTicket= Integer.toString(TicetId); ////
						String _Checkindate=""; // sets check in date to null
						Random rand3 = new Random();  // generate random number
						int rand_int3 = rand3.nextInt(3); // To create random parking Level
						String Lev3 = Integer.toString(rand_int3); // random variable

						String custLines=newTicket+","+ _Checkindate+","+""+"0"+Lev3; // combine to make line
						Append_At_End(custLines,"Customer.txt");// appends at the end of customer file
						Append_At_End(custLines,"Recents.txt");// appends at the end of recents file
						break;
					}
					break;
				case(2):
					System.out.println("Press 1 to Check_in Resident : ");
					System.out.println("Press 2 to Check_in Customer : ");
					int option4=a.nextInt();
					switch(option4)
					{
					case(1):
					System.out.println("Enter Permit ID");
					int permit2=a.nextInt();
					if(resident.Check_Permit(permit2)==true)
					{

						Random rand2 = new Random();
						int rand_int2 = rand2.nextInt(3); // To create random parking Level
						String Level = Integer.toString(rand_int2);
						String checkin_Resident="05/03/2020";
						String perid=Integer.toString(permit2);
						String newline=perid+","+checkin_Resident+","+resident.Get_Name()+","+Level;
						Append_At_End(newline,"Recents.txt"); // appends the text
						resident.Update_Resi_Checkin(newline); // update the resident file

						cashier.Update_Recents(newline); // update the recents

						System.exit(0);
					}

						break;
					case(2):
						int TicetId=customer.Load_Customer_Data()+1;  // Gets the ticket id
						String newTicket= Integer.toString(TicetId);// convert from string to integer to save in file
						String _Checkindate="01/01/2020";
						Random rand3 = new Random();  // Random number
						int rand_int3 = rand3.nextInt(3); // To create random parking Level
						String Lev3 = Integer.toString(rand_int3);  // converts
						String custLines=newTicket+","+ _Checkindate+","+""+"0"+Lev3;//combines the smaller strings to make a larger line
						Append_At_End(custLines,"Customer.txt");// appends in the file of customer
						Append_At_End(custLines,"Recents.txt");//appneds
						System.out.println("Customer has checked in successfully and also added to recents");
						cashier.Update_Recents(custLines);// update the file
						System.exit(0);

						break;
					}


					break;
				case(3):
					System.out.println("Press 1 to Check_out Resident : ");
					System.out.println("Press 2 to Check_out Customer : ");
					int option5=a.nextInt();
					switch(option5)
					{
					case(1):
					System.out.println("Enter Permit ID");
					int permit2=a.nextInt();
					if(resident.Check_Permit(permit2)==true) // checks if permit id is valid or not
					{
						Random rand2 = new Random();
						String Level="Not in Parking";// check out the resident from the parking
						String checkin_Resident=""; //
						String perid=Integer.toString(permit2); //conversion
						String newline=perid+","+checkin_Resident+","+resident.Get_Name()+","+Level;//combines the strings
						resident.Update_Resi_Checkin(newline);// update the resident file
						System.exit(0);
					}
					else {
						System.out.println("Invalid permit id: "); // if pin is invalid
						System.exit(0);
					}
						break;
					case(2):
						System.out.println("Enter Ticket Id : ");
						int id=a.nextInt();
						String custLines=null; //
						String ida=Integer.toString(id);
						String _Checkindate=customer.Get_cust_checkin_date(id); // Get the check in date of customer from customer file
						String Checkoutdate="22/04/2020"; //
						System.out.println("sales="+cashier.Get_Total_Sale()); // Get the total sales of the customer file
						String fee=cashier.Update_Sales(_Checkindate, Checkoutdate); // calculate the fee of the customer after check out
						String insert1="Customer id = "+ida+" has Checked out,"+" by paying Fee = "+fee; // combines the string
						Append_At_End(insert1,"Sales.txt"); // appends the line
						System.out.println("Press 1 to show updated Sales");
						System.out.println("Press 2 to Exit the program");
						int option6=a.nextInt();
						switch(option6)
						{
						case(1):
							int t=cashier.Get_Total_Sale(); // To get the total sales
							System.out.println("Total Updated Sales ="+t); // show sales on screen
							break;
						case(2):
							System.exit(0); // terminates the program
							break;
						}

						System.exit(0); // exit the program
						break;
					}


					break;
				case(4):
					cashier.Show_Data("Resident.txt");

					break;
				case(5):
					cashier.Show_Data("Recents.txt");

					break;
				case(6):
					int Total_sales=cashier.Get_Total_Sale();
					System.out.println("Total_sales ="+Total_sales);
					break;
				}

				System.out.println("");
			}



			else {
				System.out.println("Invalid Pin ");
				System.exit(0);
			}
			break;
		}


	}// main function ends here

}// Main Java Class ends here
