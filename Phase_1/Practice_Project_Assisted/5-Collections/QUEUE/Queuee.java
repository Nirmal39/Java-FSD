
import java.util.*;
import java.util.Queue;
public class Queuee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q=new PriorityQueue<String>();
		q.add("a");
		q.add("b");
		q.add("c");
		System.out.println(q);
		q.remove("c");
		System.out.println(q);
		q.peek();
		System.out.println(q);
		q.poll();
		System.out.println(q);
		

	}

}
