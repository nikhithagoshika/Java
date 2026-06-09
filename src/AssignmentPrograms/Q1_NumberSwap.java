package AssignmentPrograms;

public class Q1_NumberSwap {
    public static void main(String[] args)
    {
        int a=45,b=78;
        System.out.println("Value of a and b Before Swap:"+a+" "+b);
        a=a+b;//a=45+78=123 so a=123
        b=a-b;//b=123-78=45 so b=45
        a=a-b;//a=123-45=78 so a=78
        System.out.println("Value of a and b After Swap: "+a+" "+b);
    }
}
