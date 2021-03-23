public class IteratorDemo {

    public static void main(String[] args) {
        // Instantiates repositories that have implemented the Container interface
        NameRepository namesRepository = new NameRepository();
        AgeRepository ageRepository = new AgeRepository();

        // Creates a for loop based on the Iterator; Defines the condition that must be true to continue the loop
        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }

        // Creates a for loop based on the Iterator; Defines the condition that must be true to continue the loop
        for (Iterator iter = ageRepository.getIterator(); iter.hasNext(); ) {
            int age = (int) iter.next();
            System.out.println("Age : " + age);
        }
    }
}
