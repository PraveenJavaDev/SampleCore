package com.coding.corejava;

public class Sudoku {
	public static void main(String[] args) {
		
		  int[][] sudokuTable ={ { 4,0,7,0,0,1,2,3,9 }, { 5,2,9,3,7,0,0,0,8 }, {
		  0,3,8,9,0,4,7,0,0 }, { 0,0,0,0,0,0,0,9,3 }, { 2,1,5,6,3,9,8,7,4 }, {
		  7,9,3,4,8,5,6,0,0 }, { 8,4,6,2,9,3,1,5,7 }, { 3,0,0,0,4,0,0,0,6 }, {
		  9,7,0,0,6,0,0,0,0 } };
		 
		
		
			/*
			 * int[][] sudokuTable = { { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0,
			 * 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0,
			 * 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0,
			 * 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
			 */
		Sudoku s = new Sudoku();
		
		/*System.out.println(s.validator(sudokuTable));
		s.sudokuSolver(sudokuTable);*/
	if(s.solveBoard(sudokuTable)){
		System.out.println("solved Successfully");
		s.sudokuDisplay(sudokuTable);
	}

	}
	
	
	public void sudokuSolver(int[][] sudoku) {
		Sudoku s = new Sudoku();
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {
				int number = sudoku[row][col];
				
				if (number == 0) {
					for (int val = 1; val <= 9; val++) {

						if (s.rowValidator(sudoku, row, val, 11) && s.colomValidator(sudoku, col, val, 11)
								&& s.blackValidator(sudoku, row, col, val)) {
							sudoku[row][col] = val;
							break;
							

						} 

					}
				}
			}
		}
		s.sudokuDisplay(sudoku);

	}
	
	public boolean solveBoard(int[][] sudoku) {
		Sudoku s = new Sudoku();
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {
				int number = sudoku[row][col];

				if (number == 0) {
					for (int val = 1; val <= 9; val++) {

						if (s.rowValidator(sudoku, row, val, 11) && s.colomValidator(sudoku, col, val, 11)
								&& s.blackValidator(sudoku, row, col, val)) {
							sudoku[row][col] = val;
							if (solveBoard(sudoku)) {
								return true;
							}else{
								sudoku[row][col]=0;
							}
						}
					}
					return false;
				}
			}
		}

		return true;

	}

	
	public void sudokuDisplay(int[][] sudoku) {
		for(int row=0;row<9;row++){
			for(int col=0;col<9;col++){
				System.out.print(sudoku[row][col]+" ");
			}
			System.out.println();
		}

	}

	public String validator(int sudoku[][]) {
		int n = 1;
		Sudoku s = new Sudoku();
		for (int row = 0; row < 9; row++) {
			for (int col = 0; col < 9; col++) {
				int number = sudoku[row][col];

				if (s.rowValidator(sudoku, row, number, col) && s.colomValidator(sudoku, col, number, row)
						&& s.blackValidator(sudoku, row, col, number)) {

				} else {
					return "The Given Sudoku is not Valid";

				}
			}
		}
		return "The Given Sudoku is Valid One";
	}

	public boolean rowValidator(int[][] sudoku, int rownumber, int number, int colomnumber) {
		for (int col = 0; col < 9; col++) {
			if (sudoku[rownumber][col] == number && colomnumber != col) {
				return false;
			}
		}

		return true;

	}

	public boolean colomValidator(int[][] sudoku, int colomNumber, int number, int rownumber) {
		for (int row = 0; row < 9; row++) {
			if (sudoku[row][colomNumber] == number && rownumber != row) {
				return false;
			}
		}

		return true;

	}

	public boolean blackValidator(int[][] sudoku, int rowNumber, int colomNumber, int number) {
		int rowscal = rowNumber / 3;
		int colcal = colomNumber / 3;
		int rowsta = rowscal * 3;
		int rowend = rowsta + 2;
		int colsta = colcal * 3;
		int colend = colsta + 2;
		
		for (int row = rowsta; row <= rowend; row++) {
			for (int col = colsta; col <= colend; col++) {
				if (sudoku[row][col] == number) {
					//if (rowNumber != row && colomNumber != col)
						return false;
				}
			}

		}
		
		return true;
	}
}
