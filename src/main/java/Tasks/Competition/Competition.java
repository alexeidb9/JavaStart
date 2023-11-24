package Tasks.Competition;

import Tasks.Competition.Exceptions.AgeViolationException;
import Tasks.Competition.Exceptions.DuplicateException;
import Tasks.Competition.Exceptions.MaxCompetitorsException;

public class Competition {
    private String name;
    private Participant[] participants;
    private int ageLimit;
    private int maxParticipants;
    private int size;

    public Competition(String name, int maxParticipants, int ageLimit) {
        this.name = name;
        if(ageLimit <= 0)
            throw new IllegalArgumentException("Age limit has to be a positive number");
        this.ageLimit = ageLimit;
        this.participants = new Participant[maxParticipants];
    }

    void addParticipant(Participant participant) throws AgeViolationException, MaxCompetitorsException {

        checkAgeConstraint(participant);
        checkMaxParticipantsConstraint(participant);
        participants[size] = participant;
            size++;
    }

    private void checkMaxParticipantsConstraint(Participant participant) {
        if(participants.length == size)
                throw new MaxCompetitorsException(participants.length);
        checkDuplicate(participant);
    }

    private void checkAgeConstraint(Participant participant) {
        if(participant.getAge() < ageLimit)
            throw new AgeViolationException(ageLimit);
    }

    private void checkDuplicate(Participant participant){
        for (int i = 0; i < size; i++) {
            if (participants[i].getDocumentId().equals(participant.getDocumentId())) {
                throw new DuplicateException(participant);
            }
        }

    }
    boolean hasFreeSpots() {
        return size < participants.length;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Zawody ")
                .append(name)
                .append("\n")
                .append("Liczba uczestników: ").append(size);
        for (int i = 0; i < size; i++) {
            builder.append("\n");
            builder.append(" > ");
            builder.append(participants[i].toString());
        }
        return builder.toString();
    }
}
