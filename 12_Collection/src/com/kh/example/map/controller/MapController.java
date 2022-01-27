package com.kh.example.map.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

import com.kh.example.map.model.compare.SnackComparator;
import com.kh.example.map.model.vo.Snack;

public class MapController {
	public void doMap() {
//		HashMap map = new HashMap();	// 제네릭을 설정안하면 노란줄 경고문이 뜸
		HashMap<String, Snack> map = new HashMap<String, Snack>();
		
		// put(K Key, V value): V  -> 키와 값을 추가하는 메소드
		map.put("새우깡", new Snack("짠맛", 1500));
		map.put("다이제", new Snack("단맛", 2500));
		map.put("포테이토칩", new Snack("짠맛", 1500));
		map.put("고소미", new Snack("고소한맛", 1000));
		System.out.println(map);		// 순서 유지가 안됨
		map.put("새우깡", new Snack("매운맛", 1500));
		System.out.println(map);	// key값이 같아 위에 있는 새우깡이 덮어씌워져 매운맛 새우깡으로 출력됨

		// contiansKey(Object key):boolean		-> 해당 key가 있는지 확인하는 메소드
		// containsValue(Object value):boolean	-> 해당 value가 있는지 확인하는 메소드
		System.out.println(map.containsKey("새우깡"));
		System.out.println(map.containsValue(new Snack("짠맛", 1500)));	// new연산자에의해 주소 값이 달라 false가 출력됨
		// equals메소드 오버라이딩 해줘야함
		
		// get(Object key):V 	-> 키에 해당하는 값 반환하는 메소드
			// Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
			// : 키에 대한 값을 반환하고, 없다면 null이 반환됨
		System.out.println(map.get("다이제"));
		System.out.println(map.get("홈런볼"));
		
		// values():Collection<V>	-> 모든 value를 Collection에 담아 반환
		System.out.println(map.values());
		
		// keySet():Set<K>	->  Map안에 있는 key들을 모아 Set으로 반홤함
		// Returns a Set view of the keys contained in this map.
		// : Map안에 있는 Key들을 Set에 반홤함
		Set<String> set1 = map.keySet();
		System.out.println(set1);	// 
		Iterator<String> it1 = set1.iterator();
		while(it1.hasNext()) {
			String key = it1.next();	// 키들을 모아
			System.out.println(key + "=" + map.get(key));	// 그 키들을 맵으로 가지고 오는 방식
			
		}
		
		// entrySet():Set<Map.Entry<K,V>>	-> entry(key와 value)들을 모아 set으로 반환
			// Returns a Set view of the mappings contained in this map.
			// : Map안에 있는  멤핑되어있는 것들(key,value)를 set으로 반환
		Set<Entry<String, Snack>> set2 = map.entrySet();
		System.out.println(set2);
		Iterator<Entry<String, Snack>> it2 = set2.iterator();	// it2에는 entry가 들어 있음
		while(it2.hasNext()) {
			Entry<String, Snack> entry = it2.next();
			System.out.println(entry.getKey() + "=" + entry.getValue());	// 하나씩 매칭되어 출력 됨
			// Entry<String,Snack>으로 묶여져있어 바로 getkey()메소드를 사용하는 것이 아니라 entry.getKey로 입력해 Entry<~~>를 불러옴
			
		}
		
		//	TreeMap 이용해 정렬		// key를 기반으로 정령
		TreeMap<String, Snack> map2 = new TreeMap<String, Snack> ();
		map2.putAll(map);
		System.out.println(map2);	// String에 있는 정렬 기준으로 정렬이 됨
		
		// snackcomparator 이용
		TreeMap<String, Snack> map3 = new TreeMap<String, Snack>(new SnackComparator());
		map3.putAll(map3);
		System.out.println(map3);
		
		// remove(Object key):V	-> 해당 key의 entry 삭제 후 해당 값 변환
		System.out.println(map3.remove("다이제"));
		System.out.println(map3);
		// remove(Object key, Object value):boolean	-> 해당 키와 값이 모두 맞으면 삭제후 true반환
		System.out.println(map3.remove("고소미", new Snack("고소한맛", 1500)));
		System.out.println(map3);
		System.out.println(map3.remove("고소미", new Snack("고소한맛", 1500)));
		System.out.println(map3);
		
		// clear(): void 	-> 모든 entry 삭제
		//	isEmpty():boolean	-> map이 비어있는지 확인
		map3.clear();
		System.out.println(map3);
		System.out.println(map3.isEmpty());
		
	
	}
	
	public void doProperties() {
		// Properties : key와 value의 타입을 String오로만 제한
		Properties prop = new Properties();	// 제네리을 넣지 않아도 노란줄이 뜨지 앟음 why? 이미 String으로 제한되어 있기 때문
//		prop.put(1, 10);	// => {1=10}
//		System.out.println(prop);	// put()메소드는 HashTable안에 있는 메소드임 -> properties에서 값이 출력된 이유는 prop가 HashTable의 부모라서
		
		// Properties에 저장하는 메소드 : setProperty
		// setProperty(String key, String value):Object		-> Properties에 데이터 추가
		prop.setProperty("채소", "오이");
		prop.setProperty("과일", "사과");
		prop.setProperty("간식", "젤리");
		prop.setProperty("채소", "피망");
		System.out.println(prop);
		
		// getProperty(String key):String					-> key를 통해 value반환
		// getProperty(String key, defaultValue):String		-> key를 통해 value반환, 해당 key가 없으면 defaultValue반환
		System.out.println(prop.getProperty("채소"));
		System.out.println(prop.getProperty("견과"));
		System.out.println(prop.getProperty("채소", "땅콩"));		// 땅콩만 출력됨

	}
	
}	

