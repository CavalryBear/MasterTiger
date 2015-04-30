package com.cavalrybear.mastertiger.ui.winnerScreen;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.cavalrybear.mastertiger.R;
import com.cavalrybear.mastertiger.ui.BaseFragmentActivity;
import com.cavalrybear.mastertiger.ui.homeScreen.HomeActivity;

/**
 * Created by Alex on 4/30/2015.
 */
public class WinnerActivity extends BaseFragmentActivity implements WinnerCallbacks
{
	public static Intent getIntent(Context context)
	{
		Intent intent = new Intent(context, WinnerActivity.class);
		intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		return intent;
	}

	@Override
	protected Fragment getInitialContent()
	{
		return WinnerFragment.getInitialContent();
	}

	@Override
	public void onGoToHome()
	{
		Intent intent = HomeActivity.getIntent(this);

		this.startActivity(intent);
		overridePendingTransition(R.anim.animation_activity_in, R.anim.animation_activity_out);

		this.finish();
	}
}
