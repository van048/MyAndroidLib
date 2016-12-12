package ben.cn.library.utils;

import android.content.Context;

import com.blankj.utilcode.utils.ToastUtils;

public class MyToastUtils {
    public static void showShortToastSafeNew(Context context, int resId) {
        ToastUtils.init(true);
        ToastUtils.showShortToastSafe(context, resId);
    }
}
