package main.java.com.basic.practice;

public class Main {
    public static void main(String[] args) {
        GreetingServiceFactory greetingServiceFactory = new GreetingServiceFactory();
      GreetingService greetingService =  greetingServiceFactory.getGreetingServiceFactory("English");
       greetingService.greet("sree");
    }
}

