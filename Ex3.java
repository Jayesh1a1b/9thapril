package patternProgram;

public class Ex3 {

	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****
		//row->5;column->5
		
		int star=1;
		for(int i=1;i<=5;i++)//outer loop for row
		{
			for(int j=1;j<=star;j++)//inner loop for column
			{
				System.out.print("*");
			}
			System.out.println("");
			star++;
		}

	}

}
