package ben.cn.library.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import ben.cn.library.R;
import ben.cn.library.utils.MyToastUtils;

public abstract class BaseActivity extends AppCompatActivity {
    // double click to exit
    private long lastBackKeyDownTick = 0;
    private static final long DEFAULT_MAX_DOUBLE_BACK_DURATION = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(getThemeResourceID());
        super.onCreate(savedInstanceState);

        init(savedInstanceState);
        setContentView(getLayoutResourceID());
        setUpView();
        setUpData();
    }

    protected int getThemeResourceID() {
        return R.style.DefaultAppTheme;
    }

    /**
     * initialize before setContentView
     *
     * @param savedInstanceState param from onCreate
     */
    protected void init(Bundle savedInstanceState) {
    }

    protected abstract int getLayoutResourceID();

    protected void setUpView() {

    }

    protected void setUpData() {

    }

    protected <T extends View> T $(int id) {
        //noinspection unchecked
        return (T) findViewById(id);
    }


    protected void startActivityWithoutExtras(Class<?> clazz) {
        Intent intent = new Intent(this, clazz);
        startActivity(intent);
    }

    protected void startActivityWithExtras(Class<?> clazz, Bundle extras) {
        Intent intent = new Intent(this, clazz);
        intent.putExtras(extras);
        startActivity(intent);
    }

    // double click to exit
    @Override
    public void onBackPressed() {
        if (beforeOnBackPressed()) {
            long currentTick = System.currentTimeMillis();
            if (currentTick - lastBackKeyDownTick > getMaxDoubleBackDuration()) {
                MyToastUtils.showShortToastSafeNew(this, getExitHintResourceID());
                lastBackKeyDownTick = currentTick;
            } else {
                finish();
                System.exit(0);
            }
        } else {
            super.onBackPressed();
        }
    }

    protected long getMaxDoubleBackDuration() {
        return DEFAULT_MAX_DOUBLE_BACK_DURATION;
    }

    protected int getExitHintResourceID() {
        return R.string.default_double_click_exit_hint;
    }

    /**
     * do sth before ready-to-exit
     *
     * @return if return true, then double-click-to-exit is enabled
     */
    protected boolean beforeOnBackPressed() {
        return true;
    }
}
