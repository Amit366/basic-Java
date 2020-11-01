import java.io.*;
import java.util.*;
class grades{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("1. Average is >90");
System.out.println("2. Average is >80 and <=90");
System.out.println("3. Average is >70 and <=80");
System.out.println("4. Average is >=50 and <=70");
System.out.println("5. Average is <50");
System.out.println("Enter your choice");
int t=sc.nextInt();
switch(t){

case 1: System.out.println("A");
        break;
case 2: System.out.println("B");
        break;
case 3: System.out.println("C");
        break;
case 4: System.out.println("D");
        break;
default:System.out.println("Fail");
}

}


}