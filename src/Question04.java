import java.util.PriorityQueue;

public class Question04 {

	public static void main(String[] args) {
		
PriorityQueue <String> p= new PriorityQueue <String>();
		
		p.add("kakashi");
		p.add("naruto");
		p.add("sasuke");
		p.add("sakura");
		
		String s= "Iruka sensie";
		
		p.add(s);
		
		System.out.println(p);
	}

}
