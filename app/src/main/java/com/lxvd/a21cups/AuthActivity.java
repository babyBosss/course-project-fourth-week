package com.lxvd.a21cups;

import android.support.v4.app.Fragment;

public class AuthActivity extends SingleFragmentActivity {
    @Override
    protected Fragment getFragment(){
        return AuthFragment.newInstance();
    }
}
