import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Customer {

	private int Ticket_Id; // to store ticket id
	private String Check_In_Date;//to store check in date
	private Date Check_Out_Date;// to store check out date
	private int Fee;// to store fee
	private String Level;// to store level
	Customer(){    // constructor

	}
	Customer(int ticket,String checkin,String l) //parameterized constructor
	{
			this.Ticket_Id=ticket;   // sets ticket id
			this.Check_In_Date=checkin;// set check in date

			this.Level=l;// set level

	}

	void Set_Ticket_Id(int id) //sets ticket id
	{
		this.Ticket_Id=id;
	}

	int Get_Ticket_Id() //Getter to get ticket id
	{
		return this.Ticket_Id;//return statement
	}

	void Set_Cust_Checkin_date(String date)//setter
	{
		this.Check_In_Date=date;
	}
	String Get_cust_checkin_date(int checkid) throws IOException// Getter function to get customer check-in date
	{


			File file = new File("Customer.txt"); //File file absolute path of file


			BufferedReader br = new BufferedReader(new FileReader(file));

			br.readLine(); // Skip the first line in the file which is header
			String line=null;
			String checkindate=null;
			while ((line = br.readLine()) != null) // reads the file line by line
			{
				if(line.contains(","))  // separates the line into fields separated by comma
				{
				    String parts2[] = line.split("\\,"); // split into subfields
				    char c2=parts2[0].charAt(0); // gets the first character of line
				    String Lev=null;
				    int ide=c2-48;
				    if(checkid==ide) // check the id
				    {
				    	 checkindate=parts2[1];
				    	 this.Level=parts2[4];// sets the level
				    }
				}

			}

			return checkindate;// return statement

	}


	void Set_Checkout_date(Date d) //Function to set check out date
	{
		this.Check_Out_Date=d;
	}
	Date Get_Checkout_Date()// function to get check out date
	{
		return this.Check_Out_Date;
	}

	void Set_Level(String l)// function to set level
	{
		this.Level=l;
	}
	String Get_Level()//function to get level
	{
		return this.Level;
	}


	static void Update_Customer(String newLine) throws IOException //function to update customer file
	{
		String parts[] = newLine.split("\\,");
	    char c=parts[0].charAt(0);
	    int id=c-48;

		File file = new File("Customer.txt"); //File file absolute path of file


		BufferedReader br = new BufferedReader(new FileReader(file));
		String oldLine = null;
		br.readLine(); // Skip the first line in the file which is header
		String line=null;

		int count=0;
		while ((line = br.readLine()) != null) //reads line by line
		{

			if(line.contains(","))
			{
			    String parts2[] = line.split("\\,");
			    char c2=parts2[0].charAt(0);
			    int ide=c2-48;
			    if(id==ide)
			    {
			    	oldLine=line;
			    }
			}

		}

		//Instantiating the File class
	    String filePath = "Customer.txt";
	    //Instantiating the Scanner class to read the file
	    Scanner sc = new Scanner(new File(filePath));
	    //instantiating the StringBuffer class
	    StringBuffer buffer = new StringBuffer();
	    //Reading lines of the file and appending them to StringBuffer
	    while (sc.hasNextLine()) {
	       buffer.append(sc.nextLine()+System.lineSeparator());
	    }
	    String fileContents = buffer.toString();
	    //System.out.println("Contents of the file: "+fileContents);
	    //closing the Scanner object
	    sc.close();
	    //Replacing the old line with new line
	    fileContents = fileContents.replaceAll(oldLine, newLine);
	    //instantiating the FileWriter class
	    FileWriter writer = new FileWriter(filePath);
	    writer.append(fileContents);// appends the file
	    writer.flush();

	}

	static int Load_Customer_Data() throws IOException
	{
		File file = new File("Customer.txt"); //File file absolute path of file


		BufferedReader br = new BufferedReader(new FileReader(file)); // to store the file in buffer

		br.readLine(); // Skip the first line in the file which is header
		String line=null;
		int count=0;// counts the total number of customers
		while ((line = br.readLine()) != null)  // reads the file line by line
		{
			count=count+1;// counts the lines of the file except header
		}
		return count; // return the count of customer
	}

}
