package Assignment_3;

public class Class_Encapsulation {
    private double balance=5000;
    private int ATM_pin=1234;
    private void validatePin(int enteredPin){
        this.ATM_pin=enteredPin;
    }
    public void DepositMoney(int enteredPin, double amount){
        if(ATM_pin!=enteredPin){
            System.out.println("Invalid Pin");
        }
        else if (amount<=0) {
            System.out.println("Enter valid amount");
        }
        else {
            balance=balance+amount;
            System.out.println("Deposit Successful!! Updated balance: "+balance);
        }

    }
    public void Withdraw(int enteredPin, double amount){
        if(ATM_pin!=enteredPin){
            System.out.println("Invalid Pin");
        }
        else if (amount<=0) {
            System.out.println("Enter valid amount");
        }
        else if (balance<amount) {
            System.out.println("Insufficient balance!!");
        } else {
            balance=balance-amount;
            System.out.println("Withdraw Successful!! Updated balance: "+balance);
        }

    }
    public void DisplayBalance(int enteredPin){
        if(ATM_pin!=enteredPin){
            System.out.println("Invalid Pin");
        }
        else{
            System.out.println("Balance amount is:"+balance);
        }


    }

}
