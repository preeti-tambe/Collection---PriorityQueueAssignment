import java.util.PriorityQueue;

public class Question03 {

	public static void main(String[] args) {


PriorityQueue <String> p= new PriorityQueue <String>();
		
		p.add("kakashi");
		p.add("naruto");
		p.add("sasuke");
		p.add("sakura");
		
PriorityQueue <String> p1= new PriorityQueue <String>();
		
		p1.add("zenitus");
		p1.add("tanjiro");
		p1.add("inosake");
		
PriorityQueue <String> p2= new PriorityQueue <String>();
		
		
		for(String s : p1)
		{
			p.add(s);
		}
		
		p2.addAll(p);
		
		System.out.println(p2);
		
		
	}

}
