package pl.javastart.task;

public class SalesRepresentative {

    public Config config;

    public SalesRepresentative() {
        this.config = new Config();
    }

    public Offer createLoanOffer(int requestedAmount, int earnings) {
        Offer offer = new Offer();
        if (earnings >= config.minRequiredEarnings) {
            offer.percentage = config.percentage;
            offer.valid = true;
            offer.value = requestedAmount;
        }
        return offer;
    }

}
