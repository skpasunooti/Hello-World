package firstProject;

public class A {
	
	    public static void M1()
	    {
	      System.out.println("welcome to world of dotnet"); 
	    }
	    public static int M2()
	    { 
	        return 2 * 3 + 4 - 5 - 7 / 6 + 5 % 2; 
	    }
	    public static String M3()
	    {
	        return "sathya" + 10; 
	    }
	    public static int M4(int x, int y)
	    {
	        return x + y; 
	    }
	    
	    public static double M6(int x)
	    {
	        return x + 2.3; 
	    }
	  
	    public static boolean M8()
	    {
	        if (10 > 5)
	        { 
	          System.out.println("its right"); 
	        }
	        return true; 
	    }


	    public static boolean M9()
	    { 
	        return M8(); 
	    }
	    public static boolean M10()
	    {
	        boolean b = false;
	        if (M8())
	        {
	            b = true; 
	        }
	        return b;
	    }
	    public int M11()
	    { 
	        return 2 + 3 * 5 - 8 / 2 + 9 % 2; 
	    }
	    public int M12()
	    {
	        return M2() + M11(); 
	    }
	  
	    public int  M14()
	    {
	        return 10; 
	    }
	    public int M15()
	    { 
	        return (int)M14(); 
	    }
	}
	

