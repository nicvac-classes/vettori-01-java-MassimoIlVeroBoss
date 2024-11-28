import java.util.Scanner;

class Esercizio {
    
    public static void main(String args[]) {
        Scanner in = new Scanner( System.in );
        String [] v = new String [5];
        String [] w = new String [5];
        int [] x = new Int [10];
        int [] y = new Int [10];
        int i;
        v[0] = "Nirvana";
        v[1] = "Linkin Park";
        v[2] = "Queen";
        v[3] = "Metallica";
        v[4] = "Imagine Dragons";
        for (i=0; i<v.length; i++) {
            System.out.println("Inserisci il nome del cantante n°" + i+1);
            w[i] = in.nextLine();
        }
        for (i=0; i<x.length; i++) {
            x[i] = i+1;
        }
        for (i=0; i<y.length; i++) {
            y[i] = i*2;
        }
        System.out.println(v[0]);
        System.out.println(v[2]);
        System.out.println(v[4]);
        for (i=0; i<w.length; i++) {
            System.out.println(w[i]);
        }
        for (i=0; i<x.length; i++) {
            System.out.println(x[i]);
            System.out.println(y[i]);
        }
        for (i=0; i<x.length; i++) {
            if (i % 2 == 0) {
                System.out.println(x[i]);
            }
        }
        for (i=0; i<x.length; i++) {
            if (x[i] % 2 == 0) {
                System.out.println(x[i]);
            }
        }
    }
}