package Collections;
import java.util.*;

public class Main {
	
	 public static void main(String[] args) {

	        Map<String, String> personMap = new HashMap<>();


	        personMap.put("Pupkin", "Ihor");
	        personMap.put("Protsak", "Vasya");
	        personMap.put("Donkruzo", "Vitalik");
	        personMap.put("Teff", "Bob");
	        personMap.put("Kash", "Ihor");
	        personMap.put("koko", "Gosha");
	        personMap.put("Kaskun", "Ira");
	        personMap.put("Boss", "Petro");
	        personMap.put("Srt", "Orest");
	        personMap.put("Guch", "Mary");

	        Set<Map.Entry<String, String>> set = personMap.entrySet();

	        String firstName = personMap.get(0);

	        for (Map.Entry<String, String> e : set) {
	            if (e.getValue().equals(firstName)) {
	                System.out.println("There are two person with same first name");
	            }
	        }
	        System.out.println(personMap);


	        String name = "Orest";
	        List<String> keyByName = new LinkedList<>();
	        for (Map.Entry<String, String> e : set) {
	            if (e.getValue() == name) {
	                keyByName.add(e.getKey());
	            }
	        }
	        for (String key : keyByName) {
	            personMap.remove(key);
	        }

	        System.out.println(personMap);


	}

}
