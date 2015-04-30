package com.cavalrybear.mastertiger.ui.swissRoundScreen;

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
public class SwissRoundFragment extends BaseNavigationFragment<SwissRoundCallbacks>
{
	public static Fragment getInitialContent()
	{
		return new SwissRoundFragment();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View mView = inflater.inflate(R.layout.swiss_round_screen, container, false);

		mView.findViewById(R.id.swiss_screen_button_next_round).setOnClickListener(mNextRoundButtonListener);
		mView.findViewById(R.id.swiss_screen_button_top).setOnClickListener(mFirstTopRoundButtonListener);
		mView.findViewById(R.id.swiss_screen_button_winner).setOnClickListener(mWinnerButtonListener);

		return mView;
	}

	@Override
	public SwissRoundCallbacks getDummyCallbacks()
	{
		return new SwissRoundCallbacks()
		{
			public void onGoToNextSwissRound() {}
			public void onGoToFirstTopRound() {}
			public void onGoToWinner() {}
		};
	}

	View.OnClickListener mNextRoundButtonListener = new View.OnClickListener()
	{
		@Override
		public void onClick(View view)
		{
			mCallbacks.onGoToNextSwissRound();
		}
	};

	View.OnClickListener mFirstTopRoundButtonListener = new View.OnClickListener()
	{
		@Override
		public void onClick(View view)
		{
			mCallbacks.onGoToFirstTopRound();
		}
	};

	View.OnClickListener mWinnerButtonListener = new View.OnClickListener()
	{
		@Override
		public void onClick(View view)
		{
			mCallbacks.onGoToWinner();
		}
	};
}
