
class Employees
	{
	int salary=10000;;
	String cname=this.getClass().getName();
		void display()
		{
		System.out.println("The name of the class is "+cname);	
		}
		void calcSalary()
		{
			System.out.println("The salary of employee is "+salary);
		}
	}
class Engineer extends Employees
	{
	}
	
public class Inheritance
{
	public static void main(String args[])
	{
		Engineer eng=new Engineer();
		eng.display();
		eng.salary=20000;
		eng.calcSalary();
	}
}		