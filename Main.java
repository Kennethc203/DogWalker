public class Main {
    public static void main(String[] args) {
        DogWalkCompany doug = new DogWalkCompany();
        System.out.println(doug);
        int hour = doug.addDogs();
        System.out.println(doug);
        DogWalker Micheal = new DogWalker(4, doug);



    }
}
