package com.cavalrybear.mastertiger.model;

import java.util.ArrayList;

/**
 * Created by Alex on 4/23/2015.
 */

public class Round
{
	private ArrayList<Match> mMatchList;
	private boolean mIsTop;
	private boolean mBestOfThree;

	public Match getMatch(int index)
	{
		return mMatchList.get(index);
	}

	public void addMatch(Match match)
	{
		mMatchList.add(match);
	}

	public void addMatch(Player playerOne, Player playerTwo)
	{
		mMatchList.add(new Match(playerOne, playerTwo));
	}

	public void setTop(boolean top)
	{
		mIsTop = top;
	}

	public boolean isTop()
	{
		return mIsTop;
	}

	public void setBestOfThree(boolean bestOfThree)
	{
		mBestOfThree = bestOfThree;
	}

	public boolean isBestOfThree()
	{
		return mBestOfThree;
	}

	public Round(boolean isTop, boolean isBestOfThree)
	{
		mMatchList = new ArrayList<>();
		mIsTop = isTop;
		mBestOfThree = isBestOfThree;
	}
}
