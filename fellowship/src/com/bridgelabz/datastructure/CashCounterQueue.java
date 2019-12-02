/* Author   -  Nanda kumar.s
 * Version  -  1.2
 * Purpose  -  cash counter program using queue
 * FileName -  CashCounterQueue.java
 * Date     -  22/11/2019
 */
package com.bridgelabz.datastructure;
import com.bridgelabz.datastructure.basic.LinkedList;
import com.bridgelabz.utility.Utility;

public class CashCounterQueue {

	public static void main(String[] args) {
		Integer bankcash=10000;
		LinkedList<Integer> queue=new LinkedList<Integer>();
		System.out.println("Enter the queue Length");
        int noofperson=Utility.GetInt();
		for(int i=1;i<=noofperson;i++)
        {
			queue.enqueue(i);
        	int choice;
        	System.out.println("Enter 1 to deposit amount or 2 to withdraw for person :"+i);
        	choice=Utility.GetInt();
        	switch(choice)
        	{
        	case 1:
        		Integer deposit;
        		System.out.println("Enter the amount to deposit");
        		deposit=Utility.GetInt();
        		bankcash+=deposit;
        		queue.dequeue();
        		break;
        	case 2:
        		Integer withdraw;
        		System.out.println("Enter the amount to withdraw");
        		withdraw=Utility.GetInt();
        		if(withdraw>bankcash){
        		System.out.println("amount not available");
        		queue.dequeue();
        		}
        		else{
        		bankcash-=withdraw;
        		queue.dequeue();
        		}
        		break;
        	default:
        		System.out.println("wrong decision");
        		queue.dequeue();
	         }
	}
		System.out.println("The bank balance is"+bankcash);
}
}