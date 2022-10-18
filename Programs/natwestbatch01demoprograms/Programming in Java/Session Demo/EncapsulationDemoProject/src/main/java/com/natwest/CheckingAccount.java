package com.natwest;

class AccountImpl{
    public static void main(String[] args) {
        CheckingAccount checkingAccount=new CheckingAccount();
      //  checkingAccount.name="Aakriti";
        checkingAccount.setAccountNumber(12345);
        System.out.println("Account Number = "+checkingAccount.getAccountNumber());
        checkingAccount.setName("Aakiriti");
        System.out.println("Name = "+checkingAccount.getName());
        checkingAccount.setEmail("Aakiriti@gmail.com");
        System.out.println("Email ID = "+checkingAccount.getEmail());
        checkingAccount.setMobileNo("9986754311");
        System.out.println("Mobile Number = "+checkingAccount.getMobileNo());
        checkingAccount.setAmount(50000.00);
        System.out.println("Balance = "+checkingAccount.getAmount());
        checkingAccount.deposit(20000.00);
        checkingAccount.withdrawal(40000.00);


    }
}


public class CheckingAccount {
    // Private Data
  private  int accountNumber;
  private  String name;
  private  String email;
  private  String mobileNo;
  private  double amount;

    public CheckingAccount() {
    }

    // Business Method
    // Deposit Amount
    public void deposit(double amount){
        this.amount +=amount;
        System.out.println("Balance = "+this.amount);
    }
    // Withdraw Amount
    public void withdrawal(double amt){
        if(amount >=amt){
            amount -=amt;
        }
        System.out.println("Balance = "+this.amount);
    }

    // public Methods

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


}
