
class odd extends Thread
{
synchronized public void run()
{
	System.out.println(this.currentThread().getName() +" with priority "+this.currentThread().getPriority());
for(int i = 1 ; i<=100 ; i+=2)
{
/*if(i % 2 != 0)
{*/
System.out.print(i+" ");
//}
}
System.out.println();
}
}

class even extends Thread
{
synchronized public void run()
{
	System.out.println(this.currentThread().getName() +" with priority "+this.currentThread().getPriority());
for(int i = 2 ;i<=100 ;i+=2)
{
/*if(i % 2 == 0)
{*/
System.out.print(i+" ");
//}
}
System.out.println();
}
}

public class ThreadPriority
{
public static void main(String args[])
{
try
{
odd Odd = new odd();
Odd.setPriority(10);
even Even = new even();
Even.setPriority(5);
Thread.sleep(1000);
synchronized(args)
{
   if(Odd.getPriority() > Even.getPriority())
   {
Odd.start();
Odd.join();
Even.start();
}
   else
   {
    Even.start();
    Even.join();
    Odd.start();
   }
       }
}
catch(InterruptedException ex)
{
System.out.println("Thread interrupted "+ex);
   }
}
}


/*
class ThDemo extends Thread
{
	int i;
	public void odd()
	{
		System.out.println("Odd numbers ");
		for(i=1;i<50;i+=2)
			System.out.print(i+" ");
		System.out.println();
	}
	
	public void even()
	{
		System.out.println("Even numbers ");
		for(i=2;i<=50;i+=2)
			System.out.print(i+" ");
		System.out.println();
	}
}

public class twoThread {
	public static void main(String args[]) {
		ThDemo t1=new ThDemo();
		ThDemo t2=new ThDemo();
		t1.setPriority(8);
		t2.setPriority(5);
		if(t1.getPriority()>t2.getPriority())
		{
			System.out.println("Priority :"+t1.getPriority());
			t1.odd();
			System.out.println("Priority :"+t2.getPriority());
			t2.even();
		}
		else
		{
			t2.odd();
			t1.even();
		}
	}
}
*/
