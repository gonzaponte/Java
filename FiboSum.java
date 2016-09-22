import java.util.*;

public class FiboSum
{
    public static void main( String args[] )
    {
        Fibonacci fb = new Fibonacci( Integer.parseInt(args[0]), Integer.parseInt(args[1]), '*');
        fb.print();
        System.out.println( String.valueOf(fb.get(24)) );
        fb.print();
    }
    
}
