package aula8;

import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double SalBr = 0;
        double SalLi = 0;

        System.out.println("Calculo do Salário liquido");
        SalBr = sc.nextDouble();
        Calc c1 = new Calc(SalBr, 0, 0, 0, 0, 0, 0);

        c1.INSSCalc();
        c1.IRCalc();
        c1.VTCalc();
        c1.VRCalc();
        c1.VACalc();
        c1.PSCalc();

        System.out.println("\n-----------------------------------------------------");

        System.out.printf("\nSalario Bruto = R$%.2f", SalBr);
        System.out.println();

        SalBr -= c1.INSSCalc();
        SalBr -= c1.IR;
        SalBr -= c1.VT;
        SalBr -= c1.PS;
        SalBr -= c1.VR;
        SalBr -= c1.VA;


        System.out.printf("\nDesconto INSS             = " + "  -R$%.2f", c1.INSSCalc());
        System.out.printf("\nDesconto Imposto de Renda = " + "  -R$%.2f", c1.IR);
        System.out.printf("\nDesconto Plano de Saude   = " + "  -R$%.2f", c1.PS);
        System.out.printf("\nDesconto Vale Transporte  = " + "  -R$%.2f", c1.VT);
        System.out.printf("\nDesconto Vale Refeição    = " + "  -R$%.2f", c1.VR);
        System.out.printf("\nDesconto Vale Alimentação = " + "  -R$%.2f", c1.VA);
        System.out.println();
        System.out.printf("\nSalario Liquido = R$%.2f", SalBr);
    }
}
