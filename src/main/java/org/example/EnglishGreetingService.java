package main.java.com.basic.practice;

public class EnglishGreetingService implements GreetingService{
    @Override
    public void greet(String name) {
        System.out.println("hello ,"+" "+ name);

    }
}
