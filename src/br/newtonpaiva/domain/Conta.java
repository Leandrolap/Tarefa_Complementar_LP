package br.newtonpaiva.domain;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Conta {
    private Integer agencia;
    private Integer numero;
    private Double saldo;


    List<String> lisConta = new ArrayList<>();

    public void eriainfoconta() throws IOException {
        FileOutputStream fOut = new FileOutputStream("vinhos.txt");
        ObjectOutputStream oOut = new ObjectOutputStream(fOut);
        oOut.writeObject(lisConta);
        oOut.close();
    }
}
