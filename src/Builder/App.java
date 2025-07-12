package Builder;

public class App {

    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = director.cancunTrip();
        TourPlan tourPlan1 = director.longBeachTrip();
        System.out.println("Tour Plan 1: " + tourPlan1.toString());
        System.out.println("Tour Plan 2: " + tourPlan.toString());
    }
}