import java.util.Scanner;

public class BurcHesaplama {
    public static void main(String[] args) {

        int gun, ay;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen doğduğunuz ayı giriniz (1-12): ");
        ay = input.nextInt();

        System.out.print("Lütfen doğduğunuz günü giriniz (1-31): ");
        gun = input.nextInt();

        String burc = "";
        boolean hataliMi = false;

        if ((ay <= 12) && (ay > 0)) {

            if (ay == 1) {
                if ((gun > 0) && (gun <= 21)) {
                    burc = "Oglak";
                } else if ((gun > 21) && (gun <= 31)) {
                    burc = "Kova";
                } else {
                    hataliMi = true;
                }
            }
            if (ay == 2) {
                if ((gun > 0) && (gun <= 19)) {
                    burc = "Kova";
                } else if ((gun > 19) && (gun <= 29)) {
                    burc = "Balık";
                } else {
                    hataliMi = true;
                }
            }
            if (ay == 3) {
                if ((gun > 0) && (gun <= 20)) {
                    burc = "Balık";
                } else if ((gun > 20) && (gun <= 31)) {
                    burc = "Koç";
                } else {
                    hataliMi = true;
                }
            }

            if (ay == 4) {
                if ((gun > 0) && (gun <= 20)) {
                    burc = "Koç";
                } else if ((gun > 20) && (gun <= 30)) {
                    burc = "Boğa";
                } else {
                    hataliMi = true;
                }
            }

            if (ay == 5) {
                if ((gun > 0) && (gun <= 21)) {
                    burc = "Boğa";
                } else if ((gun > 21) && (gun <= 31)) {
                    burc = "İkizler";
                } else {
                    hataliMi = true;
                }
            }

            if (ay == 6) {
                if ((gun > 0) && (gun <= 22)) {
                    burc = "İkizler";
                } else if ((gun > 22) && (gun <= 30)) {
                    burc = "Yengeç";
                } else {
                    hataliMi = true;
                }
            }

            if (ay == 7) {
                if ((gun > 0) && (gun <= 22)) {
                    burc = "Yengeç";
                } else if ((gun > 22) && (gun <= 31)) {
                    burc = "Aslan";
                } else {
                    hataliMi = true;
                }
            }

            if (ay == 8) {
                if ((gun > 0) && (gun <= 22)) {
                    burc = "Aslan";
                } else if ((gun < 22) && (gun <= 31)) {
                    burc = "Başak";
                } else {
                    hataliMi = true;
                }
            }

            if (ay == 9) {
                if ((gun > 0) && (gun <= 22)) {
                    burc = "Başak";
                } else if ((gun > 22) && (gun <= 30)) {
                    burc = "Terazi";
                } else {
                    hataliMi = true;
                }
            }

            if (ay == 10) {
                if ((gun > 0) && (gun <= 22)) {
                    burc = "Terazi";
                } else if ((gun > 22) && (gun <= 31)) {
                    burc = "Akrep";
                } else {
                    hataliMi = true;
                }
            }

            if (ay == 11) {
                if ((gun > 0) && (gun <= 21)) {
                    burc = "Akrep";
                } else if ((gun > 21) && (gun <= 30)) {
                    burc = "Yay";
                } else {
                    hataliMi = true;
                }
            }

            if (ay == 12) {
                if ((gun > 0) && (gun <= 21)) {
                    burc = "Yay";
                } else if ((gun > 21) && (gun <= 31)) {
                    burc = "Oğlak";
                } else {
                    hataliMi = true;
                }
            }

            if (!hataliMi) {
                System.out.print("Burcunuz: " + burc);
            } else {
                System.out.print("Hatalı gün değeri!");
            }
        } else {
            System.out.print("Hatalı değer!");
        }

    }
}

