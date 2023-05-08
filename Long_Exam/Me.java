public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {

        budget -= boracay.airFare;

        // Define your visit
        System.println("wow white sand ka ning");
        checkBudget();
    }

    public void visit(Davao davao) {

        budget -= davao.airFare;

        // Define your visit
        System.println("going to Davao for durian");
        checkBudget();
    }

    public void visit(Kalinga kalinga) {

        budget -= kalinga.airFare;

        // Define your visit
        System.println("aakyat sa bundok for apo wang od");
        checkBudget();
    }

    public void visit(Manila manila) {

        budget -= manila.airFare;

        // Define your visit
        System.println("Intramuros here we go!!");
        checkBudget();
    }

    public void visit(NuevaEcija nuevaecija) {

        budget -= nuevaecija.airFare;

        // Define your visit
        System.println("for the palayan ang ferson");
        checkBudget();
    }

    public void visit(Siargao siargao) {

        budget -= nuevaecija.airFare;

        // Define your visit
        System.println("let's chill in Siargao!!");
        System.println("surf na this!!");
        checkBudget();
    }


    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

}
