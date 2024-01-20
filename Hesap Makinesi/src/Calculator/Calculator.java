/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Calculator;

import java.awt.Color;

/**
 *
 * @author has1y
 */
public class Calculator extends javax.swing.JFrame {
    double NumEnter1,NumEnter2,result;
    String op;
    

    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtresult = new javax.swing.JTextField();
        jbtnBS = new javax.swing.JButton();
        jbtndigit7 = new javax.swing.JButton();
        jbtndigit4 = new javax.swing.JButton();
        jbtndigit1 = new javax.swing.JButton();
        jbtndigit0 = new javax.swing.JButton();
        jbtnCE = new javax.swing.JButton();
        jbtnDot = new javax.swing.JButton();
        jbtndigit2 = new javax.swing.JButton();
        jbtndigit5 = new javax.swing.JButton();
        jbtndigit8 = new javax.swing.JButton();
        jbtnImpact = new javax.swing.JButton();
        jbtndigit3 = new javax.swing.JButton();
        jbtnEqual = new javax.swing.JButton();
        jbtnDivide = new javax.swing.JButton();
        jbtnMinus = new javax.swing.JButton();
        jbtndigit6 = new javax.swing.JButton();
        jbtndigit9 = new javax.swing.JButton();
        jbtnC = new javax.swing.JButton();
        jbtnPM = new javax.swing.JButton();
        jbtnPlus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtnBS.setBackground(new java.awt.Color(204, 255, 204));
        jbtnBS.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jbtnBS.setText("←");
        jbtnBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBSActionPerformed(evt);
            }
        });

        jbtndigit7.setBackground(new java.awt.Color(204, 255, 204));
        jbtndigit7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtndigit7.setForeground(new java.awt.Color(102, 102, 0));
        jbtndigit7.setText("7");
        jbtndigit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndigit7ActionPerformed(evt);
            }
        });

        jbtndigit4.setBackground(new java.awt.Color(204, 255, 204));
        jbtndigit4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtndigit4.setForeground(new java.awt.Color(102, 102, 0));
        jbtndigit4.setText("4");
        jbtndigit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndigit4ActionPerformed(evt);
            }
        });

        jbtndigit1.setBackground(new java.awt.Color(204, 255, 204));
        jbtndigit1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtndigit1.setForeground(new java.awt.Color(102, 102, 0));
        jbtndigit1.setText("1");
        jbtndigit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndigit1ActionPerformed(evt);
            }
        });

        jbtndigit0.setBackground(new java.awt.Color(204, 255, 204));
        jbtndigit0.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtndigit0.setForeground(new java.awt.Color(102, 102, 0));
        jbtndigit0.setText("0");
        jbtndigit0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndigit0ActionPerformed(evt);
            }
        });

        jbtnCE.setBackground(new java.awt.Color(204, 255, 204));
        jbtnCE.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnCE.setForeground(new java.awt.Color(255, 51, 51));
        jbtnCE.setText("CE");
        jbtnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCEActionPerformed(evt);
            }
        });

        jbtnDot.setBackground(new java.awt.Color(204, 255, 204));
        jbtnDot.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDot.setForeground(new java.awt.Color(255, 51, 51));
        jbtnDot.setText(".");
        jbtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDotActionPerformed(evt);
            }
        });

        jbtndigit2.setBackground(new java.awt.Color(204, 255, 204));
        jbtndigit2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtndigit2.setForeground(new java.awt.Color(102, 102, 0));
        jbtndigit2.setText("2");
        jbtndigit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndigit2ActionPerformed(evt);
            }
        });

        jbtndigit5.setBackground(new java.awt.Color(204, 255, 204));
        jbtndigit5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtndigit5.setForeground(new java.awt.Color(102, 102, 102));
        jbtndigit5.setText("5");
        jbtndigit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndigit5ActionPerformed(evt);
            }
        });

        jbtndigit8.setBackground(new java.awt.Color(204, 255, 204));
        jbtndigit8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtndigit8.setForeground(new java.awt.Color(102, 102, 0));
        jbtndigit8.setText("8");
        jbtndigit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndigit8ActionPerformed(evt);
            }
        });

        jbtnImpact.setBackground(new java.awt.Color(204, 255, 204));
        jbtnImpact.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnImpact.setForeground(new java.awt.Color(255, 51, 51));
        jbtnImpact.setText("*");
        jbtnImpact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnImpactActionPerformed(evt);
            }
        });

        jbtndigit3.setBackground(new java.awt.Color(204, 255, 204));
        jbtndigit3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtndigit3.setForeground(new java.awt.Color(102, 102, 0));
        jbtndigit3.setText("3");
        jbtndigit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndigit3ActionPerformed(evt);
            }
        });

        jbtnEqual.setBackground(new java.awt.Color(204, 255, 204));
        jbtnEqual.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnEqual.setForeground(new java.awt.Color(255, 0, 51));
        jbtnEqual.setText("=");
        jbtnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEqualActionPerformed(evt);
            }
        });

        jbtnDivide.setBackground(new java.awt.Color(204, 255, 204));
        jbtnDivide.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDivide.setForeground(new java.awt.Color(255, 51, 51));
        jbtnDivide.setText("/");
        jbtnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDivideActionPerformed(evt);
            }
        });

        jbtnMinus.setBackground(new java.awt.Color(204, 255, 204));
        jbtnMinus.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnMinus.setForeground(new java.awt.Color(255, 0, 0));
        jbtnMinus.setText("-");
        jbtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMinusActionPerformed(evt);
            }
        });

        jbtndigit6.setBackground(new java.awt.Color(204, 255, 204));
        jbtndigit6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtndigit6.setForeground(new java.awt.Color(102, 102, 0));
        jbtndigit6.setText("6");
        jbtndigit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndigit6ActionPerformed(evt);
            }
        });

        jbtndigit9.setBackground(new java.awt.Color(204, 255, 204));
        jbtndigit9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtndigit9.setForeground(new java.awt.Color(102, 102, 0));
        jbtndigit9.setText("9");
        jbtndigit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndigit9ActionPerformed(evt);
            }
        });

        jbtnC.setBackground(new java.awt.Color(204, 255, 204));
        jbtnC.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnC.setForeground(new java.awt.Color(51, 0, 255));
        jbtnC.setText("C");
        jbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCActionPerformed(evt);
            }
        });

        jbtnPM.setBackground(new java.awt.Color(204, 255, 204));
        jbtnPM.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnPM.setForeground(new java.awt.Color(0, 153, 204));
        jbtnPM.setText("±");
        jbtnPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPMActionPerformed(evt);
            }
        });

        jbtnPlus.setBackground(new java.awt.Color(204, 255, 204));
        jbtnPlus.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnPlus.setForeground(new java.awt.Color(255, 51, 51));
        jbtnPlus.setText("+");
        jbtnPlus.setToolTipText("");
        jbtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlusActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jtxtresult, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 314, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jbtndigit7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(jbtndigit0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jbtndigit1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jbtndigit4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jbtnBS, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jbtndigit8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jbtnCE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jbtnDot, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jbtndigit2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jbtndigit5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jbtndigit9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jbtndigit3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jbtnEqual, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jbtndigit6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jbtnC, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jbtnPlus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jbtnDivide, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jbtnMinus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jbtnPM, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jbtnImpact, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(12, 12, 12))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .add(jtxtresult, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jbtnCE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jbtndigit8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jbtndigit5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jbtndigit6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jbtndigit2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jbtnDot, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(228, 228, 228)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jbtndigit3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jbtnImpact, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jbtnEqual, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jbtnPM, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jbtnC, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jbtnPlus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jbtndigit9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jbtnMinus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(82, 82, 82)
                        .add(jbtnDivide, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(jbtnBS, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jbtndigit7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jbtndigit4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jbtndigit1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jbtndigit0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterNumbers(String q) {
        String Nums = jtxtresult.getText() + q;
        jtxtresult.setText(Nums);
    }
    private void jbtndigit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndigit1ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("1");
        this.getContentPane().setBackground(Color.YELLOW);
    }//GEN-LAST:event_jbtndigit1ActionPerformed

    private void jbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCActionPerformed
    jtxtresult.setText("");
    this.getContentPane().setBackground(Color.blue);
    }//GEN-LAST:event_jbtnCActionPerformed

    private void jbtndigit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndigit7ActionPerformed
        this.getContentPane().setBackground(Color.GREEN);
        EnterNumbers("7");
    }//GEN-LAST:event_jbtndigit7ActionPerformed

    private void jbtndigit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndigit8ActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.ORANGE);
        EnterNumbers("8");
    }//GEN-LAST:event_jbtndigit8ActionPerformed

    private void jbtndigit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndigit9ActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.magenta);
        EnterNumbers("9");
    }//GEN-LAST:event_jbtndigit9ActionPerformed

    private void jbtndigit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndigit4ActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.lightGray);
        EnterNumbers("4");
    }//GEN-LAST:event_jbtndigit4ActionPerformed

    private void jbtndigit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndigit5ActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.darkGray);
        EnterNumbers("5");
    }//GEN-LAST:event_jbtndigit5ActionPerformed

    private void jbtndigit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndigit6ActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.red);
        EnterNumbers("6");
    }//GEN-LAST:event_jbtndigit6ActionPerformed

    private void jbtndigit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndigit2ActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.gray);
        EnterNumbers("2");
    }//GEN-LAST:event_jbtndigit2ActionPerformed

    private void jbtndigit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndigit3ActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.magenta);
        EnterNumbers("3");
    }//GEN-LAST:event_jbtndigit3ActionPerformed

    private void jbtnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDivideActionPerformed
        this.getContentPane().setBackground(Color.green);
        NumEnter1 = Double.parseDouble(jtxtresult.getText());
        jtxtresult.setText("");
        op = "/";
    }//GEN-LAST:event_jbtnDivideActionPerformed

    private void jbtnImpactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnImpactActionPerformed
       this.getContentPane().setBackground(Color.pink);
        NumEnter1 = Double.parseDouble(jtxtresult.getText());
        jtxtresult.setText("");
        op = "*"; // TODO add your handling code here:
    }//GEN-LAST:event_jbtnImpactActionPerformed

    private void jbtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinusActionPerformed
        this.getContentPane().setBackground(Color.cyan);
        NumEnter1 = Double.parseDouble(jtxtresult.getText());
        jtxtresult.setText("");
        op = "-";// TODO add your handling code here:
    }//GEN-LAST:event_jbtnMinusActionPerformed

    private void jbtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlusActionPerformed
       this.getContentPane().setBackground(Color.orange);
        NumEnter1 = Double.parseDouble(jtxtresult.getText());
        jtxtresult.setText("");
        op = "+"; // TODO add your handling code here:
    }//GEN-LAST:event_jbtnPlusActionPerformed

    private void jbtnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCEActionPerformed
      this.getContentPane().setBackground(Color.white);
        jtxtresult.setText("");
      String Fn, Sn;
      Fn = String.valueOf(NumEnter1);
      Sn = String.valueOf(NumEnter2);
      Fn=""; 
      Sn ="";
      // TODO add your handling code here:
    }//GEN-LAST:event_jbtnCEActionPerformed

    private void jbtnPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPMActionPerformed
    this.getContentPane().setBackground(Color.blue);
        double nums= Double.parseDouble(String.valueOf(jtxtresult.getText())); 
    nums = nums * (-1);
    jtxtresult.setText(String.valueOf(nums));
