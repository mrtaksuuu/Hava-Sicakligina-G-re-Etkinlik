import  java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int sicaklik;
        Scanner kb = new Scanner(System.in);
        System.out.println("Lütfen sıcaklık giriniz : ");
        sicaklik = kb.nextInt();

        if(sicaklik<5)
            System.out.println("Kayak yapabilirsiniz. ");
        else if(sicaklik >= 5 && sicaklik <= 15)
            System.out.println("Sinemaya gidebilirsiniz. ");
        else if(sicaklik >= 15 && sicaklik <= 25)
            System.out.println("Pikniğe gidebilirsiniz. ");
        else if(sicaklik > 25)
                System.out.println("Yüzmeye gidebilirsiniz. ");



    }
}
