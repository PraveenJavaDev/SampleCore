package com.coding.corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chess {
	public static void main(String[] args) {
		String[][] chessBoard = { { " ", " 1 ", " 2 ", " 3 ", " 4 ", " 5 ", " 6 ", " 7 ", " 8 " },
				{ "1", "RWE", "RWH", "RWC", " WK", " WQ", "LWC", "LWH", "LWE" },
				{ "2", "WPN", "WPN", "WPN", "WPN", "WPN", "WPN", "WPN", "WPN" },
				{ "3", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   " },
				{ "4", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   " },
				{ "5", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   " },
				{ "6", "   ", "   ", "   ", "   ", "   ", "   ", "   ", "   " },
				{ "7", "BPN", "BPN", "BPN", "BPN", "BPN", "BPN", "BPN", "BPN" },
				{ "8", "LBE", "LBH", "LBC", " BK", " BQ", "RBC", "RBH", "RBE" } };

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i <= Integer.MAX_VALUE; i++) {
			display(chessBoard);
			if (i % 2 == 0) {
				System.out.println("PLAYER 1 :");
			} else {
				System.out.println("PLAYER 2 :");
			}

			System.out.println("please Enter the Position of your Pawn");
			int position1 = sc.nextInt();
			int position2 = sc.nextInt();
			if (position1 < 1 || position1 > 8 || position2 < 1 || position2 > 8) {
				System.err.println("Please Enter Valid Position of Coin");
				i = i - 1;
				continue;
			}
			String coinName = chessBoard[position1][position2];
			if (i % 2 == 0 && !coinName.contains("W")) {
				System.err.println("Please Enter Valid Position of Coin");
				i = i - 1;
				continue;
			}
			if (i % 2 != 0 && coinName.contains("B")) {
				System.err.println("Please Enter Valid Position of Coin");
				i = i - 1;
				continue;
			}
			System.out.println("please Enter the Postion Where you want to move");
			int position3 = sc.nextInt();
			int position4 = sc.nextInt();

			if (coinName == "BPN" || coinName == "WPN") {
				coinName = "PAWN";
			} else if (coinName == "LBE" || coinName == "RBE" || coinName == "RWE" || coinName == "LWE") {
				coinName = "ELEPHANT";
			} else if (coinName == "RWH" || coinName == "LWH" || coinName == "LBH" || coinName == "RBH") {
				coinName = "HORSE";
			} else if (coinName == "LBC" || coinName == "RBC" || coinName == "RWC" || coinName == "LWC") {
				coinName = "CAMEL";
			} else if (coinName == " BQ" || coinName == " WQ") {
				coinName = "QUEEN";
			} else if (coinName == " BK" || coinName == " WK") {
				coinName = "KING";
			}

			switch (coinName) {
			case "PAWN":
				pawnMove(chessBoard, position1, position2, position3, position4, chessBoard[position1][position2]);
				break;
			case "ELEPHANT":
				elephentMove(chessBoard, position1, position2, position3, position4, chessBoard[position1][position2]);
				break;
			case "HORSE":
				HorseMove(chessBoard, position1, position2, position3, position4, chessBoard[position1][position2]);
				break;
			case "CAMEL":
				camelMove(chessBoard, position1, position2, position3, position4, chessBoard[position1][position2]);
				break;
			case "QUEEN":
				QueenMove(chessBoard, position1, position2, position3, position4, chessBoard[position1][position2]);
				break;
			case "KING":
				KingMove(chessBoard, position1, position2, position3, position4, chessBoard[position1][position2]);
				break;

			}
		}
	}

	private static void elephentMove(String[][] chessBoard, int one, int two, int three, int four, String coinName) {
		List<String> l = elephentMoveLogic(chessBoard, one, two, three, four, coinName);
		System.out.println(l.toString());

		display(chessBoard, one, two, three, four, coinName, l);

	}

	private static void camelMove(String[][] chessBoard, int one, int two, int three, int four, String coinName) {
		List<String> l = camelMoveLogic(chessBoard, one, two, three, four, coinName);
		System.out.println(l.toString());
		display(chessBoard, one, two, three, four, coinName, l);

	}

	private static void HorseMove(String[][] chessBoard, int one, int two, int three, int four, String coinName) {
		String check = "W";
		if (coinName.contains("B")) {
			check = "B";
		}
		List<String> l = new ArrayList<String>();
		int n = 2;
		int k = 1;
		for (int i = one + 1; i <= one + 2; i++) {
			l.add(i + "" + (two + n));
			l.add(i + "" + (two - n));
			n--;
		}
		for (int i = one - 2; i <= one - 1; i++) {
			l.add(i + "" + (two + k));
			l.add(i + "" + (two - k));
			k++;
		}
		System.out.println(l.toString());

		for (int i = 0; i < l.size(); i++) {
			System.out.println(Character.getNumericValue(l.get(i).charAt(0)));
			System.out.print(Character.getNumericValue(l.get(i).charAt(1)));
			if ((Character.getNumericValue(l.get(i).charAt(0)) <= 0
					|| Character.getNumericValue(l.get(i).charAt(0)) >= 9
					|| (Character.getNumericValue(l.get(i).charAt(1)) <= 0)
					|| Character.getNumericValue(l.get(i).charAt(1)) >= 9)) {
				l.remove(i);
				i = i - 1;
			} else if (chessBoard[Character.getNumericValue(l.get(i).charAt(0))][Character
					.getNumericValue(l.get(i).charAt(1))].contains(check)) {
				l.remove(i);
				i = i - 1;

			}
		}
		System.out.println(l.toString());
		display(chessBoard, one, two, three, four, coinName, l);

	}

	private static void KingMove(String[][] chessBoard, int one, int two, int three, int four, String coinName) {
		String check = "W";
		if (coinName.contains("B")) {
			check = "B";
		}
		List<String> l = new ArrayList<String>();
		for (int i = one - 1; i <= one + 1; i++) {
			for (int j = two - 1; j <= two + 2; j++) {
				if (i >= 1 && i <= 8 && j >= 1 && j <= 8) {
					if (!chessBoard[i][j].contains(check)) {
						l.add(i + "" + j);
					}
				}
			}
		}
		display(chessBoard, one, two, three, four, coinName, l);

	}

	private static void QueenMove(String[][] chessBoard, int one, int two, int three, int four, String coinName) {
		List<String> l = elephentMoveLogic(chessBoard, one, two, three, four, coinName);
		List<String> l1 = camelMoveLogic(chessBoard, one, two, three, four, coinName);
		l.addAll(l1);
		display(chessBoard, one, two, three, four, coinName, l);

	}

	private static void display(String[][] chessBoard) {
		for (int i = 0; i < chessBoard.length; i++) {
			for (int j = 0; j < chessBoard.length; j++) {
				System.out.print(chessBoard[i][j] + "  ");

			}
			System.out.println();

		}
	}

	private static void pawnMove(String[][] chessBoard, int one, int two, int three, int four, String coinName) {
		List<String> l = new ArrayList<String>();
		System.out.println(coinName);

		if (coinName.equals("WPN")) {
			for (int i = two - 1; i < two + 2; i++) {
				if (i != 0 && i != 8) {
					if (one == 2 && chessBoard[one + 2][two].equals("   ") && i == two) {
						l.add(one + 2 + "" + two);
						System.out.println(one + 2 + "" + two);
					}
					if (!chessBoard[one + 1][i].equals("   ") && i != two) {
						l.add(one - 1 + "" + i);
						System.out.println(one - 1 + "" + i);
					}
					if (chessBoard[one + 1][i].equals("   ") && i == two) {
						l.add(one + 1 + "" + i);
						System.out.println(one + 1 + "" + i);

					}

				}
			}
		} else {
			for (int i = two - 1; i < two + 2; i++) {
				if (i != 0 && i != 8) {
					if (one == 7 && chessBoard[one - 2][two].equals("   ") && i == two) {
						l.add(one - 2 + "" + two);
					}
					if (!chessBoard[one - 1][i].equals("   ") && i != two) {
						l.add(one - 1 + "" + i);
					}
					if (chessBoard[one - 1][i].equals("   ") && i == two) {
						l.add(one - 1 + "" + i);

					}

				}
			}
		}
		display(chessBoard, one, two, three, four, coinName, l);
	}

	private static void display(String[][] chessBoard, int one, int two, int three, int four, String coinName,
			List<String> l) {
		if (l.contains(three + "" + four)) {
			chessBoard[three][four] = coinName;
			chessBoard[one][two] = "   ";

			l.clear();

		} else {
			System.out.println("Please Enter Valid Position");
		}
	}

	private static List<String> elephentMoveLogic(String[][] chessBoard, int one, int two, int three, int four,
			String coinName) {
		String check = "W";
		if (coinName.contains("B")) {
			check = "B";
		}
		System.out.println(one + "," + two + "," + coinName + "," + check);
		List<String> l = new ArrayList<String>();
		for (int i = one + 1; i <= 8; i++) {
			if (chessBoard[i][two].equals("   ")) {
				l.add(i + "" + two);
			} else if (!chessBoard[i][two].contains(check)) {
				l.add(i + "" + two);
				break;
			} else {
				break;
			}

		}
		for (int i = one - 1; i >= 1; i--) {
			if (chessBoard[i][two].equals("   ")) {
				l.add(i + "" + two);
			} else if (!chessBoard[i][two].contains(check)) {
				l.add(i + "" + two);
				break;
			} else {
				break;
			}

		}
		for (int i = two + 1; i <= 8; i++) {
			if (chessBoard[one][i].equals("   ")) {
				System.out.println("1 :" + chessBoard[one][i]);
				l.add(one + "" + i);
			} else if (!chessBoard[one][i].contains(check)) {
				System.out.println("2 :" + chessBoard[one][i]);
				l.add(one + "" + i);
				break;
			} else {
				break;
			}

		}
		for (int i = two - 1; i >= 1; i--) {
			if (chessBoard[one][i].equals("   ")) {
				l.add(one + "" + i);
			} else if (!chessBoard[one][i].contains(check)) {
				l.add(one + "" + i);
				break;
			} else {
				break;
			}
		}

		return l;

	}

	private static List<String> camelMoveLogic(String[][] chessBoard, int one, int two, int three, int four,
			String coinName) {
		List<String> l = new ArrayList<String>();
		String check = "W";
		if (coinName.contains("B")) {
			check = "B";
		}
		int first = one;
		int second = two;
		/*
		 * int small = 0; int big = 0; if (one < two) { small = one; big = two; } else {
		 * small = two; big = one; }
		 */
		one = first + 1;
		two = second + 1;

		for (int i = 0; i <= 8; i++) {
			if (one >= 1 && one <= 8 && two >= 1 && two <= 8) {
				if (chessBoard[one][two].equals("   ")) {
					l.add(one + "" + two);
				} else if (!chessBoard[one][two].contains(check)) {
					l.add(one + "" + two);
					break;
				} else {
					break;
				}
			} else {
				break;
			}

			one++;
			two++;

		}
		one = first - 1;
		two = second - 1;

		for (int i = 0; i <= 1; i++) {
			if (one >= 1 && one <= 8 && two >= 1 && two <= 8) {
				if (chessBoard[one][two].equals("   ")) {
					l.add(one + "" + two);
				} else if (!chessBoard[one][two].contains(check)) {
					l.add(one + "" + two);
					break;
				} else {
					break;
				}
			} else {
				break;
			}

			one--;
			two--;
		}
		one = first + 1;
		two = second - 1;
		System.out.println(one + "--" + two);
		for (int i = 0; i <= 8; i++) {
			if (one >= 1 && one <= 8 && two >= 1 && two <= 8) {
				if (chessBoard[one][two].equals("   ")) {
					System.out.println(one + "---" + two);
					l.add(one + "" + two);
				} else if (!chessBoard[one][two].contains(check)) {
					l.add(one + "" + two);
					break;
				} else {
					break;
				}
			} else {
				break;
			}
			one++;
			two--;

		}
		one = first - 1;
		two = second + 1;
		for (int i = 0; i <= 8; i++) {
			if (one >= 1 && one <= 8 && two >= 1 && two <= 8) {
				if (chessBoard[one][two].equals("   ")) {
					l.add(one + "" + two);
				} else if (!chessBoard[one][two].contains(check)) {
					l.add(one + "" + two);
					break;
				} else {
					break;
				}
			} else {
				break;
			}
			one--;
			two++;

		}
		return l;
	}
}