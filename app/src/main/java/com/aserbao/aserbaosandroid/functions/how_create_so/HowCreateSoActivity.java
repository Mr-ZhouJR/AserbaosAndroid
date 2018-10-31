package com.aserbao.aserbaosandroid.functions.how_create_so;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aserbao.aserbaosandroid.base.BaseActivity;
import com.aserbao.aserbaosandroid.functions.how_create_so.useCmake.UseCMakeBuildSoActivity;
import com.aserbao.aserbaosandroid.opengl.ClassBean;

public class HowCreateSoActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void initGetData() {
        mClassBeen.add(new ClassBean("通过CMake的方式编译so文件", UseCMakeBuildSoActivity.class));
    }

}
