package com.cavalrybear.mastertiger.model;

/**
 * Created by Alex on 4/23/2015.
 */
public class Match
{
	private Player mPlayerOne;
	private Player mPlayerTwo;
	private boolean mWinner;

	public Player getPlayerOne()
	{
		return mPlayerOne;
	}

	public Player getPlayerTwo()
	{
		return mPlayerTwo;
	}

	public void setWinner(boolean bool)
	{
		mWinner = bool;
	}

	public Player getWinner()
	{
		if (mWinner)
		{
			return mPlayerTwo;
		}
		else
		{
			return mPlayerOne;
		}
	}

	public Match(Player playerOne, Player playerTwo)
	{
		mPlayerOne = playerOne;
		mPlayerTwo = playerTwo;
		mWinner = false;
	}
}
