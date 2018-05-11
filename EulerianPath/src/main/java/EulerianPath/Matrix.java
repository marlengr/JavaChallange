package EulerianPath;

import java.util.Scanner;
import java.lang.Math;

public class Matrix {

	// MACIERZ S¥SIEDZTWA
		public void createMatrix() {
		int max_n = 100;
		int i,j=0, wmax = 0, n, x, y;
		char [][] matrix = new char[max_n][max_n];
		
		for(i=0 ; i < max_n ; i++)
			for(j=0 ; j < max_n ; j++) matrix[i][j] = 0;
		
		System.out.println("wybierz liczbê wierzcho³ków");
		Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
		n = Integer.parseInt(number);
		for(i=0 ; i<n ;i++) {
			
			String number1 = scanner.nextLine();
			x = Integer.parseInt(number1);
					
			String number2 = scanner.nextLine();
			y = Integer.parseInt(number2);
			
			wmax = (x > wmax) ? x : wmax;
			wmax = (y > wmax) ? y : wmax;
			
			matrix[x-1][y-1] = 1;
			matrix[y-1][x-1] = 1;
			
		}
			for( i = 0 ; i<wmax ; i++) {
				for(j=0 ; j <wmax ; j++)
					System.out.println(matrix[i][j] + " ");
			}
				
								
		}
		
		
		
}
