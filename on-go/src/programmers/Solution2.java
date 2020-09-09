package programmers;

import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] v = new int[3][2];
        int[] answer = new int[2];
        
        for(int i=0;i<3;i++) {
        	v[i][0] = sc.nextInt();
        	v[i][1] = sc.nextInt();
        }
        
    	/*
    	if(v[0][0]==v[2][0]) {
    		answer[0]=v[1][0];
    	}else if(v[1][0]==v[2][0]) {
    		answer[0]=v[0][0];
    	}else {
    		answer[0]=v[2][0];
    	}
    	
    	if(v[0][1]==v[1][1]) {
    		answer[1]=v[2][1];
    	}else if(v[1][1]==v[2][1]) {
    		answer[1]=v[0][1];
    	}else {
    		answer[1]=v[1][1];
    	}*/
    	/*
    	for(int i=0;i<2;i++) {
    		if(v[0][i]==v[1][i]) {
    			answer[i] = v[2][i];
    		}else if(v[0][i]==v[2][i]) {
    			answer[i] = v[1][i];
    		}else {
    			answer[i] = v[0][i];
    		}
    	}*/
    	
    	answer[0] = v[0][0]^v[1][0]^v[2][0];
    	answer[1] = v[0][1]^v[1][1]^v[2][1];

    	for(int i=0;i<answer.length;i++) {
    		System.out.print(answer[i]+" ");
    	}
    	sc.close();
    }

}
