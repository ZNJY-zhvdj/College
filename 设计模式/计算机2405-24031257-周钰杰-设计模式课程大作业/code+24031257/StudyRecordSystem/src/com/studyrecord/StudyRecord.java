package com.studyrecord;

public class StudyRecord {
    private String date;          // 日期
    private String projectName;   // 项目名称
    private String language;      // 编程语言
    private int addedLines;       // 新增代码行数
    private int deletedLines;     // 删除代码行数
    private int commitCount;      // Git提交次数
    private String commitDesc;    // 提交说明摘要
    private String tag;           // 标签（练习/工作/开源/算法）
    private String summary;       // 简要心得

    public StudyRecord(String date, String projectName, String language,
                       int addedLines, int deletedLines, int commitCount,
                       String commitDesc, String tag, String summary) {
        this.date = date;
        this.projectName = projectName;
        this.language = language;
        this.addedLines = addedLines;
        this.deletedLines = deletedLines;
        this.commitCount = commitCount;
        this.commitDesc = commitDesc;
        this.tag = tag;
        this.summary = summary;
    }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
    public String getProjectName() { return projectName; }
    public void setProjectName(String projectName) { this.projectName = projectName; }
    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }
    public int getAddedLines() { return addedLines; }
    public void setAddedLines(int addedLines) { this.addedLines = addedLines; }
    public int getDeletedLines() { return deletedLines; }
    public void setDeletedLines(int deletedLines) { this.deletedLines = deletedLines; }
    public int getCommitCount() { return commitCount; }
    public void setCommitCount(int commitCount) { this.commitCount = commitCount; }
    public String getCommitDesc() { return commitDesc; }
    public void setCommitDesc(String commitDesc) { this.commitDesc = commitDesc; }
    public String getTag() { return tag; }
    public void setTag(String tag) { this.tag = tag; }
    public String getSummary() { return summary; }
    public void setSummary(String summary) { this.summary = summary; }

    @Override
    public String toString() {
        return "日期：" + date +
               "\n项目名称：" + projectName +
               "\n编程语言：" + language +
               "\n新增行数：" + addedLines +
               "\n删除行数：" + deletedLines +
               "\n提交次数：" + commitCount +
               "\n提交摘要：" + commitDesc +
               "\n标签：" + tag +
               "\n心得：" + summary +
               "\n--------------------------";
    }
}