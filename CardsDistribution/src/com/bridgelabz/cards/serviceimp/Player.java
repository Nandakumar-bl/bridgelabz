/*Author: Nanda kumar.s
 *purpose:implementation for deck of cards.  
 * date:30.11.19
 * filename:Player.java
 */
package com.bridgelabz.cards.serviceimp;

import com.bridgelabz.cards.Utility.LinkedList;
import com.bridgelabz.cards.service.Cards;

public class Player implements Cards {
	int index=0;
	String cards[];
	public LinkedList queue=new LinkedList();
	String rank[]={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	public Player()
	{
		cards=new String[9];
		for(int i=0;i<9;i++)
			cards[i]=new String();
	}
	public void getCards(String card)
	{
			
				cards[index]=card;
				index++;
				if(index==9)
					sort();
	}
	public void sort()
	{
		for(int i=0;i<rank.length;i++)
		{
			for(int j=0;j<cards.length;j++)
			{
				if(cards[j].charAt(0)==rank[i].charAt(0))
				{
					queue.enqueue(cards[j]);
				}
			}
		}
		
	}

}
