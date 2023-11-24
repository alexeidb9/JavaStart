package Tasks.Competition.Exceptions;

import Tasks.Competition.Participant;

public class DuplicateException extends RuntimeException{

    private final Participant participant;

    public DuplicateException(Participant participant) {
        this.participant = participant;
    }

    public Participant getParticipant() {
        return participant;
    }
}
