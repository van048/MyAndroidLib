package ben.cn.myandroidlib;

import ben.cn.library.activity.base.BaseSplashActivity;

public class SplashActivity extends BaseSplashActivity {

    @Override
    protected int getLayoutResourceID() {
        return R.layout.activity_splash;
    }

    @Override
    protected Class<?> getJumpingActivityClass() {
        return EntryActivity.class;
    }

    @Override
    protected long getSplashDuration() {
        return 3000;
    }
}
