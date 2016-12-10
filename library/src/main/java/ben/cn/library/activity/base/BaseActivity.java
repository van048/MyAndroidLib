package ben.cn.library.activity.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init(savedInstanceState);
        setContentView(getLayoutResourceID());
        setUpView();
        setUpData();
    }

    /***
     * 用于在初始化View之前做一些事
     */
    protected void init(Bundle savedInstanceState) {

    }

    protected abstract int getLayoutResourceID();

    protected abstract void setUpView();

    protected void setUpData() {

    }


    protected <T extends View> T $(int id) {
        //noinspection unchecked
        return (T) super.findViewById(id);
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

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode) {
            case 1:

                break;
        }
    }
}
