package com.company.solid.singleresponsibility.problem;

import com.company.solid.singleresponsibility.solution.InvoicePrinter;

public class Execute {
//    private Book book;
//    private InvoicePrinter invoicePrinter;
//    private Invoice invoice;
    public static void main(String[] args) {

        Book book = new Book("Pirates","Fantasia",1995,200,"AS214");
        Invoice invoice = new Invoice(book,5,1.3,7.5);
        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);

        invoicePrinter.print();

    }
}
