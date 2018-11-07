package space.harbour.java.hw2;

import java.util.Scanner;

public class Pascal {

	int[][] arr;
	int n;

	public Pascal(int size) {
		n = size;
		arr = new int[n + 1][n + 1];
		arr[1][1] = 1;
		for (int i = 2; i <= n; ++i)
			for (int j = 1; j <= i; ++j)
				arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];

	}
    
    public void print() {
    	for (int i = 1; i <= n; ++i) {
    		for (int space = 0; space < n - i; ++space)
    			System.out.print(" ");
    		for (int j = 1; j <= i; ++j)
    			System.out.print(arr[i][j] + " ");
    		System.out.print("\n");
    	}
    }

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		Pascal p = new Pascal(n);
		p.print();
	}
}
