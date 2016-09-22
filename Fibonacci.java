import java.util.*;

public class Fibonacci
{
    private long f0;
    private long f1;
    private long c0;
    private long c1;
    private char op;
    private Vector fs;
    
    public Fibonacci( int a0, int a1 )
    {
        this(a0,a1,'+');
    }

    public Fibonacci( int a0, int a1, char operator )
    {
        this(a0,a1,1,1,operator);
    }

    public Fibonacci( int a0, int a1, int alpha, int beta )
    {
        this(a0,a1,alpha,beta,'+');
    }

    public Fibonacci( int a0, int a1, int alpha, int beta, char operator )
    {
        fs = new Vector(0);
        f0 = a0;fs.addElement( new Long(f0) );
        f1 = a1;fs.addElement( new Long(f1) );
        
        c0 = (long) alpha;
        c1 = (long) beta;
        op = operator;
    }
    
    public long get( int N )
    {
        if ( N >= fs.size() ) extendList(N);
        return ( (Long) fs.elementAt(N) ).longValue();
    }
    
    private void extendList( int N )
    {
        Long newElement = null;
        long nextTo = c1 * get(N-1);
        long nextToNextTo = c0 * get(N-2);
        switch (op)
        {
            case '+':
                newElement = new Long( nextTo + nextToNextTo );
                break;
            case '*':
                newElement = new Long( nextTo * nextToNextTo );
                break;
        }
        
        fs.addElement( newElement );
    }
    
    public void print()
    {
        System.out.println( fs );
    }
    
    
}