package main.java.com.basic.practice;

public class CoreJava {
    public void m1(){
        System.out.println("sree");
    }
    public void m2(){
        System.out.println("sde");
    }
}
class Overde extends CoreJava{
    public void m1() {
        System.out.println("akash");
    }
}
    class MainTest {
        public static void main(String[] args) {
            CoreJava p = new Overde();
          p.m1();
          p.m2();

    }
}