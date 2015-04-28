package com.cavalrybear.mastertiger.ui;

/**
 * Created by Alex on 4/22/2015.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.LinearLayout;

public abstract class BaseFragmentActivity extends FragmentActivity
{
    private static final int FRAGMENT_ID = 1;
    private static final String MAIN_FRAGMENT_TAG = "main_tag";
    private static final String STACK_KEY = "stack";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        View view = new LinearLayout(this);
        view.setId(FRAGMENT_ID);

        setContentView(view);
        if (savedInstanceState == null)
        {
            replaceContent(getInitialContent(), false, MAIN_FRAGMENT_TAG);
        }
    }

    protected Fragment getCurrentFragment()
    {
        return getSupportFragmentManager().findFragmentById(FRAGMENT_ID);
    }

    public Fragment getMainFragment()
    {
        return getSupportFragmentManager().findFragmentByTag(MAIN_FRAGMENT_TAG);
    }

    protected void replaceContent(Fragment fragment)
    {
        replaceContent(fragment, true);
    }

    protected void replaceContent(Fragment fragment, boolean addToBackStack)
    {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(FRAGMENT_ID, fragment);

        if (addToBackStack)
        {
            fragmentTransaction.addToBackStack(STACK_KEY);
        }

        fragmentTransaction.commit();
    }

    protected void replaceContent(Fragment fragment, boolean addToBackStack, String tag)
    {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(FRAGMENT_ID, fragment, tag);

        if (addToBackStack)
        {
            fragmentTransaction.addToBackStack(STACK_KEY);
        }

        fragmentTransaction.commit();
    }

    protected abstract Fragment getInitialContent();

    protected void cleanBackStack()
    {
        getSupportFragmentManager().popBackStack(STACK_KEY, FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }
}
