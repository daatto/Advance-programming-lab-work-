
public class Variatic extends Animal {
	public double ava(int ... n)
	{
		int sum=0; int x=0;
		for(int i: n)
		{
			sum=sum+i;
			x=x+1;
		}
		
		return (sum/x);
	}

}
