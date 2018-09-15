
public class CmdLineArgs {
	public static void main(String[] args) {
		int sum = 0;
		for (String str : args) {
          sum += Integer.parseInt(str);
		}
		System.out.println("Sum: " +sum);
		
		
		int x = 10;
		// Boxing
		Integer iobj=x;
		
		//Unboxing
		int y = iobj;
		
		//autoboxing
		Integer z = iobj * x + y;
	}
}
