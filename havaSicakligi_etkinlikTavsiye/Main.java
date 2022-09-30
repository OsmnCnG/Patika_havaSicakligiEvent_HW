import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hava sıcaklığı:");
        double havaSicakligi = keyboard.nextDouble();

        System.out.println("Hava sıcaklığı: " + havaSicakligi + " derece.");
        if (havaSicakligi < 5)
            System.out.println("Hava tam kayak yapmalık..");
        else if (havaSicakligi < 15 && havaSicakligi >= 5) {
            System.out.println("Hava tam Sinema izlemelik..");
        } else if (havaSicakligi < 25 && havaSicakligi >= 15 ) {
            System.out.println("Hava tam Piknik yapmalık..");
        }else
            System.out.println("Hava tam yüzmeye gitmelik..");
    }
}