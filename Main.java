import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import service.MeetingService;
import service.ReportRecordService;
import service.ReportService;
import service.StudentMapService;

public class Main {
    public static void main(String[] args) {
        StudentMapService studentMapService = new StudentMapService();
        studentMapService.loadDetails("files/map.csv");

        MeetingService meetingService = new MeetingService();
        meetingService.loadMeetingDetails("files/meet copy.csv");

        ReportRecordService reportRecordService = new ReportRecordService(studentMapService, meetingService);

        ReportService reportService = new ReportService(reportRecordService);
        
        
        try {
            Files.writeString(Path.of("reports/report.csv"),reportService.reportToCSV(),StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
