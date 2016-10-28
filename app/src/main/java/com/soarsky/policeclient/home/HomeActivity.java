package com.soarsky.policeclient.home;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;


import com.soarsky.policeclient.R;
import com.soarsky.policeclient.base.BaseActivity;
import com.soarsky.policeclient.data.local.db.bean.Note;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;

public class HomeActivity extends BaseActivity<HomePresent,HomeModel> implements HomeView {


    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
    }

    public void query(View view) {
        mPresenter.getNotes();
    }


    @Override
    public void showResult(List<Note> notes) {

    }

    @Override
    public void showSuccess() {
        Toast.makeText(this, "Success", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showFail() {
        Toast.makeText(this, "fail", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showProgess() {

    }

    @Override
    public void stopProgess() {

    }
}
