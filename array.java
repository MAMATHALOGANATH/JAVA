package array;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of elements ");
		n=s.nextInt();
		int[] array=new int[50];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++)
		{
			array[i]=s.nextInt();
		}
		System.out.println("array elements are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(array[i]);
		}
	}

}
