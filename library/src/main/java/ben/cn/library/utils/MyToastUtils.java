package ben.cn.library.utils;

import android.content.Context;

import com.blankj.utilcode.utils.ToastUtils;

public class MyToastUtils {
    private MyToastUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void showShortToastSafe(final Context context, final CharSequence text, boolean cancelBeforeShow) {
        ToastUtils.init(cancelBeforeShow);
        ToastUtils.showShortToastSafe(context, text);
    }

    public static void showShortToastSafe(final Context context, final int resId, final boolean cancelBeforeShow) {
        ToastUtils.init(cancelBeforeShow);
        ToastUtils.showShortToastSafe(context, resId);
    }

    public static void showShortToastSafe(final Context context, final int resId, final boolean cancelBeforeShow, final Object... args) {
        ToastUtils.init(cancelBeforeShow);
        ToastUtils.showShortToastSafe(context, resId, args);
    }

    public static void showShortToastSafe(final Context context, final String format, final boolean cancelBeforeShow, final Object... args) {
        ToastUtils.init(cancelBeforeShow);
        ToastUtils.showShortToastSafe(context, format, args);
    }

    public static void showLongToastSafe(final Context context, final CharSequence text, final boolean cancelBeforeShow) {
        ToastUtils.init(cancelBeforeShow);
        ToastUtils.showLongToastSafe(context, text);
    }

    public static void showLongToastSafe(final Context context, final int resId, final boolean cancelBeforeShow) {
        ToastUtils.init(cancelBeforeShow);
        ToastUtils.showLongToastSafe(context, resId);
    }

    public static void showLongToastSafe(final Context context, final int resId, final boolean cancelBeforeShow, final Object... args) {
        ToastUtils.init(cancelBeforeShow);
        ToastUtils.showLongToastSafe(context, resId, args);
    }

    public static void showLongToastSafe(final Context context, final String format, final boolean cancelBeforeShow, final Object... args) {
        ToastUtils.init(cancelBeforeShow);
        ToastUtils.showLongToastSafe(context, format, args);
    }

    public static void showShortToast(Context context, CharSequence text, boolean cancelBeforeShow) {
        ToastUtils.init(cancelBeforeShow);
        ToastUtils.showShortToast(context, text);
    }

    public static void showShortToast(Context context, int resId, boolean cancelBeforeShow) {
        ToastUtils.init(cancelBeforeShow);
        ToastUtils.showShortToast(context, resId);
    }

    public static void showShortToast(Context context, int resId, boolean cancelBeforeShow, Object... args) {
        ToastUtils.init(cancelBeforeShow);
        ToastUtils.showShortToast(context, resId, args);
    }

    public static void showShortToast(Context context, String format, boolean cancelBeforeShow, Object... args) {
        ToastUtils.init(cancelBeforeShow);
        ToastUtils.showShortToast(context, format, args);
    }

    public static void showLongToast(Context context, CharSequence text, boolean cancelBeforeShow) {
        ToastUtils.init(cancelBeforeShow);
        ToastUtils.showLongToast(context, text);
    }

    public static void showLongToast(Context context, int resId, boolean cancelBeforeShow) {
        ToastUtils.init(cancelBeforeShow);
        ToastUtils.showLongToast(context, resId);
    }

    public static void showLongToast(Context context, int resId, boolean cancelBeforeShow, Object... args) {
        ToastUtils.init(cancelBeforeShow);
        ToastUtils.showLongToast(context, resId, args);
    }

    public static void showLongToast(Context context, String format, boolean cancelBeforeShow, Object... args) {
        ToastUtils.init(cancelBeforeShow);
        ToastUtils.showLongToast(context, format, args);
    }

    public static void cancelToast() {
        ToastUtils.cancelToast();
    }
}
