import java.util.*;
import java.io.*;

public class ExtractEmailAddress
{
    public static void main( String args[] ) throws IOException
    {
        String filename = args[0];
        System.out.println("Opening file " + filename);
        
        BufferedReader fin = new BufferedReader( new FileReader(filename) );
        String line;
        while ( (line = fin.readLine()) != null )
        {
            int index = line.indexOf("@");
            print("" + index);
        }
        
    }
    
    private static void print( String str )
    {
        System.out.println(str);
    }

}