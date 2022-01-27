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
//		HashMap map = new HashMap();	// ���׸��� �������ϸ� ����� ����� ��
		HashMap<String, Snack> map = new HashMap<String, Snack>();
		
		// put(K Key, V value): V  -> Ű�� ���� �߰��ϴ� �޼ҵ�
		map.put("�����", new Snack("§��", 1500));
		map.put("������", new Snack("�ܸ�", 2500));
		map.put("��������Ĩ", new Snack("§��", 1500));
		map.put("��ҹ�", new Snack("����Ѹ�", 1000));
		System.out.println(map);		// ���� ������ �ȵ�
		map.put("�����", new Snack("�ſ��", 1500));
		System.out.println(map);	// key���� ���� ���� �ִ� ������� ������� �ſ�� ��������� ��µ�

		// contiansKey(Object key):boolean		-> �ش� key�� �ִ��� Ȯ���ϴ� �޼ҵ�
		// containsValue(Object value):boolean	-> �ش� value�� �ִ��� Ȯ���ϴ� �޼ҵ�
		System.out.println(map.containsKey("�����"));
		System.out.println(map.containsValue(new Snack("§��", 1500)));	// new�����ڿ����� �ּ� ���� �޶� false�� ��µ�
		// equals�޼ҵ� �������̵� �������
		
		// get(Object key):V 	-> Ű�� �ش��ϴ� �� ��ȯ�ϴ� �޼ҵ�
			// Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
			// : Ű�� ���� ���� ��ȯ�ϰ�, ���ٸ� null�� ��ȯ��
		System.out.println(map.get("������"));
		System.out.println(map.get("Ȩ����"));
		
		// values():Collection<V>	-> ��� value�� Collection�� ��� ��ȯ
		System.out.println(map.values());
		
		// keySet():Set<K>	->  Map�ȿ� �ִ� key���� ��� Set���� ���c��
		// Returns a Set view of the keys contained in this map.
		// : Map�ȿ� �ִ� Key���� Set�� ���c��
		Set<String> set1 = map.keySet();
		System.out.println(set1);	// 
		Iterator<String> it1 = set1.iterator();
		while(it1.hasNext()) {
			String key = it1.next();	// Ű���� ���
			System.out.println(key + "=" + map.get(key));	// �� Ű���� ������ ������ ���� ���
			
		}
		
		// entrySet():Set<Map.Entry<K,V>>	-> entry(key�� value)���� ��� set���� ��ȯ
			// Returns a Set view of the mappings contained in this map.
			// : Map�ȿ� �ִ�  ���εǾ��ִ� �͵�(key,value)�� set���� ��ȯ
		Set<Entry<String, Snack>> set2 = map.entrySet();
		System.out.println(set2);
		Iterator<Entry<String, Snack>> it2 = set2.iterator();	// it2���� entry�� ��� ����
		while(it2.hasNext()) {
			Entry<String, Snack> entry = it2.next();
			System.out.println(entry.getKey() + "=" + entry.getValue());	// �ϳ��� ��Ī�Ǿ� ��� ��
			// Entry<String,Snack>���� �������־� �ٷ� getkey()�޼ҵ带 ����ϴ� ���� �ƴ϶� entry.getKey�� �Է��� Entry<~~>�� �ҷ���
			
		}
		
		//	TreeMap �̿��� ����		// key�� ������� ����
		TreeMap<String, Snack> map2 = new TreeMap<String, Snack> ();
		map2.putAll(map);
		System.out.println(map2);	// String�� �ִ� ���� �������� ������ ��
		
		// snackcomparator �̿�
		TreeMap<String, Snack> map3 = new TreeMap<String, Snack>(new SnackComparator());
		map3.putAll(map3);
		System.out.println(map3);
		
		// remove(Object key):V	-> �ش� key�� entry ���� �� �ش� �� ��ȯ
		System.out.println(map3.remove("������"));
		System.out.println(map3);
		// remove(Object key, Object value):boolean	-> �ش� Ű�� ���� ��� ������ ������ true��ȯ
		System.out.println(map3.remove("��ҹ�", new Snack("����Ѹ�", 1500)));
		System.out.println(map3);
		System.out.println(map3.remove("��ҹ�", new Snack("����Ѹ�", 1500)));
		System.out.println(map3);
		
		// clear(): void 	-> ��� entry ����
		//	isEmpty():boolean	-> map�� ����ִ��� Ȯ��
		map3.clear();
		System.out.println(map3);
		System.out.println(map3.isEmpty());
		
	
	}
	
	public void doProperties() {
		// Properties : key�� value�� Ÿ���� String���θ� ����
		Properties prop = new Properties();	// ���׸��� ���� �ʾƵ� ������� ���� ���� why? �̹� String���� ���ѵǾ� �ֱ� ����
//		prop.put(1, 10);	// => {1=10}
//		System.out.println(prop);	// put()�޼ҵ�� HashTable�ȿ� �ִ� �޼ҵ��� -> properties���� ���� ��µ� ������ prop�� HashTable�� �θ��
		
		// Properties�� �����ϴ� �޼ҵ� : setProperty
		// setProperty(String key, String value):Object		-> Properties�� ������ �߰�
		prop.setProperty("ä��", "����");
		prop.setProperty("����", "���");
		prop.setProperty("����", "����");
		prop.setProperty("ä��", "�Ǹ�");
		System.out.println(prop);
		
		// getProperty(String key):String					-> key�� ���� value��ȯ
		// getProperty(String key, defaultValue):String		-> key�� ���� value��ȯ, �ش� key�� ������ defaultValue��ȯ
		System.out.println(prop.getProperty("ä��"));
		System.out.println(prop.getProperty("�߰�"));
		System.out.println(prop.getProperty("ä��", "����"));		// ���Ḹ ��µ�

	}
	
}	

