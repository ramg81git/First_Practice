
public class Maxmin {

	public static void main(String[] args) {
		
		int a[]={12,45,3,66,95,46,24,105};
		
        int max=a[0];
        
        for(int i=0;i<a.length;i++)
        {
        	if(a[i]>max)
        		
        		max=a[i];
        	
        }
        System.out.println("max number is"); 
	System.out.println(max);  
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<max)
		
		max=a[i];
				
	}System.out.println("min number is");
	System.out.println(max);
	
	
        
        
        
        
        
        
        
        
        
        
	}

}
