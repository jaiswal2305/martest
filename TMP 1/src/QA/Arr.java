package QA;

import java.util.ArrayList;

public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int[] Array1= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
	    
		for(int i=0;i<=Array1.length;i++)
		{
			if (Array1[i] % 2 != 0)
			{
				System.out.println(Array1[i]);
			}
		}*/
	
	ArrayList<String> a= new ArrayList<String>();
	a.add("a");
	a.add("b");
	a.add("c");
	a.add("d");
	a.remove(2);

	System.out.println(a.get(1));
	
	}
	
}