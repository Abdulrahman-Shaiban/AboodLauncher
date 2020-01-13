package com.abood.aboodlauncher;

import androidx.fragment.app.Fragment;

public class AboodLauncherActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {

        return AboodLauncherFragment.newInstance();

    }

}
