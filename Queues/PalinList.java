//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  -

import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList
{
	private Queue<String> queue;
	private Stack<String> stack;

	public PalinList()
	{
		setList("");
	}

	public PalinList(String list)
	{
		setList(list);
	}

	public void setList(String list)
	{
		String[] words = list.split(" ");
		queue=new LinkedList<String>();
		stack=new Stack<String>();
		for (int i=0;i<words.length;i++)
		{
			queue.add(words[i]);
			stack.push(words[i]);
		}
	}

	public boolean isPalin()
	{
		ArrayList<String> store = new ArrayList<String>();
		for (int i=0;i<queue.size()/2;i++)
		{
			String comp1 = queue.remove();
			String comp2 = stack.pop();
			if (!(comp1.equals(comp2)))
				return false;
			queue.add(comp1);
		}
		
		
		return true;
	}

	public String toString()
	{
		String k = queue.toString();
		if (isPalin()==true)
			return k + " is a palinlist.";
		return k + " is not a palinlist.";
	}
}