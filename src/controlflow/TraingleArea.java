package controlflow;
import java.util.Scanner;
public class TraingleArea {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Point A co-ordinates");
		String[] PointA = sc.nextLine().split(" ");
		System.out.println("Point B co-ordinates");
		String[] PointB = sc.nextLine().split(" ");
		System.out.println("Point C co-ordinates");
		String[] PointC = sc.nextLine().split(" ");
		
		int aX = Integer.parseInt(PointA[0]);
		int aY = Integer.parseInt(PointA[1]);
		
		int bX = Integer.parseInt(PointB[0]);
		int bY = Integer.parseInt(PointB[1]);
		
		int cX = Integer.parseInt(PointC[0]);
		int cY = Integer.parseInt(PointC[1]);
		
		int area=(aX*(bY-cY)+bX*(cY-aY)+cX*(aY-bY))/2;
		System.out.println("Area is "+ Math.abs(area));
	}

}
