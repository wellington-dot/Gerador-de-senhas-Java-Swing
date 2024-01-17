package com.example.geradorsenha;

import javax.swing.*;

public class application {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            gerador ger = new gerador();
            ger.setVisible(true);
        });
    }
}
