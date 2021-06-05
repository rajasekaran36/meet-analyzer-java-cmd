import service.MeetAnalyzerService;

public class Main {
    public static void main(String[] args) {
        MeetAnalyzerService meetAnalyzerService = new MeetAnalyzerService("files/maps/map.csv","files/meets/meet.csv");
        meetAnalyzerService.writeToCSVFile("files/reports/report.csv");

    }
}
