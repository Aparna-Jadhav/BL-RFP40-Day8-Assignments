import java.util.Scanner;
class Calculate
{

	static int  x1, x2, y1, y2;
	static int  a1, a2, b1, b2;

	static int firstLen, secondLen ;


	public static void calDis1(int x1,int y1,int x2,int y2)
	{
	    firstLen= ((int) Math.sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2));
	     System.out.println("Length of line "+"("+x1+","+y1+"),"+"("+x2+","+y2+") : " + ""+firstLen);
	}




	public static void calDis2(int a1,int b1,int a2,int b2)
	{
	    secondLen= ((int) Math.sqrt((a2 - a1) ^ 2 + (b2- b1) ^ 2));
	    System.out.println("Length of line = "+"("+a1+","+b1+"),"+"("+a2+","+b2+") : "+ secondLen);
	}
 


	public static void EqualOrNot( )
	{
		
		
	System.out.println("Comparison of line lenght is : "+Integer.valueOf(firstLen).equals((Integer.valueOf(secondLen))));
	}

}



public class LengthBwtPoint
{
	public static void main(String args[])
	
	{

		Calculate.calDis1(2,8,30,40);
		Calculate.calDis2(2,8,30,40);
		Calculate.EqualOrNot();
	}
	
}