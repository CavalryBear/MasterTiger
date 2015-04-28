package com.cavalrybear.mastertiger.model;

import java.util.ArrayList;

/**
 * Created by Alex on 4/23/2015.
 */
public class Player
{
	private String mName;
	private int mMatchPoints;
	private int mGamePoints;
	private ArrayList<Player> mOpponentsList;

	public String getName()
	{
		return mName;
	}

	public int getMatchPoints()
	{
		return mMatchPoints;
	}

	public int getGamePoints()
	{
		return mGamePoints;
	}

	public float getMatchWinPercentage()
	{
		return Math.max(mMatchPoints / (mOpponentsList.size() * 3), 0.33f);
	}

	public float getGameWinPercentage()
	{
		return mGamePoints / (mOpponentsList.size() * 3);
	}

	public Player getOpponent(int index)
	{
		return mOpponentsList.get(index);
	}

	public void addOpponent(Player player)
	{
		mOpponentsList.add(player);
	}

	public Player(String name)
	{
		mName = name;
		mMatchPoints = 0;
		mGamePoints = 0;
		mOpponentsList = new ArrayList<>();
	}
}
