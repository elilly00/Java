package com.kh.example.map.model.compare;

import java.util.Comparator;

public class SnackComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {	// compare() : ���� �� ���� ����
		return -o1.compareTo(o2);
		
	}

	
}
