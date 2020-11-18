
#Problem Statement (Parking Lot)

I own a multi­storey parking lot that can hold up to 'n' cars at any given point in time. Each slot is given a number starting at 1 increasing with increasing distance from the entry point in steps of one. I want to create an automated ticketing system that allows my customers to use my parking lot without human intervention. 

When a car enters my parking lot, I want to have a ticket issued to the driver. The ticket issuing process includes us documenting the registration number (number plate) and the colour of the car and allocating an available parking slot to the car before actually handing over a ticket to the driver (we assume that our customers are nice enough to always park in the slots allocated to them). The customer should be allocated a parking slot which is nearest to the entry. At the exit the customer returns the ticket which then marks the slot they were using as being available.

#Project Requirements

1. Latest version of JDK.
2. Latest version of maven.

#Project Requirements

1. I used fasad design patterns, created one interface with three method declaration- park, leave, status.
2. created one class which implement this method.
3. created one java constant class where park,leave,status command is declared.
4. this is bottom-up approache which is allign with oops concept.

#Build Instructions

Run the following command -
```sh
mvn clean install



 input in (file)
 
 create_parking_lot 6
park KA-01-HH-1234
park KA-01-HH-9999
park KA-01-BB-0001
park KA-01-HH-7777
park KA-01-HH-2701
park KA-01-HH-3141
leave KA-01-HH-3141 4
status
park KA-01-P-333
park DL-12-AA-9999
leave KA-01-HH-1234 4
leave KA-01-BB-0001 6
leave DL-12-AA-9999 2
park KA-09-HH-0987
park CA-09-IO-1111
park KA-09-HH-0123
status

output

Created parking lot with 6 slots

Allocated slot number: 1
Allocated slot number: 2
Allocated slot number: 3
Allocated slot number: 4
Allocated slot number: 5
Allocated slot number: 6

Registration number KA-01-HH-3141 with Slot Number 6 is free with charge 30

 KA-01-HH-1234 

 KA-01-BB-0001 

 KA-01-HH-2701 

 KA-01-HH-7777 

 KA-01-HH-9999 
Allocated slot number: 6
Sorry, parking lot is full


Registration number KA-01-HH-1234 with Slot Number 1 is free with charge 30

Registration number KA-01-BB-0001 with Slot Number 3 is free with charge 50

Car number DL-12-AA-9999 not found
Allocated slot number: 1
Allocated slot number: 3
Sorry, parking lot is full


 CA-09-IO-1111 

 KA-01-HH-2701 

 KA-01-HH-7777 

 KA-09-HH-0987 

 KA-01-HH-9999 

 KA-01-P-333 







