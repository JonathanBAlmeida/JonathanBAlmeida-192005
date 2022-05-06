import java.util.Scanner;

public class ArrithematicOperation {
    public static void main(String args[]) {
        //creating scanner calss object
        Scanner sc = new Scanner(System.in);
        //input to numbers of users
        System.out.print("Enter first number: ");        
        int num1= sc.nextInt();
        System.out.print("Enter second number: ");
        int num2= sc.nextInt(); 
        //preform arithematic poeration
        int sum=num1+num2;
        int dif=num1-num2;
        int mul=num1*num2;
        int div=num1/num2;
        int mod=num1%num2;
        //print result to console
        System.out.println("sum: "+sum);
        System.out.println("dif: "+dif);
        System.out.println("mul: "+mul);
        System.out.println("div: "+div);
        System.out.println("modulo: "+mod);

    }
    
}
