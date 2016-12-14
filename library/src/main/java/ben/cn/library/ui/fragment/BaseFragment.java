package ben.cn.library.ui.fragment;

import android.support.v4.app.Fragment;
import android.view.View;

import static com.google.common.base.Preconditions.checkNotNull;

public abstract class BaseFragment extends Fragment {

    protected View mRootView;

    protected <T extends View> T $(int id) {
        checkNotNull(mRootView);
        //noinspection unchecked
        return (T) mRootView.findViewById(id);
    }
}