public class Demo2 extends Demo1
{
    public int x = 5;

    public void addition(int x , int y)
    {
        System.out.println("addition() method in Demo2 class...!");
        int z = x + y;
        System.out.println(z);
    }
    public void display()
    {
        System.out.println("display() method in Demo2 class...!");
        System.out.println(this.x); //5

        //super class properties
        System.out.println(super.x+"   "+super.d1); //10    14.3

        //Method Over-riding
        Demo1 dem1 = new Demo2();
        dem1.addition(1,2);  //3

        //Method Over-loading
        Demo1 dem11 = new Demo1();
        dem11.substraction(10,30); //20
        dem11.substraction(10f,100d);//90.0

    }

    public static void main(String args[])
    {
        System.out.println("main() method in Demo2 class...!");
        Demo2 dem2 = new Demo2();
        dem2.display();
    }
}
