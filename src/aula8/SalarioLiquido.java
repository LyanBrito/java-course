package aula8;

import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double SalBr = 0;
        double SalLi = 0;

        System.out.println("Digite o salário: ");
        SalBr = sc.nextDouble();
        Calc c1 = new Calc(SalBr, 0, 0, 0, 0, 0, 0);

        c1.VTCalc();
        c1.VACalc();
        c1.VRCalc();
        c1.PSCalc();
        c1.INSSCalc();
        c1.IRCalc();


        System.out.printf("\nSalario Bruto = R$%.2f", SalBr);
        System.out.println();

        SalLi += c1.INSSCalc();
        SalLi += c1.IR;
        SalLi += c1.VT;
        SalLi += c1.PS;
        SalLi += c1.VR;
        SalLi += c1.VA;

        SalLi = SalBr - SalLi; 
        System.out.printf("\nDesconto INSS             = " + "  - R$%.2f", c1.INSSCalc());
        System.out.printf("\nDesconto Imposto de Renda = " + "  - R$%.2f", c1.IR);
        System.out.printf("\nDesconto Plano de Saude   = " + "  - R$%.2f", c1.PS);
        System.out.printf("\nDesconto Vale Transporte  = " + "  - R$%.2f", c1.VT);
        System.out.printf("\nDesconto Vale Refeição    = " + "  - R$%.2f", c1.VR);
        System.out.printf("\nDesconto Vale Alimentação = " + "  - R$%.2f", c1.VA);

        System.out.printf("\nSalario Liquido = R$%.2f", SalLi);
    }
}
