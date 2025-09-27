item_count = int(input("Enter the intem count:- "))

item_price = float(input("Enter the price of item:- "))

bill = item_count *item_price
if(bill>=100):
    if(bill==100):
        print("is equal to 100")
    else:
        print("More than 100")
else:
    print("Less than 100")
