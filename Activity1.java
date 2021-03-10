import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

    public class Activity1 {
        
        public static void main(String[] args) throws Exception {
            BufferedReader br1 = null;                                   //The BufferedReader has an internal buffer which has intialized to null
            BufferedReader br2 = null;
			
            String sCurrentLine;                                         //Declare a string name sCurrentLine
            ArrayList<String> list1 = new ArrayList<String>();           //Create a new ArrayList for storing the elements in the first text file GirlNames.txt
            ArrayList<String> list2 = new ArrayList<String>();           //Create a new ArrayList for storing the elements in the second text file BoyNames.txt
			
            br1 = new BufferedReader(new FileReader("GirlNames.txt"));   //Reading the file GirlNames.txt
            br2 = new BufferedReader(new FileReader("BoyNames.txt"));    //Reading the file BoyNames.txt
			
            while ((sCurrentLine = br1.readLine()) != null) {
                list1.add(sCurrentLine);                                 //Adding elements to list1
            }
            while ((sCurrentLine = br2.readLine()) != null) {
                list2.add(sCurrentLine);                                 //Adding elements to list2
            }
			
            ArrayList<String> list3 = new ArrayList<String>(list1);      //Adding items to list3 from list1
            list3.addAll(list2);                                         //Adding items to list3 from list3
			
			System.out.println("This is list3 which contains all names in list1 and list2");
			System.out.println('\n');
            System.out.println(list3);                                   //Printing items in list3
			System.out.println('\n');
			Scanner sc= new Scanner(System.in);                          //System.in is a standard input stream  
            System.out.print("Enter  NAME : ");                          
            String str= sc.nextLine();                                   //Getting name as input from the user
						
			for (int i=0;i<list3.size(); i++)                            //Loop untill the list size iterating each item in list3
            {
			  
              String s1=list3.get(i);                                    
              if (s1.contains(str))                                      //checks if s1 contains string which was given as input
             {
                 System.out.println(str +" is a POPULAR NAME :-)");
				 break;
              }
			  
			  
			}		
}
			
				
 }
    