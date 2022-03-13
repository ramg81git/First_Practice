import java.util.*;

public class Simplearray {
	public static void main(String[] args)
	{
		
       int a[]= {10,5,7,3,15,25,1};
       String b[]= {"kavya","bhoomi","zoom","angel","riya"};
       String c[]= {"kavya","bhoomi","zoom","angel","riya"};
      
       System.out.println(Arrays.equals(c,b));
       
       List<String> l=new ArrayList<String>();
       l=Arrays.asList(b);
		System.out.println(l);
		System.out.println((l.contains("kavy")));
			
      for(int x:a)
     	   
       Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		for(String y:b) 
			Arrays.sort(b);	
		
		System.out.println(Arrays.toString(b));
		Collections.sort(l);
		System.out.println("new list"+  l);
	// 2d array of strings
		
		String s[][]= {{"priya","math"},{"shiva","science"},{"renu","eng"},{"amy","math"}};
		String s3[][]= {{"priya","math"},{"shiva","science"},{"renu","eng"},{"amy","math"}};
	
		for(String s1[]:s)	
			Arrays.sort(s1);
		//for(String s2:s1) 
		//System.out.println(s2);
		System.out.println(Arrays.deepToString(s));
		
		List<List> l1 = new ArrayList<List> ();
        for(String tmp[]:s)
        	l1.add(Arrays.asList(tmp));
        System.out.println("Newlist"+ l1);

		
	//System.out.println(Arrays.equals(c,b));
		System.out.println("from 2d");
		System.out.println(Arrays.equals(s, s3));
		System.out.println(Arrays.deepEquals(s, s3));
		
		
		
		
		
     }
}
