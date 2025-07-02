# A Python compound interest calculator

## Description
The programme estimates the compound interest using the user's input for principal amount, interest rate and time in years.

## Structure

- three ``while`` loops validate user input for principal, interest and time
- the final amount is calculated using the formula for compound interest: \[ A = P * (1 + r/100)^t \]


## Features 
- Input validation with `try-except` blocks
- Looping until correct input is provided
- Use of `math.pow()` for exponentiation

Eventually, the programme prints the final amount with two decimal places using an f-string.