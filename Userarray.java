import java.util.Scanner;
public class Userarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Put in 5 integers");
int [] array = new int[5];
for(int i = 0; i<=array.length-1;i++) {
	array[i] = input.nextInt();
}
System.out.println(array[4]);
}
	}


