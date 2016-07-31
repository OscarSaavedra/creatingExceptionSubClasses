package Exceptions;

public class Exception1 extends Exception {
    private int ExceptionParam1;

    Exception1(int a) {
        this.ExceptionParam1 = a;
    }

    @Override
    public String toString() {
        return "Exception1.NumberCannotBeBiggerThan5" +
                "{"+ExceptionParam1+"}";
    }
}
