package com.test;



import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Test {

	public static TreeMap<String, ArrayList<String>> tm = new TreeMap<>();
	

	public void getCountry(String countryName) {
		if(tm.containsKey(countryName)) {
			System.out.println("Districts for the Entered Country:");
			System.out.println(tm.get(countryName));
		}else {
			System.out.println("Country Name not found");
		}
		System.out.println("=====================");
	}
	
	public void listCountryBefore(String countryName) {
		Set<Entry<String, ArrayList<String>>> set =tm.entrySet();
		System.out.println("District before country name:");
		for(Entry<String, ArrayList<String>> e:set) {
			if(e.getKey().equals(countryName)) {
			System.out.println(e.getValue()+":"+e.getKey());
			}
		}
		System.out.println("=====================");
	}
	
	public void listCountryAfter(String countryName) {
		Set<Entry<String, ArrayList<String>>> set =tm.entrySet();
		System.out.println("District after country name:");
		for(Entry<String, ArrayList<String>> e:set) {
			if(e.getKey().equals(countryName)) {
			System.out.println(e.getKey()+":"+e.getValue());
			}
		}
		System.out.println("=====================");
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		//Testing Data
		ArrayList<String> districts = new ArrayList<>();
		districts.add("RangaReddy");
		districts.add("Secundrabad");
		ArrayList<String> districts1 = new ArrayList<>();
		districts1.add("DC");
		districts1.add("LA");
		tm.put("India", districts);
		tm.put("USA", districts1);
		
		//testing 3 scenarios
		test.getCountry("abc");
		test.listCountryBefore("USA");
		test.listCountryAfter("India");
       
	}

}
