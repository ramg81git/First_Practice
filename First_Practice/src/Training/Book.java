package Training;

public class Book {
	int Bid;
	String Bname;
	char Status;
	
	Book(int id,String name,char status)
	{
		Bid=id;
		Bname=name;
		Status=status;
		
				
	}
	Book(int id,String name)
	{
		Bid=id;
		Bname=name;
			
				
	}
	
	
	Book(){
		
		
	}

	
void Display()
{
	System.out.println("Added Displaygit");
	System.out.println("Git");
	System.out.println(Bid);
	System.out.println(Bname);
	System.out.println(Status);
	
}
char bookstatus()
{
	return Status;
}

}
