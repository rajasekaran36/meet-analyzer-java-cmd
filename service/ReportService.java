package service;

import java.util.ArrayList;
import java.util.List;

import model.Meeting;
import model.Participation;
import model.Report;
import model.ReportRecord;
import model.Student;
import model.StudentMap;

public class ReportService {
    private ReportRecordService reportRecordService;
    private Report report;

    public ReportService(ReportRecordService reportRecordService){
        this.reportRecordService = reportRecordService;
        report = new Report(reportRecordService.getMeeting(), reportRecordService.getReportRecords());
    }

    public String reportToCSV(){
        List<String> lines = new ArrayList<>();
        
        for(StudentMap studentMap:reportRecordService.getStudentMaps()){
            List<String> words = new ArrayList<>();
            Student student = studentMap.getStudent();
            words.add(String.valueOf(student.getId()));
            words.add(String.valueOf(student.getRollNo()));
            words.add(String.valueOf(student.getName()));
            ReportRecord reportRecord = getReportRecord(student.getId());
            if(reportRecord!=null){
                Participation participation = reportRecord.getParticipation();
                words.add(participation.getGmeetName());
                words.add(participation.getArrivalTime());
                words.add(participation.getLastSeen());
                words.add(String.valueOf(reportRecord.getTotalDuration()));
                words.add(reportRecord.getStatus());
                words.add(reportRecord.getComments());

            }
            else{
                words.add("");
                words.add("");
                words.add("");
                words.add("");
                words.add("AB");
                words.add("ABSENT");
            }
            lines.add(String.join(",", words));
        }
        return String.join("\n", lines);
    }

    public ReportRecord getReportRecord(Integer studentID){
        for(ReportRecord reportRecord:report.getRecords()){
            if(reportRecord.getStudent().getId()==studentID){
                return reportRecord;
            }
        }
        return null;
    }
}
