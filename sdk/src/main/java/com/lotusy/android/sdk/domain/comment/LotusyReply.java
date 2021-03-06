package com.lotusy.android.sdk.domain.comment;

import java.util.Date;

/**
 * Created by pshen on 2014-07-16.
 */
public class LotusyReply {

    protected int id;
    protected int userId;
    protected int commentId;
    private String nickName;
    private String message;
    private Date createTime;

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public int getCommentId() {
        return commentId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
