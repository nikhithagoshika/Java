package AssignmentPrograms;

public class Q10_PalindromeNumber {
    public static void main(String[] args)
    {
        int n=12215;
        int Original=n;
        int rev=0;
        int rem;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(Original==rev){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
