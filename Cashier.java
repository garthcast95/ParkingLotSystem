import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Cashier {
	private int Pin;// to store pin
	private int Sales; // to store sales
	Cashier(int p,int sales) // parameterized constructor
	{
		this.Sales=sales; // sets sales
		this.Pin=p;// sets pin
	}


	String Update_Sales(String date1,String date2) // update sales by checking check-in date and check out date
	{
		int day1 = 0,day2=0,month1=0,month2 = 0; // to store months and days of the two dates
		if(date1.contains("/")) // separates between months and days
		{
		    String parts[] = date1.split("\\/"); //split the dates on the basis of "/" separator
		    day1=Integer.parseInt(parts[0]);   // gets the days of date 1
		    month1=Integer.parseInt(parts[1]); // Get the days of month 1
		}
		if(date2.contains("/"))
		{
		    String parts[] = date1.split("\\/");//split the dates on the basis of "/" separator
		    day2=Integer.parseInt(parts[0]);  // gets the days of date 1
		    month2=Integer.parseInt(parts[1]);// Get the days of month 1
		}
		int days=0; // days variable
		days=(month2-month1)*30; // convert the months into days
		days=days+day2; // calculate the total days
		int fee=0; // initial fee is zero
		fee =days*5; // multiply days with $5. as one day charges are $5
		this.Sales=Sales+fee; // update the sales variable

		String fees=Integer.toString(fee); // convert fee from integer to string
		return fees; // return fee
	}
	int Get_Total_Sale() // function to get sales
	{
		return this.Sales; // return sales
	}
	void Update_Recents(String Line) throws IOException // update the recent file
	{
		 BufferedWriter writer = new BufferedWriter(
                 new FileWriter("Recents", true)  //Set true for append mode
             );
		 writer.newLine();   //Add new line
		 writer.write(Line); // write new line at the end of file
		 writer.close();// closes the file
	}
	void Show_Data(String filename) throws IOException
	{
		File file = new File(filename); //File file absolute path of file
		BufferedReader br = new BufferedReader(new FileReader(file)); //file reader descriptor
		String line=null; // sets line null
		while ((line = br.readLine()) != null) //reads the complete file in loop line by line
		{
			System.out.println(line); // print the file line by line
		}
	}

}
