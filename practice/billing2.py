item_count = int(input("Enter the intem count:- "))

item_price = float(input("Enter the price of item:- "))

bill = item_count *item_price
if(bill>=100):
    if(bill==100):
        print("is equal to 100")
    elif(bill>100):
        if(bill>500):
            print("Greater than 500")
        elif(bill==500):
            print("equal to 500")
        elif(bill<400):
            print("less than 400")
else:
    print("Less than 100")
