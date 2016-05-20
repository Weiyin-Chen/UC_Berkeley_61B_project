package project1;

public class DListNode1 {

	  /**
	   *  item references the item stored in the current node.
	   *  prev references the previous node in the DList.
	   *  next references the next node in the DList.
	   *
	   *  DO NOT CHANGE THE FOLLOWING FIELD DECLARATIONS.
	   */

	  public int[] item;
	  public DListNode1 prev;
	  public DListNode1 next;

	  /**
	   *  DListNode1() constructor.
	   */
	  DListNode1() {
	    item = new int[4];
	    prev = null;
	    next = null;
	  }

	  DListNode1(int a,int b,int c,int d) {
	    item = new int[4];
	    item[0]=a;
	    item[1]=b;
	    item[2]=c;
	    item[3]=d;
	    prev = null;
	    next = null;
	  }
	}

