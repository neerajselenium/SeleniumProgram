import java.io.File;
 
public class FileReadOnlyOrNot
{    
    public static void main(String[] args) 
    {
        File anyTextFile;
        anyTextFile = new File("C:\\Users\\Ketan Chaudhary\\Desktop\\This.txt");

        //making the file as read-only using setReadOnly() method

        final boolean b = anyTextFile.setReadOnly();

        //Checking anyTextFile is read-only or writable
         
        if(anyTextFile.canWrite())
        {
            System.out.println("File is writable...!");
        }
        else
        {
            System.out.println("File is read-only...!");
        }
    }    
}