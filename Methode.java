package Deal_or_No_Deal;

import java.util.Random;
import java.util.Scanner;

public class Methode{

    //Fragt, ob der Spieler die Spielregeln kennt, wenn nicht dann wird die Methode "spielregeln" aufgerufen.
    public static void regelnAbfragen(){
        Scanner scanner = new Scanner(System.in);
        String abfrage;

        do {
            System.out.println("Kennst du die Regeln schon? (ja/nein)");
            abfrage = scanner.nextLine();                                                   // Eingabe von Nutzer
            if(abfrage.equalsIgnoreCase("nein")){
                spielregeln();
            } else if (abfrage.equalsIgnoreCase("ja")) {
                System.out.println("Super, dann kann das Spiel beginnen!");
            } else {
                System.out.println("\"" + abfrage + "\" verstehe ich nicht.");
                System.out.println("Es stehen nur \"ja\" oder \"nein\" zur Auswahl.");
                abfrage = scanner.nextLine();
                if (abfrage.equalsIgnoreCase("nein")){
                    spielregeln();
                }
            }
        }while(!abfrage.equalsIgnoreCase("ja") && !abfrage.equalsIgnoreCase("nein"));
    }

    // Gibt die Spielregeln aus.
    public static void spielregeln(){
        String redColor = "\u001B[31m";
        String resetColor = "\u001B[0m";
        System.out.println("Spielregeln: \n"+
                "____________________________________________________________________________________________________________________________________________________________________________________________________________\n"+
                redColor+"1. Spielziel:"+resetColor+ " Das Ziel des Spiels ist Koffer nacheinander zu öffnen bis nur noch zwei übrig sind um dann den Gewinn zu erhalten.\n" +
                "\n" +
                redColor+"2. Runden:"+resetColor+" Das Spiel besteht aus mehreren Runden. In jeder Runde muss der Spieler sechs Koffer öffnen, deren Inhalte dann als potenzielle Gewinne des Spielers gestrichen werden.\n" +
                "\n" +
                redColor+"3. Angebote:"+resetColor+" Nachdem sechs ungeöffnete Koffer in einer Runde geöffnet wurden, bietet die \"Bank\" dem Spieler einen Geldbetrag an, um das Spiel vorzeitig zu beenden. Der angebotene Betrag basiert auf den noch im Spiel verbleibenden Beträgen und deren Wahrscheinlichkeiten.\n" +
                "\n" +
                redColor+"4. Entscheidungen des Spielers:"+resetColor+" Nachdem die Bank ein Angebot gemacht hat, muss der Spieler entscheiden, ob er das Angebot annimmt und das Spiel beendet (\"Deal\") oder ob er ablehnt und weiter spielt (\"No Deal\").\n" +
                "\n" +
                redColor+"5. Fortsetzung des Spiels:"+resetColor+" Nachdem der Spieler sich entschieden hat ob er das Angebot annimmt oder nicht, werden weitere Koffer geöffnet und die Bank macht weitere Angebote bis entweder alle anderen Koffer geöffnet sind oder der Spieler ein Angebot annimmt.\n" +
                "\n" +
                redColor+"6. Finale Entscheidung:"+resetColor+" Wenn nur noch zwei Koffer übrig sind, dann muss der Spieler sich zwischen den beiden Koffern entscheiden. Der gewählte Koffer ist dann sein Gewinn.\n" +
                "\n" +
                redColor+"7. Gewinn:"+resetColor+" Der Spieler gewinnt den Betrag, der im von ihm gewählten Koffer enthalten ist.\n"+
                "____________________________________________________________________________________________________________________________________________________________________________________________________________\n");
    }

    //Fragt, ob das Spiel gestartet werden soll, wenn ja ("START"), dann wird die "loadingScreen" Methode aufgerufen.
    public static void startAbfrage(){
        Scanner scanner = new Scanner(System.in);
        String start;
        do {
            System.out.println("Gebe \"START\" ein, um das Spiel zu starten.");
            start = scanner.nextLine();
            if (!start.equalsIgnoreCase("start")){
                System.out.println("\""+start + "\" ist kein gültiger Befehl!");
            }
        }while(!start.equalsIgnoreCase("start"));
        LoadingScreen_und_Animation.loadingScreen();
    }

    //Fragt, welcher Koffer geöffnet werden soll und gibt Wert an (oeffenKoffer();) weiter
    public static int oeffnenAbfrage(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%6sWelchen Koffer möchtest du öffnen?\n","");
        System.out.printf("%6s","");
        return scanner.nextInt();
    }

