# 📱 Simple Bank Account System
The Java program is a simple system to showcase a banking system. Create an account, check balance, deposit money and withdraw money 

## ℹ️ Overview
/src folder contains all java files and classes.
- App.java creates an account and tests all functions of the BankAccount class
- BankAccount.java contains the overall structure of a bank account. A bank account contains 3 values:
  - ```accountNumber```: An account number of type "long". The value is randomized between the smallest 64-bit (1000000000) to Long.MAX_VALUE - 1
  - ```accountName```: An account name initialized in the constructor.
  - ```balance```: An account balance of type "long", initialized to 0.
  - ```toString()```: Inherited to print the accountName and accountNumber.
  -  ```checkBalance()```: Void function to print ```balance```.
  -  ```depositMoney()```: Void function to add deposit parameter to ```balance```. If balance + deposit is greater than the Long.MAX_VALUE, the bank account will be unable to hold that amount of money and an error is printed.
  -  ```withdrawMoney()```: Void function to withdraw amount from balance. If balance - withdraw is less than or equal to 0, an error is printed.

## :ballot_box_with_check: Purpose
The purpose of this application is to quickly create simple Java applications.
