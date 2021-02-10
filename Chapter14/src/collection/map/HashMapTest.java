package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>(); // interface형이라 new Map으로 구현 불가
		
		//객체 추가
		hashMap.put("네이버", 300000);
		hashMap.put("카카오", 400000);
		hashMap.put("엔씨소프트", 900000);
		
		System.out.println(hashMap); //hashMap은 toString재정의가 되어 있어서 그냥 출력해도 출력값이 나오고 {}형태로 표시
		
		//중복 추가
		hashMap.put("카카오", 500000); //key는 중복불가, value는 변경가능
		System.out.println(hashMap);
		
		//특정 객체의 값 가져오기
		System.out.println("네이버 : "+hashMap.get("네이버"));
		
		System.out.println("===목록 조회===");
		//목록 출력 - Set사용, Iterator 클래스 사용 //map&set은 연관됨
		Set<String> keySet = hashMap.keySet(); //key 객체 사용
		for(String key : keySet) {
			Integer value = hashMap.get(key);
			System.out.println(key+":"+value);
		}
		/*Iterator<String> ir = keySet.iterator();
		Iterator<String> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			String key = ir.next(); //1. key를 가져오고
			Integer value = hashMap.get(key); //2. key를 매개로 값을 가져옴
			System.out.println(key+":"+value);
		}*/
		
		
		//객체 삭제
		String removeCompany = "네이버";
		if(hashMap.containsKey(removeCompany)) { //key가 존재한다면
			hashMap.remove(removeCompany); //해당 key를 삭제
		}
		hashMap.put("삼성전자", 1000000);
		System.out.println(hashMap);
		
	}

}
