class demo1
{
 public static void main(String  args[])
    {
      for(int i=1;i<=3;i++)
            { 
            System.out.println("start of outer loop");
                    for(int j=1;j<=3;j++)
                     {
                       System.out.println("start of  inner loop");
                      System.out.println("end of  inner loop");
                      }
             }
System.out.println("end of outer loop");
   System.out.println("*******");          
     
}
}




