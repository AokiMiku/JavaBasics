package matrices;

import basics.RandomGenerator;

public class IntMatrix 
{
	private int[][] Matrix;
	private int X;
	private int Y;
	
	public IntMatrix(int x, int y)
	{
		this(x, y, 0);
	}
	
	public IntMatrix(int x, int y, int initWith)
	{
		this.X = x;
		this.Y = y;
		this.Matrix = new int[x][y];
		
		for (int i = 0; i < this.Matrix.length; i++) 
		{
			for (int j = 0; j < this.Matrix[i].length; j++) 
			{
				this.Matrix[i][j] = initWith;
			}
		}
	}
	
	public int get(int x, int y)
	{
		return this.Matrix[x][y];
	}
	
	public void set(int x, int y, int value)
	{
		this.Matrix[x][y] = value;
	}
	
	public static IntMatrix getRandomMatrix(int x, int y, int randomMax)
	{
		IntMatrix randomMatrix = new IntMatrix(x, y);
		
		for (int i = 0; i < randomMatrix.Matrix.length; i++) 
		{
			for (int j = 0; j < randomMatrix.Matrix[i].length; j++) 
			{
				randomMatrix.Matrix[i][j] = RandomGenerator.getRandomNumber(0, randomMax);
			}
		}
		
		return randomMatrix;
	}
	
	public IntMatrix clone()
	{
		return new IntMatrix(this.X, this.Y);
	}
	
	public IntMatrix add(IntMatrix other)
	{
		if (this.X != other.X || this.Y != other.Y) 
		{
			return null;
		}
		
		IntMatrix add = this.clone();
		for (int i = 0; i < this.Matrix.length; i++) 
		{
			for (int j = 0; j < this.Matrix[i].length; j++) 
			{
				add.set(i, j, this.Matrix[i][j] + other.Matrix[i][j]);
			}
		}
		
		return add;
	}
	
	public IntMatrix substract(IntMatrix other)
	{
		if (this.X != other.X || this.Y != other.Y) 
		{
			return null;
		}
		
		IntMatrix substract = this.clone();
		
		for (int i = 0; i < this.Matrix.length; i++) 
		{
			for (int j = 0; j < this.Matrix[i].length; j++) 
			{
				substract.set(i, j, this.Matrix[i][j] - other.Matrix[i][j]);
			}
		}
		
		return substract;
	}
	
	public IntMatrix multiply(IntMatrix other)
	{
		if (this.X != other.X || this.Y != other.Y) 
		{
			return null;
		}
		
		IntMatrix multiply = this.clone();
		
		for (int i = 0; i < this.Matrix.length; i++) 
		{
			for (int j = 0; j < this.Matrix[i].length; j++) 
			{
				multiply.set(i, j, this.Matrix[i][j] * other.Matrix[i][j]);
			}
		}
		
		return multiply;
	}
	
	public IntMatrix divide(IntMatrix other)
	{
		if (this.X != other.X || this.Y != other.Y) 
		{
			return null;
		}
		
		IntMatrix divide = this.clone();
		
		for (int i = 0; i < this.Matrix.length; i++) 
		{
			for (int j = 0; j < this.Matrix[i].length; j++) 
			{
				divide.set(i, j, this.Matrix[i][j] / other.Matrix[i][j]);
			}
		}
		
		return divide;
	}
	
	public IntMatrix transpose()
	{
		IntMatrix transpose = new IntMatrix(this.Y, this.X);
		
		for (int i = 0; i < this.Matrix.length; i++) 
		{
			for (int j = 0; j < this.Matrix[i].length; j++) 
			{
				transpose.set(j, i, this.Matrix[i][j]);
			}
		}
		
		return transpose;
	}
	
	public boolean equals(IntMatrix other) 
	{
		if (this.X != other.X || this.Y != other.Y) 
		{
			return false;
		}
		
		for (int i = 0; i < this.Matrix.length; i++) 
		{	
			for (int j = 0; j < this.Matrix[i].length; j++) 
			{
				if (this.Matrix[i][j] != other.Matrix[i][j]) 
				{
					return false;
				}
			}
		}
		
		return true;
	}
	
	public String toString()
	{
		String toString = "";
		for (int i = 0; i < this.Matrix.length; i++) 
		{
			for (int j = 0; j < this.Matrix[i].length; j++) 
			{
				toString += this.Matrix[i][j] + ", ";
			}
			toString = toString.substring(0, toString.lastIndexOf(',')) +  "\n";
		}
		
		return toString;
	}
}