    //Zeigt welche Gewinne sich hinter den Koffern verstecken, mit %s Zeilen eingerückt (rechtsbündig) und mit %f Nachkommastellen begrenzt und %n fügt eine neue Zeile ein.
    // ( die "10" in "%10.2f" gibt die Gesamtbreite der Zahl an, sodass die Zahlenabstände einheitlich groß sind. )
    public static void ausgabeTafel(double[] kofferBetraege) {

        double[] array = new double[27];
        for (int i = 1; i < array.length; i++) {
            if (kofferBetraege[i] / 1000000 == 1) {
                array[26] = kofferBetraege[i];
            } else if (kofferBetraege[i] / 750000 == 1) {
                array[25] = kofferBetraege[i];
            } else if (kofferBetraege[i] / 500000 == 1) {
                array[24] = kofferBetraege[i];
            } else if (kofferBetraege[i] / 400000 == 1) {
                array[23] = kofferBetraege[i];
            } else if (kofferBetraege[i] / 300000 == 1) {
                array[22] = kofferBetraege[i];
            } else if (kofferBetraege[i] / 200000 == 1) {
                array[21] = kofferBetraege[i];
            } else if (kofferBetraege[i] / 100000 == 1) {
                array[20] = kofferBetraege[i];
            } else if (kofferBetraege[i] / 75000 == 1) {
                array[19] = kofferBetraege[i];
            } else if (kofferBetraege[i] / 50000 == 1) {
                array[18] = kofferBetraege[i];
            } else if (kofferBetraege[i] / 25000 == 1) {
                array[17] = kofferBetraege[i];
            } else if (kofferBetraege[i] / 10000 == 1) {
                array[16] = kofferBetraege[i];
            } else if (kofferBetraege[i] / 5000 == 1) {
                array[15] = kofferBetraege[i];
            } else if (kofferBetraege[i] / 1000 == 1) {
                array[14] = kofferBetraege[i];
            } else if (kofferBetraege[i] / 750 == 1) {
                array[13] = kofferBetraege[i];
            } else if (kofferBetraege[i] / 500 == 1) {
                array[12] = kofferBetraege[i];
            } else if (kofferBetraege[i] / 400 == 1) {
                array[11] = kofferBetraege[i];
            } else if (kofferBetraege[i] / 300 == 1) {
                array[10] = kofferBetraege[i];
            } else if (kofferBetraege[i] / 200 == 1) {
                array[9] = kofferBetraege[i];
            } else if (kofferBetraege[i] / 100 == 1) {
                array[8] = kofferBetraege[i];
            } else if (kofferBetraege[i] / 75 == 1) {
                array[7] = kofferBetraege[i];
            } else if (kofferBetraege[i] / 50 == 1) {
                array[6] = kofferBetraege[i];
            } else if (kofferBetraege[i] / 25 == 1) {
                array[5] = kofferBetraege[i];
            } else if (kofferBetraege[i] / 10 == 1) {
                array[4] = kofferBetraege[i];
            } else if (kofferBetraege[i] / 5 == 1) {
                array[3] = kofferBetraege[i];
            } else if (kofferBetraege[i] == 1) {
                array[2] = kofferBetraege[i];
            } else if (kofferBetraege[i] / 0.01 == 1) {
                array[1] = kofferBetraege[i];
            } else if (kofferBetraege[i] == 0) {
                array[0] = 0;
            }
        }

        System.out.println();
        System.out.printf("%6s ================================%n", "");
        System.out.printf("%17s Preistafel%n", "");
        System.out.printf("%6s ================================%n", "");
        System.out.printf("%9s €%10.2f | %10.0f €%n", "", array[1], array[14]);
        System.out.printf("%9s €%10.0f | %10.0f €%n", "", array[2], array[15]);
        System.out.printf("%9s €%10.0f | %10.0f €%n", "", array[3], array[16]);
        System.out.printf("%9s €%10.0f | %10.0f €%n", "", array[4], array[17]);
        System.out.printf("%9s €%10.0f | %10.0f €%n", "", array[5], array[18]);
        System.out.printf("%9s €%10.0f | %10.0f €%n", "", array[6], array[19]);
        System.out.printf("%9s €%10.0f | %10.0f €%n", "", array[7], array[20]);
        System.out.printf("%9s €%10.0f | %10.0f €%n", "", array[8], array[21]);
        System.out.printf("%9s €%10.0f | %10.0f €%n", "", array[9], array[22]);
        System.out.printf("%9s €%10.0f | %10.0f €%n", "", array[10], array[23]);
        System.out.printf("%9s €%10.0f | %10.0f €%n", "", array[11], array[24]);
        System.out.printf("%9s €%10.0f | %10.0f €%n", "", array[12], array[25]);
        System.out.printf("%9s €%10.0f | %10.0f €%n", "", array[13], array[26]);
        System.out.printf("%6s --------------------------------", "");

    }



