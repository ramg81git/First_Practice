import java.util.*;
public class Arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int x=0;
		int a1[][]= {{1,12,3},{7,3,2},{10,4,6},{8,8,7}};		
				
	
	int r = a1.length;
	int c=a1[0].length;

	/*for(int i=0;i<r;i++) {
		
		for(int j=0;j<c;j++)
		{
			for(int k=j+1;k<c;k++)
		
			{
				if(a1[i][j]>a1[i][k])
				{
					x=a1[i][j];
				a1[i][j]=a1[i][k];
				
				a1[i][k]=x;	}
			}
		}
	} */
	
	
	

for(int y[]:a1) {
	Arrays.sort(y);
	System.out.println(Arrays.toString(y));	}
    
System.out.println(Arrays.deepToString(a1));


//for(int z:y)
	//System.out.println(z);
	
}
			



}	
