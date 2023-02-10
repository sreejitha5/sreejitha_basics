package com.basic;
/*interface will not be tightly coupled to the dependent class
 Here no i can MAKE DIFFERNT classes which can overrride the interface and give the needed result without much  dependency
 for ex:english greeting service can implement thuis interface and the desired result
 and french greeting service does the job separately without affecting the interface
  main nhelp is bcoz of overriding*/

public interface GreetingService {
     public void greet(String name);
}
