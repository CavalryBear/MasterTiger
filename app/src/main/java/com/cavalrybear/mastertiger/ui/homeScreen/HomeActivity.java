package com.cavalrybear.mastertiger.ui.homeScreen;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.cavalrybear.mastertiger.ui.BaseFragmentActivity;

/**
 * Created by Alex on 4/22/2015.
 */

public class HomeActivity extends BaseFragmentActivity implements HomeCallbacks
{
	public static Intent getIntent(Context context)
	{
		Intent intent = new Intent(context, HomeActivity.class);
		intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		return intent;
	}

	@Override
	protected Fragment getInitialContent()
	{
		return HomeFragment.getInitialContent();
	}
}
