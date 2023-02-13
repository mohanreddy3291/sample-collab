public class Demo1
{
    public int x = 10;
    public double d1 = 14.3;

    public void addition(int x , int y)
    {
        System.out.println("addition() method in Demo1 class...!");
        int z = x + y;
        System.out.println(z);
    }

    //Method Over-loading
    public void substraction(int a,int b)
    {
        System.out.println("substraction() method-1 in Demo1 class...!");
        int i = b - a;
        System.out.println(i);
    }
    public void substraction(float f1,double d1)
    {
        System.out.println("substraction() method-2 in Demo1 class...!");
        double d2 = d1 - f1;
        System.out.println(d2);
    }


}

