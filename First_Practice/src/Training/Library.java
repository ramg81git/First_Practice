package Training;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char x;
		Book b1= new Book(1,"Alphabet", 'A');
		Book b2= new Book(2,"numbers",'A');
		Book b3= new Book(3,"Java");
		Book b4= new Book();
		
	//b1.book();	
	b1.Display();
	b2.Display();
	b3.Display();
	x=b1.bookstatus();
	
	if  (x=='A')
		System.out.println("book is available");
else
System.out.println("book is not available");

	}

}
