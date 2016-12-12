package ben.cn.library.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import ben.cn.library.R;

public abstract class BaseActivity extends AppCompatActivity {

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
}
