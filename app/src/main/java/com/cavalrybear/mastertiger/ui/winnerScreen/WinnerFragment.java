package com.cavalrybear.mastertiger.ui.winnerScreen;

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
public class WinnerFragment extends BaseNavigationFragment<WinnerCallbacks>
{
	public static Fragment getInitialContent()
	{
		return new WinnerFragment();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View mView = inflater.inflate(R.layout.winner_screen, container, false);

		mView.findViewById(R.id.winner_screen_button_home).setOnClickListener(mHomeButtonListener);

		return mView;
	}

	@Override
	public WinnerCallbacks getDummyCallbacks()
	{
		return new WinnerCallbacks()
		{
			public void onGoToHome() {}
		};
	}

	View.OnClickListener mHomeButtonListener = new View.OnClickListener()
	{
		@Override
		public void onClick(View view)
		{
			mCallbacks.onGoToHome();
		}
	};
}
