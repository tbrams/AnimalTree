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
				 this.item = "Default...";
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
			  
			  void ClearItem() {
				  this.item=null;
			  }
			  
		  }
}

