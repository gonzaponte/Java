import java.util.*;

public class Fibonacci
{
    private long f0;
    private long f1;
    private long c0;
    private long c1;
    private Vector fs;
    
    public Fibonacci( int a0, int a1 )
    {
        fs = new Vector(0);
        f0 = a0;fs.addElement( new Long(f0) );
        f1 = a1;fs.addElement( new Long(f1) );
        
        c0 = c1 = 1;
        
    }

    public Fibonacci( int a0, int a1, int alpha, int beta )
    {
        fs = new Vector(0);
        f0 = a0;fs.addElement( new Long(f0) );
        f1 = a1;fs.addElement( new Long(f1) );
        
        c0 = alpha;
        c1 = beta;
    }

    
    public long get( int N )
    {
        if ( N >= fs.size() ) fs.addElement( new Long( c1 * get(N-1) + c0 * get(N-2)) );
        return ( (Long) fs.elementAt(N) ).longValue();
    }
    
    public void print()
    {
        System.out.println( fs );
    }
    
    
}