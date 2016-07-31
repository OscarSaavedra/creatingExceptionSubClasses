import Exceptions.ExceptionTests;
import Exceptions.Exception1;
import java.util.InputMismatchException;
import java.util.Scanner;

class Main extends ExceptionTests {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Put number 1");
            int num=sc.nextInt();
            System.out.println("Put number 2");
            int num2=sc.nextInt();
            try{
                test1(num);
                test1(num2);
            }catch (Exception1 me){
                System.out.println("Error: "+me);
            }
        }catch (InputMismatchException imme){
            System.out.println("You have to introduce a number");
            System.out.println("Complete exception name: "+imme);
        }
    }
}

