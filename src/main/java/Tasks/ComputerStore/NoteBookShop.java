package Tasks.ComputerStore;

public class NoteBookShop {
    public static void main(String[] args) {

        DataStore dataStore = new DataStore();
        dataStore.add(new Computer("Lenovo", 412));
        dataStore.add(new Computer("Asus", 44));
        dataStore.add(new Computer("HP", 42145));
        dataStore.add(new Computer("Apple", 989));
        dataStore.add(new Computer("Apple", 989));

        Computer compToFind = new Computer("Apple", 989);
        System.out.println("Available pc's of model " + compToFind.getProducer() + " " + compToFind.getModel() + ": " + dataStore.checkAvailability(compToFind));
//        dataStore.info();
    }

}
