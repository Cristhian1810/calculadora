package com.crixz.calculadora.vista;

import com.crixz.calculadora.modelo.Calculadora;
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristhian
 */
public class JFrCalculadora extends javax.swing.JFrame {
    Calculadora calculadora = new Calculadora();
    DecimalFormat df = new DecimalFormat("#.##");
    private double num1;
    private double num2;
    private String operador;
    private boolean resuelto;
    
    public JFrCalculadora() {
        initComponents();
        setTitle("Calculadora");
        setLocationRelativeTo(null);
        setResizable(false);

        setVisible(true);
    }
    
    public void limpiar() {
        txtPantalla.setText("");
    }
    
    public void resultado() {
        num2 = Integer.parseInt(txtPantalla.getText());
        
        switch (operador) {
            case "+" :
                txtPantalla.setText("" + calculadora.sumar(num1, num2));
                resuelto = true;
                break;
            case "-" :
                txtPantalla.setText("" + calculadora.restar(num1, num2));
                resuelto = true;
                break;
            case "*" :
                txtPantalla.setText("" + calculadora.multiplicar(num1, num2));
                resuelto = true;
                break;
            case "/" :
                txtPantalla.setText("" + calculadora.dividir(num1, num2));
                resuelto = true;
                break;
            case "^" :
                txtPantalla.setText("" + df.format(calculadora.potenciar(num1, num2)));
                resuelto = true;
                break;
        }
    }
    
