package com.cavalrybear.mastertiger.ui.swissRoundScreen;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.cavalrybear.mastertiger.R;
import com.cavalrybear.mastertiger.ui.BaseFragmentActivity;
import com.cavalrybear.mastertiger.ui.winnerScreen.WinnerActivity;

/**
 * Created by Alex on 4/30/2015.
 */
public class SwissRoundActivity extends BaseFragmentActivity implements SwissRoundCallbacks
{
	public static Intent getIntent(Context context)
	{
		Intent intent = new Intent(context, SwissRoundActivity.class);
		intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		return intent;
	}

	@Override
	protected Fragment getInitialContent()
	{
		return SwissRoundFragment.getInitialContent();
	}

	@Override
	public void onGoToNextSwissRound()
	{
		Intent intent = SwissRoundActivity.getIntent(this);

		this.startActivity(intent);
		overridePendingTransition(R.anim.animation_activity_in, R.anim.animation_activity_out);

		this.finish();
	}

	@Override
	public void onGoToFirstTopRound()
	{

	}

	public void onGoToWinner()
	{
		Intent intent = WinnerActivity.getIntent(this);

		this.startActivity(intent);
		overridePendingTransition(R.anim.animation_activity_in, R.anim.animation_activity_out);

		this.finish();
	}
}
