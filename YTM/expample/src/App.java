import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        standartUser stduser = new standartUser("std", "123456");
        stduser.setTl(226.0);
        superUser spruser = new superUser("spr", "123456");
        spruser.setDoviz(10);
        spruser.setTl(526.0);
        superMoneyMenager sprmoney = new superMoneyMenager();
        standartMoneyMenager stdmoney = new standartMoneyMenager();
        Scanner scan = new Scanner(System.in);
        int kulislem1 = 0;
        int kulislem2 = 0;

        while (true) {
            System.out.println("1-standart user\n2-super user\n3-çıkış");
            kulislem1 = scan.nextInt();
            switch (kulislem1) {
                case 1:
                    System.out.println("bakiye: " + stduser.getToplamVarlik() + " 1-havale\n2-eft");
                    kulislem2 = scan.nextInt();
                    switch (kulislem2) {
                        case 1:
                            stdmoney.havale(100.0, stduser);
                            break;
                        case 2:
                            stdmoney.eft(100.0, stduser);
                            break;
                        default:
                            System.out.println("hatalı giriş");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("bakiye: " + spruser.getToplamVarlik() + " 1-havale\n2-eft\n3-swift");
                    kulislem2 = scan.nextInt();
                    switch (kulislem2) {
                        case 1:
                            sprmoney.havale(100.0, spruser);
                            break;
                        case 2:
                            sprmoney.eft(100.0, spruser);
                            break;
                        case 3:
                            sprmoney.swift(100.0, spruser);
                            break;
                        default:
                            System.out.println("hatalı giriş");
                            break;
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;

                default:
                    System.out.println("hatalı giriş");
                    break;
            }

        }
    }
}
