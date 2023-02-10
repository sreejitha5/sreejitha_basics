package main.java.com.basic.practice;

public class GreetingServiceFactory {
    public GreetingService getGreetingServiceFactory(String language){
        if(language.equals("English")) {
            return new EnglishGreetingService();
        }
        else if (language.equals("French")) {
                return new FrenchGreetingService();
            }
        else {
               throw new RuntimeException("no service found for "+ language+"language.");
        }
    }
}


