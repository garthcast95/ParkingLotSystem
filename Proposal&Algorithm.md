RESIDENTIAL PARKING LOT SYSTEM

Project Description
This project aims to do make a full parking lot system that involves residents, customers, and a cashier. 
Similar to the semesters project of a HEAP OF STUDENTS, this aims to process lines of text files and save them or update them to a new one.
Just like the Indiana University Parking Lot System, students register for a school permit that would last them a whole semester.
They are then added to the system with the ability to check in and check out with a time and date.
Customers or non locals in the other hand will be registering for a ticket on the same day.
On the same spot, they are added to the system with an increment of 1 for each new ticket. 
Since they are non residential, we also compute for their total payment by the day.
Residents or registered users on the other hand have a one time fee of $20 which is added to the sales. 
This system however will be approaching a residential system such as like a New York Parking Garage, or a garage that involves residents and customers.
This system will also be producing several reports. The first being a Sales report which calculates the total number of sales. 
The second is the complete list of residents by listing all the current registered residents in the system.
Another list will show all those who are checked in the system. By having the list show all who checked-in, it will show all residents and customers who are checked in.
This is then similar to the bank on it assignment which shows the difference between savings and checking account.

PURPOSE
The purpose of this project is to fully apply programming theories learned throughout the semester. 
Similar with a HEAP OF STUDENTS, this project aims to fully apply skills that involve opening, writing, and saving files.
Its an interesting concept that I find since most users manage databases and the alike with our current technology.
This project aims to mimic an actual parking lot system and its practicality.


USERS
The users involved will be revolving with CUSTOMERS, RESIDENTS, and CASHIERS.
CASHIER - Since this will be most likely my main class, I want the cashier to have all the functions by having.
1) Ability to add and remove residents in the system.
- A resident will register through a cashier since a resident cannot register themself.
2) Ability to add and remove customers in the system.
- Cashiers have the flexibility to add and remove customers from the system just how they can create a new ticket on the spot.
3) Ability to check in and check out residents in the system
-Add a person to the parking lot system by checking them in and check them out by removing them to the daily list.
4) Ability to show the complete list of residents in the system.
-As residents are added to the system, they are added to a list on a text file. 
This list will show all of the listed users.
5) Ability to show the total number of sales in the system
-Sales are computed by the number of residents and number of customers
-Customers are listed down on the system and aren't computed as sales till they check out.
- A flat one time fee of $20 for Residents is computed while a rate of $5 per day for a customer.

PROPOSAL ALGORITHM
main()
Goal: Create a menu of users
Output: Bring the user to desired task
Input: Ask user for what type of user are they 
1. Create a Cashier, Resident, and Customer Menu
2. Show user of the menu
3. If 1, bring them to customer menu.
If 2, bring them to resident menu
If 3, bring them to admin menu.

TotalResidents()
Goal: Show the complete list of residents 
Output: Display total residents in the system
Input: a Text file.
1. Create a resident list
2. Open the text file. 
3. Skip the header line.
4. Use getline to loop each line of the file. 

NewCustomer
Goal: Add a Customer to the system 
Output: a New Customer to the list in the system 
1. Get the total number of Customers.
2. Generate a new Customer ID to the number of Customer.
3. Register System date.
4. Assign a random parking lot. 
5. Construct line separated by comma.
6. Add the Customer to the total Customer file.
7. Add them to check in system.

NewResident
Goal: Add a resident to the system 
Output: a New resident to the list in the system 
Input: Get the name of the resident. Originally I had Plate number in mind/
1. Get the total number of residents.
2. Generate a new permit ID to the number of residents.
3. Register System date.
4. Ask for name of resident 
5. Construct line separated by comma.
6. Add the resident to the total resident file.

Check-In Resident 
Goal: Add a resident to currently checkedin
Output: Resident is checked in to the system 
Input: Permit ID Number
1. Ask for the permit ID 
2. Check the list if they are resident.
3. If they are resident, assign to a random parking level.
4. Add them to the list of currently checked in 
5. Update the list of checkedin.

Check-Out Resident 
Goal: Remove a resident to currently checkedin
Output: Resident is checked out of the system 
Input: Permit ID Number
1. Ask for the permit ID 
2. Check the list if they are checked in
3. Remove them to the list of currently checked in 
4. Update the list of checkedin.


Check-Out Customer 
Goal: Remove a Customer to currently checkedin
Output: Customer is checked out of the system 
Input: Ticket ID Number
1. Ask for the Ticket ID 
2. Check the list if they are checked in
3. Calculate the number of days by separating lines of the string.
4. Deduct the issued date from checkout date.
5. Multiply by 5
6. Add them to the total number of Sales.
7. Remove them from the checkin residents.
8. Update list. 

ShowResidents
Goal: Show complete list of residents.
Output: List of residents.
Input: Residents text file.
1. Grab list of residents.
2. Show list of residents.


ShowCurrent
Goal: Show complete list of checked-in
Output: List of currently checked-in.
Input: Recents text file.
1. Grab list of Checked-in.
2. Show list of residents.


ShowSales
Goal: Show complete list of Sales
Output: List of all sales
Input: Sales text file.
1. Grab list of residents.
2. Multiply by 20.
3. Grab list of sales.
4. Add those together to total sales. 

UPDATE:
04/11/2020
Created basic menu function and basic classes.
Mainly constructed private class such as the permit ID, resident Name, and Issued date.
Cashier has their own pin and Sales. Loop menu is not working properly.

04/17/2020
Date files are not working properly. Tried flat date.
Systemdate includes time. Still figuring out how to do date only and exclude time.

04/19/2020
basic report generation is now good.