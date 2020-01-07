//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Stack;
import java.util.Scanner;
import static java.lang.System.*;

public class PostFix
{
	private Stack<Double> stack;
	private String expression;

	public PostFix()
	{
		stack = new Stack<Double>();
		setExpression("");
	}

	public PostFix(String exp)
	{
		stack = new Stack<Double>();
		setExpression(exp);
	}

	public void setExpression(String exp)
	{
		stack.clear();
		expression=exp;
	}

	public double calc(double one, double two, char op)
	{
		if (op=='+')
			return one*1.0+two;
		if (op=='-')
			return one*1.0-two;
		if (op=='*')
			return one*1.0*two;
		if (op=='/'&&two!=0.0)
			return one*1.0/two;
		return 0.0;
	}

	public void solve()
	{
		for (int i=0;i<expression.length();i++)
		{
			char curr = expression.charAt(i);
			if (curr=='+'||curr=='/'||curr=='-'||curr=='*')
			{
				double two = stack.pop();
				double one = stack.pop();
				stack.push(calc(one,two,curr));
			}
			else if (curr==' ')
				continue;
			else
			{
				String add = Character.toString(curr);
				int addi = Integer.parseInt(add);
				stack.push(addi*1.0);
			}
			
		}
	}
	
	public String toString()
	{
		return expression+" = "+stack.peek();
	}
	
}