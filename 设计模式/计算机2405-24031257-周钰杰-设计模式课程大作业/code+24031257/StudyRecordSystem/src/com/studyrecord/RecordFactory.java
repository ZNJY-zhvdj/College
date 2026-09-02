package com.studyrecord;


public class RecordFactory {

    public static StudyRecord createRecord(String date, String projectName, String language,
                                           int addedLines, int deletedLines, int commitCount,
                                           String commitDesc, String tag, String summary) {
        return new StudyRecord(date, projectName, language, addedLines, deletedLines,
                               commitCount, commitDesc, tag, summary);
    }
}