package com.coo.mvp_coco.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class TestTabel {

    @Id(autoincrement = true)
    private Long id;

    private String name;

    private String info;

    @Generated(hash = 1427150761)
    public TestTabel(Long id, String name, String info) {
        this.id = id;
        this.name = name;
        this.info = info;
    }

    @Generated(hash = 1127867144)
    public TestTabel() {
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

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

}
