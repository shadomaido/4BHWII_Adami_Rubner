

import Models.Drucker;
import Models.DruckerProxy;

public class Main {
    public static void main(String[] args) {
        Drucker drucker = new DruckerProxy();

        drucker.drucken("Testdokument", 15);
        System.out.println();
        drucker.drucken("Dokument.exe", 50);
        System.out.println();
        drucker.drucken("Test3",500);
        System.out.println();
        drucker.drucken("Test3",501);
        System.out.println();
        drucker.drucken("Test4", 480);
        System.out.println();
        drucker.drucken("Testdruck", 540);
        System.out.println();
        drucker.drucken("Test6", 880);
        System.out.println();
    }
}
