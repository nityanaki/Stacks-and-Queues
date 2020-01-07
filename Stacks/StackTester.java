//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Stack;
import static java.lang.System.*;

public class StackTester
{
	private Stack<String> stack;

	public StackTester()
	{
		stack = new Stack<String>();
		setStack("");
	}

	public StackTester(String line)
	{
		stack = new Stack<String>();
		setStack(line);
	}
	
	public void setStack(String line)
	{
		stack.clear();
		String[] theset = line.split(" ");
		for (String k:theset)
		{
			stack.push(k);
		}
	}

	public void popEmAll()
	{
		System.out.println("popping all items from the stack");
		String fin = "";
		int k=stack.size();
		for (int i=0;i<k;i++)
		{
			fin+=stack.pop() + " ";
		}
		System.out.println(fin+"\n\n\n");
	}
	
	public String toString()
	{
		return stack.toString()+"\n";
	}

	//add a toString
}