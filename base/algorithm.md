
MAIN GOAL
GOAL: Create a Virtual Pet where the a person can interact with
INPUT: Input a series of commands that can change a pets Hunger, Mood, Energy, and Hygiene
OUTPUT: Increase or Decrease Values to reflect the pets Attributes

main Menu()
GOAL: Have the user select a pet that they want
INPUT: Select what kind of pet they want either CAT or DOG
OUTPUT: Call Menu that shows how to Interact with PET 
STEPS:
1. Ask for User Input for 1 for DOG and 2 for CAT
2. Call the KIND of PET (OBJECT) and all its attributes
3. Show Menu on how to Interact with Pet
4. Ask for input for user of desired task
	1. INTERACT
		a. PLAY Outside with Pet (INC: MOOD, DEC: ENERGY, HYGIENE, HYGEINE)
		b. RUB PET (INC: ENERGY, MOOD)
		c. SCOLD PET (DEC MOOD)
	2. FEED (INC HUNGER BY 1)
	3. SHOWER (INC HYGEINE TO MAX)
	4. IGNORE PET (DEC EVERYTHING TO ZERO)
	
	
INTERACT()
GOAL: Have the user interact with Pet
INPUT: Ask for what kind of interaction they want with pet
OUTPUT: Change the values of those attributes
STEPS:
1. If Person wants to PLAY
	MOOD:
		1. Go to main Class
		2. Locate the index of  Mood
		3. Increase the index of Mood
	HUNGER:
		1. Go to main Class
		2. Locate the index of  Hunger
		3. Increase the index of Hunger
	HYGIENE:
		1. Go to main Class
		2. Locate the index of  Hygiene
		3. Decrease the index of Hunger	
	ENERGY:
		1. Go to main Class
		2. Locate the index of  ENERGY
		3. Decrease the index of ENERGY
2. If Person wants to RUB
	ENERGY:
		1. Go to main Class
		2. Locate the index of  ENERGY
		3. Increase the index of ENERGY
	MOOD:
		1. Go to main Class
		2. Locate the index of  MOOD
		3. Increase the index of MOOD
3. If Person wants to SCOLD
	MOOD:
		1. Go to main Class
		2. Locate the index of  MOOD
		3. Decrease the index of MOOD		
4. Show user of the Current Status of the Pet		
5. Ask User to Repeat Process
6. Return to Main Menu/Exit


FEED()
GOAL: Have the user feed with Pet
OUTPUT: Increase the index of pets hunger by 1
STEPS:
1. Go to main Class
2. Locate the index of  HUNGER
3. Decrease the index of HUNGER
4. Show user of the Current Status of the Pet		
5. Ask User to Repeat Process
6. Return to Main Menu/Exit

Shower()
GOAL: Have the user SHOWER THE Pet
OUTPUT: Set the Hygiene to MAX
STEPS:
1. Go to main Class
2. Locate the index of  HYGIENE
3. Decrease the index of HYGIENE
4. Show user of the Current Status of the Pet		
5. Ask User to Repeat Process
6. Return to Main Menu/Exit

RESET/IGNORE()
GOAL: Have the pet all values of index to 0
OUTPUT: Set the HYGIENE, HUNGER, ENERGY, and MOOD Index to 0
STEPS:
1. Go to main Class
2. Locate the index of  HYGIENE, HUNGER, ENERGY, and Mood
3. Decrease the index of those all to ZERO
4. Show user of the Current Status of the Pet		
5. Ask User to Repeat Process
6. Return to Main Menu/Exit

	 