package HW1.Test;

public class Lesson {
    public int sum( Integer a, Integer b) {
        if( a==null || b==null) {
            throw new IllegalArgumentException();
        }
        return a + b;
    }
}
