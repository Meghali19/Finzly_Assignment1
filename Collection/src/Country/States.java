package Country;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class States 
{
	HashSet<City> m1()
	{
		City c1 = new City("MP", "Indore", 40);
		City c2 = new City("MP", "Bhopal", 50);
		City c3 = new City("MH", "Mumbai", 130);
		City c4 = new City("MH", "Pune", 89);
		City c5 = new City("KA", "Banglore", 126);
		City c6 = new City("KA", "Mangluru", 30);
		City c7 = new City("MH", "Nagpur", 76);
		City c8 = new City("MP", "Ujjain", 61);
		City c9 = new City("KA", "Mysuru", 36);
		City c10 = new City("MP", "Dewas", 37);
		City c11 = new City("KA", "Udupi", 30);
		City c12 = new City("MH", "Nashik", 46);
		
		
		HashSet<City> hMP = new HashSet<>();
		hMP.add(c1);
		hMP.add(c2);
		hMP.add(c8);
		hMP.add(c10);
		
		HashSet<City> hMH = new HashSet<>();
		hMH.add(c3);
		hMH.add(c4);
		hMH.add(c7);
		hMH.add(c12);
		
		HashSet<City> hKA = new HashSet<>();
		hKA.add(c5);
		hKA.add(c6);
		hKA.add(c9);
		hKA.add(c11);
		
		HashMap<String, HashSet<City>> hm = new HashMap<>();
		hm.put("Madhya Pradesh", hMP);
		hm.put("Maharashtra", hMH);
		hm.put("Karnataka", hKA);
		
		TreeMap<String, HashMap<String, HashSet<City>>> india = new TreeMap<>();
		india.put("India", hm);
		
		return hMP;
	}

}
