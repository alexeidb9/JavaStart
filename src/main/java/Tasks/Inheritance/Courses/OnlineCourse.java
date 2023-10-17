package Tasks.Inheritance.Courses;

public class OnlineCourse extends Course{

    private double duration;
    private double learningTime;

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getLearningTime() {
        return learningTime;
    }

    public void setLearningTime(double learningTime) {
        this.learningTime = learningTime;
    }
}
