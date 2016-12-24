package pckg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;


public class Sample {

	/**
	 * @param args
	 */
	long t1,t2,t3,t4,t5,t6;
		public void readListA() throws IOException 
		{
			 
			BufferedReader br1=new BufferedReader(new FileReader("finaldata.csv"));
			String strLine1 = br1.readLine();
			ArrayList<String> list1=new ArrayList<String>();
			while(br1.readLine() != null)
			{
		    list1.add(br1.readLine());
			}

			BufferedReader br2=new BufferedReader(new FileReader("lookup.txt"));

			String strLine2 = br2.readLine();
			ArrayList<String> list2=new ArrayList<String>();
			while(br2.readLine() != null)
			{
		    list2.add(br2.readLine());
			}
			
			long arr[] = new long[10000];
			
			t2=System.currentTimeMillis();
			for (int i = 0; i<list2.size(); i++)
			{
			  if(list1.contains(list2.get(i)));
			  {
				  t1 = System.currentTimeMillis();
			
				 //arr[i]=t1;
				  t3=t1-t2;
				  //System.out.println("Time taken to search an element in Arraylist : "+t3+" ns");
				
			  }
			}
			
			System.out.println("Time taken to search record ID's in Arraylist : "+t3+" ns");
		}
		
		
		public void readListB() throws IOException 
		{
		
			BufferedReader br3=new BufferedReader(new FileReader("finaldata.csv"));
			String strLine3 = br3.readLine();
			LinkedList<String> list3=new LinkedList<String>();
			while(br3.readLine() != null)
			{
		    list3.add(br3.readLine());
			}

			BufferedReader br4=new BufferedReader(new FileReader("lookup.txt"));

			String strLine4 = br4.readLine();
			LinkedList<String> list4=new LinkedList<String>();
			while(br4.readLine() != null)
			{
		    list4.add(br4.readLine());
			}
			
			long arr[] = new long[10000];
			
			t4=System.currentTimeMillis();
			for (int i = 0; i<list4.size(); i++)
			{
			  if(list3.contains(list4.get(i)));
			  {
				  t5 = System.currentTimeMillis();
				
				 //arr[i]=t1;
				  t6=t5-t4;
			  }
			}
			System.out.println("Time taken to search record ID's in LinkedList : "+t6+" ns");
		}
		
		public static void main (String[] args) throws java.lang.Exception
		{
			
			Sample obj1=new Sample();
			obj1.readListA();
			Sample obj2=new Sample();
			obj2.readListB();
		}

		
		
	}

