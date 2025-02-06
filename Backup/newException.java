class heynewexception extends Exception{
	
	public heynewexception(String string)
	{
		super(string);
	}
}
public class newException {    
    public static void main(String[] args)
    {
        try 
        {
            if(10+5==15)
            {
                throw new heynewexception("This is exception");
            }
	    }
		
	    catch (heynewexception e)
	    {
		    System.out.println(e);
	    }
    
    }
}