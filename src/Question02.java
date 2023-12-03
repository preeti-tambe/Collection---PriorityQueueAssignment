import java.util.Iterator;
import java.util.PriorityQueue;

public class Question02 {

	public static void main(String[] args) {
		
		//add data and iterate data
		
PriorityQueue <String> p= new PriorityQueue <String>();
		
		p.add("kakashi");
		p.add("naruto");
		p.add("sasuke");
		p.add("sakura");
		
		Iterator it = p.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
