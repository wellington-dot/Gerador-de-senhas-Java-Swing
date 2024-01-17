package com.example.geradorsenha;

import java.awt.event.ActionEvent;
import java.util.Random;

public class gerador extends geradorForm {

    Random gLetraMin = new Random();
    Random gLetrasMaiusc = new Random();
    Random gSimb =  new Random();
    Random gNum = new Random();

    @Override
    protected void btnGerarClick(ActionEvent ev) {

        String[] letrasMinusculas = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"
                , "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        String[] letrasMaiusculas = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"
                , "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        String[] simbolos = {"*", "&", "-", "_", "$", "+"};

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int letraG = gLetrasMaiusc.nextInt(letrasMaiusculas.length);
        int letraP = gLetraMin.nextInt(letrasMinusculas.length);
        int simb = gSimb.nextInt(simbolos.length);
        int num = gNum.nextInt(numeros.length);

        String LGrande = letrasMaiusculas[letraG];
        String LPequena = letrasMinusculas[letraP];
        String SimbGerado = simbolos[simb];
        String nmrGerado = (Integer.toString(numeros[num]));

        String senha = (LGrande + SimbGerado + LPequena + nmrGerado + LGrande
                + nmrGerado + LPequena + LGrande + SimbGerado + nmrGerado + LPequena +
                LGrande);

        lblTextResult.setText(senha);
    }
}
