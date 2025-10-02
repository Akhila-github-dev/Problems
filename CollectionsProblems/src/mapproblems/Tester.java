package mapproblems;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Arrays;


class Tester{
	public static void main(String[] args) {
		ArrayList<String> empList = new ArrayList<>(Arrays.asList("Ajay","Sachin","Kamal","Swati","Ajay","Rahul","Amit")) ;
		Map<String,Integer> empDetails = new HashMap<String,Integer>();
		
		for (String name : empList) {
			empDetails.put(name, empDetails.getOrDefault(name,0)+1);
		}
		
		for(Entry<String, Integer> map:empDetails.entrySet()) {
			if(map.getValue()>1) {
				System.out.println(map.getKey()+" "+map.getValue());
			}
		}
	

	}
}