import java.util.Scanner;
class Hello{
int a,b,sum;
Scanner s=new Scanner(System.in);
Hello(int a,int b){

this.a=a;
this.b=b;
}
void read()
{
a=s.nextInt();
b=s.nextInt();

}
void add()
{
sum=a+b;
}
void display()
{
System.out.println("sum="+sum);
}
}
class Demo{

public static void main(String args[])
  {
Hello h=new Hello(1,1);
//h.read();
h.add();
h.display();
 
  }
}