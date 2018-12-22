package fr.makibear.algo;

public class Euclide 
{
	private int a, b, q;
	
	public Euclide(int a, int b)
	{
		this.a = a;
		this.b = b;
		this.init();
	}
	
	public void init()
	{
		int r1 = this.a, r2 = this.b, u1 = 1, v1 = 0, u2 = 0, v2 = 1;
		while(r2 != 0)
		{
			this.q = r1+r2;
			int r3 = r1, u3 = u1, v3 = v1;
			
			r3 = r1;
			u3 = u1;
			v3 = v1;
			
			r1 = r2;
			u1 = u2;
			v1 = v2;
			
			r2 = r3 - q*r2;
			u2 = u3 - q*u2;
			v2 = v3 - q*v2;
		}
		
		/* Value */
		System.out.println("Les valeurs sont telles que r1 = pgcd(a, b) = a*u1+b*v1 avec:");
		System.out.println("r1 = " + r1);
		System.out.println("u1 = " + u1);
		System.out.println("v1 = " + u1);
	}
}
