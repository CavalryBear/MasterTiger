package com.cavalrybear.mastertiger.ui.tournamentConfigScreen;

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
public class TournamentConfigFragment extends BaseNavigationFragment<TournamentConfigCallbacks>
{
	public static Fragment getInitialContent()
	{
		return new TournamentConfigFragment();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View mView = inflater.inflate(R.layout.tournament_config_screen, container, false);

		mView.findViewById(R.id.tournament_screen_button_player_registration).setOnClickListener(mPlayerRegistrationButtonListener);
		mView.findViewById(R.id.tournament_screen_button_swiss).setOnClickListener(mFirstSwissRoundButtonListener);

		return mView;
	}

	@Override
	public TournamentConfigCallbacks getDummyCallbacks()
	{
		return new TournamentConfigCallbacks()
		{
			public void onGoToPlayerRegistration() {}
			public void onGoToFirstSwissRound() {}
		};
	}

	View.OnClickListener mPlayerRegistrationButtonListener = new View.OnClickListener()
	{
		@Override
		public void onClick(View view)
		{
			mCallbacks.onGoToPlayerRegistration();
		}
	};

	View.OnClickListener mFirstSwissRoundButtonListener = new View.OnClickListener()
	{
		@Override
		public void onClick(View view)
		{
			mCallbacks.onGoToFirstSwissRound();
		}
	};
}
