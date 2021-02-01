package matrices;

public class Matrix 
{
	public static void main(String[] args) 
	{
		IntMatrix m1 = new IntMatrix(2, 3, 2);
		IntMatrix m2 = new IntMatrix(2, 3, 4);
		IntMatrix m3 = IntMatrix.getRandomMatrix(2, 3, 20);
		
		System.out.println("m1:\n" + m1);
		System.out.println("m2:\n" + m2);
		System.out.println("m3:\n" + m3);
		
		System.out.println("m2.add(m1):\n" + m2.add(m1));
		System.out.println("m2.substract(m1):\n" + m2.substract(m1));
		System.out.println("m2.multiply(m1):\n" + m2.multiply(m1));
		System.out.println("m2.divide(m1)\n" + m2.divide(m1));
		System.out.println("m3.transpose():\n" + m3.transpose());
		
		IntMatrix[] arr = new IntMatrix[2];
		arr[0] = new IntMatrix(2, 3, 3);
		arr[1] = new IntMatrix(3, 2, 6);
		System.out.println("arr[0]:\n" + arr[0]);
		System.out.println("arr[1]:\n" + arr[1]);
		
		System.out.println("m1.get(1, 2): " + m1.get(1, 2));
		System.out.println("m2.get(1, 2): " + m2.get(1, 2));
		System.out.println("m3.get(1, 2): " + m3.get(1, 2));
		
		System.out.println("m1.equals(m2): " + m1.equals(m2));
	}
}