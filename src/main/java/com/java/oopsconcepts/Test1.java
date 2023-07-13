package com.java.oopsconcepts;

public class Test1 {
    public int sno = 9;

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    private int eno;
    private String ename;

    public static String sname = "Reddy";

    public void display(){
        System.out.println("Display method in Test1");
    }
    public static void say(){
        System.out.println("Static say method in Test1");
    }
    public void display(int x){
        System.out.println(x);
    }
    public void display(float a , String b){
        System.out.println(a +" " +b);

    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
       t1.display();
        t1.setEno(100);
        t1.setEname("Star");


    }

}
