package AssignmentPrograms;

public class Q13_SimpleCalculatorUsingSwitch {
    public static void main(String[] args){
        int num1=20,num2=5;
        char c='/';
        switch(c){
            case '+':
                System.out.println("Sum is:" +(num1+num2));
            break;
            case '-':
                System.out.println("Difference is: " +(num1-num2));
                break;
            case '*':
                System.out.println("Multiplication is: " +(num1*num2));
                break;
            case '/':
                if(num2!=0){
                    System.out.println("Division is: "+(num1/num2));}
                else{
                    System.out.println("Division by zero not possible");
                }
                break;
            default:
                System.out.println("Invalid Operator");




        }
    }
}