    //Festlegung welcher Koffer welchen Betrag hat
    public static double[] kofferArray(){
        Random random = new Random();

        double[] tempRandom = new double[27];               // tempRandom Array wird erstellt und mit den zu gewinnenden Beträgen deklariert
        tempRandom[0] = 0.0;
        tempRandom[1] = 0.01;
        tempRandom[2] = 1;
        tempRandom[3] = 5;
        tempRandom[4] = 10;
        tempRandom[5] = 25;
        tempRandom[6] = 50;
        tempRandom[7] = 75;
        tempRandom[8] = 100;
        tempRandom[9] = 200;
        tempRandom[10] = 300;
        tempRandom[11] = 400;
        tempRandom[12] = 500;
        tempRandom[13] = 750;
        tempRandom[14] = 1000;
        tempRandom[15] = 5000;
        tempRandom[16] = 10000;
        tempRandom[17] = 25000;
        tempRandom[18] = 50000;
        tempRandom[19] = 75000;
        tempRandom[20] = 100000;
        tempRandom[21] = 200000;
        tempRandom[22] = 300000;
        tempRandom[23] = 400000;
        tempRandom[24] = 500000;
        tempRandom[25] = 750000;
        tempRandom[26] = 1000000;

        // kofferBetraege Array wird erstellt, um die Beträge des tempRandom Arrays zuffällig zugewiesen zu bekommen
        double[] kofferBetraege = new double[27];

        // Iteration durch das Array kofferBetraege
        for (int i = 1; i < kofferBetraege.length; i++) {
            kofferBetraege[0] = 0;          // Der erste Betrag wird explizit auf 0 gesetzt.
            int randomNum;

            // Eine Zufallszahl wird generiert, um einen Betrag aus dem tempRandom Array zu wählen.
            // Wenn der gewählte Betrag bereits zugewiesen wurde (d.h. er ist 0), wird eine neue Zufallszahl generiert.
            do {
                randomNum = random.nextInt(26)+1;        // Zufallszahl zwischen 1 und 27 wird generiert.
            } while (tempRandom[randomNum] == 0);

            kofferBetraege[i] = tempRandom[randomNum];        // Der zufällig ausgewählte Betrag wird dem kofferBetraege Array zugewiesen.
            tempRandom[randomNum] = 0;                      // Der ausgewählte Betrag im tempRandom Array wird auf 0 gesetzt, um anzuzeigen, dass er bereits zugewiesen wurde.
        }
        return kofferBetraege;
    }

    // Gibt an welche Koffer noch nicht geöffnet wurden
    public static void nichtGeoeffneteKoffer(double[] kofferBetraege){
        System.out.printf("%6sFolgende Koffer sind noch ungeöffnet: ","");
        for (int i = 0; i < kofferBetraege.length; i++){                    // Iteration durch das Array kofferBetraege
            if (kofferBetraege[i] != 0){                                   // Überprüfen, ob der Wert im aktuellen Index nicht 0 ist (Koffer ist ungeöffnet)
                System.out.print(i+", ");                                  // Printed den Index des ungeöffneten Koffers aus
            }
        }
        System.out.println();
    }


