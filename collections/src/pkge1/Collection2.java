package pkge1;

import java.util.HashMap;
import java.util.Map;

public class Collection2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 HashMap<Integer,String> hm=new HashMap<Integer,String>();  
		  
		  hm.put(1,"Deepika");  
		  hm.put(2,"Mounika");  
		  hm.put(3,"Sandeep");
		  hm.put(4,"Ganesh");
		  hm.put(5,"Sindhu");
		  
		  for(Map.Entry m:hm.entrySet()){  
		  System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 }    
	}

