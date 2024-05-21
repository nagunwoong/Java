package chap15.sec08;

import java.util.*;

public class ImmutableExample {

	public static void main(String[] args) {
		
		// List, Set, Map 의 정적메소드인 of()로 생성함
		// List 불변 컬렉션 생성(저장된 요소를 변경하고 싶지 않을때 사용)
		List<String> immutableList1 = List.of("A", "B", "C");
		//immutableList1.add("E");
		//ImmutablList1.add("D"); X
		// ImmutablList1.remove("C"); X
		System.out.println("ImmutablList1 : " + immutableList1);
		
		
		// set 불변 컬렉션 생성
		Set<String> immutableSet = Set.of("A", "B", "C", "D");
		// ImmutablList2.add("E"); (X)
		// ImmutablList2.remove("A"); (X)
		System.out.println("immutableList2 : " + immutableSet);
		
		
		//Map 불변 컬렉션 생성
		Map<Integer, String> immutableMap = Map.of(
				1, "A",
				2, "B",
				3, "C"
				);
		// immutableMap.put(4, "D") (X)
		System.out.println("immutableMap : " + immutableMap);
		
		//List 컬랙션을 불변컬렉션으로 복사
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		List<String> immutableList2 = List.copyOf(list);
		System.out.println(list);
		//immutableList2.add("E") (X)
		System.out.println("immutableList2 = " + immutableList2);
		
		// Set 컬렉션을 불변 컬렉션으로 복사
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		Set immutableSet2 = Set.copyOf(set);
		System.out.println("set : " + set);
		System.out.println("immutableSet2 : " + immutableSet2);
		
		//Map 컬렉션을 돌변 컬렉션으로 복사
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(1, "B");
		map.put(1, "C");
		Map<Integer, String> immutableMap2 = Map.copyOf(map);
		System.out.println("map : "  + map);
		//immutableMap2.put (4, "D"); (X)
		System.out.println("immutableMap2 : " + immutableMap2);
		
		//배열로 부터 List 불변 컬렉션 생성
		String[] arr = {"A", "B", "C"};
		List<String> immutableList3 = Arrays.asList(arr);
		System.out.println("arr : " + arr);
		System.out.println("immutableList3 : " + immutableList3);
		
	}
	
}
