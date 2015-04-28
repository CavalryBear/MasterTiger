package com.cavalrybear.mastertiger.ui.homeScreen;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cavalrybear.mastertiger.R;
import com.cavalrybear.mastertiger.ui.BaseNavigationFragment;

/**
 * Created by Alex on 4/22/2015.
 */
public class HomeFragment extends BaseNavigationFragment<HomeCallbacks>
{
	public static Fragment getInitialContent()
	{
		return new HomeFragment();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View mView = inflater.inflate(R.layout.home_screen, container, false);

		return mView;
	}

	@Override
	public HomeCallbacks getDummyCallbacks()
	{
		return new HomeCallbacks()
		{
		};
	}
}
