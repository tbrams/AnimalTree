package animalTree;

import java.util.*;
import java.io.*;
import animalTree.MyNode.myNode;

public class myNodeDemo {
	      	      	      
		  public static void main(String args[]) {
		      		  
		    Scanner linereader= new Scanner(System.in);		    
	  	    
	  	    // Initialize
	  	    myNode  node, node1;
	  	    node = new myNode();
	  	    node1= new myNode("A pigeon");
	  	    node.setQuestion("Please imagine an animal.\nAre you ready");
	  	    node.yes = node1;
	  	    
	  	    myNode root = node;
	  	    while (true) {
 			   while (!node.isLeaf()) {
                   if (Helper.replyYesNo(node.Question())=='Y') {
                 	  if (node.yes!=null) 
                		  node = node.yes;
                	  else
                		  break;
                   } else {
                	  if (node.no!=null) 
                		  node = node.no;
                	  else
                		  break;
                   }					
			   }
			
	  	       // do we have a solution?
               if (Helper.replyYesNo("Is it " + node.What())=='Y') {
                   // got it then exit and that is it...                	
    	  	       System.out.println("I knew it!\n:-)");
                   break;
                }
               
               	// this is a new item - make room with two new nodes
               // 1. Current Node will become new Question node
               // 2. Create new item node 1 for old item
               // 3. Create new item node 2 for new item
               
    	  	   	System.out.println("What is it then? ");
                String newItem = linereader.nextLine(); 
    	     	System.out.println("Give me a question that will enable me to tell the difference between "+node.What()+" and "+newItem+"? ");
                String newQuestion = linereader.nextLine(); 
                char branch=Helper.replyYesNo("And what is the answer for "+newItem);
                
                myNode newINode1 = new myNode(node.What());
                myNode newINode2 = new myNode(newItem);
                
                node.ClearItem();
                node.setQuestion(newQuestion);               	                	
                if (branch=='Y') {
                   node.yes=newINode2;
                   node.no= newINode1;
                }  
                else {
                   node.no=newINode2;
                   node.yes=newINode1;
                }   
                
                // go back to the top of the tree and start again
                node = root;
	  	    }
	   }
	}
