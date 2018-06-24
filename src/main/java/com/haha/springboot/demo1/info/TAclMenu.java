package com.haha.springboot.demo1.info;
import org.nutz.dao.entity.annotation.*;

import java.io.Serializable;


@Table("t_acl_menu")
public class TAclMenu   implements Serializable {
    private static final long serialVersionUID = 1L;
    @Name
    @Prev(els = {@EL("uuid()")})
    public String id;

    @Column
    public String pid;

    @Column
    public String name;

    @Column
    public String icon;

    @Column
    public String seq;

    @Column
    public String functionid;

    @Column
    public Integer visible;

    @Column
    public String winformtype;

    @Column
    public String url;

    @Column
    public String webicon;

    @Column
    public String systemtypeId;

    @Column
    public String creator;

    @Column
    public String creatorId;

    @Column
    public Integer createtime;

    @Column
    public String editor;

    @Column
    public String editorId;

    @Column
    public Integer edittime;

    @Column
    public Integer deleted;


}
