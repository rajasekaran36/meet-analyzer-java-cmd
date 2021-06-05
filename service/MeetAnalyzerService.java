package service;

public class MeetAnalyzerService {
    public MeetAnalyzerService(String studentMappingFilePath, String meetFilePath, String reportFilePath){
        StudentMapService studentMapService = new StudentMapService();
        studentMapService.loadDetails(studentMappingFilePath);

        MeetingService meetingService = new MeetingService();
        meetingService.loadMeetingDetails(meetFilePath);

        ReportRecordService reportRecordService = new ReportRecordService(studentMapService, meetingService);

        ReportService reportService = new ReportService(reportRecordService);
        
        reportService.writeToCSVFile(reportFilePath);
    }
}
