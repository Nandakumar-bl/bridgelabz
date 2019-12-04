/*Author: Nanda kumar.s
 *purpose:program to distribute a deck of cards for 4 player.  
 * date:30.11.19
 * filename:DeckOfCards.java
 */
package com.bridgelabz.cards.controller;

import com.bridgelabz.cards.serviceimp.Player;

public class DeckOfCards {

	public static void main(String[] args) {
		String shape[]={"Spades","Clover","Diamond","Heart"};
		String rank[]={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
		Player object[]=new Player[4];
		
		for(int i=0;i<4;i++)
			object[i]=new Player();
		int[][] combinations=new int[4][13];
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<13;j++)
			{
				combinations[i][j]=0;
			}
		}
		for(int i=0;i<36;)
		{
			int index1=(int)(Math.random()*3);
			int index2=(int)(Math.random()*12);
		   if(combinations[index1][index2]==0)
		   {
			   if(i%4==0)
				   object[0].getCards(rank[index2]+" of "+shape[index1]);
			   if(i%4==1)
				   object[1].getCards(rank[index2]+" of "+shape[index1]);
			   if(i%4==2)
				   object[2].getCards(rank[index2]+" of "+shape[index1]);
			   if(i%4==3)
				   object[3].getCards(rank[index2]+" of "+shape[index1]);
				i++;   
				combinations[index1][index2]=1;
			  }
		}
		for(int i=0;i<4;i++)
		{
			object[i].queue.print();
		    System.out.println();
		}
	}
}
