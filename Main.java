import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import handles.MeetingService;
import handles.ReportRecordService;
import handles.StudentMapService;

public class Main {
    public static void main(String[] args) {
        StudentMapService studentMapService = new StudentMapService();
        studentMapService.loadDetails("files/map.csv");

        MeetingService meetingService = new MeetingService();
        meetingService.loadMeetingDetails("files/meet copy.csv");

        ReportRecordService recordService = new ReportRecordService(studentMapService, meetingService);
        try {
            Files.writeString(Path.of("reports/report.csv"),recordService.reportToCSV(),StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
