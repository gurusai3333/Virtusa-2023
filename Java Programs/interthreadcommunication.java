import java.util.*;
import java.io.*;
import java.lang.*;

class TestIC{ 
 
public static void main(String args[]){ 
 
final Customer c=new Customer(); 
 new Thread()
{
public void run()
{
c.withdraw(15000);
}  

}.start(); 

 

new Thread()
{  
public void run()
{
c.deposit(10000);
}  
}.start();  

}}  


class Customer{  
	int amt=10000;  

	synchronized void withdraw(int amount)
	{  
	System.out.println("going to withdraw...");  

	if(this.amt<amount)
	{  
System.out.println("balance is not sufficient");  
		try
		{	
				wait();
			}

			catch(Exception e)
			{}  
		}  
		amt=amt-amount;  
		System.out.println("withdraw completed...");  
		System.out.println(amount);
	}  


	synchronized void deposit(int amount)
	{  
		System.out.println("going to deposit...");  
		amt=amt+amount;  
		System.out.println("deposit completed... ");  
		notify();  
	}  
}  




