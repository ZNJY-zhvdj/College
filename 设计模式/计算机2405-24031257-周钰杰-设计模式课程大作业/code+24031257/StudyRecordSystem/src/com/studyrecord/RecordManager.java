package com.studyrecord;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RecordManager {

    private static RecordManager instance = null;
    private List<StudyRecord> records;

    private RecordManager() {
        records = new ArrayList<>();
    }

    public static RecordManager getInstance() {
        if (instance == null) {
            instance = new RecordManager();
        }
        return instance;
    }

    public void addRecord(StudyRecord record) {
        records.add(record);
    }

    public boolean modifyRecord(int index, StudyRecord newRecord) {
        if (index < 1 || index > records.size()) {
            return false;
        }
        records.set(index - 1, newRecord);
        return true;
    }

    public Iterator<StudyRecord> getIterator() {
        return records.iterator();
    }

    public int size() {
        return records.size();
    }

    public StudyRecord getRecord(int index) {
        if (index < 1 || index > records.size()) return null;
        return records.get(index - 1);
    }
}