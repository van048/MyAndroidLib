package ben.cn.library.ui.fragment;

import android.support.v4.app.Fragment;
import android.view.View;

public abstract class BaseFragment extends Fragment {

    protected View mView;

    protected <T extends View> T $(int id) {
        assert mView != null;
        //noinspection unchecked
        return (T) mView.findViewById(id);
    }
}