package Deal_or_No_Deal;


public class Deal_or_No_Deal_GAME {
    public static void main(String[] args) {
        System.out.println("===============================================================================================================================");
        System.out.println();
        System.out.println(
                """
                         /$$$$$$$                      /$$                                 /$$   /$$                 /$$$$$$$                      /$$
                        | $$__  $$                    | $$                                | $$$ | $$                | $$__  $$                    | $$
                        | $$  \\ $$  /$$$$$$   /$$$$$$ | $$        /$$$$$$   /$$$$$$       | $$$$| $$  /$$$$$$       | $$  \\ $$  /$$$$$$   /$$$$$$ | $$
                        | $$  | $$ /$$__  $$ |____  $$| $$       /$$__  $$ /$$__  $$      | $$ $$ $$ /$$__  $$      | $$  | $$ /$$__  $$ |____  $$| $$
                        | $$  | $$| $$$$$$$$  /$$$$$$$| $$      | $$  \\ $$| $$  \\__/      | $$  $$$$| $$  \\ $$      | $$  | $$| $$$$$$$$  /$$$$$$$| $$
                        | $$  | $$| $$_____/ /$$__  $$| $$      | $$  | $$| $$            | $$\\  $$$| $$  | $$      | $$  | $$| $$_____/ /$$__  $$| $$
                        | $$$$$$$/|  $$$$$$$|  $$$$$$$| $$      |  $$$$$$/| $$            | $$ \\  $$|  $$$$$$/      | $$$$$$$/|  $$$$$$$|  $$$$$$$| $$
                        |_______/  \\_______/ \\_______/|__/       \\______/ |__/            |__/  \\__/ \\______/       |_______/  \\_______/ \\_______/|__/
                                                                                                                                                     \s
                                                                                                                                                     \s
                        """);
        System.out.println("===============================================================================================================================");
        System.out.println();
        Methode.regelnAbfragen();
        System.out.println();
        Methode.startAbfrage();
        System.out.println();
        Methode.ausgabeTafel(Methode.kofferArray());
        System.out.println();
        Methode.oeffnenKoffer(Methode.kofferArray(), Methode.oeffnenAbfrage());
    }
}



