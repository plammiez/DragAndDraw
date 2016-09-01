package com.augmentis.ayo.dnd;

import android.support.v4.app.Fragment;

/**
 * Created by Waraporn on 9/1/2016.
 */
public class SunsetActivity extends SingleFragmentActivity {
    @Override
    protected Fragment onCreateFragment() {
        return SunsetFragment.newInstance();
    }
}
