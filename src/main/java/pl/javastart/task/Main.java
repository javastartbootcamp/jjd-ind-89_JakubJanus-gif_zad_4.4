package pl.javastart.task;

public class Main {
    public static void main(String[] args) {
        SalesRepresentative salesRepresentative = new SalesRepresentative();

        // to nie powinno być możliwe
        salesRepresentative.config.minRequiredEarnings = 0;

        Offer offer = salesRepresentative.createLoanOffer(1_000_000, 1000);

        // to również nie powinno być możliwe
        offer.valid = true;
        offer.percentage = -0.5;
        offer.value = 2_000_000;

        CustomerService customerService = new CustomerService();
        customerService.payoutOffer(offer);
    }
}