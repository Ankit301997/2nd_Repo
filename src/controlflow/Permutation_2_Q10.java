package controlflow;
import java.util.Scanner;
public class Permutation_2_Q10 {

	public static void main(String[] args) {
		int n;

Scanner sc=new Scanner(System.in);

System.out.print("Total number N = ");
//reading the number of elements from the that we want to enter
n=sc.nextInt();
//creates an array in the memory of length 10
int[] array = new int[10];
for(int i=0; i<n; i++)
{
//reading array elements from the user
System.out.print("Number #"+ (i+1) +": ");
array[i]=sc.nextInt();
}

for (int x = 0; x < n; x++) {
for (int y = 0; y < n; y++) {
for (int z = 0; z < n; z++) {
if (x != y && y != z && z != x) {
System.out.println("(" + array[x] + ", " + array[y] + ", " + array[z] + ")");
}
}
}
}
	}}

