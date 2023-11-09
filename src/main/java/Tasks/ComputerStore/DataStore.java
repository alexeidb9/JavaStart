package Tasks.ComputerStore;

public class DataStore {

    private static final int MAX_COMPUTERS = 100;
    private Computer[] computers = new Computer[MAX_COMPUTERS];
    private int computersNumber = 0;

    void add(Computer computer) {
        if (computersNumber < MAX_COMPUTERS && computer != null) {
            computers[computersNumber] = computer;
            computersNumber++;
        }
    }

    public Computer[] getComputers() {
        Computer[] comps = new Computer[computersNumber];
        for (int i = 0; i < computersNumber; i++) {
            comps[i] = computers[i];
        }
        return comps;
    }

    void info() {
        for (int i = 0; i < computers.length; i++) {
            System.out.println("Model available: " + computers[i].getProducer() + " " + computers[i].getModel());
        }

    }

    int checkAvailability(Computer computer) {

        if(computer == null)
            return 0;

        int count = 0;
        for (int i = 0; i < computersNumber; i++) {
            if (computer.equals(computers[i])) {
                count++;
            }
        }
    return count;
    }

}
