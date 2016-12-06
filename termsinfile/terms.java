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
         
        
         do {
           choice = input.nextInt();
         }while (choice<1 | choice>3);
    
         Scanner in = new Scanner(System.in);
         int one = 1;
         String search = "n/a";
         if (choice == one){
            System.out.println("Please enter the name of the term you wish to search: ");
            search = in.nextLine();    
            
             if (search.equals(terms[0])) {
               System.out.println("Found. " + terms[1]); 
             } else if (search.equals(terms[2])) {
               System.out.println("Found. " + terms[3]);
             } else if (search.equals(terms[4])) {
               System.out.println("Found. " + terms[5]);
             } else if (search.equals(terms[6])) {
               System.out.println("Found. " + terms[7]);
             } else if (search.equals(terms[8])) {
               System.out.println("Found. " + terms[9]);
             } else if (search.equals(terms[10])) {
               System.out.println("Found. " + terms[11]);
             } else if (search.equals(terms[12])) {
               System.out.println("Found. " + terms[13]);
             } else if (search.equals(terms[14])) {
               System.out.println("Found. " + terms[15]);
             } else if (search.equals(terms[16])) {
               System.out.println("Found. " + terms[17]);
             } else if (search.equals(terms[18])) {
               System.out.println("Found. " + terms[19]);
             } else   {
               System.out.println("Term not found.");
             }      
            System.out.println();
         } 
         
         
         Scanner last = new Scanner(System.in);
         String keyword;
         if (choice == two) {
            System.out.println("Please enter a keyboard: ");
            keyword = last.nextLine();
            
               if (terms[1].contains(keyword))   {
                   System.out.println("Found , for " + terms[0]);
                   System.out.println(terms[1]);
               } else if (terms[3].contains(keyword))   {
                   System.out.println("Found , for " + terms[2]);
                   System.out.println(terms[3]);
               } else if(terms[5].contains(keyword))   {
                   System.out.println("Found , for " + terms[4]);
                   System.out.println(terms[5]);
               } else if(terms[7].contains(keyword))   {
                   System.out.println("Found , for " + terms[6]);
                   System.out.println(terms[7]);
               } else if(terms[9].contains(keyword))   {
                   System.out.println("Found , for " + terms[8]);
                   System.out.println(terms[9]);
               } else if(terms[11].contains(keyword))   {
                   System.out.println("Found , for " + terms[10]);
                   System.out.println(terms[11]);
               } else if(terms[13].contains(keyword))   {
                   System.out.println("Found , for " + terms[12]);
                   System.out.println(terms[13]);
               } else if(terms[15].contains(keyword))   {
                   System.out.println("Found , for " + terms[14]);
                   System.out.println(terms[15]);
               } else if(terms[17].contains(keyword))   {
                   System.out.println("Found , for " + terms[16]);
                   System.out.println(terms[17]);
               } else if(terms[19].contains(keyword))   {
                   System.out.println("Found , for " + terms[18]);
                   System.out.println(terms[19]);
               } else {
                   System.out.println("No descriptions found containing this keyword.");
               }
                  
               
            System.out.println();
            }
         
         
    }   while (choice!=three);
  }   
}