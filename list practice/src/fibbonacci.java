
public class fibbonacci {

	public static void main(String[] args) {
		
		int first=0;
		int second=1;
		int last=10;
		System.out.println(first);
		System.out.println(second);
		for(int i=0;i<=10;i++)
		{
		last=first+second;
		first=second;
		second=last;
		
System.out.println(last);
		}
	}

}
 