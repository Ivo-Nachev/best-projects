
def main():
    
     while True:   
           try:
                   num1=float(input("Enter the first number: "))
                   break
           except ValueError: 
                    print("You should enter a number, not a string!")
               
           
     operator=input("Enter an operator: ")
         
     while not (operator=="+" or operator=="-" or operator=="/" or operator=="*"):
            print("This calculator only works with '+', '-', '*' and '/' !")
            operator=input("Enter an operator: ")
     
     while True:    
           try:
                   num2=float(input("Enter the second number: "))
                   break
           except ValueError:
                   print("You should enter a number, not a string!")
             
     
     result=0
     
     match operator:
           case "+":
               result=num1+num2
           case "-":
               result=num1-num2
           case "*":
               result=num1*num2
           case "/":
               result=num1/num2
           case _:
               print(f"The `{operator}` does NOT exists as an operator! Next time use something between +, -, *, /")
     
     
     print(round(result,2))

main()