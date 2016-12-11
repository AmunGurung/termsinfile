import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class terms
{
     public static void main(String[] args) throws IOException
     {
       FileReader fr = new FileReader("C:\\Users\\User\\Desktop\\terms.txt");
       BufferedReader br = new BufferedReader(fr);  
        
       String str;
       int choice;
       int three = 3;
       int two = 2;
       ArrayList<String> list = new ArrayList<String>();
       while((str = br.readLine()) != null){
              list.add(str);
       }
       String[] terms = list.toArray(new String[0]);
       
       do {
         Scanner input = new Scanner(System.in);
         System.out.println("1. Search for a term.");
         System.out.println("2. Search for a keyword in the descriptions");
         System.out.println("3. End");
         System.out.println();
         System.out.println("Please key in choice: ");
         boolean found = false;
        
         do {
           choice = input.nextInt();
         }while (choice<1 | choice>3);
    
         Scanner in = new Scanner(System.in);
         int one = 1;
         String search = "n/a";
         if (choice == one){
            System.out.println("Please enter the name of the term you wish to search: ");
            search = in.nextLine();    
            for (int i = 0 ; i<20 ; i++) {
                  if (search.equals(terms[i])) {
                       System.out.println("Found. " + terms[i+ 1]); 
                       found = true;
                } 
              }  
            if (found = (false)){
                System.out.println("Term not found.");
              }
            System.out.println();
         } 
         
         Scanner last = new Scanner(System.in);
         String keyword;
         boolean jack = false;
         if (choice == two) {
            System.out.println("Please enter a keyword: ");
            keyword = last.nextLine(); 
            for (int i = 0 ; i<20 ; i+=2) {
               if (terms[i+1].contains(keyword))   {
                   System.out.println("Found , for " + terms[i]);
                   System.out.println(terms[i+1]);
                   jack = true;
                }
            } 
            if (found = (false)){
                   System.out.println("No descriptions found containing this keyword.");
                }
            System.out.println();
            }
            
    }   while (choice!=three);
  }   
}