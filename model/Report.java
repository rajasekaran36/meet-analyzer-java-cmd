package model;

import java.util.List;

public class Report {
    private Meeting meeting;
    List<ReportRecord> records;


    public Meeting getMeeting() {
        return this.meeting;
    }

    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }

    public List<ReportRecord> getRecords() {
        return this.records;
    }

    public void setRecords(List<ReportRecord> records) {
        this.records = records;
    }

}
