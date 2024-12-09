/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.memorygamev2.Interface;

import com.mycompany.memorygamev2.Game;
import com.mycompany.memorygamev2.IA;
import java.awt.Color;
import java.util.Stack;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JButton;

/**
 *
 * @author vinic
 */
public class PlayerxCom extends javax.swing.JFrame {
    Game game = new Game(4);
    int player1 = 0;
    int player2 = 0;
    boolean ativ = false;
    int[] coords = {-1, -1, -1, -1};
    IA bot = new IA(4);
    int v = 1;
    Stack<javax.swing.JButton> stack = new Stack<>();
    ImageIcon imageBack = new ImageIcon("src\\main\\java\\Image\\Captura de tela 2024-12-03 002323.png");
    ImageIcon[] vecImages = new ImageIcon[8];
    
    public void play(javax.swing.JButton jButton, int a, int b){ 
        if(!game.getBoolean(a, b)){
            if((player1 + player2) < (((4 * 4) / 2))){
                jButton.setIcon(vecImages[game.getInt(a, b)]);
                boolean match = verify(a,b);
                if(!ativ){
                    ativ = true;
                    stack.add(jButton);
                }

                else {
                    ativ = false;
                    if(!match){
                        ++v;
                        //Timer delayTimer = new Timer(1000, new ActionListener() {
                        //@Override
                        //public void actionPerformed(ActionEvent e) {
                            stack.pop().setIcon(imageBack);
                            jButton.setIcon(imageBack);
                            if(v % 2 != 0) {
                                P1.setForeground(Color.red);
                                P2.setForeground(Color.white);
                            }
                            else {
                                P1.setForeground(Color.white);
                                P2.setForeground(Color.magenta);
                            }
                        //}
                        //});
                 
                    }

                    else{
                        stack.pop();
                        if(v % 2 != 0){
                            player1++;
                            P1Points.setText(String.valueOf(player1));
                        }
                        else { 
                            player2++;
                            P2Points.setText(String.valueOf(player2));
                        }
                    }
                }
            }

            else {
                this.setVisible(false);
                if(player1 > player2)JOptionPane.showMessageDialog(null,"Gojo Wins");
                else JOptionPane.showMessageDialog(null,"Mahoroga Wins");
            }
        }
    }
    
    boolean verify(int l, int m){
        if(!ativ){
            coords[0] = l;
            coords[1] = m;
        }
        
        else {
            coords[2] = l;
            coords[3] = m;
            return game.play(bot, coords);
        }
        
        return false;
    }
    
    public void construo(){
        for(int i = 0; i < 8; ++i){
            String aux = "src\\main\\java\\Image\\image";
            aux += String.valueOf(i + 1) + ".jpg";
            vecImages[i] = new ImageIcon(aux);
            Image Resizer = vecImages[i].getImage().getScaledInstance(150, 201, Image.SCALE_SMOOTH);
            vecImages[i] = new ImageIcon(Resizer);
        }
    }
    
    public javax.swing.JButton transleiter(int l, int m){
        if (l == 0 && m == 0) {
           return jButton18;
        } else if (l == 0 && m == 1) {
            return jButton19;
        } else if (l == 0 && m == 2) {
            return jButton20;
        } else if (l == 0 && m == 3) {
            return jButton21;
        } else if (l == 1 && m == 0) {
            return jButton22;
        } else if (l == 1 && m == 1) {
            return jButton23;
        } else if (l == 1 && m == 2) {
            return jButton24;
        } else if (l == 1 && m == 3) {
            return jButton25;
        } else if (l == 2 && m == 0) {
            return jButton26;
        } else if (l == 2 && m == 1) {
            return jButton27;
        } else if (l == 2 && m == 2) {
            return jButton28;
        } else if (l == 2 && m == 3) {
            return jButton29;
        } else if (l == 3 && m == 0) {
            return jButton30;
        } else if (l == 3 && m == 1) {
            return jButton31;
        } else if (l == 3 && m == 2) {
            return jButton31;
        } else if (l == 3 && m == 3) {
            return jButton32;
        }
        
        return null;
    }
    

