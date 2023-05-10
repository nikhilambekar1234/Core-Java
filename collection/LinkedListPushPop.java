import java.util.LinkedList;
class LinkedListPushPop
 {

  public static void main(String[] args) 
  {

     // Create a LinkedList of Strings
     LinkedList<String> list = new LinkedList<String>();

     // Add few Elements
     list.add("Jack");
     list.add("Robert");
     list.add("Chaitanya");
     list.add("kate");

     // Display LinkList elements
     System.out.println("LinkedList contains before push: "+list);

     // push Element the list
     list.push("NEW ELEMENT");

     // Display after push operation
     System.out.println("LinkedList contains after push: "+list);
	 
	      // Display LinkList elements
     System.out.println("LinkedList before pop: "+list);

     // pop Element from list and display it
     System.out.println("Element removed: "+list.pop());

     // Display after pop operation
     System.out.println("LinkedList after pop: "+list);

  }
}
