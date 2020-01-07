//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -  

public class PQTestRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		PQTester test = new PQTester();
		test.setPQ("one two three four five six seven");
		System.out.println("toString() - " + test);	
		System.out.println("getMin() - " + test.getMin());
		System.out.println("getNaturalOrder() - " + test.getNaturalOrder()+"\n");
		
		test.setPQ("1 2 3 4 5 one two three four five");
		System.out.println("toString() - " + test);	
		System.out.println("getMin() - " + test.getMin());
		System.out.println("getNaturalOrder() - " + test.getNaturalOrder()+"\n");
		
		test.setPQ("a p h j e f m c i d k l g n o b");
		System.out.println("toString() - " + test);	
		System.out.println("getMin() - " + test.getMin());
		System.out.println("getNaturalOrder() - " + test.getNaturalOrder()+"\n");	
	}
}