package Module2_Assignment;

public class Q7_ATMPinValidatorWithRetryLogic {
    public static void main(String[] args){
        int attempt= 1;
        int correctPIN=4521;
        int enteredPIN = 0;
        while(attempt<=3){
            if(attempt==1){
                enteredPIN=1234;
            } else if(attempt==2) {
                enteredPIN=0000;
            } else if (attempt==3) {
                enteredPIN=4521;
            }
            if(enteredPIN==correctPIN){
                System.out.println("Access Granted. Welcome!");
                break;
            }
            else{
                System.out.println("Incorrect PIN." + (3 - attempt) + " attempt(s) remaining.");
            }
            attempt++;
        }
        if (attempt>3 && enteredPIN!=correctPIN) {
            System.out.println("Card Blocked. Contact your bank.");
        }
    }
}
