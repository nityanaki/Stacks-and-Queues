//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Stack;
import static java.lang.System.*;

public class SyntaxChecker
{
	private String exp;
	private Stack<Character> symbols;
	private char[] open = {'(','{','<','['};
	private char[] close = {')','}','>',']'};

	public SyntaxChecker()
	{
		exp="";
		symbols = new Stack<Character>();
	}

	public SyntaxChecker(String s)
	{
		symbols = new Stack<Character>();
		setExpression(s);
	}
	
	public void setExpression(String s)
	{
		exp=s;
		symbols.clear();
	}

	public boolean checkExpression()
	{
		for (int i=0;i<exp.length();i++)
		{
			if (isOpen(exp.charAt(i)))
				symbols.push(exp.charAt(i));
			else if (isClosed(exp.charAt(i)))
			{
				int ind=-1;
				if (!(symbols.isEmpty()))
				{
					char comp = symbols.pop();
					if (comp==open[0])
						ind=0;
					else if (comp==open[1])
						ind =1;
					else if (comp==open[2])
						ind=2;
					else
						ind = 3;
					if (exp.charAt(i)!=close[ind])
						return false;
				}
				else
					return false;
			}
		}
		
		if (!(symbols.isEmpty()))
			return false;
		return true;
	}
	
	public boolean isOpen(char A)
	{
		for (int i=0;i<open.length;i++)
			if (A==open[i])
				return true;
		return false;
	}
	
	public boolean isClosed(char A)
	{
		for (int i=0;i<close.length;i++)
			if (A==close[i])
				return true;
		return false;
	}

	public String toString()
	{
		boolean prin = checkExpression();
		String phrase;
		if (prin)
			phrase = " is correct.";
		else
			phrase = " is incorrect.";
		return exp+phrase;
	}
}