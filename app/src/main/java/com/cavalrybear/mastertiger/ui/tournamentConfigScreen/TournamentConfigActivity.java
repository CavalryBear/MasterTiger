package com.cavalrybear.mastertiger.ui.tournamentConfigScreen;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.cavalrybear.mastertiger.R;
import com.cavalrybear.mastertiger.ui.BaseFragmentActivity;
import com.cavalrybear.mastertiger.ui.playerRegistrationScreen.PlayerRegistrationActivity;
import com.cavalrybear.mastertiger.ui.swissRoundScreen.SwissRoundActivity;

/**
 * Created by Alex on 4/30/2015.
 */
public class TournamentConfigActivity extends BaseFragmentActivity implements TournamentConfigCallbacks
{
	public static Intent getIntent(Context context)
	{
		Intent intent = new Intent(context, TournamentConfigActivity.class);
		intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		return intent;
	}

	@Override
	protected Fragment getInitialContent()
	{
		return TournamentConfigFragment.getInitialContent();
	}

	@Override
	public void onGoToPlayerRegistration()
	{
		Intent intent = PlayerRegistrationActivity.getIntent(this);

		this.startActivity(intent);
		overridePendingTransition(R.anim.animation_activity_in, R.anim.animation_activity_out);

		this.finish();
	}

	@Override
	public void onGoToFirstSwissRound()
	{
		Intent intent = SwissRoundActivity.getIntent(this);

		this.startActivity(intent);
		overridePendingTransition(R.anim.animation_activity_in, R.anim.animation_activity_out);

		this.finish();
	}
}
