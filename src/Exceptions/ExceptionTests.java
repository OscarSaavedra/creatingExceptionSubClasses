package Exceptions;

public class ExceptionTests {
    protected static void test1(int a) throws Exception1 {
        System.out.println("You've introduced "+a);
        if (a>5){
            throw new Exception1(a);
        }else{
            System.out.println("No exception");
        }
    }
}
