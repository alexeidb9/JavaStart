package Tasks.Inheritance.Courses;

public class Bootcamp extends OnlineCourse{

    private String teacher;
    private int consultationAvailableHours;

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getConsultationAvailableHours() {
        return consultationAvailableHours;
    }

    public void setConsultationAvailableHours(int consultationAvailableHours) {
        this.consultationAvailableHours = consultationAvailableHours;
    }
}
