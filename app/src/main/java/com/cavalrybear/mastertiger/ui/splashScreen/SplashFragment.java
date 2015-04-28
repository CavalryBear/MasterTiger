package com.cavalrybear.mastertiger.ui.splashScreen;

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
public class SplashFragment extends BaseNavigationFragment<SplashCallbacks>
{
    public static Fragment getInitialContent()
    {
        return new SplashFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View mView = inflater.inflate(R.layout.splash_screen, container, false);

	    mView.postDelayed(new Runnable()
	    {
		    @Override
	        public void run()
		    {
			    mCallbacks.onGoToHome();
		    }
	    }, 2000);

        return mView;
    }

    @Override
    public SplashCallbacks getDummyCallbacks()
    {
        return new SplashCallbacks()
        {
            @Override public void onGoToHome() {}
        };
    }
}
