package com.bridgelabz.design.creational.singleton;

class BillPughInstance
{
	private BillPughInstance() {};
	private static class InstanceCreator{
		private static final BillPughInstance instance=new  BillPughInstance();
	}
	
	public static BillPughInstance getInstance()
	{
		return InstanceCreator.instance;
	}
}
public class BillpughSingletonRunner {

	public static void main(String[] args) {
		

		   for(int i=0;i<2;i++)
		   {
			  Thread Thread1=new Thread(()->System.out.println(BillPughInstance.getInstance().hashCode()));
			  Thread Thread2=new Thread(()->System.out.println(BillPughInstance.getInstance().hashCode()));
			  Thread Thread3=new Thread(()->System.out.println(BillPughInstance.getInstance().hashCode()));
			  Thread1.start();
			  Thread2.start();
			  Thread3.start();
		   }

	}

}
