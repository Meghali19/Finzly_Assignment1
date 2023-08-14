package com;

public class InheritanceHW 
{
    void show(String p)
    {
    	System.out.println("111");
    }
    void show(Object p)
    {
    	System.out.println("777");
    }
    
    public static void main(String []args)
    {
    	InheritanceHW ih = new InheritanceHW();
    	Object o = new Object();
    	o = null;
    	ih.show(null);                      //111
    	ih.show(new String());              //111
    	ih.show((Object)null);              //777 UPCASTING
    	ih.show(new Object());              //777
    	ih.show(o);                         //777
    	ih.show(new InheritanceHW());       //777
    }
}
