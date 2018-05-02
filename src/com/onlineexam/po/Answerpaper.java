package com.onlineexam.po;

public class Answerpaper {
    private String sid;

    private Integer paperid;

    private Integer sore;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public Integer getPaperid() {
        return paperid;
    }

    public void setPaperid(Integer paperid) {
        this.paperid = paperid;
    }

    public Integer getSore() {
        return sore;
    }

    public void setSore(Integer sore) {
        this.sore = sore;
    }
}