package aula8;

import java.util.Scanner;

public class Calc {
    double salB;
    double PS;
    double VT;
    double VR;
    double VA;
    double IR;
    double dep;

    public Calc(double salB, double PS, double VT, double VR, double VA, double IR, double dep) {
        this.dep = dep;
        this.salB = salB;
        this.PS = PS;
        this.VT = VT;
        this.VR = VR;
        this.VA = VA;
        this.IR = IR;
    }

    public double INSSCalc() {
        double inss = 0;
        double sal = salB;

        if (sal <= 1302) {
            inss = sal * 0.08;
        } else if (sal > 1302 && sal <= 2571) {
            inss = sal * 0.09;
        } else if (sal > 2571 && sal <= 3856) {
            inss = sal * 0.11;
        } else if (sal > 3856.01) {
            inss = sal * 0.12;
        }

        return inss;
    }

    public void IRCalc() {
        Scanner sc = new Scanner(System.in);
        double sal = salB;

        System.out.println("Digite o numero de dependentes do funcionário: ");
        double depN = sc.nextDouble();

        sal = sal - (depN * 189.59);

        if (sal <= 1903.98) {
            IR = 0;
        } else if (sal > 1903.98 && sal <= 2826.65) {
            IR = (sal * 0.075) - 142.8;
        } else if (sal > 2826.65 && sal <= 3751.05) {
            IR = (sal * 0.15) - 354.8;
        } else if (sal > 3751.05 && sal <= 4664.68) {
            IR = (sal * 0.225) - 636.13;
        } else if (sal > 4664.68) {
            IR = (sal * 0.275) - 869.36;
        }
    }

    public void VTCalc() {
        Scanner sc = new Scanner(System.in);
        double sal = salB;
        String resposta;

        System.out.println("O funcionário tem direito a Vale Transporte? (S/N)");
        resposta = sc.next();
        while (true) {
            if (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N")) {
                System.out.println("resposta invalida");
            } else if (resposta.equalsIgnoreCase("S")) {
                VT = (sal * 0.06);
                break;
            } else {
                VT = 0;
                break;
            }
        }
    }

    public void VRCalc() {
        Scanner sc = new Scanner(System.in);
        String resposta;

        System.out.println("O funcionário tem direito a Vale Refeição? (S/N)");
        resposta = sc.next();

        while (true) {
            if (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N")) {
                System.out.println("resposta invalida");
            } else if (resposta.equalsIgnoreCase("S")) {
                VR = 250;
                break;
            } else {
                VR = 0;
                break;
            }
        }

    }

    public void VACalc() {
        Scanner sc = new Scanner(System.in);
        String resposta;

        System.out.println("O funcionário tem direito a Vale Alimentação? (S/N)");
        resposta = sc.next();

        while (true) {
            if (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N")) {
                System.out.println("resposta invalida");
            } else if (resposta.equalsIgnoreCase("S")) {
                VA = 200;
                break;
            } else {
                VA = 0;
                break;
            }
        }
    }

    public void PSCalc() {
        Scanner sc = new Scanner(System.in);
        String resposta;

        System.out.println("O funcionário tem direito a Plano de saúde? (S/N)");
        resposta = sc.next();

        while (true) {
            if (resposta.equalsIgnoreCase("S") || resposta.equalsIgnoreCase("s")) {
                System.out.println("O funcionário tem direito ao plano completo? (S/N)");
                resposta = sc.next();
                if (resposta.equalsIgnoreCase("S") || resposta.equalsIgnoreCase("s")) {
                    PS = 300;
                    break;
                } else if (resposta.equalsIgnoreCase("N") || resposta.equalsIgnoreCase("n")) {
                    PS = 150;
                    break;
                } else {
                    System.out.println("resposta invalida");
                    System.out.println("responda novamente: (S/N)");
                }
            } else if (resposta.equalsIgnoreCase("N") || resposta.equalsIgnoreCase("n")) {
                PS = 0;
                break;
            } else {
                System.out.println("resposta invalida");
            }
        }
    }

}
