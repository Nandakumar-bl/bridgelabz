/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  program to play tictactoe
 * FileName -  TicTacToe.java
 * Date     -  19/11/2019
 */
package com.bridgelabz.logical;

import java.util.Random;



import com.bridgelabz.utility.Utility;

public class TicTacToe 
{
	static Random rand=new Random();
	public static void ticTacToe() 
	{
	int pc = 0;
	int user = 0;
	int[][] a = new int[3][3];
	int t = 0, count = 0, s = 0, u = 0;
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) { //getting inital array values
			a[i][j] = -1;
		}
	}
	while (t == 0) {
		count = 0;
		s = 0;
		u = 0;
		int r =rand.nextInt(3);   //counting un occupied boxes
		int c = rand.nextInt(3);
		int countPcIn = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] == -1)
					countPcIn++;
			}
		}

		while (s == 0 && countPcIn > 0) {
			if (a[r][c] == -1) {
				System.out.println(r + " " + c);  //getting pc input
				a[r][c] = 0;
				s = 1;                             
			} else {
				r = rand.nextInt(3);
				c = rand.nextInt(3);
			}
		}

		if (a[0][0] == 0 && a[0][1] == 0 && a[0][2] == 0) {    //checking for pc win             
			pc++;
			break;
		} else if (a[1][0] == 0 && a[1][1] == 0 && a[1][2] == 0) {
			pc++;
			break;
		} else if (a[2][0] == 0 && a[2][1] == 0 && a[2][2] == 0) {
			pc++;
			break;
		} else if (a[0][0] == 0 && a[1][0] == 0 && a[2][0] == 0) {
			pc++;
			break;
		} else if (a[0][1] == 0 && a[1][1] == 0 && a[2][1] == 0) {
			pc++;
			break;
		} else if (a[0][2] == 0 && a[1][2] == 0 && a[2][2] == 0) {
			pc++;
			break;
		} else if (a[0][0] == 0 && a[1][1] == 0 && a[2][2] == 0) {
			pc++;
			break;
		} else if (a[0][2] == 0 && a[1][1] == 0 && a[2][0] == 0) {
			pc++;
			break;
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] >= 0)
					System.out.print(" " + a[i][j] + " ");   //printing the boxes
				else
					System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("==========\n");
		int countUserIn = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] == -1)
					countUserIn++;
			}
		}

		if (countUserIn > 0)
			System.out.println("Empty cells are");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] == -1) {                //showing empty cells
					System.out.println(i + " " + j);
				}
			}
		}

		if (countUserIn > 0) {
			System.out.println("Enter the cell");
			r = Utility.GetInt();                 //getting user choice
			c = Utility.GetInt();
		}

		while (u == 0 && countUserIn > 0) {
			if (a[r][c] == -1) {
				a[r][c] = 1;
				u = 1;
			} else {
				System.out.println("Enter the cells numbers from\nabove indexes");
				r = Utility.GetInt();
				c = Utility.GetInt();
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] >= 0)
					System.out.print(" " + a[i][j] + " ");
				else
					System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("==========\n");

		if (a[0][0] == 1 && a[0][1] == 1 && a[0][2] == 1) {   //checking for player wins
			user++;
			break;
		} else if (a[1][0] == 1 && a[1][1] == 1 && a[1][2] == 1) {
			user++;
			break;
		} else if (a[2][0] == 1 && a[2][1] == 1 && a[2][2] == 1) {
			user++;
			break;
		} else if (a[0][0] == 1 && a[1][0] == 1 && a[2][0] == 1) {
			user++;
			break;
		} else if (a[0][1] == 1 && a[1][1] == 1 && a[2][1] == 1) {
			user++;
			break;
		} else if (a[0][2] == 1 && a[1][2] == 1 && a[2][2] == 1) {
			user++;
			break;
		} else if (a[0][0] == 1 && a[1][1] == 1 && a[2][2] == 1) {
			user++;
			break;
		} else if (a[0][2] == 1 && a[1][1] == 1 && a[2][0] == 1) {
			user++;
			break;
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] == -1) {
					count++;
				}
			}
		}
		if (count != 0) {
			t = 0;
		} else {
			t = 1;
		}

	}
	System.out.println("==========");
	System.out.println();
	if (pc > 0)
		System.out.println("Computer wins");
	else if (user > 0)
		System.out.println("User wins");
	System.out.println("Ends");
	}
	public static void main(String args[])
	{
		int i=0;
		System.out.println("enter 1 to play tictactoe");
		i=Utility.GetInt(); 
		if(i==1)
		ticTacToe();
		else
			System.out.println("no games");
	}
}
