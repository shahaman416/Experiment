import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FilesExperiment 
{
    public static void main(String[] args) 
	throws 
	FileNotFoundException, IOException 
	{
         File fi = new File("C:\\Users\\shaha\\OneDrive\\Documents\\NameList.txt"); 
  int i=1;
  BufferedReader brd = new BufferedReader(new FileReader(fi)); 
  ArrayList<String> aList = new ArrayList<>();
  String str; 
  str = brd.readLine();
  while (str!= null) 
  {
      if((i%2)==1) 
      {
         aList.add(str); 
      }
  str=brd.readLine();
  i=i+1;
  }
  System.out.println(aList);
    } 
}
    
