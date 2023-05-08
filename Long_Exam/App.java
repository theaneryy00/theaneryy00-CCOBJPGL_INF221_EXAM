public class App {
    public static void main(String[] args) throws Exception {


        Locations boracay = new Boracay();
        Locations davao = new Davao();
        Locations kalinga = new Kalinga();
        Locations manila = new Manila();
        Locations nuevaecija = new NuevaEcija();
        Locations siargao = new Siargao();
        
        Tourist me = new Me();

        boracay.accept(me);
        davao.accept(me);
        kalinga.accept(me);
        manila.accept(me);
        nuevaecija.accept(me);
        siargao.accept(me);

        // Long exam 1

        // 1. Add 5 new locations to visit
        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod

    }
}
