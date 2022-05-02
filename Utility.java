import java.io.IOException;
class Utility
{
    public static void divide(int x,int y) 
    {
       try
       {
          if(y!=0)
             System.out.println(x/y); 
          throw new IOException();
       }
       catch(IOException ex)
       {
           System.out.println("Caught in divide() "+ex);
       }   
    }
}


/*if a method throws an Checked Exception then the method should either catch it or should be declared with throws clause.

this is not applicable in case of Unchecked Exceptions*/