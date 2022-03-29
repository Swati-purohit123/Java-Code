package collectionstest;

import java.util.*;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> set= new LinkedHashSet();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		Iterator<String> i=set.iterator();
		while (i.hasNext())
		{
			System.out.println(i.next());
		}
		}

}
