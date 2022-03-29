package collectionstest;

import java.util.*;

public class HashSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet();
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
