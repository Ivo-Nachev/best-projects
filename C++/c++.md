# Car database- C++ project

This C++ programme is a simple example of a database for cars.

## Description

It allows the user to:
- enter information about cars (brand, year, colour, price)
- enter data about at most 30 cars 
- Sort the cars by year of production ascendingly
- Display the data in a formated table

## Programme content

### struct car

It represents a car's characteristics

- `brand` – car manufacturer 
- `year` – year of production
- `colour` – car colour 
- `price` – car value 



### main function

- Declaring an array of `car` structure
- Allowing the user to define the number of cars
- Calling the input, output and sorting by year functions


### input_data function

Enables the user to enter the details of each car


### sorting_by_year function

The cars are sorted by year using the bubble sort


### output_data function

It lays out the database as a table.

#### Instance output:
<pre>brand year colour price 
 bmw  1999  red   5600  
 opel 2001  blue  3000 </pre>