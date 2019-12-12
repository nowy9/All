package pl.kul;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Application {
    private final Scanner scanner;

    public Application() {
        scanner = new Scanner(System.in);
    }

    public void run() {
        List<InvoiceEntry> invoiceEntries = new LinkedList<>();
        do {
            String entryName;
            do {
                System.out.println("Podaj nazwę produktu/usługi:");
                entryName = scanner.next();
            } while (entryName == null || entryName.isBlank());
            BigDecimal itemNetPrice;
            do {
                System.out.println("Podaj cenę netto za sztukę (jednostkę):");
                itemNetPrice = scanner.nextBigDecimal();
            } while (itemNetPrice == null);
            BigDecimal amount;
            do {
                System.out.println("Podaj ilość sztuk (jednostek):");
                amount = scanner.nextBigDecimal();
            } while (amount == null);

            InvoiceEntry invoiceEntry = new InvoiceEntry(entryName, itemNetPrice, amount);
            invoiceEntries.add(invoiceEntry);
        } while (wantNextInvoiceEntry());
    }

    private boolean wantNextInvoiceEntry() {
        System.out.println("Dodać kolejną pozycję? [T/n]");
        String result = scanner.next();

        return result != null && (result.equalsIgnoreCase("T") || result.isEmpty());
    }
}