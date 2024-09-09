package Deal_or_No_Deal;
public class LoadingScreen_und_Animation {


    // Kurze verzögerung 500 millisekunden
    public static void loadingScreenShort(){
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){

        }
    }
    public static void oeffnenAnimation(int nummer) {
        String resetColor = "\u001B[0m";
        String greenColor = "\u001B[32m";
        for (int i = 0; i < 1; i++) {
                try {
                    System.out.printf("%17s%sKoffer %d wird geöffnet%s","",greenColor,nummer,resetColor);
                    Thread.sleep(300);
                    System.out.print("\r");
                } catch (InterruptedException e) {
                }
                try {
                    System.out.printf("%23sKoffer %d","",nummer);
                    Thread.sleep(350);
                    System.out.print("\r");
                } catch (InterruptedException e) {
                }
        }
    }

    // Soll einen Ladebildschrim darstellen
    public static void loadingScreen(){
        String greenColor = "\u001B[32m";
        String resetColor = "\u001B[0m";

        try {
            System.out.print("Loading...");
            Thread.sleep(300);
            System.out.print("\r");
        }catch (InterruptedException e){

        }try {
            for (int i = 0; i<=100;i++){
                if(i<=20){
                    Thread.sleep(10);
                    System.out.print(i+"%\r");
                } else if (i>20 && i<95) {
                    Thread.sleep(10);
                    System.out.print(i+"%\r");
                } else {
                    Thread.sleep(20);
                    System.out.print(i+"%\r");
                    if (i == 100){
                        System.out.print("");
                        if (i==100){
                            System.out.print("\r"+greenColor+"*Ladevorgang abgeschlossen!*"+resetColor);
                        }
                        loadingScreenShort();
                    }
                }
            }
        }catch (InterruptedException e){

        }
    }
    public static void kofferAnimation(){
        try{
            Thread.sleep(10);
        }catch (InterruptedException e){

        }
    }
}
