package collectionstest;

import java.util.*;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list= new LinkedList<String>();
		list.add("swati");
		list.add("swagatika");
		list.add("purohit");
		list.add("nilam");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	

}
