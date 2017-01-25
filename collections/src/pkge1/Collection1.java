package pkge1;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList<Integer> al=new ArrayList<Integer>();//creating arraylist  
		 for(int i=1;i<=10;i++)
		 {
			 al.add(i); 
		 }
		  
		  
		  Iterator itr=al.iterator();//Iterator from arraylist to traverse elements  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	}
}
		

