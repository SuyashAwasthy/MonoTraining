package com.techlabs.forloop;

public class OnetoFiftyPrime {

	public static void main(String[] args) {
		System.out.println("Prime numbers from 1 to 50: ");
		boolean flag=true;
		int[] store = new int[51];
		int size=0;
		for(int i=2;i<=50;i++) {
				flag=true;
				for(int j=2;j<=Math.sqrt(i);j++)
					if(i%j==0) flag=false;
				if(flag==true) {
					store[size]=i;
					size++;
				}
			}
		int id=0, i=0;
		while(id<size) {
			for(int j=0;j<=i;j++) {
				System.out.print(store[id]+" ");
				id++;
			}
			System.out.println();
			i++;
		}
		
//		boolean[] is_prime = new boolean[51];
//		int[] store = new int[51];
//        Arrays.fill(is_prime, true);
//        is_prime[0] = is_prime[1] = false;
//        for (int p = 2; p * p <= 50; p++) {
//            if (is_prime[p]) {
//                for (int i = p * p; i <= 50; i += p) {
//                    is_prime[i] = false;
//                }
//            }
//        }
//        int j=0;
//        for (int i = 2; i <= 50; i++) {
//            if (is_prime[i]) {
//                store[j++]=i;
//            }
//        }
//        //System.out.println(j);
//        for(int i=0;i<j;i++) {
//        	for(int k=0;k<i;k++) {
//        		System.out.print(store[i]+" ");
//        	}
//        	System.out.println();
//        }
	}
}
