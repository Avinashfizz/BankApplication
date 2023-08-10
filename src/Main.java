// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        SBIBANK AvinashAcount = new SBIBANK("Chitrasen", "Vaishnavi@995", 200000);
        System.out.println(AvinashAcount);
        System.out.println(AvinashAcount.fetchBalance("Vaishnavi@995"));
        System.out.println(AvinashAcount.fetchBalance("Vaishnavi@99"));
        System.out.println(AvinashAcount.addMoney(10000.0));
        System.out.println(AvinashAcount.withdrawMoney(200000.0, "Vaishnavi@995"));
        System.out.println(AvinashAcount.withdrawMoney(20000000.0, "Vaishnavi@995"));
        System.out.println(AvinashAcount.withdrawMoney(200000.0, "Vaishnavi@1"));
        System.out.println(AvinashAcount.changePassword("Vaishnavi@995", "Vaishnavi@99"));
        System.out.println(AvinashAcount.calculateIntrest(5));







        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
     //   System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
     //  for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
       //     System.out.println("i = " + i);
     //   }
    }
}