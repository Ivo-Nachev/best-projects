def main():

    principal=0
    interest=0
    time=0
    check=True
    
    while True:
    
        try:
            principal=float(input("Enter the principal: "))
            check=True
        except ValueError:
            check=False
        
        if principal<0 or not check:
            print("It cannot be a string or less than null.")
        elif check:
            break
    
    while True:
        
        try:
            interest=float(input("Enter the interest rate: "))
            check=True
        
        except ValueError:
            check=False
        
        if interest<0 or not check:
            print("It cannot be a string or less than null.")
        elif check:
            break
    
    while True:
        
    
        try:
            time=int(input("Enter the time in years: "))
            check=True
        except ValueError:
            check=False
    
        if time<0 or not check:
            print("It cannot be a string or less than null.")
        elif check:
            break
    
    total=principal*pow((1+interest/100), time)
    
    print(f"Balance after {time} year/s is {total:.2f} lv")

main()