package tests.test1;
import io.github.rajasekaran.meettool.service.MeetAnalyzerService;

public class MeetServiceTest {
    public static final String MAP_PATH = "files/maps/map.csv";
    public static final String MEET_PATH = "files/meets/meet.csv";
    public static final String REPORT_PATH = "files/reports/meet.csv";
    public static void main(String[] args) {
        MeetAnalyzerService meetAnalyzerService = new MeetAnalyzerService(MAP_PATH,MEET_PATH);
        meetAnalyzerService.writeToCSVFile(REPORT_PATH);

    }
}
