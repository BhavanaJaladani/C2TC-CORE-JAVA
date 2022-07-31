package tracker;

public class MultiCatchBlock {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			System.out.println(a[10]);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occurs");
			
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException occurs");
		}
        catch(Exception e)
		{
        	System.out.println("Parent Exception occurs");
		}
		
		System.out.println("execute");
	}

}
