import java.util.Scanner;
import java.math.BigInteger;
 
class A{}
class AddingLargeNumbers {
  public static void main(String[] args) {
    String number1, number2;
    Scanner in = new Scanner(System.in);
 
    System.out.println("Enter first large number");
    number1 = in.nextLine();
 
    System.out.println("Enter second large number");
    number2 = in.nextLine();
 
    BigInteger first  = new BigInteger(number1);
    BigInteger second = new BigInteger(number2);
    BigInteger sum;
 
    sum = first.add(second);
 
    System.out.println("Result of addition = " + sum);
  }
}
Java programming source code
import java.util.Scanner;
 
class AddNumbers
{
   public static void main(String args[])
   {
      int x, y, z;
      System.out.println("Enter two integers to calculate their sum ");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      y = in.nextInt();
      z = x + y;
      System.out.println("Sum of entered integers = "+z);
   }
}
// palindrome class example
class PalindromeExample{  
 public static void main(String args[]){  
  int r,sum=0,temp;    
  int n=454;//It is the number variable to be checked for palindrome  
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  
// Factorial Program using loop in java

//Let's see the factorial Program using loop in java.

class FactorialExample{  
 public static void main(String args[]){  
  int i,fact=1;  
  int number=5;//It is the number to calculate factorial    
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  
Output:

Factorial of 5 is: 120

