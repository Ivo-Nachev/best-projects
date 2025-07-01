# A Java programme about numbers

## Description
This Java project is a homework from the Plovdiv university, and it is about some actions you can do with numbers in an array such as:
- looking for the position of an element
- shuffling the numbers
- finding the biggest/smallest number
- finding the sum and the average of all array elements
- check if the array is symmetrical
- displaying the array
- displaying the array in reverse



## Programme structure

### ``Main`` class

- Declaring an array of integers
- Defining the length and the numbers of the array as this happens in ``ArrayInput`` class
- After receiving the array input, the programme continues to the menu function in the ``Main`` class, which redirects the user to the ``Option`` class.

### ``ArrayInput`` class
Defining array's length and elements

### ``Option`` class

Making a choice whether to continue with one of the functionalities between 1–9 or to halt the code with 10

### ``ArrayOperations`` class

``Switch-case`` block which decides in which class the user is going to be sent depending on what was their choice
(Four of the functionalities are merged in two classes (3 and 6, 4 and 5 and 8 and 9) because they do similar things)

### ``FunctionalityOne`` class

Finding the element using bubble sort and binary search

### ``FunctionalityTwo`` class

This functionality randomly shuffles and prints the elements of the array without repeating any index.

It uses two helper arrays:

    randPositions – tracks which indices have already been used (all initialized to 0)

    randIndex – stores randomly generated indices

On each loop iteration, a new random index is generated. If that index hasn't been used yet (i.e., ``randPositions[index] == 0``), the value at that position is printed and marked as used.
This ensures that every element is printed exactly once, in a random order.

### ``FunctionalityThreeAndSix`` class

If the user's choice is 3, then it will display them the sum of all numbers. If it is 6, it will be the average of the numbers.

### ``FunctionalityFourAndFive`` class
If the user's choice is 4- it will print them the biggest number and if it is five-the smallest one.

### ``FunctionalitySeven`` class

Checking if the array is symmetrical.

### ``FunctionalityEightAndNine`` class

If the user's choice is 9, the array will be printed. If it is 8, it will be printed in reverse.