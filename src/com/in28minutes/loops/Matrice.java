package com.in28minutes.loops;

import java.util.Random;

public class Matrice {

	int row, col, i,j,n;

	public static void main(String[] args) {
		int i, j;
		int arr[][] = new int[4][4];
		Matrice matrice = new Matrice();
		matrice.row = 4;
		matrice.col = 4;
		matrice.n = 4;
		Random rand = new Random();

		for (i = 0; i < matrice.row; i++) {
			for (j = 0; j < matrice.col; j++) {
				arr[i][j] = rand.nextInt(100);
			}
		}

		System.out.println("The Matrix is :\n");
		for (i = 0; i < matrice.row; i++) {
			for (j = 0; j < matrice.col; j++) {
				System.out.format("%4d", arr[i][j]);
			}
			System.out.println();
		}


		readMainDiagonal(arr);
		matrice.readMainDiagonalWithLines(arr);
	}


	public static void readMainDiagonal(int[][] arr) {
		System.out.println("\nMain diagonal is : ");
		int length = arr.length - 1;
		for (int row = 0; row <= length; ++row) {
			arr[row][length - row] = row;

			System.out.print(arr[row][row] + " ");
		}
	}

	public void readMainDiagonalWithLines(int[][] arr) {
		System.out.println("\n\nMain diagonal  with lines is : ");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {

				if (i == j) {
					System.out.println(arr[i][j]);
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}


	}

}