// TODO add your handling code here:
    }//GEN-LAST:event_jbtnPMActionPerformed

    private void jbtnBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBSActionPerformed
     this.getContentPane().setBackground(Color.black);
        String backSp = null;

    if(jtxtresult.getText().length() > 0)
    {
     StringBuilder sb = new StringBuilder(jtxtresult.getText());
     sb.deleteCharAt(jtxtresult.getText().length() - 1);
     backSp = sb.toString();
     jtxtresult.setText(backSp);
    }
// TODO add your handling code here:
    }//GEN-LAST:event_jbtnBSActionPerformed

    private void jbtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDotActionPerformed
      this.getContentPane().setBackground(Color.yellow);
        if (! jtxtresult.getText().contains(".")){
          jtxtresult.setText(jtxtresult.getText() + jbtnDot.getText());
      }
      // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDotActionPerformed

    private void jbtnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEqualActionPerformed
     this.getContentPane().setBackground(Color.red);
        NumEnter2 = Double.parseDouble(jtxtresult.getText());
     if (op == "+"){
         result = NumEnter1 + NumEnter2;
         jtxtresult.setText(String.valueOf(result));
     }
     else if (op == "-"){
         result = NumEnter1 - NumEnter2;
         jtxtresult.setText(String.valueOf(result));
     }
     else if (op == "*"){
         result = NumEnter1 * NumEnter2;
         jtxtresult.setText(String.valueOf(result));
     }
     else if (op == "/"){
         result = NumEnter1 / NumEnter2;
         jtxtresult.setText(String.valueOf(result));
     }
     