    public void otraOperacion() {
        if (resuelto) {
            limpiar();
            resuelto = false;
        }
    }

    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnDivision = new javax.swing.JButton();
        btnBorrarTodo = new javax.swing.JButton();
        btnPotencia = new javax.swing.JButton();
        btnRaizCuadrada = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tglBtnTemaClaro = new javax.swing.JToggleButton();
        txtPantalla = new javax.swing.JTextField();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(20, 31, 45));

        btnDivision.setBackground(new java.awt.Color(31, 108, 178));
        btnDivision.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(255, 255, 255));
        btnDivision.setText("/");
        btnDivision.setAlignmentY(0.0F);
        btnDivision.setFocusPainted(false);
        btnDivision.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        btnBorrarTodo.setBackground(new java.awt.Color(31, 108, 178));
        btnBorrarTodo.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        btnBorrarTodo.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarTodo.setText("C");
        btnBorrarTodo.setAlignmentY(0.0F);
        btnBorrarTodo.setBorder(null);
        btnBorrarTodo.setFocusPainted(false);
        btnBorrarTodo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnBorrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarTodoActionPerformed(evt);
            }
        });

        btnPotencia.setBackground(new java.awt.Color(31, 108, 178));
        btnPotencia.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        btnPotencia.setForeground(new java.awt.Color(255, 255, 255));
        btnPotencia.setText("^");
        btnPotencia.setAlignmentY(0.0F);
        btnPotencia.setFocusPainted(false);
        btnPotencia.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenciaActionPerformed(evt);
            }
        });

        btnRaizCuadrada.setBackground(new java.awt.Color(31, 108, 178));
        btnRaizCuadrada.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        btnRaizCuadrada.setForeground(new java.awt.Color(255, 255, 255));
        btnRaizCuadrada.setText("√2");
        btnRaizCuadrada.setAlignmentY(0.0F);
        btnRaizCuadrada.setFocusPainted(false);
        btnRaizCuadrada.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnRaizCuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizCuadradaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(16, 26, 37));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 180));

        tglBtnTemaClaro.setBackground(new java.awt.Color(20, 31, 45));
        tglBtnTemaClaro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sol.png"))); // NOI18N
        tglBtnTemaClaro.setBorder(null);
        tglBtnTemaClaro.setFocusable(false);
        tglBtnTemaClaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglBtnTemaClaroActionPerformed(evt);
            }
        });

        txtPantalla.setBackground(new java.awt.Color(16, 26, 37));
        txtPantalla.setFont(new java.awt.Font("Arial", 0, 50)); // NOI18N
        txtPantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPantalla.setBorder(null);
        txtPantalla.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtPantalla.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtPantalla)
                .addGap(16, 16, 16))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(tglBtnTemaClaro, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(tglBtnTemaClaro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        btn7.setBackground(new java.awt.Color(37, 58, 83));
        btn7.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.setAlignmentY(0.0F);
        btn7.setFocusPainted(false);
        btn7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(37, 58, 83));
        btn8.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.setAlignmentY(0.0F);
        btn8.setFocusPainted(false);
        btn8.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(37, 58, 83));
        btn9.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.setAlignmentY(0.0F);
        btn9.setFocusPainted(false);
        btn9.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnMultiplicacion.setBackground(new java.awt.Color(31, 108, 178));
        btnMultiplicacion.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        btnMultiplicacion.setForeground(new java.awt.Color(255, 255, 255));
        btnMultiplicacion.setText("x");
        btnMultiplicacion.setAlignmentY(0.0F);
        btnMultiplicacion.setFocusPainted(false);
        btnMultiplicacion.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(37, 58, 83));
        btn4.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.setAlignmentY(0.0F);
        btn4.setFocusPainted(false);
        btn4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(37, 58, 83));
        btn1.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.setAlignmentY(0.0F);
        btn1.setFocusPainted(false);
        btn1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(37, 58, 83));
        btn5.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.setAlignmentY(0.0F);
        btn5.setFocusPainted(false);
        btn5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(37, 58, 83));
        btn2.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.setAlignmentY(0.0F);
        btn2.setFocusPainted(false);
        btn2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(37, 58, 83));
        btn6.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.setAlignmentY(0.0F);
        btn6.setFocusPainted(false);
        btn6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(37, 58, 83));
        btn3.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.setAlignmentY(0.0F);
        btn3.setFocusPainted(false);
        btn3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnResta.setBackground(new java.awt.Color(31, 108, 178));
        btnResta.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        btnResta.setForeground(new java.awt.Color(255, 255, 255));
        btnResta.setText("-");
        btnResta.setAlignmentY(0.0F);
        btnResta.setFocusPainted(false);
        btnResta.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnSuma.setBackground(new java.awt.Color(31, 108, 178));
        btnSuma.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(255, 255, 255));
        btnSuma.setText("+");
        btnSuma.setAlignmentY(0.0F);
        btnSuma.setFocusPainted(false);
        btnSuma.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(37, 58, 83));
        btn0.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.setAlignmentY(0.0F);
        btn0.setFocusPainted(false);
        btn0.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnIgual.setBackground(new java.awt.Color(147, 183, 116));
        btnIgual.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(255, 255, 255));
        btnIgual.setText("=");
        btnIgual.setAlignmentY(0.0F);
        btnIgual.setFocusPainted(false);
        btnIgual.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnPunto.setBackground(new java.awt.Color(37, 58, 83));
        btnPunto.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        btnPunto.setForeground(new java.awt.Color(255, 255, 255));
        btnPunto.setText(".");
        btnPunto.setAlignmentY(0.0F);
        btnPunto.setFocusPainted(false);
        btnPunto.setMargin(new java.awt.Insets(0, 0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBorrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnRaizCuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBorrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRaizCuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarTodoActionPerformed
        limpiar();
    }//GEN-LAST:event_btnBorrarTodoActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        otraOperacion();
        txtPantalla.setText(txtPantalla.getText() + btn0.getText());
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        otraOperacion();
        txtPantalla.setText(txtPantalla.getText() + btn1.getText());
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        otraOperacion();
        txtPantalla.setText(txtPantalla.getText() + btn2.getText());
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        otraOperacion();
        txtPantalla.setText(txtPantalla.getText() + btn3.getText());
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        otraOperacion();
        txtPantalla.setText(txtPantalla.getText() + btn4.getText());
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        otraOperacion();
        txtPantalla.setText(txtPantalla.getText() + btn5.getText());
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        otraOperacion();
        txtPantalla.setText(txtPantalla.getText() + btn6.getText());
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        otraOperacion();
        txtPantalla.setText(txtPantalla.getText() + btn7.getText());
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        otraOperacion();
        txtPantalla.setText(txtPantalla.getText() + btn8.getText());
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        otraOperacion();
        txtPantalla.setText(txtPantalla.getText() + btn9.getText());
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnRaizCuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizCuadradaActionPerformed
        try {
            num1 = Integer.parseInt(txtPantalla.getText());
            operador = "+";
            txtPantalla.setText("" + df.format(calculadora.SacarRaizCuadrada(num1)));
            resuelto = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Solo se permite una única operación aritmética por cálculo.");
            txtPantalla.setText("");
        }
    }//GEN-LAST:event_btnRaizCuadradaActionPerformed

    private void btnPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenciaActionPerformed
        try {
            num1 = Integer.parseInt(txtPantalla.getText());
            operador = "^";
            txtPantalla.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Solo se permite una única operación aritmética por cálculo.");
            txtPantalla.setText("");
        }
    }//GEN-LAST:event_btnPotenciaActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        try {
            num1 = Integer.parseInt(txtPantalla.getText());
            operador = "-";
            txtPantalla.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Solo se permite una única operación aritmética por cálculo.");
            txtPantalla.setText("");
        }
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        try {
            num1 = Integer.parseInt(txtPantalla.getText());
            operador = "*";
            txtPantalla.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Solo se permite una única operación aritmética por cálculo.");
            txtPantalla.setText("");
        }
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        try {
            num1 = Integer.parseInt(txtPantalla.getText());
            operador = "-";
            txtPantalla.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Solo se permite una única operación aritmética por cálculo.");
            txtPantalla.setText("");
        }
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        try {
            num1 = Integer.parseInt(txtPantalla.getText());
            operador = "+";
            txtPantalla.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Solo se permite una única operación aritmética por cálculo.");
            txtPantalla.setText("");
        }
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        resultado();
    }//GEN-LAST:event_btnIgualActionPerformed

    private void tglBtnTemaClaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglBtnTemaClaroActionPerformed
        if (tglBtnTemaClaro.isSelected()) {
            jPanel1.setBackground(new Color(250, 250, 250));
            jPanel2.setBackground(new Color(238, 238, 238));
            txtPantalla.setBackground(new Color(238, 238, 238));
            txtPantalla.setDisabledTextColor(new Color(0, 0, 0));
            tglBtnTemaClaro.setIcon(new ImageIcon("src\\main\\resources\\imagenes\\luna.png"));
        } else {
            jPanel1.setBackground(new Color(20, 31, 45));
            jPanel2.setBackground(new Color(16, 26, 37));
            txtPantalla.setBackground(new Color(16, 26, 37));
            txtPantalla.setDisabledTextColor(new Color(255, 255, 255));
            tglBtnTemaClaro.setIcon(new ImageIcon("src\\main\\resources\\imagenes\\sol.png"));
        }
    }//GEN-LAST:event_tglBtnTemaClaroActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBorrarTodo;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnPotencia;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnRaizCuadrada;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton tglBtnTemaClaro;
    private javax.swing.JTextField txtPantalla;
    // End of variables declaration//GEN-END:variables
}
