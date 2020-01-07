//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  - This lab demonstrates a way to use PriorityQueues with Objects.

import java.util.*;

public class MonsterPQRunner
{
	public static void main ( String[] args )
	{
		MonsterPQ tom = new MonsterPQ();
		Scanner input = new Scanner(System.in);
		System.out.print("How many monsters did you wish to enter? :: ");
		int size = input.nextInt();
		System.out.println();
		for (int i=0;i<size;i++)
		{
			System.out.print("Enter the ht :: ");
			int ht=input.nextInt();
			System.out.print("Enter the wt :: ");
			int wt=input.nextInt();
			System.out.print("Enter the age :: ");
			int age=input.nextInt();
			System.out.println();
			tom.add(new Monster(ht,wt,age));
		}
		System.out.println(tom+"\n");
		System.out.println("getMin() :: " + tom.getMin());
		System.out.println("removeMin() :: " + tom.removeMin()+"\n");
		System.out.println(tom+"\n");
		System.out.println("getMin() :: " + tom.getMin());
		System.out.println("removeMin() :: " + tom.removeMin()+"\n");
		System.out.println(tom+"\n");
					
	}
}