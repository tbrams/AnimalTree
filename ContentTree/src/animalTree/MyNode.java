package animalTree;

public class MyNode {

		  static class myNode {
			  private String item;
			  private String question;
			  public myNode yes,no;
			  
			  myNode(String nyItem) {
				 this.item = nyItem;
				 this.question = null;
				 this.yes = null;
				 this.no = null;
			  }
			  
			  myNode() {
				 this.item = null;
				 this.question = null;
				 this.yes = null;
				 this.no=null;
			  }
			  
			  String What() {
				  return this.item;
			  }
			  
			  String Question() {
				  return this.question;
			  }
			  
			  void setQuestion(String q) {
				  this.question = q;
			  }
			  
			  boolean isLeaf() {
				  return (this.question==null);
			  }
			  boolean hasItem() {
				  return (this.item!=null);
			  }
			  
			  void ClearItem() {
				  this.item=null;
			  }
			  
			  void dumpAll() {
				  this.dumpAll("");
			  }
			  
			  void dumpAll(String space) {
				  if (this!=null) {
				     System.out.println(space+"<node>");
				     System.out.println(space+"   <item>"+this.item+"</item>");
				     System.out.println(space+"   <question>"+this.question+"</question>");
				     if (this.yes!=null) {
					     System.out.println(space+"   <yes>");
			             this.yes.dumpAll(space+"      ");
					     System.out.println(space+"   </yes>");
				     } else
				    	 System.out.println(space+"   <yes>null</yes>");
				     if (this.no!=null) {
					     System.out.println(space+"   <no>");
			             this.no.dumpAll(space+"      ");
					     System.out.println(space+"   </no>");
				     } else
				    	 System.out.println(space+"   <no>null</no>");
			     System.out.println(space+"</node>");
				  }
		     }
			  
		  }
}

