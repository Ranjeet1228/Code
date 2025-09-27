class Account:

    
    def __init__(self,account_No,balance):
        self.account_No = account_No
        self.balance = balance
    
    def credit(self, amount):
        self.balance += amount
        return
    
    def debit(self, amount):
        self.balance -= amount
        return
    
    def show_balance(self):
        return self.balance
    


account = int(input("Enter the account:- "))
balance = float(input("Enter the balance :- "))
ranjeet = Account(account,balance)

amount = int(input("Enter the amount to credit:- "))

ranjeet.credit(amount)

print(ranjeet.show_balance())