import io.github.rajasekaran.meettool.service.MeetAnalyzerService;

public class Main {
    public static final String MAP_PATH = "C:\\Users\\Rajasekaran S\\Documents\\ex-test\\files\\maps\\map.csv";
    public static final String MEET_PATH = "C:\\Users\\Rajasekaran S\\Documents\\ex-test\\files\\meets\\meet.csv";
    public static final String REPORT_PATH = "C:\\Users\\Rajasekaran S\\Documents\\ex-test\\files\\reports\\meet.csv";
    public static void main(String[] args) {
        MeetAnalyzerService meetAnalyzerService = new MeetAnalyzerService(MAP_PATH,MEET_PATH);
        meetAnalyzerService.writeToCSVFile(REPORT_PATH);

    }
}
