package ben.cn.library.ui.activity;

import ben.cn.library.R;
import ben.cn.library.utils.MyToastUtils;

public abstract class BaseEntryActivity extends BaseActivity {
    private long lastBackKeyDownTick = 0;
    private static final long MAX_DOUBLE_BACK_DURATION = 1500;

    @Override
    public void onBackPressed() {
        if (beforeOnBackPressed()) {
            long currentTick = System.currentTimeMillis();
            if (currentTick - lastBackKeyDownTick > MAX_DOUBLE_BACK_DURATION) {
                MyToastUtils.showShortToastSafeNew(this, getExitHintResourceID());
                lastBackKeyDownTick = currentTick;
            } else {
                finish();
                System.exit(0);
            }
        }
    }

    protected int getExitHintResourceID() {
        return R.string.click_one_more_time_to_exit;
    }

    protected boolean beforeOnBackPressed() {
        return true;
    }
}