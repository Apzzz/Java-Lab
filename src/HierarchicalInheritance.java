


class Employee 
{
	String name,address;
	int age;
	long ph;
	double salary;
	void print_Salary()
	{
		System.out.println("The salary is "+salary);
	}
}
class Officer extends Employee
{
	String spec,dept;
	Officer(String a,int b,long ch,String ad,double d,String s,String e)
	{
		name=a;
		age=b;
		ph=ch;
		address=ad;
		salary=d;
		spec=s;
		dept=e;
	}
	void display()
	{
		System.out.println("The details of officer are ");
		System.out.println("The name is "+name);
		System.out.println("The age is "+age);
		System.out.println("The phone number is "+ph);
		System.out.println("The address is "+address);
		print_Salary();
		System.out.println("The specialization is "+spec);
		System.out.println("The department is "+dept);
		System.out.println();
		
	}
}
class Manager extends Employee
{
	String spec,dept;
	Manager(String a,int b,long ch,String ad,double d,String s,String e)
	{
		name=a;
		age=b;
		ph=ch;
		address=ad;
		salary=d;
		spec=s;
		dept=e;
	}
	void display()
	{
		System.out.println("The details of manager are ");
		System.out.println("The name is "+name);
		System.out.println("The age is "+age);
		System.out.println("The phone number is "+ph);
		System.out.println("The address is "+address);
		print_Salary();
		System.out.println("The specialization is "+spec);
		System.out.println("The department is "+dept);
		System.out.println();
	}
}

public class HierarchicalInheritance 
{
	public static void main(String args[])
	{
		Officer o=new Officer("Tom",30,231549564,"Kochi",12000,"Planning","Civil");
		Manager m=new Manager("Tina",25,69364863,"Mumbai",10000,"Design","Architecture");
		o.display();
		m.display();
	}
}