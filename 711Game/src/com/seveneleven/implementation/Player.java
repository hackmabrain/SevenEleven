package com.seveneleven.implementation;

public class Player {
	
	private String mPlayerName; // Name of the player
	private int mDrinkingTime=2; // Time to finish 1 drink default is 2secs
	private int mMaxDrinksLimit=5; // Maximum drinks a player can drink
	 

	public int getMaxDrinksLimit() {
		return mMaxDrinksLimit;
	}
	public void setMaxDrinksLimit(int pMaxDrinksLimit) {
		this.mMaxDrinksLimit = pMaxDrinksLimit;
	}
	public String getmPlayerName() {
		return mPlayerName;
	}
	public void setPlayerName(String pPlayerName) {
		this.mPlayerName = pPlayerName;
	}
	public int getDrinkingTime() {
		return mDrinkingTime;
	}
	public void setDrinkingTime(int pDrinkingTime) {
		this.mDrinkingTime = pDrinkingTime;
	}
	

}
