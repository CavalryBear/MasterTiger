package com.cavalrybear.mastertiger.ui.splashScreen;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import com.cavalrybear.mastertiger.R;
import com.cavalrybear.mastertiger.ui.BaseFragmentActivity;
import com.cavalrybear.mastertiger.ui.homeScreen.HomeActivity;

/**
 * Created by Alex on 4/22/2015.
 */

public class SplashActivity extends BaseFragmentActivity implements SplashCallbacks
{
    @Override
    protected Fragment getInitialContent()
    {
        return SplashFragment.getInitialContent();
    }

    @Override
    public void onGoToHome()
    {
		Intent intent = HomeActivity.getIntent(this);

	    this.startActivity(intent);
	    overridePendingTransition(R.anim.animation_activity_in, R.anim.animation_activity_out);
    }
}
