public class Manila implements Locations {

    int airFare = 20;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
