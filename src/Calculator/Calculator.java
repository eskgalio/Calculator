/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Calculator;

/**
 *
 * @author JYOTIRMOY DUTTA
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    double NumEnter1;
    double NumEnter2;
    double Result;
    String Op;
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

        JtxtResults = new javax.swing.JTextField();
        jbtnMul = new javax.swing.JButton();
        jbtnC = new javax.swing.JButton();
        jbtnBACK = new javax.swing.JButton();
        jbtnPM = new javax.swing.JButton();
        jbtnDiv = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jbtnMinus = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtnPlus = new javax.swing.JButton();
        jbtnP = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jbtnEq = new javax.swing.JButton();
        jbtnCE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JtxtResults.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JtxtResults.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        JtxtResults.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(JtxtResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, 310, 50));

        jbtnMul.setBackground(new java.awt.Color(204, 204, 204));
        jbtnMul.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jbtnMul.setText("x");
        jbtnMul.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jbtnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMulActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnMul, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 70, 50));

        jbtnC.setBackground(new java.awt.Color(204, 204, 204));
        jbtnC.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jbtnC.setText("C");
        jbtnC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 70, 50));

        jbtnBACK.setBackground(new java.awt.Color(204, 204, 204));
        jbtnBACK.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jbtnBACK.setText("BACK");
        jbtnBACK.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jbtnBACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBACKActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 70, 50));

        jbtnPM.setBackground(new java.awt.Color(204, 204, 204));
        jbtnPM.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jbtnPM.setText("+/-");
        jbtnPM.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jbtnPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPMActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 70, 50));

        jbtnDiv.setBackground(new java.awt.Color(204, 204, 204));
        jbtnDiv.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jbtnDiv.setText("/");
        jbtnDiv.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jbtnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDivActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 70, 50));

        jbtn7.setBackground(new java.awt.Color(204, 204, 204));
        jbtn7.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jbtn7.setText("7");
        jbtn7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 70, 50));

        jbtn8.setBackground(new java.awt.Color(204, 204, 204));
        jbtn8.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jbtn8.setText("8");
        jbtn8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 70, 50));

        jbtn9.setBackground(new java.awt.Color(204, 204, 204));
        jbtn9.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jbtn9.setText("9");
        jbtn9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 70, 50));

        jbtn4.setBackground(new java.awt.Color(204, 204, 204));
        jbtn4.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jbtn4.setText("4");
        jbtn4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 70, 50));

        jbtn5.setBackground(new java.awt.Color(204, 204, 204));
        jbtn5.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jbtn5.setText("5");
        jbtn5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 70, 50));

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jButton6.setText("6");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 70, 50));

        jbtnMinus.setBackground(new java.awt.Color(204, 204, 204));
        jbtnMinus.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jbtnMinus.setText("-");
        jbtnMinus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jbtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMinusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 70, 50));

        jbtn1.setBackground(new java.awt.Color(204, 204, 204));
        jbtn1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jbtn1.setText("1");
        jbtn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 70, 50));

        jbtn2.setBackground(new java.awt.Color(204, 204, 204));
        jbtn2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jbtn2.setText("2");
        jbtn2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 70, 50));

        jbtn3.setBackground(new java.awt.Color(204, 204, 204));
        jbtn3.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jbtn3.setText("3");
        jbtn3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 70, 50));

        jbtnPlus.setBackground(new java.awt.Color(204, 204, 204));
        jbtnPlus.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jbtnPlus.setText("+");
        jbtnPlus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jbtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 70, 50));

        jbtnP.setBackground(new java.awt.Color(204, 204, 204));
        jbtnP.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jbtnP.setText(".");
        jbtnP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jbtnP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 70, 50));

        jbtn0.setBackground(new java.awt.Color(204, 204, 204));
        jbtn0.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jbtn0.setText("0");
        jbtn0.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 70, 50));

        jbtnEq.setBackground(new java.awt.Color(204, 204, 204));
        jbtnEq.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jbtnEq.setText("=");
        jbtnEq.setToolTipText("");
        jbtnEq.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jbtnEq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEqActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnEq, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 70, 50));

        jbtnCE.setBackground(new java.awt.Color(204, 204, 204));
        jbtnCE.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jbtnCE.setText("CE");
        jbtnCE.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jbtnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCEActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 70, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
        EnterNumbers("8"); // TODO add your handling code here:
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
    EnterNumbers("7");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
    EnterNumbers("9");         // TODO add your handling code here:
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
    EnterNumbers("4");         // TODO add your handling code here:
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
    EnterNumbers("5");         // TODO add your handling code here:
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    EnterNumbers("6");         // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
    EnterNumbers("1");         // TODO add your handling code here:
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
    EnterNumbers("2");         // TODO add your handling code here:
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
    EnterNumbers("3");         // TODO add your handling code here:
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn0ActionPerformed
    EnterNumbers("0");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn0ActionPerformed

    private void jbtnPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPActionPerformed
    if(!JtxtResults.getText().contains("."))
    {
        JtxtResults.setText(JtxtResults.getText()+jbtnP.getText());
    }
    }//GEN-LAST:event_jbtnPActionPerformed

    private void jbtnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDivActionPerformed
        NumEnter1 = Double.parseDouble(JtxtResults.getText());
        JtxtResults.setText("");
        Op="/";
    }//GEN-LAST:event_jbtnDivActionPerformed

    private void jbtnMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMulActionPerformed
        NumEnter1 = Double.parseDouble(JtxtResults.getText());
        JtxtResults.setText("");
        Op="*";
    }//GEN-LAST:event_jbtnMulActionPerformed

    private void jbtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinusActionPerformed
    NumEnter1 = Double.parseDouble(JtxtResults.getText());
        JtxtResults.setText("");
        Op="-";
    }//GEN-LAST:event_jbtnMinusActionPerformed

    private void jbtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlusActionPerformed
    NumEnter1 = Double.parseDouble(JtxtResults.getText());
        JtxtResults.setText("");
        Op="+";
    }//GEN-LAST:event_jbtnPlusActionPerformed

    private void jbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCActionPerformed
            JtxtResults.setText("");    // TODO add your handling code here:
    }//GEN-LAST:event_jbtnCActionPerformed

    private void jbtnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCEActionPerformed
    JtxtResults.setText("");
    
    String fn,sn;
    fn=String.valueOf(NumEnter1);
    sn=String.valueOf(NumEnter2);
    fn="";
    sn ="";
    }//GEN-LAST:event_jbtnCEActionPerformed

    private void jbtnPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPMActionPerformed
        double nums = Double.parseDouble(String.valueOf(JtxtResults.getText()));
        nums=nums*(-1);
        JtxtResults.setText(String.valueOf(nums));
    }//GEN-LAST:event_jbtnPMActionPerformed

    private void jbtnBACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBACKActionPerformed
        String bk = null;
        if(JtxtResults.getText().length() > 0){
            StringBuilder sb = new StringBuilder(JtxtResults.getText());
            sb.deleteCharAt(JtxtResults.getText().length()-1);
            bk=sb.toString();
            JtxtResults.setText(bk);
        }
    }//GEN-LAST:event_jbtnBACKActionPerformed

    private void jbtnEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEqActionPerformed
        NumEnter2 = Double.parseDouble(JtxtResults.getText());
        if(Op.equals("+")){
            Result=NumEnter1+NumEnter2;
            JtxtResults.setText(String.valueOf(Result));
        }
        else if(Op.equals("-")){
            Result=NumEnter1-NumEnter2;
            JtxtResults.setText(String.valueOf(Result));
        }
        else if(Op.equals("*")){
            Result=NumEnter1*NumEnter2;
            JtxtResults.setText(String.valueOf(Result));
        }
        else if(Op.equals("/")){
            Result=NumEnter1/NumEnter2;
            JtxtResults.setText(String.valueOf(Result));
        }
    }//GEN-LAST:event_jbtnEqActionPerformed

    private void EnterNumbers(String q){
        String Nums = JtxtResults.getText()+q;
        JtxtResults.setText(Nums);
    }
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
    private javax.swing.JTextField JtxtResults;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnBACK;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnCE;
    private javax.swing.JButton jbtnDiv;
    private javax.swing.JButton jbtnEq;
    private javax.swing.JButton jbtnMinus;
    private javax.swing.JButton jbtnMul;
    private javax.swing.JButton jbtnP;
    private javax.swing.JButton jbtnPM;
    private javax.swing.JButton jbtnPlus;
    // End of variables declaration//GEN-END:variables
}
