package ro.bogdanpanea.teste;

public class main {


    public static void main(String args[]) {

        int[] valori = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int produs = 0;
        int counter = 0;
        for (int i = 0; i < valori.length - 1; i++) {
            for (int j = i + 1; j < valori.length; j++) {
                int minLenght = valori[i] > valori[j] ? valori[j] : valori[i];
                int aria = minLenght * (j - i);
                if (produs < aria) {
                    produs = aria;
                }
                counter++;
            }
        }

        System.out.println("Max surface is " + produs);
        System.out.println("Number of iterations is " + counter);
    }
}
