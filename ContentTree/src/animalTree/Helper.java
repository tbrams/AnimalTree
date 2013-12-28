package animalTree;

import java.util.Scanner;

public class Helper {
    public static Character replyYesNo(String question) {
  	 Scanner linereader= new Scanner(System.in);
     char response=' ';
     char tmp=' ';
   	 while (response==' ') {
   		 System.out.println(question+"? [Y/N]");
         tmp = linereader.nextLine().toUpperCase().charAt(0);
         if ((tmp=='Y') || (tmp=='J') || (tmp=='N')) response=tmp;
   	 }
  	 return response;  
    }

}
