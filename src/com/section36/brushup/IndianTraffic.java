 package com.section36.brushup;

public class IndianTraffic implements interfaceExample , ContinentalRules{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		interfaceExample i = new IndianTraffic();
		i.greenGo();
		
		walkOnSymbo();
		
		ContinentalRules cr = new IndianTraffic();
		cr.stopTrain();

	}
	public static void walkOnSymbo() {
		System.out.println("Only walk on symbols");
	}
	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Go Green");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void stopTrain() {
		// TODO Auto-generated method stub
		System.out.println("Stop for train");
		
	}

}
