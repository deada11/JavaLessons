package stepikCource.logic32;

import java.util.Scanner;

class Quiz_13 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), a1 = sc.next(), a2 = sc.next();
        char g=a.charAt(0);
        char g1=a1.charAt(0);
        char g2=a2.charAt(0);
        if ( (g<g1 && g<g2) && (g1<g2) )
        { System.out.println( a+"\n"+a1+"\n"+a2);}
        else if ( (g<g1 && g<g2) && (g2<g1) ) { System.out.println (a+"\n"+a2+"\n"+a1);}
        else if ((g1<g && g1<g2) && (g<g2) ) { System.out.println (a1+"\n"+a+"\n"+a2);}
        else if ((g1<g && g1<g2) && (g2<g) ) { System.out.println (a1+"\n"+a2+"\n"+a);}
        else if ((g2<g1 && g2<g) && (g<g1) ){ System.out.println (a2+"\n"+a+"\n"+a1);}
        else if ((g2<g1 && g2<g) && (g1<g) ){ System.out.println (a2+"\n"+a1+"\n"+a);}
    }
}
