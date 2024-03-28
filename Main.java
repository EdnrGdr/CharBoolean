public class Main {

    public static void main (String[] args) {

        // Char veri tipi karakterler için kullanılır.

        char a = 'A';
        char b = '?';
        char c = 23;
        char d = '\u00E3';   // unicode table google dan aratılır istedigimiz karakterin unicodunu buraya yazarız. basına U+ dilip \ u yazıp. Konsolda istedigimiz karakter gözükür.
        char e = '\u058D';

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);


        // Boolean koşullu değerde kullanılır. True - False ( Dogru - Yanlıs ) durumlarında kullanırız.

        boolean x = true;
        boolean y = false;
        System.out.println(x);
        System.out.println(y);

    }
}
