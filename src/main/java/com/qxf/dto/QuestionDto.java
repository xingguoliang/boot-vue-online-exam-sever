package com.qxf.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName QuestionDto
 * @Description TODO
 * @Author qiuxinfa
 * @Date 2020/5/24 21:33
 **/
public class QuestionDto implements Serializable{
    private String id;
    private String questionContent;   //题目
    private String questionAnswer;
    private String choiceA;
    private String choiceB;
    private String choiceC;
    private String choiceD;
    private Date createTime;
    private Date updateTime;
    private Integer questionLevel;       //难度等级
    private String questionLevelStr;    //难度等级
    private String questionExplain;
    //问题类型（填空题，判断题，单选题，多选题），这个暂时没有用上，如果前端需要统一展示，则会用上
    private String typeStr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }

    public String getChoiceA() {
        return choiceA;
    }

    public void setChoiceA(String choiceA) {
        this.choiceA = choiceA;
    }

    public String getChoiceB() {
        return choiceB;
    }

    public void setChoiceB(String choiceB) {
        this.choiceB = choiceB;
    }

    public String getChoiceC() {
        return choiceC;
    }

    public void setChoiceC(String choiceC) {
        this.choiceC = choiceC;
    }

    public String getChoiceD() {
        return choiceD;
    }

    public void setChoiceD(String choiceD) {
        this.choiceD = choiceD;
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

    public Integer getQuestionLevel() {
        return questionLevel;
    }

    public void setQuestionLevel(Integer questionLevel) {
        this.questionLevel = questionLevel;
    }

    public String getQuestionLevelStr() {
        return questionLevelStr;
    }

    public void setQuestionLevelStr(String questionLevelStr) {
        this.questionLevelStr = questionLevelStr;
    }

    public String getQuestionExplain() {
        return questionExplain;
    }

    public void setQuestionExplain(String questionExplain) {
        this.questionExplain = questionExplain;
    }

    public String getTypeStr() {
        return typeStr;
    }

    public void setTypeStr(String typeStr) {
        this.typeStr = typeStr;
    }
}
