package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class map_ex01 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>(); // <>안에 key, value 타입이 들어감
		map.put("001", "kim"); // key: "001", value: "kim" 
		map.put("002", "park"); 
		map.put("003", "kang");

		System.out.println(map.size()); //map에 몇개가 들어있는지 확인할 수 있음 / 결과 : 3
		
		System.out.println(map.get("001")); // "001"이라는 key에 무슨 value가 들어있는지 볼 수 있음
		
		System.out.println(map.get("002")); // map.get(여기에 보고자 하는 value의 키값을 적어넣기)

		Set<String> keys = map.keySet(); // 모든 key값을 꺼내보기. 
		System.out.println(keys); // 결과 : [001, 002, 003]
		
		Iterator<String> iter = keys.iterator(); // iterator : 반복자 => keys를 반복한다 라는 뜻. 


		
		
		
		
	
	}

}

