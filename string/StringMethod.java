/*Java String class methods
The java.lang.String class provides a lot of methods to work on string. By the help of these methods, we can perform operations on string such as trimming,
 concatenating, converting, comparing, replacing strings etc.
Java String is a powerful concept because everything is treated as a string if you submit any form in window based, web based or mobile application.
*/
class StringMethod
{
      public static void main(String arg[])
      {
              String s9="deepak";

              String s8="This is demo";
              String s5="";
               String s="Sachin Tendulkar";
               String s1="  nik  ";
               String s2=new String("nik");
               String s4=s1.concat(s);
			   System.out.println(s4);
               String s3=s2.intern();
               System.out.println(s.substring(6));
               System.out.println(s.substring(0,6));
               System.out.println(s.length());
               System.out.println(s1);
               System.out.println(s1.trim());
               System.out.println(s.toUpperCase());
               System.out.println(s.toLowerCase());
               System.out.println(s.charAt(0));
               System.out.println(s.charAt(2));
               System.out.println(s3 );
              System.out.println(s.startsWith("Sa"));
              System.out.println(s.endsWith("r"));
              System.out.println(s.isEmpty());   //false
              System.out.println(s5.isEmpty());//true
              System.out.println(s8.replace("is","was")); 
              System.out.println(s8.replaceFirst("is","was"));
              System.out.println(s9.indexOf("e"));
              System.out.println(s9.lastIndexOf('e'));
              System.out.println(s9.charAt(3));
              System.out.println(s9.contains("e"));
              System.out.println(s9.startsWith("ee"));
              System.out.println(s9.endsWith("ak"));

               int a=10;
               String s10=String.valueOf(a);
               System.out.println(s10);

               char[] c=s9.toCharArray();
               System.out.println(c);
               
      }
}