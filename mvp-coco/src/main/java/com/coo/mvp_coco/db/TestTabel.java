package com.coo.mvp_coco.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class TestTabel {

    @Id
    private long id;

    private String name;

    private String info;

    @Generated(hash = 1163982875)
    public TestTabel(long id, String name, String info) {
        this.id = id;
        this.name = name;
        this.info = info;
    }

    @Generated(hash = 1127867144)
    public TestTabel() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
