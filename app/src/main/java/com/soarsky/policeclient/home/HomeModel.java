package com.soarsky.policeclient.home;

import android.app.Activity;


import com.soarsky.policeclient.App;
import com.soarsky.policeclient.base.BaseModel;
import com.soarsky.policeclient.data.local.db.bean.Note;
import com.soarsky.policeclient.data.local.db.dao.DaoSession;

import org.greenrobot.greendao.rx.RxDao;
import org.greenrobot.greendao.rx.RxQuery;

/**
 * Created by elvissun on 8/22/2016.
 */
public class HomeModel implements BaseModel {

    private Activity context;
    private DaoSession daoSession;
    private RxDao<Note, Long> noteDao;
    private RxQuery<Note> notesQuery;

    public RxQuery<Note> getNotexQuery() {
        if (notesQuery == null) {
            notesQuery = daoSession.getNoteDao().queryBuilder().rx();
        }
        return notesQuery;
    }

    public RxDao<Note, Long> getNoteDao() {
        if (noteDao == null) {
            noteDao = daoSession.getNoteDao().rx();
        }
        return noteDao;
    }


    public void setContext(Activity context) {
        this.context = context;
        daoSession = ((App) context.getApplication()).getDaoSession();
    }
}
