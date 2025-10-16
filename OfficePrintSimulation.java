
class Printer {
    public synchronized void printDocument(String user, String document) {
        System.out.println(user + " is printing: " + document);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Printing interrupted");
        }
        System.out.println(user + " finished printing: " + document);
    }
}

class User implements Runnable {
    private String name;
    private Printer printer;
    private String document;

    public User(String name, Printer printer, String document) {
        this.name = name;
        this.printer = printer;
        this.document = document;
    }

    @Override
    public void run() {
        printer.printDocument(name, document);
    }
}

public class OfficePrintSimulation {
    public static void main(String[] args) {
        Printer sharedPrinter = new Printer();

        Thread user1 = new Thread(new User("User1", sharedPrinter, "Report.pdf"));
        Thread user2 = new Thread(new User("User2", sharedPrinter, "Invoice.docx"));
        Thread user3 = new Thread(new User("User3", sharedPrinter, "Presentation.pptx"));

        user1.start();
        user2.start();
        user3.start();
    }
}