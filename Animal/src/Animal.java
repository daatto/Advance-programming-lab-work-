

public class Animal {
	
	public void dosome(Animal ani)
	{
		 try
		    {
		    	if(ani instanceof Oviparous)
		    	{
		    		if(ani instanceof Birds) { 
		    		System.out.println("this is a bird\n");
		    		}
		    		else if(ani instanceof Insects)
		    		{
		    			System.out.println("this is a insect\n");
		    		}
		    	}
		    	else if(ani instanceof Mammal)
		    	{
		    		if(ani instanceof Land) { 
		    		System.out.println("this is a land animal\n");
		    		}
		    		else if(ani instanceof Water)
		    		{
		    			System.out.println("this is a water animal\n");
		    		}
		    	}
		    }
		    catch(Exception e)
			   {
		    	 System.out.println("exception occured\n");	
		    }
	}
     public void check()
     {
    	 System.out.println(" animal\n");
     }
	public static void main(String[] args) {
	Animal ani=new Animal();
	Animal a;
    Birds an=new Birds();
    Water wa =new Water();
    ani.dosome(an);
    ani.dosome(wa);
    a=an;
    a.check();
    a=wa;
    a.check();
    Variatic aa=new Variatic();
    System.out.println(aa.ava(1,2,3,4,5,6,7));
	}

}
