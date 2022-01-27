package com.kh.example.set.model.compare;

import java.util.Comparator;

import com.kh.example.set.model.vo.Dog;

public class DogComparator implements Comparator<Dog> {

	@Override
	public int compare(Dog o1, Dog o2) {
		// 이름으로 오름차순
		String standard = o1.getName();
		String object = o2.getName();
		
//		return standard.compareTo(object);	
		
		int result = standard.compareTo(object);	// 이름과 몸무게로 오름차순
		if(result == 0) {
			Double standardWeight = o1.getWeight();
			Double objectWeight = o2.getWeight();
			return standardWeight.compareTo(objectWeight);
		} else {
			return result;
		}
//		return standard.compareTo(object);	// 이름으로 오름차순
	}
	
}
