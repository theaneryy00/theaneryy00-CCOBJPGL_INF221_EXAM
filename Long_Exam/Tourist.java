interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);

    void visit(Davao davao);

    void visit(Kalinga kalinga);

    void visit(Manila manila);

    void visit(NuevaEcija nuevaecija);

    void visit(Siargao siargao);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}
