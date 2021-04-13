package com.tyss.elftraining.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MyHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> myhash=new HashMap<String, Integer>();
		myhash.put("Shwetha", 2);
		myhash.put("Smitha", 1);
		myhash.put("Shravan", 3);
		myhash.put("Sachu", 5);


		TreeMap<String, Integer> mytree=new TreeMap<String,Integer>();
		mytree.putAll(myhash);

		SortByValues byVal=new SortByValues();
		Set<Entry<String, Integer>> set =mytree.entrySet();	
		List<Entry<String,Integer>> list=new ArrayList<Entry<String,Integer>>(set);
		Collections.sort(list,byVal);
		for (Entry<String, Integer> entry : list) {
			System.out.println(entry);
		}
	}

}

