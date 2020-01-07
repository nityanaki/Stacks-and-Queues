//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -  

import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PQTester
{
	private Queue<String> pQueue;

	public PQTester()
	{
		setPQ("");
	}

	public PQTester(String list)
	{
		setPQ(list);
	}

	public void setPQ(String list)
	{
		pQueue = new PriorityQueue<String>();
		String[] kay = list.split(" ");
		for (int i=0;i<kay.length;i++)
		{
			pQueue.add(kay[i]);
		}
	}
	
	public Object getMin()
	{
		return pQueue.peek();
	}
	
	public String getNaturalOrder()
	{
		String output="";
		int soize = pQueue.size();
		for (int i=0;i<soize;i++)
		{
			output+=pQueue.remove()+" ";
		}
		return output;		
	}

	public String toString()
	{
		return pQueue.toString();
	}
}