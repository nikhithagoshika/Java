package AssignmentPrograms;

public class Q3_GradeClassifier {
    public static void main(String[] args){
        int marks = 90;
        if(marks>100)
            System.out.println("Invalid Marks");
        else if (marks>=90)
            System.out.println("Grade O");
        else if (marks>=75)
            System.out.println("Grade A");
        else if (marks>=60)
            System.out.println("Grade B");
        else if (marks>=45)
            System.out.println("Grade C");
        else
            System.out.println("Fail");

            
        }
    }

