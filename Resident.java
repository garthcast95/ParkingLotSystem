import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Resident {

	private String Permit_Id; // A class variable to store Permit_id
	private String Resident_Name; // A variable to store Resident name
	private Date Issue_Date; // A variable of data type Date to store the issuing date of Parking Permit
	Resident(){

	}
	Resident(String id,String name,Date issue) //Parameterized constructor
	{
		this.Permit_Id=id;
		this.Resident_Name=name;
		this.Issue_Date= issue;
	}

	void Set_Permit_Id(String id) // A function to set the permit id
	{
		this.Permit_Id=id;
	}
	String Get_Permit_Id()  // A function to get the permit id
	{
		return this.Permit_Id;
	}

	void Set_Name(String name) // A function to set the name of the resident
	{
		this.Resident_Name=name;
	}
	String Get_Name()     // A function to get the name of the Resident
 	{
		return this.Resident_Name;
	}

	void Set_Issue_Date(Date date)// A function to set issue date of the resident permit id
	{
		this.Issue_Date=date;//sets
	}
	Date Get_Issue_Date() // Get the issue date of resident permit id
	{
		return this.Issue_Date;
	}
	static int Total_Residents() throws IOException
	{
		File file = new File("Resident.txt"); //File file absolute path of file


		BufferedReader br = new BufferedReader(new FileReader(file));

		br.readLine(); // Skip the first line in the file which is header
		String line=null;
		int count_residents=0;//

		while ((line = br.readLine()) != null) // reads the file line by line
		{
			count_residents=count_residents+1;

		}
			return count_residents;//return the total number of residents in the file
	}

	static void Update_Resi_Checkin(String newLine) throws IOException// update resident check in
	{

	 	String parts[] = newLine.split("\\,");
	    char c=parts[0].charAt(0);
	    int id=c-48;

		File file = new File("Customer.txt"); //File file  absolute path of file


		BufferedReader br = new BufferedReader(new FileReader(file)); //a buffer to store the file
		String oldLine = null;// old line
		br.readLine(); // Skip the first line in the file which is header
		String line=null;
		while ((line = br.readLine()) != null) // loop  to read the file line by line
		{
			if(line.contains(","))
			{
			    String parts2[] = line.split("\\,"); // splits the lines into subfields on the basis of comma separator
			    char c2=parts2[0].charAt(0); // gets the first character of line which is id
			    int ide=c2-48; // coverts id into integer
			    if(id==ide)  // compare two ids
			    {
			    	oldLine=line; // sets the old line which has to be updated
			    }
			}

		}

		//Instantiating the File class
	    String filePath = "Resident.txt";
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
	    writer.append(fileContents);
	    writer.flush();

	}	// Method ends here


	boolean Check_Permit(int pid) throws IOException
	{
		File file2 = new File("Resident.txt"); //File file  absolute path of file


		BufferedReader br2 = new BufferedReader(new FileReader(file2));

		br2.readLine(); // Skip the first line in the file which is header
		String line=null;
		int i=0;
		while ((line = br2.readLine()) != null) // line by line reading of file
		{

			if(line.contains(","))//separetes the line into fields on the basis of comma
			{
			    String parts[] = line.split("\\,");
			    char c=parts[0].charAt(0);
			    int ide=c-48;
			    if(ide==pid)
			    {
			    	this.Resident_Name =parts[2]; // sets the resident name
			    	return true;
			    }
			 }
		}

		return false;

	}


}
