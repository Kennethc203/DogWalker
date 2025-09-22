public class Main {
    public static void main(String[] args) {
        DogWalkCompany doug = new DogWalkCompany();
        System.out.println(doug);
        int hour = doug.addDogs();
        System.out.println(doug);
        DogWalker Micheal = new DogWalker(4, doug);
        System.out.println(Micheal.walkDogs(hour) + " dogs walked.");
        System.out.println(doug.numAvailableDogs(hour) + " dogs remaining.");
        DogWalkCompany tobey = new DogWalkCompany();
        for (int i = 7; i < 11; i++) {tobey.addDogs();}
        System.out.println(tobey);
        DogWalker josh = new DogWalker(3, tobey);
        System.out.println("$" + josh.dogWalkShift(7, 10) + ".00 earned.");
        System.out.println(tobey);




    }
}
