package com.sec8_9.FT.Synchronization;

public class labelledBreak {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outerloop : for (int i = 0; i < 3; i++)

		{
			for(int j =0;j<2;j++) {
				System.out.println(j);
				break  outerloop;
			}
		

		}



	}

}
