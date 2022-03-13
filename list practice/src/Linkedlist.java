
public class Linkedlist
{
Node head;
public void insert(int data)
{
	Node tmp=new Node();
	tmp.data= data;
	tmp.next=null;
	System.out.println("after assignment"+ tmp.data);
     if(head==null)
    	 
     {
    	head=tmp; 
     }
     else {
    	 Node n=head;
    	 while(n.next!= null)
    	 {
           n=n.next;     
    	 }
     n.next= tmp;
     }
}
     public void show()
     {
    Node tmp= head;
     while(tmp.next!= null)
     {
    	 System.out.println(tmp.data);
    	tmp=tmp.next;
    	 
    	 
  }
     System.out.println(tmp.data);

}
}
