import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<List<String>> people = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        // Initialize some sample contacts
        List<String> anthony = new LinkedList<>(Arrays.asList("Anthony", "(210)111-1111"));
        people.add(anthony);
        List<String> becky = new LinkedList<>(Arrays.asList("Becky", "(210)222-2222"));
        people.add(becky);
        List<String> carl = new LinkedList<>(Arrays.asList("Carl", "(210)333-3333"));
        people.add(carl);

        int count = 1;
        while (count < 5) {
            System.out.println("I am your address book!");
            try {
                while (true) {
                    System.out.println();
                    System.out.println("1. Add");
                    System.out.println("2. Search");
                    System.out.print("Select an option (type the number): ");

                    int choice = scanner.nextInt();
                    scanner.nextLine();

                    switch (choice) {
                        case 1:
                            System.out.print("Enter the name of the person: ");
                            String addName = scanner.nextLine();
                            System.out.print("Enter their number: ");
                            String addNumber = scanner.nextLine();
                            List<String> newEntry = new LinkedList<>(Arrays.asList(addName, addNumber));
                            people.add(newEntry);
                            System.out.println("Contact added successfully!");
                            break;
                        case 2:
                            System.out.print("Enter the name or number to search (exactly how you put it in): ");
                            String searchTerm = scanner.nextLine();
                            boolean found = false;
                            for (List<String> person : people) {
                                if (person.contains(searchTerm)) {
                                    System.out.println("Contact found: " + person.get(0) + " - " + person.get(1));
                                    found = true;
                                }
                            }
                            if (!found) {
                                System.out.println("Contact not found!");
                            }
                            break;
                    }
                }
            } finally {
                System.out.println("Your address book is complete!");
                count += 1;
            }
        }
    }
}
