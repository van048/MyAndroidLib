package ben.cn.library.activity.base;

import com.blankj.utilcode.utils.ToastUtils;

import ben.cn.library.R;

public abstract class BaseEntryActivity extends BaseActivity {
    private long lastBackKeyDownTick = 0;
    private static final long MAX_DOUBLE_BACK_DURATION = 1500;

    @Override
    public void onBackPressed() {
        if (beforeOnBackPressed()) {
            long currentTick = System.currentTimeMillis();
            if (currentTick - lastBackKeyDownTick > MAX_DOUBLE_BACK_DURATION) {
                ToastUtils.init(true);
                ToastUtils.showShortToast(this, R.string.click_one_more_time_to_exit);
                lastBackKeyDownTick = currentTick;
            } else {
                finish();
                System.exit(0);
            }
        }
    }

    protected boolean beforeOnBackPressed() {
        return true;
    }
}
