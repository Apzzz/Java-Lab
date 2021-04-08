
public class GarbageCollector
{
	public void finalize()
	{
		System.out.println("Garbage collected "+this);
	}
	public static void main(String args[])
	{
		GarbageCollector g1=new GarbageCollector();
		GarbageCollector g2=new GarbageCollector();
		g1=null;
		g2=null;
		System.gc();
	}
}
