package ben.cn.library.ui.activity;

import android.os.Bundle;
import android.os.Handler;

import ben.cn.library.R;

public abstract class BaseSplashActivity extends BaseActivity {

    @Override
    protected int getThemeResourceID() {
        return R.style.DefaultSplashTheme;
    }

    @Override
    protected void setUpView(Bundle savedInstanceState) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivityWithoutExtras(getJumpingActivityClass());
                finish();
            }
        }, getSplashDuration());
    }

    protected abstract Class<?> getJumpingActivityClass();

    protected abstract long getSplashDuration();

    @Override
    protected boolean beforeOnBackPressed() {
        // disable double-click-to-exit
        return false;
    }
}
