package com.cavalrybear.mastertiger.ui.swissRoundScreen;

import com.cavalrybear.mastertiger.ui.BaseNavigationFragment;

/**
 * Created by Alex on 4/30/2015.
 */
public interface SwissRoundCallbacks extends BaseNavigationFragment.VoidCallbacks
{
	public void onGoToNextSwissRound();
	public void onGoToFirstTopRound();
	public void onGoToWinner();
}