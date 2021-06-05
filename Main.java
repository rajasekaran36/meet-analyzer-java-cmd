import java.nio.file.Path;

import jdk.tools.jlink.resources.plugins;
import service.MeetAnalyzerService;
import service.MeetingService;
import service.ReportRecordService;
import service.ReportService;
import service.StudentMapService;

public class Main {
    public static void main(String[] args) {
        MeetAnalyzerService meetAnalyzerService = new MeetAnalyzerService("files/maps/map.csv","files/meets/meet.csv","files/reports/report.csv");
        
    }
}
