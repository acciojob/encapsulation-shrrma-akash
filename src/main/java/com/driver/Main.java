package com.driver;

public class Main {
  public static void main(String[] args) {
        RWOnly rw = new RWOnly();


        //rw.name = "akash";
        //System.out.println(name);
        //java : name has private access in com.driver.RWOnly

        rw.setName("Akash");

        // get number...
        String ans= rw.getName();
        System.out.println(ans);
    }
}
