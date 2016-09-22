import java.util.*;

public class tryTableReader
{
    public static void main( String args[] )
    {
        TableReader tr = new TableReader("table.txt");
        System.out.println( tr.read() );
        System.out.println( tr.read() );
        System.out.println( tr.read() );
        System.out.println( tr.read() );
        return;
    }
}