package com.carpark.pojo;

public class NoticeTable {
    private Integer noticeId;

    private String noticeMsg;

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticeMsg() {
        return noticeMsg;
    }

    public void setNoticeMsg(String noticeMsg) {
        this.noticeMsg = noticeMsg == null ? null : noticeMsg.trim();
    }
}