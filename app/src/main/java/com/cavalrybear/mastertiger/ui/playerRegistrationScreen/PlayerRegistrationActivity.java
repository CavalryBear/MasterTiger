package com.cavalrybear.mastertiger.ui.playerRegistrationScreen;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.cavalrybear.mastertiger.R;
import com.cavalrybear.mastertiger.ui.BaseFragmentActivity;
import com.cavalrybear.mastertiger.ui.tournamentConfigScreen.TournamentConfigActivity;

/**
 * Created by Alex on 4/30/2015.
 */
public class PlayerRegistrationActivity extends BaseFragmentActivity implements PlayerRegistrationCallbacks
{
	public static Intent getIntent(Context context)
	{
		Intent intent = new Intent(context, PlayerRegistrationActivity.class);
		intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		return intent;
	}

	@Override
	protected Fragment getInitialContent()
	{
		return PlayerRegistrationFragment.getInitialContent();
	}

	@Override
	public void onGoToTournamentConfig()
	{
		Intent intent = TournamentConfigActivity.getIntent(this);

		this.startActivity(intent);
		overridePendingTransition(R.anim.animation_activity_in, R.anim.animation_activity_out);

		this.finish();
	}
}
