public class CalculadoraGUI extends javax.swing.JFrame 
{
    String sig;
    double num1,num2;
    public CalculadoraGUI() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bot1 = new javax.swing.JButton();
        Bot2 = new javax.swing.JButton();
        Bot3 = new javax.swing.JButton();
        Bot4 = new javax.swing.JButton();
        Bot5 = new javax.swing.JButton();
        Bot6 = new javax.swing.JButton();
        Bot7 = new javax.swing.JButton();
        Bot8 = new javax.swing.JButton();
        Bot9 = new javax.swing.JButton();
        BotRestar = new javax.swing.JButton();
        BotMultiplicar = new javax.swing.JButton();
        BotDividir = new javax.swing.JButton();
        BotTan = new javax.swing.JButton();
        BotCos = new javax.swing.JButton();
        BotPorcentaje = new javax.swing.JButton();
        BotRaiz = new javax.swing.JButton();
        BotPotencia = new javax.swing.JButton();
        BotBorrar = new javax.swing.JButton();
        CajaDeOperaciones = new javax.swing.JLabel();
        CajaDeResultados = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BotIgual = new javax.swing.JButton();
        Bot0 = new javax.swing.JButton();
        BotSumar = new javax.swing.JButton();
        BotSen = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bot1.setBackground(new java.awt.Color(30, 36, 53));
        Bot1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        Bot1.setForeground(new java.awt.Color(255, 255, 255));
        Bot1.setText("1");
        Bot1.setBorder(null);
        Bot1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot1ActionPerformed(evt);
            }
        });
        getContentPane().add(Bot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 193, 41, 41));

        Bot2.setBackground(new java.awt.Color(30, 36, 53));
        Bot2.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        Bot2.setForeground(new java.awt.Color(255, 255, 255));
        Bot2.setText("2");
        Bot2.setBorder(null);
        Bot2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot2ActionPerformed(evt);
            }
        });
        getContentPane().add(Bot2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 193, 41, 41));

        Bot3.setBackground(new java.awt.Color(30, 36, 53));
        Bot3.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        Bot3.setForeground(new java.awt.Color(255, 255, 255));
        Bot3.setText("3");
        Bot3.setBorder(null);
        Bot3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot3ActionPerformed(evt);
            }
        });
        getContentPane().add(Bot3, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 193, 41, 41));

        Bot4.setBackground(new java.awt.Color(30, 36, 53));
        Bot4.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        Bot4.setForeground(new java.awt.Color(255, 255, 255));
        Bot4.setText("4");
        Bot4.setBorder(null);
        Bot4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot4ActionPerformed(evt);
            }
        });
        getContentPane().add(Bot4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 244, 41, 41));

        Bot5.setBackground(new java.awt.Color(30, 36, 53));
        Bot5.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        Bot5.setForeground(new java.awt.Color(255, 255, 255));
        Bot5.setText("5");
        Bot5.setBorder(null);
        Bot5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot5ActionPerformed(evt);
            }
        });
        getContentPane().add(Bot5, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 244, 41, 41));

        Bot6.setBackground(new java.awt.Color(30, 36, 53));
        Bot6.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        Bot6.setForeground(new java.awt.Color(255, 255, 255));
        Bot6.setText("6");
        Bot6.setBorder(null);
        Bot6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot6ActionPerformed(evt);
            }
        });
        getContentPane().add(Bot6, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 244, 41, 41));

        Bot7.setBackground(new java.awt.Color(30, 36, 53));
        Bot7.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        Bot7.setForeground(new java.awt.Color(255, 255, 255));
        Bot7.setText("7");
        Bot7.setBorder(null);
        Bot7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot7ActionPerformed(evt);
            }
        });
        getContentPane().add(Bot7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 295, 41, 41));

        Bot8.setBackground(new java.awt.Color(30, 36, 53));
        Bot8.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        Bot8.setForeground(new java.awt.Color(255, 255, 255));
        Bot8.setText("8");
        Bot8.setBorder(null);
        Bot8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot8ActionPerformed(evt);
            }
        });
        getContentPane().add(Bot8, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 295, 41, 41));

        Bot9.setBackground(new java.awt.Color(30, 36, 53));
        Bot9.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        Bot9.setForeground(new java.awt.Color(255, 255, 255));
        Bot9.setText("9");
        Bot9.setBorder(null);
        Bot9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot9ActionPerformed(evt);
            }
        });
        getContentPane().add(Bot9, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 295, 41, 41));

        BotRestar.setBackground(new java.awt.Color(82, 201, 220));
        BotRestar.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        BotRestar.setForeground(new java.awt.Color(255, 255, 255));
        BotRestar.setText("-");
        BotRestar.setBorder(null);
        BotRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotRestarActionPerformed(evt);
            }
        });
        getContentPane().add(BotRestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 295, 41, 41));

        BotMultiplicar.setBackground(new java.awt.Color(82, 201, 220));
        BotMultiplicar.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        BotMultiplicar.setForeground(new java.awt.Color(255, 255, 255));
        BotMultiplicar.setText("x");
        BotMultiplicar.setBorder(null);
        BotMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotMultiplicarActionPerformed(evt);
            }
        });
        getContentPane().add(BotMultiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 244, 41, 41));

        BotDividir.setBackground(new java.awt.Color(82, 201, 220));
        BotDividir.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        BotDividir.setForeground(new java.awt.Color(255, 255, 255));
        BotDividir.setText("/");
        BotDividir.setBorder(null);
        BotDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotDividirActionPerformed(evt);
            }
        });
        getContentPane().add(BotDividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 193, 41, 41));

        BotTan.setBackground(new java.awt.Color(82, 201, 220));
        BotTan.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        BotTan.setForeground(new java.awt.Color(255, 255, 255));
        BotTan.setText("TAN");
        BotTan.setBorder(null);
        BotTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotTanActionPerformed(evt);
            }
        });
        getContentPane().add(BotTan, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 295, 82, 41));

        BotCos.setBackground(new java.awt.Color(82, 201, 220));
        BotCos.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        BotCos.setForeground(new java.awt.Color(255, 255, 255));
        BotCos.setText("COS");
        BotCos.setBorder(null);
        BotCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotCosActionPerformed(evt);
            }
        });
        getContentPane().add(BotCos, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 244, 82, 41));

        BotPorcentaje.setBackground(new java.awt.Color(82, 201, 220));
        BotPorcentaje.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        BotPorcentaje.setForeground(new java.awt.Color(255, 255, 255));
        BotPorcentaje.setText("%");
        BotPorcentaje.setBorder(null);
        BotPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotPorcentajeActionPerformed(evt);
            }
        });
        getContentPane().add(BotPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 193, 82, 41));

        BotRaiz.setBackground(new java.awt.Color(82, 201, 220));
        BotRaiz.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        BotRaiz.setForeground(new java.awt.Color(255, 255, 255));
        BotRaiz.setText("√");
        BotRaiz.setBorder(null);
        BotRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotRaizActionPerformed(evt);
            }
        });
        getContentPane().add(BotRaiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 142, 92, 41));

        BotPotencia.setBackground(new java.awt.Color(82, 201, 220));
        BotPotencia.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        BotPotencia.setForeground(new java.awt.Color(255, 255, 255));
        BotPotencia.setText("POT");
        BotPotencia.setBorder(null);
        BotPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotPotenciaActionPerformed(evt);
            }
        });
        getContentPane().add(BotPotencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 142, 92, 41));

        BotBorrar.setBackground(new java.awt.Color(82, 201, 220));
        BotBorrar.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        BotBorrar.setForeground(new java.awt.Color(255, 255, 255));
        BotBorrar.setText("DEL");
        BotBorrar.setBorder(null);
        BotBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(BotBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 142, 82, 41));

        CajaDeOperaciones.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        CajaDeOperaciones.setForeground(new java.awt.Color(255, 255, 255));
        CajaDeOperaciones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(CajaDeOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 92, 286, 30));

        CajaDeResultados.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        CajaDeResultados.setForeground(new java.awt.Color(255, 255, 255));
        CajaDeResultados.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(CajaDeResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 22, 230, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(82, 201, 220));
        jLabel1.setText("=");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 26, -1, 60));

        jPanel2.setBackground(new java.awt.Color(26, 27, 40));

        BotIgual.setBackground(new java.awt.Color(82, 201, 220));
        BotIgual.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        BotIgual.setForeground(new java.awt.Color(255, 255, 255));
        BotIgual.setText("=");
        BotIgual.setToolTipText("");
        BotIgual.setBorder(null);
        BotIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotIgualActionPerformed(evt);
            }
        });

        Bot0.setBackground(new java.awt.Color(30, 36, 53));
        Bot0.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        Bot0.setForeground(new java.awt.Color(255, 255, 255));
        Bot0.setText("0");
        Bot0.setBorder(null);
        Bot0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot0ActionPerformed(evt);
            }
        });

        BotSumar.setBackground(new java.awt.Color(82, 201, 220));
        BotSumar.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        BotSumar.setForeground(new java.awt.Color(255, 255, 255));
        BotSumar.setText("+");
        BotSumar.setBorder(null);
        BotSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotSumarActionPerformed(evt);
            }
        });

        BotSen.setBackground(new java.awt.Color(82, 201, 220));
        BotSen.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        BotSen.setForeground(new java.awt.Color(255, 255, 255));
        BotSen.setText("SEN");
        BotSen.setBorder(null);
        BotSen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotSenActionPerformed(evt);
            }
        });

        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Calculadora media fea :c (2.0)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Bot0, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(BotIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(BotSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(BotSen, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 26, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 333, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BotIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bot0, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BotSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BotSen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void Bot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot1ActionPerformed
        CajaDeResultados.setText(CajaDeResultados.getText()+"1");
    }//GEN-LAST:event_Bot1ActionPerformed

    private void Bot2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot2ActionPerformed
        CajaDeResultados.setText(CajaDeResultados.getText()+"2");
    }//GEN-LAST:event_Bot2ActionPerformed
    private void Bot3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot3ActionPerformed
        CajaDeResultados.setText(CajaDeResultados.getText()+"3");
    }//GEN-LAST:event_Bot3ActionPerformed

    private void Bot4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot4ActionPerformed
        CajaDeResultados.setText(CajaDeResultados.getText()+"4");
    }//GEN-LAST:event_Bot4ActionPerformed

    private void Bot5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot5ActionPerformed
        CajaDeResultados.setText(CajaDeResultados.getText()+"5");
    }//GEN-LAST:event_Bot5ActionPerformed

    private void Bot6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot6ActionPerformed
        CajaDeResultados.setText(CajaDeResultados.getText()+"6");
    }//GEN-LAST:event_Bot6ActionPerformed

    private void Bot7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot7ActionPerformed
        CajaDeResultados.setText(CajaDeResultados.getText()+"7");
    }//GEN-LAST:event_Bot7ActionPerformed

    private void Bot8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot8ActionPerformed
        CajaDeResultados.setText(CajaDeResultados.getText()+"8");
    }//GEN-LAST:event_Bot8ActionPerformed

    private void Bot9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot9ActionPerformed
        CajaDeResultados.setText(CajaDeResultados.getText()+"9");
    }//GEN-LAST:event_Bot9ActionPerformed

    private void Bot0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot0ActionPerformed
        CajaDeResultados.setText(CajaDeResultados.getText()+"0");
    }//GEN-LAST:event_Bot0ActionPerformed

    private void BotTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotTanActionPerformed
        if(Double.parseDouble(CajaDeResultados.getText())==90||Double.parseDouble(CajaDeResultados.getText())==270||Double.parseDouble(CajaDeResultados.getText())==-90||Double.parseDouble(CajaDeResultados.getText())==-270)
        {
            CajaDeResultados.setText("MATH ERROR");
        }
        else
        {
            double res;
            res = Math.tan(Math.toRadians(Double.parseDouble(CajaDeResultados.getText())));
            CajaDeOperaciones.setText("tan("+CajaDeResultados.getText()+")");
            CajaDeResultados.setText(String.valueOf(res)); 
        }
    }//GEN-LAST:event_BotTanActionPerformed

    private void BotCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotCosActionPerformed
        double res=Math.cos(Math.toRadians(Double.parseDouble(CajaDeResultados.getText())));
        CajaDeOperaciones.setText("cos("+CajaDeResultados.getText()+")");
        CajaDeResultados.setText(String.valueOf(res));
    }//GEN-LAST:event_BotCosActionPerformed

    private void BotSenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotSenActionPerformed
        double res=Math.sin(Math.toRadians(Double.parseDouble(CajaDeResultados.getText())));
        CajaDeOperaciones.setText("sen("+CajaDeResultados.getText()+")");
        CajaDeResultados.setText(String.valueOf(res));
    }//GEN-LAST:event_BotSenActionPerformed

    private void BotPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotPorcentajeActionPerformed
        num1=Double.parseDouble(CajaDeResultados.getText());
        sig="por";
        CajaDeResultados.setText("");
    }//GEN-LAST:event_BotPorcentajeActionPerformed

    private void BotRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotRaizActionPerformed
        num1=Double.parseDouble(CajaDeResultados.getText());
        sig="raiz";
        CajaDeResultados.setText("");
    }//GEN-LAST:event_BotRaizActionPerformed

    private void BotPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotPotenciaActionPerformed
        num1=Double.parseDouble(CajaDeResultados.getText());
        sig="pot";
        CajaDeResultados.setText("");
    }//GEN-LAST:event_BotPotenciaActionPerformed

    private void BotBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotBorrarActionPerformed
        CajaDeResultados.setText("");
        CajaDeOperaciones.setText("");
    }//GEN-LAST:event_BotBorrarActionPerformed

    private void BotDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotDividirActionPerformed
        num1=Double.parseDouble(CajaDeResultados.getText());
        sig="/";
        CajaDeResultados.setText(""); 
    }//GEN-LAST:event_BotDividirActionPerformed

    private void BotRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotRestarActionPerformed
        num1=Double.parseDouble(CajaDeResultados.getText());
        sig="-";
        CajaDeResultados.setText("");
    }//GEN-LAST:event_BotRestarActionPerformed

    private void BotMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotMultiplicarActionPerformed
        num1=Double.parseDouble(CajaDeResultados.getText());
        sig="*";
        CajaDeResultados.setText("");
    }//GEN-LAST:event_BotMultiplicarActionPerformed

    private void BotSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotSumarActionPerformed
        num1=Double.parseDouble(CajaDeResultados.getText());
        sig="+";
        CajaDeResultados.setText("");
    }//GEN-LAST:event_BotSumarActionPerformed

    private void BotIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotIgualActionPerformed
        num2=Double.parseDouble(CajaDeResultados.getText());
        switch(sig)
        {
            case "+":
                CajaDeOperaciones.setText(num1+" + "+num2);
                CajaDeResultados.setText(Double.toString(num1+num2));
                break;
            case "-":
                CajaDeOperaciones.setText(num1+" - "+num2);
                CajaDeResultados.setText(Double.toString(num1-num2));
                break;
            case "*":
                CajaDeOperaciones.setText(num1+" * "+num2);
                CajaDeResultados.setText(Double.toString(num1*num2));
                break;
            case "/":
                if(num2!=0)
                {
                    CajaDeOperaciones.setText(num1+" / "+num2);
                    CajaDeResultados.setText(Double.toString(num1/num2));
                }
                else
                {
                    CajaDeOperaciones.setText(num1+" / "+num2);
                    CajaDeResultados.setText("MATH ERROR");
                }
                break;
            case "pot":
                CajaDeOperaciones.setText(num1+" ^ "+num2);
                CajaDeResultados.setText(Double.toString((double) Math.pow(num1, num2)));
                break;
            case "raiz":
                if(num1<0)
                {
                    CajaDeOperaciones.setText(num2+"√ "+num1);
                    CajaDeResultados.setText("MATH ERROR");
                }
                else
                {
                    CajaDeOperaciones.setText(num2+"√ "+num1);
                    CajaDeResultados.setText(String.valueOf(Math.pow(num1,1/num2)));
                }
                break;
            case "por":
                CajaDeOperaciones.setText(num2+"% de "+num1);
                num2=num2/100;
                CajaDeResultados.setText(Double.toString(num1*num2));
                break;
        }
    }//GEN-LAST:event_BotIgualActionPerformed
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() 
            {
                new CalculadoraGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bot0;
    private javax.swing.JButton Bot1;
    private javax.swing.JButton Bot2;
    private javax.swing.JButton Bot3;
    private javax.swing.JButton Bot4;
    private javax.swing.JButton Bot5;
    private javax.swing.JButton Bot6;
    private javax.swing.JButton Bot7;
    private javax.swing.JButton Bot8;
    private javax.swing.JButton Bot9;
    private javax.swing.JButton BotBorrar;
    private javax.swing.JButton BotCos;
    private javax.swing.JButton BotDividir;
    private javax.swing.JButton BotIgual;
    private javax.swing.JButton BotMultiplicar;
    private javax.swing.JButton BotPorcentaje;
    private javax.swing.JButton BotPotencia;
    private javax.swing.JButton BotRaiz;
    private javax.swing.JButton BotRestar;
    private javax.swing.JButton BotSen;
    private javax.swing.JButton BotSumar;
    private javax.swing.JButton BotTan;
    private javax.swing.JLabel CajaDeOperaciones;
    private javax.swing.JLabel CajaDeResultados;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
