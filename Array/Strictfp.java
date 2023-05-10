/*java Strictfp Keyword
Java strictfp keyword ensures that you will get the same result on every platform if you perform operations in the floating-point variable. 
The precision may differ from platform to platform that is why java programming language have provided the strictfp keyword, 
so that you get same result on every platform. So, now you have better control over the floating-point arithmetic.
________________________________________
Legal code for strictfp keyword
The strictfp keyword can be applied on methods, classes and interfaces.
1.	strictfp class A{}//strictfp applied on class  
1.	strictfp interface M{}//strictfp applied on interface  
1.	class A{  
2.	strictfp void m(){}//strictfp applied on method  
3.	}  
________________________________________
Illegal code for strictfp keyword
The strictfp keyword cannot be applied on abstract methods, variables or constructors.
1.	class B{  
2.	strictfp abstract void m();//Illegal combination of modifiers  
3.	}  
1.	class B{  
2.	strictfp int data=10;//modifier strictfp not allowed here  
3.	}  
1.	class B{  
2.	strictfp B(){}//modifier strictfp not allowed here  
3.	}  

*/