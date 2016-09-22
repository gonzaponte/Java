import java.io.*;
import java.util.*;

public class TableReader
{
    static public boolean verbosity = true;
    private String  filename;
    private File    file;
    private Scanner scan;
    
    private String  output;
    
    public TableReader( String fname )
    {
        filename  = fname;
        open();
    }
    
    private boolean close()
    {
        if (verbosity) System.out.print("Attempting to close file" + filename + " => " );
        if (file == null)
        {
            System.out.print("File not yet opened.\n" );
            return false;
        }
        scan.close();
        System.out.print("Succesfully closed\n");
        return true;
    }
    
    private boolean open()
    {
        System.out.print("Attempting to open file" + filename + " => " );
        try
        {
            file = new File(filename);
            scan = new Scanner( file );
        }
        catch( FileNotFoundException e )
        {
            System.out.print("File not found!\n");
            return false;
        }
        System.out.print("Succesfully opened\n");
        
        return true;
    }
    
    public String read()
    {
        return scan.nextLine();
    }
}
