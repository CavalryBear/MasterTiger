package com.cavalrybear.mastertiger.model;

import java.util.ArrayList;

/**
 * Created by Alex on 4/23/2015.
 */
public class Tournament
{
	private String mName;
	private Store mStore;
	private ArrayList<Player> mPlayerList;
	private ArrayList<Round> mRoundList;

	public String getName()
	{
		return mName;
	}

	public void setStore(Store store)
	{
		mStore = store;
	}

	public Store getStore()
	{
		return mStore;
	}

	public Player getPlayer(int index)
	{
		return mPlayerList.get(index);
	}

	public void addPlayer(Player player)
	{
		mPlayerList.add(player);
	}

	public Round getRound(int index)
	{
		return mRoundList.get(index);
	}

	public void addRound(Round round)
	{
		mRoundList.add(round);
	}

	public Tournament(String name)
	{
		mName = name;
		mPlayerList = new ArrayList<>();
		mRoundList = new ArrayList<>();
	}
}
