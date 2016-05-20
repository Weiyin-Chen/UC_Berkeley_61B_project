package project1;


public class DList1 {

	  /**
	   *  head references the first node.
	   *  tail references the last node.
	   *
	   *  DO NOT CHANGE THE FOLLOWING FIELD DECLARATIONS.
	   */

	  public DListNode1 head;
	  public DListNode1 tail;
	  public int size;

	  /* DList1 invariants:
	   *  1)  head.prev == null.
	   *  2)  tail.next == null.
	   *  3)  For any DListNode1 x in a DList, if x.next == y and x.next != null,
	   *      then y.prev == x.
	   *  4)  For any DListNode1 x in a DList, if x.prev == y and x.prev != null,
	   *      then y.next == x.
	   *  5)  The tail can be accessed from the head by a sequence of "next"
	   *      references.
	   *  6)  size is the number of DListNode1s that can be accessed from the
	   *      head by a sequence of "next" references.
	   */

	  /**
	   *  DList1() constructor for an empty DList1.
	   */
	  public DList1() {
	    head = null;
	    tail = null;
	    size = 0;
	  }

	  /**
	   *  DList1() constructor for a one-node DList1.
	   */
	  public DList1(int a,int b,int c,int d) {
	    head = new DListNode1(a, b, c, d);
	    tail = head;
	    size = 1;
	  }

	 

	  /**
	   *  insertFront() inserts an item at the front of a DList1.
	   */
	  public void insertFront(int a,int b,int c,int d) {
	    // Your solution here.
		  if(head==null){
			  head = new DListNode1(a,b,c,d);
			  tail = head;
			 
		  }else if(head==tail){
			  head = new DListNode1(a,b,c,d);
		
			  head.next = tail;
			  tail.prev = head;
		  }else{
			  DListNode1 NewOne = new DListNode1(a,b,c,d);
			  NewOne.next = head;
			  head.prev = NewOne;
			  head = NewOne;
		  }
		  size++;  
	  }

	  /**
	   *  removeFront() removes the first item (and node) from a DList1.  If the
	   *  list is empty, do nothing.
	   */
	  public void removeFront() {
	    // Your solution here.
		  if(head==null){
		  }else if (head==tail){
			  head =null;
			  tail = null;
			  size--;
		  }else if(head!=tail && size==2){
			  head = tail;
			  head.next = null;
			  tail.prev = null;
			  size--;
		  }else{
			  head.next = null;
			  head.next.prev = null;
			  head = head.next;
			  size--;
		  }
	  }

	  /**
	   *  toString() returns a String representation of this DList.
	   *
	   *  DO NOT CHANGE THIS METHOD.
	   *
	   *  @return a String representation of this DList.
	   */
	  public String toString() {
	    String result = "[  ";
	    DListNode1 current = head;
	    while (current != null) {
	      result = result + current.item + "  ";
	      current = current.next;
	    }
	    return result + "]";
	  }
}