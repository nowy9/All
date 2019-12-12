package pl.kul;

import java.math.BigDecimal;

public class InvoiceEntry {
    private final String entryName;
    private final BigDecimal itemNetPrice;
    private final BigDecimal amount;

    public InvoiceEntry(String entryName, BigDecimal itemNetPrice, BigDecimal amount) {
        this.entryName = entryName;
        this.itemNetPrice = itemNetPrice;
        this.amount = amount;
    }

    public String getEntryName() {
        return entryName;
    }

    public BigDecimal getItemNetPrice() {
        return itemNetPrice;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
