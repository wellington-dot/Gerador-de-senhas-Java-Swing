package com.example.geradorsenha;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public abstract class geradorForm extends JFrame {

    //Jlabel
    protected JPanel pnlForm;
    protected JPanel pnlBtn;

    //componentes
    protected JLabel lbltextInfo;
    protected JTextField lblTextResult;
    protected JButton btnGerar;

    //Construtor padrão com método dos componentes
    public geradorForm(){
        this.inicializar();
        this.eventos();
    };

    protected abstract void btnGerarClick(ActionEvent ev);

    private void eventos(){
        btnGerar.addActionListener(this::btnGerarClick);
    }

    //Método que inicializa os componetes
    private void inicializar(){
        this.setTitle("Gerador de senhas");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);

        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(getPnlForm(), BorderLayout.CENTER);

        this.getContentPane().add(getPnlBtn(), BorderLayout.PAGE_END);
        this.pack();
    };

    //Criando painel de formulário
    public JPanel getPnlForm(){
        if (pnlForm == null) {
            pnlForm = new JPanel(new GridLayout(2,2));
            lbltextInfo = new JLabel("Senha gerada:");
            lblTextResult = new JTextField(25);
            lblTextResult.setEditable(false);

            pnlForm.add(lbltextInfo);
            pnlForm.add(lblTextResult);
        }
        return pnlForm;
    }

    public JPanel getPnlBtn(){
        if (pnlBtn == null){
            pnlBtn = new JPanel(new FlowLayout(FlowLayout.CENTER));
            btnGerar = new JButton("Gerar senha");
            btnGerar.setBackground(Color.red);
            btnGerar.setForeground(Color.white);
            pnlBtn.add(btnGerar);
        }

        return pnlBtn;
    }
}