// TODO add your handling code here:
    }//GEN-LAST:event_jbtnEqualActionPerformed

    private void jbtndigit0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndigit0ActionPerformed
        // TODO add your handling code here:
        this.getContentPane().setBackground(Color.pink);
        EnterNumbers("4");
    }//GEN-LAST:event_jbtndigit0ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnBS;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnCE;
    private javax.swing.JButton jbtnDivide;
    private javax.swing.JButton jbtnDot;
    private javax.swing.JButton jbtnEqual;
    private javax.swing.JButton jbtnImpact;
    private javax.swing.JButton jbtnMinus;
    private javax.swing.JButton jbtnPM;
    private javax.swing.JButton jbtnPlus;
    private javax.swing.JButton jbtndigit0;
    private javax.swing.JButton jbtndigit1;
    private javax.swing.JButton jbtndigit2;
    private javax.swing.JButton jbtndigit3;
    private javax.swing.JButton jbtndigit4;
    private javax.swing.JButton jbtndigit5;
    private javax.swing.JButton jbtndigit6;
    private javax.swing.JButton jbtndigit7;
    private javax.swing.JButton jbtndigit8;
    private javax.swing.JButton jbtndigit9;
    private javax.swing.JTextField jtxtresult;
    // End of variables declaration//GEN-END:variables
}
