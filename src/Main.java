import br.newtonpaiva.domain.Banco;
import br.newtonpaiva.domain.Cliente;
import br.newtonpaiva.domain.Conta;

import javax.swing.*;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        Cliente cl = new Cliente();
        Banco bc = new Banco();
        Conta ct = new Conta();

        String nm = JOptionPane.showInputDialog("Nome Completo");
        cl.setNome(nm);
        ct.eriainfoconta();

        String bnc = JOptionPane.showInputDialog("Digite o nome do seu Banco");
        bc.setNomeBanco(bnc);
    }
}