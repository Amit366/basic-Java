import java.io.*;
import java.util.*;

class Matrix extends A{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int a[][]=new int[3][3];
int b[][]=new int[3][3];

for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
a[i][j]=sc.nextInt();
b[i][j]=sc.nextInt();

}
}
Matrix m=new Matrix();
m.add(a,b);
B bb=new B();
bb.multiply(a,b);
}
}

class A {

void add(int m[][],int n[][]){
int c[][]=new int[3][3];
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){

c[i][j]=m[i][j]+n[i][j];
System.out.print(c[i][j]+" ");
}
System.out.println();
}
System.out.println();
}
}
class B {
void multiply(int m[][],int n[][]){
int c[][]=new int[3][3];
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
c[i][j]=0;
for(int k=0;k<3;k++){
c[i][j]+=m[i][k]*n[k][j];
}
System.out.print(c[i][j]+" ");
}
System.out.println();
}
System.out.println();
}
}