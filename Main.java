import java.rmi.dgc.DGC;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
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
        tobey.totalMoney += 2000;
        System.out.println("The company has $" + tobey.totalMoney + ".00, good job.");
        File txt = new File("comp.txt");
        Scanner scan = new Scanner(txt);
        DogWalkCompany[] corporations = new DogWalkCompany[1000];
        for (int j = 0; j < 1000; j++){
            corporations[j] = new DogWalkCompany();
            for (int i = 0; i < 24; i++){
                corporations[j].addDoggies(i, scan.nextInt());
            }
        }
        System.out.println(corporations[200]);
        int totalMoney = 0;
        txt = new File("walkers.txt");
        scan = new Scanner(txt);
        DogWalker[] walters = new DogWalker[10000];
        for (int i = 0; i < 10000; i++){
            int max = scan.nextInt();
            int compLocation = scan.nextInt();
            int begin = scan.nextInt();
            int end = scan.nextInt();
            walters[i] = new DogWalker(max, corporations[compLocation]);
            totalMoney += walters[i].dogWalkShift(begin, end);
        }
        System.out.println(totalMoney);
        }



    }
