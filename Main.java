import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input
        System.out.print("  Enter Your Name: ");
        String name = sc.nextLine();
        // Converting name to uppercase
        String str = name.toUpperCase();
        // storing single letter of name into letter array
        char letter[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            letter[i] = str.charAt(i);
            // System.out.println(letter.length);
        }
        // object of print class to print 2d arrays with print() method
        Print print = new Print();
        // Alphabets ojects
        StarA a = new StarA();
        StarB b = new StarB();
        StarC c = new StarC();
        StarD d = new StarD();
        StarE e = new StarE();
        StarF f = new StarF();
        StarG g = new StarG();
        StarH h = new StarH();
        StarI i = new StarI();
        StarJ j = new StarJ();
        StarK k = new StarK();
        StarL l = new StarL();
        StarM m = new StarM();
        StarN n = new StarN();
        StarO o = new StarO();
        StarP p = new StarP();
        StarQ q = new StarQ();
        StarR r = new StarR();
        StarS s = new StarS();
        String finallString[][] = new String[6][0];
        ArrangeAlpha arng = new ArrangeAlpha();
        int count = 0;
        while (count < letter.length) {
            if (letter[count] == 'A') {
                // System.out.println("yes");
                finallString = arng.arrange(finallString, a.a);
                count++;
            } else if (letter[count] == 'B') {
                finallString = arng.arrange(finallString, b.b);
                count++;
            } else if (letter[count] == 'C') {
                finallString = arng.arrange(finallString, c.c);
                count++;
            } else if (letter[count] == 'D') {
                finallString = arng.arrange(finallString, d.d);
                count++;
            } else if (letter[count] == 'E') {
                finallString = arng.arrange(finallString, e.e);
                count++;
            } else if (letter[count] == 'F') {
                finallString = arng.arrange(finallString, f.f);
                count++;
            } else if (letter[count] == 'G') {
                finallString = arng.arrange(finallString, g.g);
                count++;
            } else if (letter[count] == 'H') {
                finallString = arng.arrange(finallString, h.h);
                count++;
            } else if (letter[count] == 'I') {
                finallString = arng.arrange(finallString, i.i);
                count++;
            } else if (letter[count] == 'J') {
                finallString = arng.arrange(finallString, j.j);
                count++;
            } else if (letter[count] == 'K') {
                finallString = arng.arrange(finallString, k.k);
                count++;
            } else if (letter[count] == 'L') {
                finallString = arng.arrange(finallString, l.l);
                count++;
            } else if (letter[count] == 'M') {
                finallString = arng.arrange(finallString, m.m);
                count++;
            } else if (letter[count] == 'N') {
                finallString = arng.arrange(finallString, n.n);
                count++;
            } else if (letter[count] == 'O') {
                finallString = arng.arrange(finallString, o.o);
                count++;
            } else if (letter[count] == 'P') {
                finallString = arng.arrange(finallString, p.p);
                count++;
            } else if (letter[count] == 'Q') {
                finallString = arng.arrange(finallString, q.q);
                count++;
            } else if (letter[count] == 'R') {
                finallString = arng.arrange(finallString, r.r);
                count++;
            } else if (letter[count] == 'S') {
                finallString = arng.arrange(finallString, s.s);
                count++;
            } else {
                System.out.println("You Are Dumb Enter Charecter In B/W A-Z.");
                break;
            }
        }

        print.print(finallString);
        sc.close();
    }
}