    // Ermittelt die letzten beiden Koffer, gibt dem Spieler an welche es sind (kofferNummer) und
    // lässt den Spieler dann entscheiden, welchen er als Gewinnerkoffer nimmt
    public static void kofferFinale(double[] kofferBetraege) {
        Scanner scanner = new Scanner(System.in);
        String colorYellow = "\u001B[33m";
        String resetColor = "\u001B[0m";
        String blueColor = "\u001B[34m";

        int loopCount = 0;
        int kofferNummer1 = 0;
        int kofferNummer2 = 0;
        System.out.printf("%6sNun musst du dich entscheiden, wähle deinen Gewinnerkoffer%n", "");
        System.out.println();

        // index i geht das Array (kofferBetraege) durch und gibt den Wert der ersten Stelle im Array die NICHT 0 ist an (kofferNummer1) weiter
        // der zweite Wert der NICHT 0 ist, wird an kofferNummer2 weitergegeben
        for (int i = 0; i >= 0 && i < kofferBetraege.length; i++) {
            if (kofferBetraege[i] > 0) {
                if (loopCount == 0) {                                       // Wenn de erste ungeöffnete Koffer gefunden wurde, wird er zu kofferNummer1 deklariert
                    loopCount++;                                            // loopCount incrementiert, weil das Programm bei dem nächsten Fund eines ungeöffneten Koffers den Wert dess dann an kofferNummer2 weiter geben soll
                    kofferNummer1 = i;
                    System.out.printf("%6sWählst du Koffer \"%d\" oder ", "", kofferNummer1);
                } else {
                    kofferNummer2 = i;
                    System.out.printf("\"%d\" ?", kofferNummer2);
                }
            }
        }
        int finalgewinnerNum = scanner.nextInt();                         // scannt die Zahl des zu öffnenden Koffer ein und reagiert darauf

        if (finalgewinnerNum == kofferNummer1) {
            System.out.printf("%6sDein finaler Koffer ist Koffer Nummer: %d%n", "", kofferNummer1);
            System.out.printf("%6sIn diesem Koffer befinden sich %.2f €%n", "", kofferBetraege[kofferNummer1]);
            System.out.printf("%6s%sDu hast %s%.2f€%s gewonnen!\n%s","", blueColor, colorYellow, kofferBetraege[kofferNummer1], blueColor, resetColor);
            System.out.printf("%6sSpielende!","");

        } else if (finalgewinnerNum == kofferNummer2) {
            System.out.printf("%6sDein finaler Koffer ist Koffer Nummer: %d%n", "", kofferNummer2);
            System.out.printf("%6sIn diesem Koffer befinden sich %.2f €%n", "", kofferBetraege[kofferNummer2]);
            System.out.printf("%6s%sDu hast %s%.2f€%s gewonnen!\n%s","", blueColor, colorYellow, kofferBetraege[kofferNummer2], blueColor, resetColor);
            System.out.printf("%6sSpielende!","");
        }
    }

    // Berechnet das Angebot der Bank
    public static double berechnungAngebot(double[] kofferBetraege,double countGeoeffnet){
        double sumValue = 0;
        for (int i = 1; i >= 0 && i < kofferBetraege.length; i++){                  // geht Array durch und ließt alle Beträge ein
            double tempNum = kofferBetraege[i];                                     // Nimmt den Betrag des momentanen Array Platzes i an und gibt sie an sumValue weiter
            sumValue += tempNum;                                                    // addiert alle von tempNum bereitgestellten Werte zusammen
        }
        double angebot = sumValue / countGeoeffnet;                                // die errechnete Summe wird durch die Zahl der noch ungeöffneten Koffer geteilt

        // Multiplikator des Angebots, basierend der übrigen Kofferanzahl.
        if (countGeoeffnet > 19){                                   // Bezieht sich auf Runde 1 (20 übrige Koffer)
            angebot *= 0.1;
        } else if (countGeoeffnet < 19 && countGeoeffnet > 13 ) {   // Bezieht sich auf Runde 2 (14 übrige Koffer)
            angebot *= 0.2;
        } else if (countGeoeffnet < 13 && countGeoeffnet > 7 ) {    // Bezieht sich auf Runde 3 (8 übrige Koffer)
            angebot *= 0.3;
        } else if (countGeoeffnet < 7 && countGeoeffnet > 1 ) {     // Bezieht sich auf Runde 4 (2 übrige Koffer) (letztes Angebot von der Bank)
            angebot *= 0.6;
        }
        return angebot;
        }

