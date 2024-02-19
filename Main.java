import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();
        // Converting name to uppercase
        String str = name.toUpperCase();
        // storing single letter of name into letter array
        char letter[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            letter[i] = str.charAt(i);
            System.out.println(letter[i]);
        }
        // object of print class to print 2d arrays with print() method
        Print print = new Print();
        // Alphabets ojects
        StarA a = new StarA();
        StarD d = new StarD();
        StarE e = new StarE();
        StarG g = new StarG();
        StarN n = new StarN();
        StarR r = new StarR();
        String finallString[][] = new String[6][letter.length * 6];
        // print.print(finallString);
        // print.print(a.a);
        // print.print(d.d);
        // print.print(e.e);
        // print.print(g.g);
        // rtr print.print(n.n);
        // print.print(r.r);
        ArrangeAlpha arng = new ArrangeAlpha();
        int count = 0;
        while (count < letter.length) {
            if (letter[count] == 'A') {
                System.out.println("yes");
                finallString = arng.arrange(finallString, a.a);
                count++;
            } else if (letter[count] == 'D') {
                finallString = arng.arrange(finallString, d.d);
                count++;
            } else if (letter[count] == 'E') {
                finallString = arng.arrange(finallString, e.e);
                count++;
            } else if (letter[count] == 'G') {
                finallString = arng.arrange(finallString, g.g);
                count++;
            } else if (letter[count] == 'N') {
                finallString = arng.arrange(finallString, n.n);
                count++;
            } else if (letter[count] == 'R') {
                finallString = arng.arrange(finallString, r.r);
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
