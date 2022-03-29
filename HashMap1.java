package collectionstest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map= new HashMap<Integer,String>();
		System.out.println("enter the name you want to added");
		Scanner sc= new Scanner(System.in);
		String s1= sc.next();
		map.put(1,s1);
		map.put(2,"swati");
		map.put(3,"swagatika");
		map.put(4,"purohit");
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getKey()+""+m.getValue());
		}
	}

}
