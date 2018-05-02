package com.onlineexam.po;

public class Choice {
    private Integer choiceid;

    private Integer questionid;

    private String choice;

    public Integer getChoiceid() {
        return choiceid;
    }

    public void setChoiceid(Integer choiceid) {
        this.choiceid = choiceid;
    }

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice == null ? null : choice.trim();
    }
}