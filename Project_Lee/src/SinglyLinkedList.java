	
public class SinglyLinkedList extends COSC2436_FA2018_BANKSERVICE_LEE{ 
		private Node h; // list header
		
	public SinglyLinkedList(){ 
		h = new Node(); // dummy node
		h.l = null;
		h.next = null;
	}
	
 	public boolean insert(BankCustomer_Lee newListing){ 
 		Node n = new Node();
 		if(n == null) // out of memory
 			return false;
 		else{ 	
 			n.next = h.next;
 			h.next = n;
 			n.l = newListing.deepCopy();
 			return true;
 		}
 	}
 	
 	public BankCustomer_Lee fetch(String targetKey){	 
 		Node p = h.next;
 		while (p != null && !(p.l.compareTo(targetKey) == 0)){ 
 			p = p.next;
 			}
 		if(p != null)
 			return p.l.deepCopy();
 		else
 			return null;
 	}
 	
 	
 	public boolean delete(String targetKey){ 
 		Node q = h;
 		Node p = h.next;
 		while (p != null && !(p.l.compareTo(targetKey) == 0)){
 			q = p;
 			p = p.next;
 		}
 		if(p != null){ 
 			q.next = p.next;
 			return true;
 		}
 		else
 			return false;
 	}
 	
 	public boolean update(String targetKey, BankCustomer_Lee newListing){ 
 		if(delete(targetKey) == false)
 			return false;
 		else if(insert(newListing) == false)
 			return false;
 		return true;
 	}
 	
 	public void showAll(){ 
 		Node p = h.next;
 		while (p != null) //continue to traverse the list
 		{ System.out.println(p.l.toString( ));
 			p = p.next;
 		}
 	}
 	
 	
 	public class Node{ 
 		private BankCustomer_Lee l;
 		private Node next;
 	public Node(){
 		}
 	}// end of inner class Node
 	
}//end SinglyLinkedList outer class