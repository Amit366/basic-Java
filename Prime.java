import java.io.*;
import java.util.*;
class Prime{
public static void main(String[] args){

Scanner sc= new Scanner(System.in);
int f=0;
System.out.println("Enter number");
int n=sc.nextInt();
for(int i=2;i*i<=n;i++){
if(n%i==0)
f=1;
}
if(f==0)
System.out.print(n+" is prime number");
else
System.out.print(n+" is not prime number");
}
}