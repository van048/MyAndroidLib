package ben.cn.library.activity.base;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public abstract class BaseSplashActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(getSplashTheme());
        super.onCreate(savedInstanceState);
    }

    protected abstract int getSplashTheme();

    @Override
    protected void setUpView() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(BaseSplashActivity.this, getJumpingActivityClass()));
                finish();
            }
        }, getSplashDuration());
    }

    protected abstract Class<?> getJumpingActivityClass();

    protected abstract long getSplashDuration();
}
