
import java.util.*;
public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> LL=new LinkedList<String>();
		LL.add("a");
		LL.add("b");
		LL.addLast("c");
		LL.addFirst("d");
		LL.add(3, "e");
		System.out.println(LL);
		LL.remove("e");
		LL.removeFirst();
		LL.removeLast();
		LL.remove(0);
		System.out.println(LL);

	}

}
