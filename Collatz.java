// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]);//the highest seed
		String mode = args[1];
		if(mode.equals("v")){
			for(int i = 1; i <= n; i++){
				int col = i;
				int count = 1;
				System.out.print(col + " ");
				do{
					if(col % 2 == 0){
					col /= 2;
					}else{
						col = col * 3 + 1;
					}
					System.out.print(col + " ");
					count ++;
				}while(col != 1);
				System.out.print("(" + count + ")");
				System.out.println(); 
				}
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		}else{
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		}
		
		
	}
}
