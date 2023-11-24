package Tasks.Competition;

import Tasks.Competition.Exceptions.AgeViolationException;

public class CompetitionApp {
    public static void main(String[] args) throws AgeViolationException {
        CompetitionController competitionController = new CompetitionController();
        competitionController.run();
    }
}
