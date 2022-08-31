package com.coding.corejava;


import java.util.Scanner;

public class TickTac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String val="";
		String[][] tictakTable = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };
		System.out.println("Please Select below any one option"+"\n"+"1.Play with System"+"\n"+"2.TWO Players");
		
		int a=sc.nextInt();

		for (int i = 1; i < 10; i++) {
			
			displayGame(tictakTable);
			if (i % 2 != 0) {
				System.out.println("PLAYER1 :  Where you want to Place the 'X' ");
				int number = sc.nextInt();
				if (!enterValue(tictakTable, number, "X")) {
					i = i - 1;

				}

			} else {
				if (a == 2) {
					System.out.println("PLAYER2 :  Where you want to Place the 'O' ");
					int number = sc.nextInt();
					if (!enterValue(tictakTable, number, "O")) {
						i = i - 1;
					}
				} else if (a == 1) {
					systemPalys(tictakTable);
				}

			}
			if (i >= 5)
				
				val=calculatewinning(tictakTable);
			if("X".equals(val)){
				displayGame(tictakTable);
				System.out.println("PLAYER 1 WINS");
				break;
			}else if("O".equals(val)){
				displayGame(tictakTable);
				System.out.println("PLAYER 2 WINS");
				break;
			}else if(i==9){
				System.out.println("NO ONE WINS IT'S DRAW");
			}

		}

	}
	private static void systemPalys(String[][] tictakTable){
		if (tictakTable[0][0].equals(tictakTable[0][1])) {
			if (tictakTable[0][0].equals("X")) {
				tictakTable[0][2] = "O";
				return;
			} 
			if (!tictakTable[0][0].equals("X")&&!tictakTable[0][0].equals("O")) {
				tictakTable[0][2] = "O";
				return;
			} 
		}
		if (tictakTable[0][0].equals(tictakTable[0][2])) {
			if (tictakTable[0][0].equals("X")) {
				tictakTable[0][1] = "O";
				return;
			} 
			if (tictakTable[0][0].equals("O")) {
				tictakTable[0][1] = "O";
				return;
			} 
		}
		if (tictakTable[0][1].equals(tictakTable[0][2])) {
			if (tictakTable[0][0].equals("X")) {
				tictakTable[0][0] = "O";
				return;
			} 
			if (tictakTable[0][1].equals("O")) {
				tictakTable[0][0] = "O";
				return;
			} 
		}
		//***************************************************
		if (tictakTable[2][0].equals(tictakTable[2][1])) {
			if (tictakTable[2][2].equals("X")) {
				tictakTable[2][2] = "O";
				return;
			} 
		}
		if (tictakTable[2][0].equals(tictakTable[2][2])) {
			if (tictakTable[2][1].equals("X")) {
				tictakTable[2][1] = "O";
				return;
			}
		}
		if (tictakTable[2][1].equals(tictakTable[2][2])) {
			if (tictakTable[2][0].equals("X")) {
				tictakTable[2][0] = "O";
				return;
			} 
		}
		//***************************************************
				if (tictakTable[1][0].equals(tictakTable[1][1])) {
					if(tictakTable[1][0].equals("X")){
						tictakTable[1][2] = "O";
						return;
					}
				}
				if (tictakTable[1][1].equals(tictakTable[1][2])) {
					if(tictakTable[1][1].equals("X")){
						tictakTable[1][1] = "O";
						return;
					}
				}
				if (tictakTable[1][1].equals(tictakTable[1][2])) {
					if(tictakTable[1][1].equals("X")){
						tictakTable[1][0] = "O";
						return;
					}
				}
				//***************************************************
				if (tictakTable[0][0].equals(tictakTable[1][0])) {
					if(tictakTable[0][0].equals("X")){
						tictakTable[2][0] = "O";
						return;
					}
				}
				if (tictakTable[1][0].equals(tictakTable[2][0])) {
					if(tictakTable[1][0].equals("X")){
						tictakTable[0][0] = "O";
						return;
					}
				}
				if (tictakTable[0][0].equals(tictakTable[2][0])) {
		        	if (tictakTable[0][0].equals("X")) {
		        		tictakTable[1][0] = "O";
				      return;
		        	}
	        	}
				//***************************************************
				if (tictakTable[0][1].equals(tictakTable[1][1])) {
					if(tictakTable[2][0].equals("X")){
						tictakTable[2][0] = "O";
						return;
					}
				}
				if (tictakTable[1][1].equals(tictakTable[2][1])) {
					if(tictakTable[1][1].equals("X")){
						tictakTable[0][1] = "O";
						return;
					}
				}
				if (tictakTable[0][1].equals(tictakTable[2][1])) {
					if(tictakTable[0][1].equals("X")){
						tictakTable[1][1] = "O";
						return;
					}
				}
				//***************************************************
				if (tictakTable[0][2].equals(tictakTable[1][2])) {
					if(tictakTable[0][2].equals("X")){
						tictakTable[2][2] = "O";
						return;
					}
				}
				if (tictakTable[1][2].equals(tictakTable[2][2])) {
					if(tictakTable[1][2].equals("X")){
						tictakTable[0][2] = "O";
						return;
					}
				}
				if (tictakTable[0][2].equals(tictakTable[2][2])) {
					if(tictakTable[0][2].equals("X")){
						tictakTable[1][2] = "O";
						return;
					}
				}
				//***************************************************
				if (tictakTable[0][0].equals(tictakTable[1][1])) {
					if(tictakTable[0][0].equals("X")){
						tictakTable[2][2] = "O";
						return;
					}
				}
				if (tictakTable[1][1].equals(tictakTable[2][2])) {
					if(tictakTable[1][1].equals("X")){
						tictakTable[0][0] = "O";
						return;
					}
				}
				if (tictakTable[0][0].equals(tictakTable[2][2])) {
					if(tictakTable[0][1].equals("X")){
						tictakTable[1][1] = "O";
						return;
					}
				}
				//***************************************************
				if (tictakTable[0][2].equals(tictakTable[1][1])) {
					if(tictakTable[0][2].equals("X")){
						tictakTable[2][0] = "O";
						return;
					}
				}
				if (tictakTable[1][1].equals(tictakTable[2][0])) {
					if(tictakTable[1][1].equals("X")){
						tictakTable[0][2] = "O";
						return;
					}
				}
				if (tictakTable[0][2].equals(tictakTable[2][0])) {
					if(tictakTable[0][2].equals("X")){
						tictakTable[1][1] = "O";
						return;
					}
				}
				
		
		
	}

	private static void displayGame(String[][] tictakTable) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(" "+tictakTable[i][j] + " |");

			}
			//System.out.println();
			System.out.println();
			System.out.print("---|---|---|");
			System.out.println();
		}

	}

	private static boolean enterValue(String[][] tictakTable, int number, String Value) {

		int row = (number - 1) / 3;
		int col = (number % 3) - 1;
		if (col == -1) {
			col = 2;
		}

		if (!tictakTable[row][col].equals("X") && !tictakTable[row][col].equals("O")) {

			tictakTable[row][col] = Value;
			return true;
		} else {
			System.out.println("Please Enter Valid Position The position " + number + " ' " + tictakTable[row][col]
					+ " ' existed");
			return false;
		}

	}

	private static String calculatewinning(String[][] tictakTable) {
		if (tictakTable[0][0].equals(tictakTable[0][1])
				&& tictakTable[0][1].equals(tictakTable[0][2])) {
			return tictakTable[0][0];

		} else if (tictakTable[1][0].equals(tictakTable[1][1]) 
				&& tictakTable[1][1].equals(tictakTable[1][2])) {
			return tictakTable[1][0];
			
		} else if (tictakTable[2][0].equals(tictakTable[2][1])
				&& tictakTable[2][1].equals(tictakTable[2][2])) {
			return tictakTable[2][0];
			
		} else if (tictakTable[0][0].equals(tictakTable[1][0])
				&& tictakTable[1][0].equals(tictakTable[2][0])) {
			return tictakTable[0][0];
			
		} else if (tictakTable[0][1].equals(tictakTable[1][1]) 
				&& tictakTable[1][1].equals(tictakTable[2][1])) {
			return tictakTable[0][1];
			
		} else if (tictakTable[0][2].equals(tictakTable[1][2])
				&& tictakTable[1][2].equals(tictakTable[2][2])) {
			return tictakTable[0][2];
			
		} else if (tictakTable[0][0].equals(tictakTable[0][0]) 
				&& tictakTable[1][1].equals(tictakTable[2][2])) {
			return tictakTable[0][0];
			
		} else if (tictakTable[2][0].equals(tictakTable[1][1])
				&& tictakTable[1][1].equals(tictakTable[0][2])) {
			return tictakTable[2][0];
		
		}
		return null;

	}

}
