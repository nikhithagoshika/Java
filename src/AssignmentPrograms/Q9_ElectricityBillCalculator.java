package AssignmentPrograms;

public class Q9_ElectricityBillCalculator {
    public static void main(String[] args){
        int units=250;
        double bill=0;
        if(units<=100) {
            bill = units * 1.5;
            System.out.println(bill);
        }
        else if (units<=200) {
            bill = 100 * 1.5 + (units - 100) * 2.5;
            System.out.println(bill);
        }
        else if (units<=300) {
            bill=100*1.5+100*2.5+(units-200)*4;
            System.out.println(bill);

        }
        else
        {
            bill=100*1.5+100*2.5+100*4+(units-300)*6;
            System.out.println(bill);

        }


    }
}