        //Das ist die wichtigste Methode, hier läuft das Spiel
        public static void oeffnenKoffer(double[] kofferBetraege, int x) {
            Scanner scanner = new Scanner(System.in);

            String colorYellow = "\u001B[33m";
            String resetColor = "\u001B[0m";
            String blueColor = "\u001B[34m";
            String redColor = "\u001B[31m";

            double countGeoeffnet = 26;                                // Wenn ein ungeöffneter Koffer geöffnet wird, wird die Variable decrementiert
            int countUebrigInderRunde = 6;                            // zählz wie viele Koffer in der Runde noch zu öffnen sind
            int round = 1;                                           // zählt die Runden
            int first_Round = 1;                                    // Ist für den Parameter x und der aktualisierung zuständig

            // Führt 4 Runden a 6x Koffer öffnen aus
            for (int i = 1; i <= 4; i++) {

                // Öffnet 6 Koffer
                for (int j = 1; j <= 6; j++) {

                    System.out.println();
                    System.out.println();

                    // Rundenangabe mit übrigen Koffern in der Runde
                    System.out.printf("%6s---------------------------------%n", "");
                    System.out.printf("%6s%sRunde %d: %s", "", blueColor, round, resetColor);

                    // Gibt die noch zu öffnende Koffer Anzahl in der Runde aus
                    if (countUebrigInderRunde == 6) {
                        System.out.println("Öffne " + countUebrigInderRunde + " Koffer.");
                    } else if (countUebrigInderRunde < 6 && countUebrigInderRunde > 1) {
                        System.out.println("Öffne " + countUebrigInderRunde + " weitere Koffer.");
                    } else {
                        System.out.println("Öffne noch einen Koffer.");
                    }

                    System.out.printf("%6s---------------------------------%n", "");
                    // Rundenangabe mit übrigen Koffern in der Runde

                    System.out.println();

                    // Wenn die erste Abfrage erledigt wurde, dann wird x in jedem Durchgang mit der Methode oeffnenAbfrage() aktualisiert
                    if (first_Round == 2){
                        x = oeffnenAbfrage();
                    }

                    if (x >= 1 && x < kofferBetraege.length) {
                        double koffer_Betrag = kofferBetraege[x];

                        // Wenn der Koffer schon geöffnet wurde, bleibt der aktuelle Koffer count in der Runde bei der selben Zahl und
                        // die Runde dauert so lange an, bis 6 ungeöffnete Koffer geöffnet wurden.
                        if (koffer_Betrag == 0) {
                            System.out.printf("%6s", "");
                            System.out.println(redColor + "*" + resetColor + "Der Koffer mit der Nummer " + x + " wurde schon geöffnet" + redColor + "*" + resetColor);
                            countUebrigInderRunde++;
                            j--;
                        } else {
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.printf("%6sDu hast Koffer %d gewählt!%n", "", x);
                            System.out.println();
                            System.out.printf("%6s%s********************************************%s%n", "", colorYellow, resetColor);
                            LoadingScreen_und_Animation.oeffnenAnimation(x);
                            System.out.println();
                            System.out.printf("%6s%s********************************************%s%n", "", colorYellow, resetColor);
                            System.out.println();
                            System.out.printf("%6sEs befinden sich %.2f € in dem Koffer!", "", koffer_Betrag);
                            System.out.println();
                            System.out.println();
                            System.out.printf("%6s%s--------------------------------------------%s%n", "", colorYellow, resetColor);
                            kofferBetraege[x] = 0;
                            countGeoeffnet--;
                        }

                        // Wenn die Zahl zur Wahl des Koffers kleiner als 1 oder größer als 26 ist.
                    } else {
                        System.out.printf("%6s\"%d\" steht nicht zur Auswahl!", "", x);
                        countUebrigInderRunde++;
                        j--;
                    }

                    // Nach sechs Kofferöffnungen in jeder Runde macht die Bank ein Angebot.
                    if (j == 6) {
                        ausgabeTafel(kofferBetraege);
                        System.out.println();
                        System.out.println();
                        nichtGeoeffneteKoffer(kofferBetraege);
                        System.out.printf("%6s*Die Bank macht dir ein Angebot*%n", "");
                        double angebot = berechnungAngebot(kofferBetraege, countGeoeffnet);
                        System.out.printf("%6s%sAngebot%s: %.2f €%n", "", blueColor, resetColor, angebot);
                        System.out.printf("%6sMöchtest du es annehmen (D) oder ablehnen (ND) ?%n", "");
                        System.out.printf("%6s","");
                        String deal = scanner.next();
                        if (deal.equalsIgnoreCase("D")) {
                            System.out.printf("%6s%sGlückwunsch! Du hast %s%.2f € %sgewonnen.%s", "", blueColor, colorYellow, berechnungAngebot(kofferBetraege, countGeoeffnet), blueColor, resetColor);
                            return;
                        }
                    }
                    countUebrigInderRunde--;
                    first_Round = 2;
                }
                round++;
                countUebrigInderRunde = 6;
            }
            // Wahl des Siegerkoffers, danach ist Spiel zuende
            kofferFinale(kofferBetraege);
        }

}
