package com.sample.PracticeCode;

public class MergeStringsAlternatively {

	public static void main(String[] args) {
		System.out.println(mergeAlternately("abc", "pqr")); //apbqcr
		System.out.println(mergeAlternately("ab", "pqrs")); //apbqrs
	}
	
	public static String mergeAlternately(String word1, String word2) {
        String[] s1 = word1.split("");
        String[] s2 = word2.split("");
        String res = "";
        int j = 0, k = 0;
        int len = Math.max(s1.length,s2.length);
        for (int i = 0; i < len ;i++){
            if (j==s1.length){
                res += s2[k];
                ++k;
            }
            else if  (k==s2.length){
                res += s1[j];
                ++j;
            }
            else {
            	res += s1[i];
            	res += s2[i];
            	++j;
            	++k;
            }
        }
        return res;
    }
	
	public static void printArr(String[] arr) {
		for (String item: arr) {
			System.out.print(item);
		}
	}

}
