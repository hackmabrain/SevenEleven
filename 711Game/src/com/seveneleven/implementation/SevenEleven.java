package com.seveneleven.implementation;

import java.io.IOException;
import java.util.*;


public class SevenEleven {

	Map<Player,Integer> mPlayers;
	int mSpeed=2;
	Die mDie1;
	Die mDie2;
	
	public SevenEleven(){
		mDie1=new Die();
		mDie2=new Die();
		mPlayers=new HashMap<Player,Integer>();
	}
	
	public void displaySummary() throws IOException{
		SevenElevenProperties sp=new SevenElevenProperties();
		String result="";
		result+=sp.getGameHeadingHelperText()+"\n"+"\n";
		result+=sp.getGameSummaryHelperText()+"\n"+"\n";
		result+=sp.getGameCommandsHeadingHelperText()+"\n";
		result+=sp.getGameCommandHELPHelperText()+"\n";
		result+=sp.getGameCommandADDHelperText()+"\n";
		result+=sp.getGameCommandSPEEDHelperText()+"\n";
		result+=sp.getGameCommandMAXHelperText()+"\n";
		result+=sp.getGameCommandSTARTHelperText()+"\n";
		
		System.out.println(result);
		
		
	}
	
	public void rollDie(){
		int resultDie1=mDie1.roll();
		System.out.println("Roll result of die 1 is: "+ resultDie1);
		int resultDie2=mDie2.roll();
		System.out.println("Roll result of die 2 is: "+ resultDie2);
	}
	
	public void addPlayer(Player pPlayer){
		this.mPlayers.put(pPlayer, 0);
	}
	
	public void removePlayer(Player pPlayer){
		this.mPlayers.remove(pPlayer);
	}
	
	public boolean doHaveValidPlayers(){
		if(mPlayers.size()<=1)
			return false;
		else
			return true;
	}
	
	public void setSpeed(int pSpeed){
		this.mSpeed=pSpeed;
	}
	
	public int getSpeed(){
		return mSpeed;
	}
	
	public boolean isWinningRoll(int die1Result, int die2Result){
		if((die1Result!=die2Result)||(die1Result+die2Result!=7)||(die1Result+die2Result!=11))
			return false;
		else 
			return true;
	}

	
}
