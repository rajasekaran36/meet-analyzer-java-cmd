import java.util.ArrayList;
import java.util.List;

import handles.MeetingService;
import handles.StudentMapService;
import model.Participation;

public class TestGetMapping {
    public static void main(String[] args) {
        StudentMapService studentMapService = new StudentMapService();
        studentMapService.loadDetails("files/map.csv");

        MeetingService meetingService = new MeetingService();
        meetingService.loadMeetingDetails("files/meet copy.csv");

        List<String> meetnames = new ArrayList<>();

        meetingService.getMeeting().getParticipations().forEach(part->{
            meetnames.add(part.getGmeetName());
        });

        meetnames.stream().forEach(name->{
            System.out.println(studentMapService.getStudentByGmeetName(name));
        });
        System.out.println(meetnames.size());
    }
}
