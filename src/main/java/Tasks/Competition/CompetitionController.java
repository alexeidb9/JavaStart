package Tasks.Competition;

import Tasks.Competition.Exceptions.AgeViolationException;
import Tasks.Competition.Exceptions.DuplicateException;
import Tasks.Competition.Exceptions.MaxCompetitorsException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompetitionController {
    private Scanner scanner = new Scanner(System.in);

    void run() throws AgeViolationException, MaxCompetitorsException {
        Competition competition = createCompetition();
        fillParticipantsInfo(competition);
        printCompetition(competition);
    }

    private Competition createCompetition() {
        System.out.println("Podaj nazwę zawodów:");
        String competitionName = scanner.nextLine();
        System.out.println("Podaj maksymalną liczbę uczestników:");
        int maxParticipants = scanner.nextInt();
        System.out.println("Podaj ograniczenie wiekowe:");
        int ageLimit = readPositiveNumber();
        scanner.nextLine();
        return new Competition(competitionName, maxParticipants, ageLimit);
    }

    private void fillParticipantsInfo(Competition competition) throws AgeViolationException, MaxCompetitorsException {

        while (competition.hasFreeSpots()) {
            System.out.println("Dodaj nowego uczestnika");
            Participant participant = createParticipant();
            try {
                competition.addParticipant(participant);
            } catch (AgeViolationException e){
                System.out.println("The participant hasn't been added, minimal age is: " + e.getAgeRequired());
            } catch (DuplicateException e) {
                System.out.println("Participant wth such id has been already added to competition " + e.getParticipant());
            } catch (MaxCompetitorsException e) {
                System.out.println("Max number of participants has been reached " + e.getMaxCompetitors());
            }


        }
    }

    private Participant createParticipant() {
        System.out.println("Podaj imię:");
        String firstName = scanner.nextLine();
        System.out.println("Podaj nazwisko:");
        String lastName = scanner.nextLine();
        System.out.println("Podaj id (np. pesel):");
        String id = scanner.nextLine();
        System.out.println("Podaj wiek:");
        int age = scanner.nextInt();
        scanner.nextLine();
        return new Participant(firstName, lastName, id, age);
    }

    private void printCompetition(Competition competition) {
        System.out.println(competition.toString());
    }

    private int readPositiveNumber(){
        int number = -1;
        while (number < 0){
            try {
                number = scanner.nextInt();
                if (number < 0) {
                    System.out.println("Added must be positive");
                }
            } catch (InputMismatchException e) {
                System.out.println("Provide a number, try again once more.");
            } finally {
                scanner.nextLine();
            }
        }
        return number;
    }
}
