import java.io.*;
import java.util.*;
class MYclass{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
int t=sc.nextInt();
Object ob=new Object();
ob.func(t);
}
}

class Object{
void func(int a){

int x= 60*24*365;

int year=a/x;
int days=(a/(60*24))%365;
System.out.print(a+" "+"minutes is approximately"+" "+year+" "+"years and"+" "+days+" days");

}

}


