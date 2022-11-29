import java.util.*;

class Divya
{
public static void main(String args[])
{
Table obj=new Table();// obj of class table
A t1=new A(obj);// thread t1
B t2=new B(obj);// thread t2
t1.start();
t2.start();
}
}


class Table
{
 synchronized void print(int n)
{
for(int i=1;i<=5;i++)

{
System.out.println(n*i);
try
{

Thread.sleep(400);
}
catch(Exception e)
{
}
}// for loop
}// closing method
}// closing class table

class A extends Thread
{
Table t;// create variable for class Table- Table - datatype
A(Table t)// constructor
{
this.t=t;

}
public void run()
{
t.print(5);
}
}

class B extends Thread
{
Table t;// create variable for class Table- Table - datatype
B(Table t)// constructor
{
this.t=t;

}
public void run()
{
t.print(7);// calling the method
}
}




