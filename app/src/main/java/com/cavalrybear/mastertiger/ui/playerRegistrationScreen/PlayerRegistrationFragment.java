package com.cavalrybear.mastertiger.ui.playerRegistrationScreen;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cavalrybear.mastertiger.R;
import com.cavalrybear.mastertiger.ui.BaseNavigationFragment;

/**
 * Created by Alex on 4/30/2015.
 */
public class PlayerRegistrationFragment extends BaseNavigationFragment<PlayerRegistrationCallbacks>
{
	public static Fragment getInitialContent()
	{
		return new PlayerRegistrationFragment();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View mView = inflater.inflate(R.layout.player_registration_screen, container, false);

		mView.findViewById(R.id.player_registration_screen_button_tournament).setOnClickListener(mTournamentButtonListener);

		return mView;
	}

	@Override
	public PlayerRegistrationCallbacks getDummyCallbacks()
	{
		return new PlayerRegistrationCallbacks()
		{
			public void onGoToTournamentConfig() {}
		};
	}

	View.OnClickListener mTournamentButtonListener = new View.OnClickListener()
	{
		@Override
		public void onClick(View view)
		{
			mCallbacks.onGoToTournamentConfig();
		}
	};
}
