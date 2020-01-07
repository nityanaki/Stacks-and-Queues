//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.PriorityQueue;

public class MonsterPQ  
{
	private Queue<Monster> pQueue;

	public MonsterPQ()
	{
		pQueue = new PriorityQueue<Monster>();
	}

	public void add(Monster obj)
	{
		pQueue.add(obj);
	}
	
	public Object getMin()
	{
		return pQueue.peek();
	}
	
	public Object removeMin()
	{
		return pQueue.remove();
	}
	
	public String getNaturalOrder()
	{	
		String output="";
		int soize = pQueue.size();
		for (int i=0;i<soize;i++)
		{
			String rem = ((Monster)getMin()).toString();
			pQueue.remove();
			output+=rem + " ";
		}
		return output;			
	}
	
	public String toString()
	{
		return pQueue.toString();
	}
}
class Monster implements Comparable<Monster>
{
   private int height;
   private int age;
   private int weight;

   public Monster()
   {
   		height=0;
   		age=0;
   		weight=0;
   }  

   public Monster(int ht)
   {
   		height=ht;
   		age=0;
   		weight=0;
   }  
	
   public Monster(int ht, int et)  
   {
   		height=ht;
   		age=et;
   		weight=0;
   }

   public Monster(int ht, int wt, int age)  
   {
   		height=ht;
   		weight=wt;
   		this.age=age;
   }

   public void setWeight(int wt)
   {
   		weight=wt;
   }

   public void setHeight( int ht)
   {
   		height=ht;
   }
	
   public void setAge( int age) 
   {
   		this.age=age;
   }
	
   public Object clone()
   {
   		Monster cat = new Monster();
   		cat.setWeight(this.getWeight());
   		cat.setAge(this.getAge());
   		cat.setHeight(this.getHeight());
   		return cat;
   }

   public int getWeight() 
   {
   		return weight;
   } 
	
   public int getHeight()  
   {
   		return height;
   }
	
   public int getAge()
   {
   		return age;
   }  

   public boolean equals( Object o )
   {
   		if (((Monster)o).getAge()!=this.getAge())
   			return false;
   		if (((Monster)o).getWeight()!=getWeight())
   			return false;
   		if (((Monster)o).getHeight()!=getHeight())
   			return false;
   		return true;
   }
    
   public int compareTo( Monster rhs )
   {
   		if (getHeight()>rhs.getHeight())
   			return 1;
   		else if (getHeight()<rhs.getHeight())
   			return -1;
   		else if (getWeight()>rhs.getWeight())
   			return 1;
   		else if (getWeight()<rhs.getWeight())
   			return -1;
   		else if (getAge()<rhs.getAge())
   			return 1;
   		else if (getAge()<rhs.getAge())
   			return -1;
   		return 0;
   }
       
   public String toString( )
   {
   		return height + " " + weight + " " + age;
   }   		
}
