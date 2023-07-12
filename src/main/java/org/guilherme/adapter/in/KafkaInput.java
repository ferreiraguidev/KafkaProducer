package org.guilherme.adapter.in;

import java.util.List;
import java.util.Scanner;

public class KafkaInput {

    public static List<String> compras() {

        int compra1, compra2, compra3 = 0;
        Scanner s = new Scanner( System.in );

        System.out.println( "Compra realizada de: ");
        compra1 = s.nextInt();

        System.out.println( "Compra realizada de: ");
        compra2 = s.nextInt();

        compra3 = compra1 + compra2;
        System.out.println( "Saldo devedor do cartão: " + compra3 );

        return List.of(
                "compra 1: " + compra1 ,
                 "comrpa 2: "+ compra2,
                "Saldo Devedor Final : " + compra3);

    }

}
