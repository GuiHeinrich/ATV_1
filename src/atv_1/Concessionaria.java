package atv_1;

import javax.swing.*;

public class Concessionaria {
    public static void main(String[] args) {
        Automovel e = new Automovel();

        String mr, md, pr, cr;
        double pc;

        mr = JOptionPane.showInputDialog("Insira a marca do Automóvel");
        md = JOptionPane.showInputDialog("Insira o modelo do Automóvel");
        pr = JOptionPane.showInputDialog("Insira o preço do Automóvel");
        cr = JOptionPane.showInputDialog("Insira a cor do Automóvel");

        pc = Double.parseDouble(pr);

        e.marca = mr;
        e.modelo = md;
        e.cor = cr;
        e.preco = pc;

        e.Informa_Automovel();
    }
}

