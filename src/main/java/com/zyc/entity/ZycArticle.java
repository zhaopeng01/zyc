package com.zyc.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author zyc
 * @since 2018-08-17
 */
public class ZycArticle implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;
    /**
     * 标题
     */
    private String title;
    /**
     * 引文
     */
    private String citation;
    /**
     * 内容
     */
    private String textContent;
    /**
     * 类型
     */
    private String type;
    /**
     * 标签
     */
    private String tag;
    /**
     * 原创
     */
    private Integer found;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 作者
     */
    private String author;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 状态
     */
    private String image;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCitation() {
        return citation;
    }

    public void setCitation(String citation) {
        this.citation = citation;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getFound() {
        return found;
    }

    public void setFound(Integer found) {
        this.found = found;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "ZycArticle{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", citation='" + citation + '\'' +
                ", textContent='" + textContent + '\'' +
                ", type='" + type + '\'' +
                ", tag='" + tag + '\'' +
                ", found=" + found +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", author='" + author + '\'' +
                ", status=" + status +
                ", image='" + image + '\'' +
                '}';
    }
}
