package ben.cn.library.utils;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.blankj.utilcode.utils.ActivityUtils;

import static com.google.common.base.Preconditions.checkNotNull;

public class MyActivityUtils {
    private MyActivityUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void addFragmentToActivity(@NonNull FragmentManager fragmentManager,
                                             @NonNull Fragment fragment, int frameId) {
        checkNotNull(fragmentManager);
        checkNotNull(fragment);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(frameId, fragment);
        transaction.commit();
    }

    public static boolean isActivityExists(Context context, String packageName, String className) {
        return ActivityUtils.isActivityExists(context, packageName, className);
    }

    public static void launchActivity(Context context, String packageName, String className) {
        ActivityUtils.launchActivity(context, packageName, className);
    }

    public static void launchActivity(Context context, String packageName, String className, Bundle bundle) {
        ActivityUtils.launchActivity(context, packageName, className, bundle);
    }

    public static String getLauncherActivity(Context context, String packageName) {
        return ActivityUtils.getLauncherActivity(context, packageName);
    }
}
