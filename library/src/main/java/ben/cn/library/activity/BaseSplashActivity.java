package ben.cn.library.activity;

import android.os.Handler;

import ben.cn.library.R;

public abstract class BaseSplashActivity extends BaseActivity {

    @Override
    protected int getThemeResourceID() {
        return R.style.DefaultSplashTheme;
    }

    @Override
    protected void setUpView() {
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
}
