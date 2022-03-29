package collectionstest;

import java.util.*;

public class ConvertArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array= {"swati","swagatika","purohit"};
		System.out.println(Arrays.toString(array));
		List<String> list= new ArrayList<String>();
		for(String name:array)
		{
			list.add(name);
		}
		Iterator itr= list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}
}
