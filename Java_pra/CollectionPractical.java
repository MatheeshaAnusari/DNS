import java.util.Collection;
import java.util.LinkedList;

class CollectionPractical1{
	public CollectionPractical1(){
		Collection <Integer> c = new LinkedList();
		c.add(5);
		c.add(6);
		c.add(4);
		c.add(1);
        c.add(2);
		
		System.out.println("is it empty"+c.isEmpty());
		System.out.println("size="+c.size());
		System.out.println("Is it contain element 5="+c.contains(5));
		
		c.remove(6);
		
		System.out.println("Remaining ="+c);
		
}
    public static void main(String [] args)
	{
		new CollectionPractical1();
	}		
}