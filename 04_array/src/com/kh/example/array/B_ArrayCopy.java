 package com.kh.example.array;

import java.util.Arrays;

public class B_ArrayCopy {
	// ���� ���� : �迭�� �ּҸ� ����
	// ���� ���� : ������ ���ο� �迭�� �ϳ� �����Ͽ� ���� ���� �� ����
	//		1) for�� �̿�		2) System.arraycopy �̿�	3) Arrays.copyOf �̿�	4) clone (������� �ʴ´�)
	public void method1() {
		int[] originArr = {1, 2, 3, 4, 5};	// ����� ���ÿ� �ʱ�ȭ	// originArr �迭�� {1,~5}�迭�� �ּ� ���� ������ �ִ�
		int[] copyArr = originArr;	// ���� ����	// �� �ּ� ���� copyArr�� ����
		
		System.out.println("originArr : " + originArr);		// originArr �ּ� �� ���
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);		// copyArr �ּ� �� ���
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		copyArr[0] = 99;		// �纻 �迭 �� �����ϱ�
		System.out.println("originArr : " + originArr);	
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
	
		}
		
		//�����迭�� �纻�迭 ���ΰ� �����ϰ� �ִ� �迭�� ���� (�ּ� ���� ����)
	}
	// ���� ����
	
	public void method2() {
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[originArr.length];		
						// new int[5]�� �Է��ص� ������ originArr�� ���̸� �׷��� ������ �ò��� ������
						// ���� ���ڸ� �Է����� �ʰ� �����ϰ� .length�� �Ἥ �迭 ���� �״�� ������ �´�.
		
		// for���� �̿��� ����
		for(int i = 0; i < originArr.length; i++) {
			copyArr[i] = originArr[i]; 	// ���� ���� �־�� �� ���� = ������ ��;	
			// copyArr = originArr; -> �̷��� ������ �����ϴ� �ǹ̰� ����.(�ּ� ���� ������ �մ� ���̱� ������) 
			// ���� ���� ������ �ִ� ������ ���ȣ�� �̿��� �ε������� �־� �����ؾ� �ϱ� ����
		}
		System.out.println("originArr : " + originArr);	
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		copyArr[0] = 99;
		System.out.println();
		
		System.out.println("originArr : " + originArr);	
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		// ���� �迭�� �纻 �迭 ���ΰ� �����ϰ� �ִ� �迭�� �ٸ� (�ּ� ���� �ٸ�)
	}

	public void method3() {
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10];	// ���� ������ �ִ� ���� ���� ũ�� �Է�
		
		System.out.println("originArr : " + originArr);	
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
	
		}
//		System.arraycopy() �̿��� ����
		 
//		System.arraycopy(src, srcPos, dest, destPos, length);	// � �迭�� ��� ���� ��
//			src 	: ���� �迭
//			srcPos	: �����迭���� ���縦 ������ ��ġ
//			dest	: ���� �迭
//			destPos : ���� �迭���� �ٿ��ֱ⸦ ������ ��ġ
//			length	: ���� ����
		// ��, � �迭�� ��𼭺��� �����ؼ� ��𿡴ٰ� ��𿡼����� �ٿ��ְ� ��� ���� �ٿ���������
		
		// ���� �迭�� 0��°������ �����迭 ���̸�ŭ ���� �� , ���� �迭 3��°������ �ٿ��ֱ�
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);
		
		System.out.println();
		System.out.println();
		
		System.out.println("originArr : " + originArr);	
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
	
		}	// �迭 3��°�������� �����迭�� �ڵ����� �ٿ��־��� ��µ�
		
		System.out.println();
		originArr[0] = 99;		// �����迭 �� �ٲ㺸��
		System.out.println();
		
		System.out.println("originArr : " + originArr);	
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
	
		}	//  ������ ���� ���� (���� �ٸ� �ּ� ���� ���� �ֱ� ����)
	}

	public void method4() {
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10];
		
		System.out.println("originArr : " + originArr);	
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
//		Arrays.copyOf �̿�
		
//		Arrays.copyOf(original, newLength)	// copyOf ��ȯ�� -> int[](�迭)
//			original	: ���� �迭
//			newLength	: ??????
		 
		copyArr = Arrays.copyOf(originArr, originArr.length);	// ctrl ���� ���¿��� copyOf�� ������ Array.class�� ������
		
		System.out.println();
		System.out.println();
		
		System.out.println("originArr : " + originArr);	
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
	
		}
		System.out.println();
		originArr[0] = 99;
		System.out.println();
		
		System.out.println("originArr : " + originArr);	
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		System.out.println("copyArr : " + copyArr);
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
	
		}
	}

	
}