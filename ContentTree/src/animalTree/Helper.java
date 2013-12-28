package animalTree;

import java.util.Scanner;

public class Helper {
    public static Character reply(String question) {
  	 Scanner linereader= new Scanner(System.in);

   	 System.out.println(question+"?");
       String tmp = linereader.nextLine(); 
  	 return tmp.toUpperCase().charAt(0);  
    }

}
