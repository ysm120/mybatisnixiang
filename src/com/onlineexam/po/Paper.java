package com.onlineexam.po;

import java.util.Date;

public class Paper {
    private Integer paperid;

    private String papername;

    private Date starttime;

    private Integer duration;

    private Integer totalscore;

    private String tid;

    private Integer singlescore;

    public Integer getPaperid() {
        return paperid;
    }

    public void setPaperid(Integer paperid) {
        this.paperid = paperid;
    }

    public String getPapername() {
        return papername;
    }

    public void setPapername(String papername) {
        this.papername = papername == null ? null : papername.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getTotalscore() {
        return totalscore;
    }

    public void setTotalscore(Integer totalscore) {
        this.totalscore = totalscore;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    public Integer getSinglescore() {
        return singlescore;
    }

    public void setSinglescore(Integer singlescore) {
        this.singlescore = singlescore;
    }
}