public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch
        fleet.add(new Thing("Get milk"));
        fleet.add(new Thing("Remove the obstacles"));
        Thing completed1 = new Thing("Stand up");
        completed1.complete();
        fleet.add(completed1);
        Thing completed2 = new Thing("Eat lunch");
        completed2.complete();
        fleet.add(completed2);


        System.out.println(fleet);
    }
}