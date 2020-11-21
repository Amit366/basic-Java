import java.io.*;
import java.util.*;
class Fibo{

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter limit");
int n=sc.nextInt();
int a=0,b=1,c=0;

for(int i=1;i<=n;i++){



System.out.print(a+" ");
c=a+b;
a=b;
b=c;
}
}
}