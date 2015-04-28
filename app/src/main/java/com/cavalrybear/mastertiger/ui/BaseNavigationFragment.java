package com.cavalrybear.mastertiger.ui;

/**
 * Created by Alex on 4/22/2015.
 */

import android.app.Activity;
import android.support.v4.app.Fragment;

public abstract class BaseNavigationFragment<T> extends Fragment
{
    protected T mCallbacks;

    @SuppressWarnings("unchecked")
    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {
            mCallbacks = (T)activity;
        }
        catch (ClassCastException e)
        {
            throw new ClassCastException("Activity must implement fragment's callbacks.");
        }
    }

    @Override
    public void onDetach()
    {
        super.onDetach();
        mCallbacks = getDummyCallbacks();
    }

    public abstract T getDummyCallbacks();

    public static interface VoidCallbacks {}
    protected static VoidCallbacks VOID_CALLBACKS = new VoidCallbacks() {};
}
