/*We can compare string in java on the basis of content and reference.
It is used in authentication (by equals() method), sorting (by compareTo() method), reference matching (by == operator) etc

1) String compare by equals() method
The String equals() method compares the original content of the string. It compares values of string for equality. String class provides two methods:
o	Public boolean equals(Object another) compares this string to the specified object.
o	Public Boolean equalsIgnoreCase(String another) compares this String to another string, ignoring case.

2) String compare by == operator
The = = operator compares references not values.

3) String compare by compareTo() method
The String compareTo() method compares values lexicographically and returns an integer value that describes if first string is less than, equal to or greater than second string.
Suppose s1 and s2 are two string variables. If:
o	s1 == s2 :0
o	s1 > s2   :positive value
o	s1 < s2   :negative value
*/
class TestCompaire
{
     public static void main(String arg[])
     {
           String s1="Sachin";
           String s2="Sachin";
           String s3=new String("Sachin");   
           String s7=new String("Sachin"); 
           String s4="Saurav";
          String s5="Ratan";
          String s6="SACHIN";
       
	      System.out.println("equals method....................................................");
	      System.out.println(s1.equals(s6));//FALSE
                        System.out.println(s1.equalsIgnoreCase(s6));//TRUE
		    
	       System.out.println(s1.equals(s2));
                         System.out.println(s1.equals(s3));
	       System.out.println(s1.equals(s4));
		   
           System.out.println("by (= =)operator....................................................");
           System.out.println(s1==s2);  //true  (because both refer to same instance)  
           System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  
            System.out.println(s7==s3);//false different reference address created by 
            
            System.out.println("compareTo method....................................................");
            System.out.println(s1.compareTo(s2));//0
            System.out.println(s1.compareTo(s5));//1(because s1>s4)  
            System.out.println(s5.compareTo(s1));//-1(because s4 < s1 )  
    }
}