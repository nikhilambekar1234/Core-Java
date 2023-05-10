//package com.company;
interface sampleInterface
{
    void meth1();
    void meth2();
}
//interface childSampleInterface implements sampleInterface       //Note: Remember that interface cannot implement another interface only classes can do that!
interface childSampleInterface extends sampleInterface
{
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface
{
    public void meth1()
	{
        System.out.println("meth1");
    }
    public void meth2()
	{
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}
public class Inherit
 {
    public static void main(String[] args)
	{
           MySampleClass obj1 = new MySampleClass();
	       obj1.meth1();
           obj1.meth2();
           obj1.meth3();
		   System.out.println("------------------------------------------------------------------");
		   
	       childSampleInterface obj2 = new MySampleClass();   // REFERENCE VARIABLE OF INTERFACE
		   obj2.meth1();
           obj2.meth2();
           obj2.meth3();
		   System.out.println("------------------------------------------------------------------");
		   
		   sampleInterface obj3 = new MySampleClass();   // REFERENCE VARIABLE OF INTERFACE
           obj3.meth1();
           obj3.meth2();
       //  obj3.meth3(); //NOT ALLOWED
    }
}
