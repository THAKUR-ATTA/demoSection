// we will take a number variable and check whether the number is prime or not.

class PrimeExample{  
 public static void main(String args[]){  
  int i,m=0,flag=0;    
  int n=17;//it is the number to be checked  
  m=n/2;    
  for(i=2;i<=m;i++){    
   if(n%i==0){    
   System.out.println("Number is not prime");    
   flag=1;    
   break;    
   }    
  }    
  if(flag==0)    
  System.out.println("Number is prime");    
}  
}  
Output:

Number is prime


//Fibonacci Series in Java without using recursion

Let's see the fibonacci series program in java without using recursion.

class FibonacciExample1{  
public static void main(String args[])  
{    
 int n1=0,n2=1,n3,i,count=10;    
 System.out.print(n1+" "+n2);//printing 0 and 1    
    
 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
  
}}  
Output:

0 1 1 2 3 5 8 13 21 34