    /**
     * Creates new form PlayerxCom
     */
    public PlayerxCom() {
        initComponents();
        Image image = imageBack.getImage().getScaledInstance(150, 201, Image.SCALE_SMOOTH);
        imageBack = new ImageIcon(image);
        jButton17.setIcon(imageBack);
        jButton18.setIcon(imageBack);
        jButton19.setIcon(imageBack);
        jButton20.setIcon(imageBack);
        jButton21.setIcon(imageBack);
        jButton22.setIcon(imageBack);
        jButton23.setIcon(imageBack);
        jButton24.setIcon(imageBack);
        jButton25.setIcon(imageBack);
        jButton26.setIcon(imageBack);
        jButton27.setIcon(imageBack);
        jButton28.setIcon(imageBack);
        jButton29.setIcon(imageBack);
        jButton30.setIcon(imageBack);
        jButton31.setIcon(imageBack);
        jButton32.setIcon(imageBack);
        
        construo();
        game.Gen();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        P1Points = new javax.swing.JLabel();
        P2 = new javax.swing.JLabel();
        P1 = new javax.swing.JLabel();
        P2Points = new javax.swing.JLabel();
        jButton33 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jButton17.setText("jButton1");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("jButton1");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("jButton1");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setText("jButton1");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setText("jButton1");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setText("jButton1");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setText("jButton1");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setText("jButton1");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setText("jButton1");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setText("jButton1");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setText("jButton1");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setText("jButton1");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setText("jButton1");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setText("jButton1");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setText("jButton1");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setText("jButton1");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ryōiki Tenkai: Mugen no memori");

        P1Points.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        P1Points.setForeground(new java.awt.Color(255, 255, 255));
        P1Points.setText("0");

        P2.setFont(new java.awt.Font("Viner Hand ITC", 0, 18)); // NOI18N
        P2.setForeground(new java.awt.Color(255, 255, 255));
        P2.setText("Player2:");

        P1.setFont(new java.awt.Font("Viner Hand ITC", 0, 18)); // NOI18N
        P1.setForeground(new java.awt.Color(255, 0, 51));
        P1.setText("Player1:");

        P2Points.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        P2Points.setForeground(new java.awt.Color(255, 255, 255));
        P2Points.setText("0");

        jButton33.setText("Break");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(P2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(P1Points)
                                .addGap(300, 300, 300)
                                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(343, 343, 343)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(P2Points)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(152, 152, 152))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(595, 595, 595)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(P1)
                    .addContainerGap(945, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(58, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(P1Points)
                        .addGap(127, 127, 127)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(P2)
                            .addComponent(P2Points))
                        .addGap(347, 347, 347))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(343, 343, 343)
                    .addComponent(P1)
                    .addContainerGap(519, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        if(v % 2 != 0) {
            JButton button = (JButton) evt.getSource();
            play(button,0,1);
        }
        while(!ativ && v % 2 == 0){
            int[] movs = bot.gen();
            Timer time = new Timer(2000, new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e){
                    play(transleiter(movs[0], movs[1]), movs[0], movs[1]);
                    play(transleiter(movs[2], movs[3]), movs[2], movs[3]);

                }
            });
            time.setRepeats(false);
            time.start();
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        if(v % 2 != 0) {
            JButton button = (JButton) evt.getSource();
            play(button,0,0);
        }
        while(!ativ && v % 2 == 0){
            int[] movs = bot.gen();
            Timer time = new Timer(2000, new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e){
                    play(transleiter(movs[0], movs[1]), movs[0], movs[1]);
                    play(transleiter(movs[2], movs[3]), movs[2], movs[3]);

                }
            });
            time.setRepeats(false);
            time.start();
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        if(v % 2 != 0) {
            JButton button = (JButton) evt.getSource();
            play(button,0,3);
        }
        while(!ativ && v % 2 == 0){
            int[] movs = bot.gen();
            Timer time = new Timer(2000, new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e){
                    play(transleiter(movs[0], movs[1]), movs[0], movs[1]);
                    play(transleiter(movs[2], movs[3]), movs[2], movs[3]);

                }
            });
            time.setRepeats(false);
            time.start();
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        if(v % 2 != 0) {
            JButton button = (JButton) evt.getSource();
            play(button,0,2);
        }
        while(!ativ && v % 2 == 0){
            int[] movs = bot.gen();
            Timer time = new Timer(2000, new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e){
                    play(transleiter(movs[0], movs[1]), movs[0], movs[1]);
                    play(transleiter(movs[2], movs[3]), movs[2], movs[3]);

                }
            });
            time.setRepeats(false);
            time.start();
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        if(v % 2 != 0) {
            JButton button = (JButton) evt.getSource();
            play(button,1,3);
        }
        while(!ativ && v % 2 == 0){
            int[] movs = bot.gen();
            Timer time = new Timer(2000, new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e){
                    play(transleiter(movs[0], movs[1]), movs[0], movs[1]);
                    play(transleiter(movs[2], movs[3]), movs[2], movs[3]);

                }
            });
            time.setRepeats(false);
            time.start();
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        if(v % 2 != 0) {
            JButton button = (JButton) evt.getSource();
            play(button,1,2);
        }
        while(!ativ && v % 2 == 0){
            int[] movs = bot.gen();
            Timer time = new Timer(2000, new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e){
                    play(transleiter(movs[0], movs[1]), movs[0], movs[1]);
                    play(transleiter(movs[2], movs[3]), movs[2], movs[3]);

                }
            });
            time.setRepeats(false);
            time.start();
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        if(v % 2 != 0) {
            JButton button = (JButton) evt.getSource();
            play(button,1,1);
        }
        while(!ativ && v % 2 == 0){
            int[] movs = bot.gen();
            Timer time = new Timer(2000, new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e){
                    play(transleiter(movs[0], movs[1]), movs[0], movs[1]);
                    play(transleiter(movs[2], movs[3]), movs[2], movs[3]);

                }
            });
            time.setRepeats(false);
            time.start();
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        if(v % 2 != 0) {
            JButton button = (JButton) evt.getSource();
            play(button,1,0);
        }
        while(!ativ && v % 2 == 0){
            int[] movs = bot.gen();
            Timer time = new Timer(2000, new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e){
                    play(transleiter(movs[0], movs[1]), movs[0], movs[1]);
                    play(transleiter(movs[2], movs[3]), movs[2], movs[3]);

                }
            });
            time.setRepeats(false);
            time.start();
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        if(v % 2 != 0) {
            JButton button = (JButton) evt.getSource();
            play(button,2,3);
        }
        while(!ativ && v % 2 == 0){
            int[] movs = bot.gen();
            Timer time = new Timer(2000, new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e){
                    play(transleiter(movs[0], movs[1]), movs[0], movs[1]);
                    play(transleiter(movs[2], movs[3]), movs[2], movs[3]);

                }
            });
            time.setRepeats(false);
            time.start();
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        if(v % 2 != 0) {
            JButton button = (JButton) evt.getSource();
            play(button,2,2);
        }
        while(!ativ && v % 2 == 0){
            int[] movs = bot.gen();
            Timer time = new Timer(2000, new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e){
                    play(transleiter(movs[0], movs[1]), movs[0], movs[1]);
                    play(transleiter(movs[2], movs[3]), movs[2], movs[3]);

                }
            });
            time.setRepeats(false);
            time.start();
        }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        if(v % 2 != 0) {
            JButton button = (JButton) evt.getSource();
            play(button,2,0);
        }
        while(!ativ && v % 2 == 0){
            int[] movs = bot.gen();
            Timer time = new Timer(2000, new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e){
                    play(transleiter(movs[0], movs[1]), movs[0], movs[1]);
                    play(transleiter(movs[2], movs[3]), movs[2], movs[3]);

                }
            });
            time.setRepeats(false);
            time.start();
        }
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        if(v % 2 != 0) {
            JButton button = (JButton) evt.getSource();
            play(button,2,1);
        }
        while(!ativ && v % 2 == 0){
            int[] movs = bot.gen();
            Timer time = new Timer(2000, new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e){
                    play(transleiter(movs[0], movs[1]), movs[0], movs[1]);
                    play(transleiter(movs[2], movs[3]), movs[2], movs[3]);

                }
            });
            time.setRepeats(false);
            time.start();
        }
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        if(v % 2 != 0) {
            JButton button = (JButton) evt.getSource();
            play(button,3,3);
        }
        while(!ativ && v % 2 == 0){
            int[] movs = bot.gen();
            Timer time = new Timer(2000, new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e){
                    play(transleiter(movs[0], movs[1]), movs[0], movs[1]);
                    play(transleiter(movs[2], movs[3]), movs[2], movs[3]);

                }
            });
            time.setRepeats(false);
            time.start();
        }
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        if(v % 2 != 0) {
            JButton button = (JButton) evt.getSource();
            play(button,3,2);
        }
        while(!ativ && v % 2 == 0){
            int[] movs = bot.gen();
            Timer time = new Timer(2000, new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e){
                    play(transleiter(movs[0], movs[1]), movs[0], movs[1]);
                    play(transleiter(movs[2], movs[3]), movs[2], movs[3]);

                }
            });
            time.setRepeats(false);
            time.start();
        }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        if(v % 2 != 0) {
            JButton button = (JButton) evt.getSource();
            play(button,3,0);
        }
        while(!ativ && v % 2 == 0){
            int[] movs = bot.gen();
            Timer time = new Timer(2000, new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e){
                    play(transleiter(movs[0], movs[1]), movs[0], movs[1]);
                    play(transleiter(movs[2], movs[3]), movs[2], movs[3]);

                }
            });
            time.setRepeats(false);
            time.start();
        }
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        if(v % 2 != 0) {
            JButton button = (JButton) evt.getSource();
            play(button,3,1);
        }
        while(!ativ && v % 2 == 0){
            int[] movs = bot.gen();
            Timer time = new Timer(2000, new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e){
                    play(transleiter(movs[0], movs[1]), movs[0], movs[1]);
                    play(transleiter(movs[2], movs[3]), movs[2], movs[3]);
                }
            });
            time.setRepeats(false);
            time.start();
        }
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        this.setVisible(false);
        Initialization console = new Initialization();
        console.setVisible(true);
    }//GEN-LAST:event_jButton33ActionPerformed

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
            java.util.logging.Logger.getLogger(PlayerxCom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayerxCom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayerxCom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayerxCom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayerxCom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel P1;
    private javax.swing.JLabel P1Points;
    private javax.swing.JLabel P2;
    private javax.swing.JLabel P2Points;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
