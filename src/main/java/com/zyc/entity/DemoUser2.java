package com.zyc.entity;

import java.util.Date;

public class DemoUser2 {
    private long id;
    private String title;
    private String tag;
    private String docContent;
    private String docType;
    private String createTime;

    @Override
    public String toString() {
        return "DemoUser2{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", tag='" + tag + '\'' +
                ", docContent='" + docContent + '\'' +
                ", docType='" + docType + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public DemoUser2(long id, String title, String tag, String docContent, String docType, String createTime) {
        this.id = id;
        this.title = title;
        this.tag = tag;
        this.docContent = docContent;
        this.docType = docType;
        this.createTime = createTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getDocContent() {
        return docContent;
    }

    public void setDocContent(String docContent) {
        this.docContent = docContent;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
