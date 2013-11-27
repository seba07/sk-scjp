package collections.mymap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * MAP
 * 
 * - map key to value - can not contain duplicate keys - 1 key - only 1 value -
 * Map interface has basic operations: put, get, remove, containsKey/Value,
 * size, empty bulk operations: putAll, clear and View operations: keySet,
 * entrySet, values - 3 types: HashMap, TreeMap, LinkedHashMap
 * 
 * 
 * 
 * 
 * 
 * @author SPKARSZX
 * 
 */
public class Main {

	private String text = "java Freq if it is to be it is up to me to delegate";

	public static void main(String args[]) {
		System.out.println("MAPS");
		new Main().myHashMap();
		new Main().myTreeMap();
		new Main().myLinkedHashMap();
	}

	public void myHashMap() {
		System.out.println();
		System.out.println("HashMap");
		String text = this.text;
		String[] wordsArray = text.split(" ");

		Map<String, Integer> frequenciesMap = new HashMap<String, Integer>();
		for (int i = 0; i < wordsArray.length; i++) {
			String key = wordsArray[i];
			Integer freq = frequenciesMap.get(key);
			frequenciesMap.put(key, freq == null ? 1 : freq + 1);
		}
		System.out.println(frequenciesMap);
	}

	/**
	 * In alphabetic order
	 */
	public void myTreeMap() {
		System.out.println();
		System.out.println("TreeMap");
		String text = this.text;
		String[] wordsArray = text.split(" ");

		Map<String, Integer> frequenciesMap = new TreeMap<String, Integer>();
		for (int i = 0; i < wordsArray.length; i++) {
			String key = wordsArray[i];
			Integer freq = frequenciesMap.get(key);
			frequenciesMap.put(key, freq == null ? 1 : freq + 1);
		}
		System.out.println(frequenciesMap);
	}

	/**
	 * With index order
	 */
	public void myLinkedHashMap() {
		System.out.println();
		System.out.println("LinkedHashMap");
		String text = this.text;
		String[] wordsArray = text.split(" ");

		Map<String, Integer> frequenciesMap = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < wordsArray.length; i++) {
			String key = wordsArray[i];
			Integer freq = frequenciesMap.get(key);
			frequenciesMap.put(key, freq == null ? 1 : freq + 1);
		}
		System.out.println(frequenciesMap);
	}

	public void myMapReviewing() {

	}
}
