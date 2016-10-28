package com.soarsky.policeclient.home;

import com.soarsky.policeclient.base.BaseView;
import com.soarsky.policeclient.data.local.db.bean.Note;

import java.util.List;

/**
 * Created by elvissun on 8/19/2016.
 */
public interface HomeView extends BaseView {

    public void showResult(List<Note> notes);

    public void showSuccess();

    public void showFail();

}
