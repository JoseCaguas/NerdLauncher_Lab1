package com.firstnamelastname.nerdlauncher;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.Menu;

public class NerdLaunchActivity extends SingleFragmentActivity {

	@Override
	public Fragment createFragment() {
		return new NerdLauncherFragment();
	}

}
