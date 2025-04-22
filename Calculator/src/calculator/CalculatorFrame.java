package calculator;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class CalculatorFrame extends javax.swing.JFrame {

    double ans, num;
    int operator,flag=0;
    ArrayList<String> history = new ArrayList<>();
    
    public void calculation() {
        String inputText = jTextField1.getText().trim();

        // Kiểm tra nếu chuỗi trống
        if (inputText.isEmpty()) {
            return; // Không làm gì nếu người dùng không nhập số
        }

        // Chuẩn hóa dấu để đảm bảo phép toán đúng
        inputText = inputText.replace("+ -", "-"); // Chuyển '+ -' thành '-'
        inputText = inputText.replace("- -", "+"); // Chuyển '- -' thành '+'

        try {
            double inputNumber = Double.parseDouble(inputText);
            switch (operator) {
                case 1:  // Cộng
                    ans = num + inputNumber;
                    history.add(num + " + " + inputText + " = " + ans);
                    break;
                case 2:  // Trừ
                    ans = num - inputNumber;
                    history.add(num + " - " + inputText + " = " + ans);
                    break;
                case 3:  // Nhân
                    ans = num * inputNumber;
                    history.add(num + " * " + inputText + " = " + ans);
                    break;
                case 4:  // Chia
                    if (inputNumber == 0) {
                        jTextField1.setText("Math Error");
                        return;
                    }
                    ans = num / inputNumber;
                    history.add(num + " / " + inputText + " = " + ans);
                    break;
                case 5:  // Phần trăm
                    ans = num / 100;
                    history.add(num + " % = " + ans);
                    break;
                case 6:  // Lũy thừa
                    ans = Math.pow(num, inputNumber);
                    history.add(num + "^" + inputText + " = " + ans);
                    break;
                case 7:  // Căn bậc hai
                    if (inputNumber < 0) {
                        jTextField1.setText("Math Error");
                        return;
                    }
                    ans = Math.sqrt(inputNumber);
                    history.add("√" + inputText + " = " + ans);
                    break;
                default:
                    return;
            }
            jTextField1.setText(Double.toString(ans));
        } catch (NumberFormatException e) {
            jTextField1.setText("Invalid Input");
        }
    }

    



    public CalculatorFrame() {
        
        initComponents();
        jRadioButtonON.setEnabled(false);
        jButtonLuyThua.setText("x^y");
        jButtonCanBacHai.setText("√x");
        jButtonPerc.setText("%");
        
    }


    public void Off(){
        jTextField1.setEnabled(false);
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton0.setEnabled(false);
        jButtonM.setEnabled(false);
        jButtonA.setEnabled(false);
        jButtonS.setEnabled(false);
        jButtonD.setEnabled(false);
        jButtonP.setEnabled(false);
        jButtonLuyThua.setEnabled(false);
        jButtonC.setEnabled(false);
        jButtonE.setEnabled(false);
        jButtonPerc.setEnabled(false);
        jButtonCanBacHai.setEnabled(false);
        jButtonBS1.setEnabled(false);
        
    }
     public void On(){
        jTextField1.setEnabled(true);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        jButton0.setEnabled(true);
        jButtonM.setEnabled(true);
        jButtonA.setEnabled(true);
        jButtonS.setEnabled(true);
        jButtonD.setEnabled(true);
        jButtonP.setEnabled(true);
        jButtonLuyThua.setEnabled(true);
        jButtonC.setEnabled(true);
        jButtonE.setEnabled(true);
        jButtonPerc.setEnabled(true);
        jButtonCanBacHai.setEnabled(true);
        jButtonBS1.setEnabled(true);
        
    }
     public void CancelingExtra(){
        if(flag == 1 || jTextField1.getText().equals("0")){
            jTextField1.setText("");
            flag = 0;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jRadioButtonON = new javax.swing.JRadioButton();
        jRadioButtonOFF = new javax.swing.JRadioButton();
        jButtonLuyThua = new javax.swing.JButton();
        jButtonD = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButtonM = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButtonS = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonA = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButtonE = new javax.swing.JButton();
        jButtonP = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonPerc = new javax.swing.JButton();
        jButtonBS1 = new javax.swing.JButton();
        jButtonCanBacHai = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULATOR");
        setLocation(new java.awt.Point(300, 20));
        setResizable(false);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("MS Gothic", 1, 25)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonON);
        jRadioButtonON.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jRadioButtonON.setText("ON");
        jRadioButtonON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonONActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonOFF);
        jRadioButtonOFF.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jRadioButtonOFF.setText("OFF");
        jRadioButtonOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOFFActionPerformed(evt);
            }
        });

        jButtonLuyThua.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jButtonLuyThua.setText("X^y");
        jButtonLuyThua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLuyThuaActionPerformed(evt);
            }
        });

        jButtonD.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jButtonD.setText("/");
        jButtonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButtonC.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jButtonC.setText("C");
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });

        jButtonM.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        jButtonM.setText("*");
        jButtonM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButtonS.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jButtonS.setText("-");
        jButtonS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButtonA.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jButtonA.setText("+");
        jButtonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAActionPerformed(evt);
            }
        });

        jButton0.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButtonE.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jButtonE.setText("=");
        jButtonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEActionPerformed(evt);
            }
        });

        jButtonP.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jButtonP.setText(".");
        jButtonP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jButtonPerc.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jButtonPerc.setText("%");
        jButtonPerc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPercActionPerformed(evt);
            }
        });

        jButtonBS1.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jButtonBS1.setText("<--");
        jButtonBS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBS1ActionPerformed(evt);
            }
        });

        jButtonCanBacHai.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jButtonCanBacHai.setText("√x");
        jButtonCanBacHai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCanBacHaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCanBacHai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonLuyThua))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonP, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonE, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonPerc, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 204, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonON)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButtonOFF)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonBS1))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonON)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonOFF)
                            .addComponent(jButtonBS1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonLuyThua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCanBacHai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonPerc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jMenu1.setText("View");

        jMenuItem1.setText("View history");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        CancelingExtra();
        jTextField1.setText(jTextField1.getText()+"7");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        CancelingExtra();
        jTextField1.setText(jTextField1.getText()+"8");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
        // TODO add your handling code here:
        num=0;
        jTextField1.setText("");
        jLabel1.setText("");
    }//GEN-LAST:event_jButtonCActionPerformed

    private void jButtonMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMActionPerformed
        // TODO add your handling code here:
       // jTextField1.setText(jTextField1.getText()+"*");
       if( !(jLabel1.getText().contains("*")  || jTextField1.getText().equals(""))){
       num= Double.parseDouble(jTextField1.getText());
        operator=3;
        jTextField1.setText("");
        jLabel1.setText(num + "*");
       }
    }//GEN-LAST:event_jButtonMActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        CancelingExtra();
        jTextField1.setText(jTextField1.getText()+"9");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        CancelingExtra();
        jTextField1.setText(jTextField1.getText()+"5");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        CancelingExtra();
        jTextField1.setText(jTextField1.getText()+"6");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButtonSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSActionPerformed
        // TODO add your handling code here:
      // jTextField1.setText( jTextField1.getText()+"-");
      if( !(jLabel1.getText().contains("-")  || jTextField1.getText().equals(""))){
      num= Double.parseDouble(jTextField1.getText());
        operator=2;
        jTextField1.setText("");
        jLabel1.setText(num + "-");
      }
    }//GEN-LAST:event_jButtonSActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CancelingExtra();
        jTextField1.setText(jTextField1.getText()+"2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CancelingExtra();
        jTextField1.setText(jTextField1.getText()+"1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CancelingExtra();
        jTextField1.setText(jTextField1.getText()+"3");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAActionPerformed
        // TODO add your handling code here:
       // jTextField1.setText(jTextField1.getText()+"+");
       if( !(jLabel1.getText().contains("+")  || jTextField1.getText().equals(""))){
        num= Double.parseDouble(jTextField1.getText());
        operator=1;
        jTextField1.setText("");
        jLabel1.setText(num + "+");
       }
    }//GEN-LAST:event_jButtonAActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        // TODO add your handling code here:
        CancelingExtra();
        if(!jTextField1.getText().equals("0"))
            jTextField1.setText(jTextField1.getText()+"0");
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        CancelingExtra();
        jTextField1.setText(jTextField1.getText()+"4");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEActionPerformed
        // TODO add your handling code here:
        calculation();
        flag = 1;
        jLabel1.setText("");
        ans = 0;
    }//GEN-LAST:event_jButtonEActionPerformed

    private void jButtonPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPActionPerformed
        // TODO add your handling code here:
        if(flag == 1){
            jTextField1.setText("");
            flag = 0;
        }
        if(!jTextField1.getText().contains("."))
        jTextField1.setText(jTextField1.getText()+".");
    }//GEN-LAST:event_jButtonPActionPerformed

    private void jRadioButtonOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOFFActionPerformed
        // TODO add your handling code here:
        Off();
        jTextField1.setText("");
        jLabel1.setText("");
        jRadioButtonON.setEnabled(true);
    }//GEN-LAST:event_jRadioButtonOFFActionPerformed

    private void jRadioButtonONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonONActionPerformed
        // TODO add your handling code here:
        On();
    }//GEN-LAST:event_jRadioButtonONActionPerformed

    private void jButtonLuyThuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLuyThuaActionPerformed
        // TODO add your handling code here:
        
        // Tính lũy thừa
        num = Double.parseDouble(jTextField1.getText());
        operator = 6;
        jTextField1.setText("");
        jLabel1.setText(num + "^");
    }//GEN-LAST:event_jButtonLuyThuaActionPerformed

    private void jButtonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDActionPerformed
        // TODO add your handling code here:
       // jTextField1.setText(jTextField1.getText()+"/");
       if( !(jLabel1.getText().contains("/")  || jTextField1.getText().equals(""))){
        num= Double.parseDouble(jTextField1.getText());
        operator=4;
        jTextField1.setText("");
        jLabel1.setText(num + "/");
       }
    }//GEN-LAST:event_jButtonDActionPerformed

    private void jButtonPercActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPercActionPerformed
        // TODO add your handling code here:
        
// Lấy giá trị nhập vào từ jTextField1
String inputText = jTextField1.getText();

// Kiểm tra xem chuỗi có trống không hoặc không phải số hợp lệ
if (inputText.trim().isEmpty()) {
    jTextField1.setText("Invalid Input");
    return;
}

try {
    // Chuyển đổi giá trị nhập vào thành số double
    double value = Double.parseDouble(inputText);

    // Kiểm tra nếu giá trị là số âm
    if (value < 0) {
        jTextField1.setText("Math Error"); // Hiển thị lỗi khi nhập số âm
        return;
    }

    // Tính phần trăm (ví dụ: tính 10% của giá trị nhập vào)
    double percent = value * 0.01; // Ví dụ tính 10% của giá trị nhập vào

    // Hiển thị kết quả
    jTextField1.setText(Double.toString(percent));
    // Lưu lại phép tính vào lịch sử
    history.add(value + " * 10% = " + percent);
    updateHistoryDisplay(); // Cập nhật giao diện hiển thị lịch sử
} catch (NumberFormatException e) {
    jTextField1.setText("Invalid Input"); // Hiển thị lỗi nếu không phải là số hợp lệ
}

        
    }//GEN-LAST:event_jButtonPercActionPerformed

    private void jPanel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1AncestorAdded

    private void jButtonCanBacHaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCanBacHaiActionPerformed
        // TODO add your handling code here:
        // Lấy giá trị nhập vào từ jTextField1
    String inputText = jTextField1.getText();
    
    // Kiểm tra xem chuỗi có trống không hoặc không phải số hợp lệ
    if (inputText.trim().isEmpty()) {
        jTextField1.setText("Invalid Input");
        return;
    }
    
    try {
        // Chuyển đổi giá trị nhập vào thành số double
        double value = Double.parseDouble(inputText);

        // Kiểm tra nếu giá trị là số âm
        if (value < 0) {
            jTextField1.setText("Math Error"); // Hiển thị lỗi khi tính căn bậc hai của số âm
            return;
        }

        // Tính căn bậc hai
        double result = Math.sqrt(value);

        // Hiển thị kết quả
        jTextField1.setText(Double.toString(result));
        // Lưu lại phép tính vào lịch sử
        history.add("√" + value + " = " + result);
        updateHistoryDisplay(); // Cập nhật giao diện hiển thị lịch sử
    } catch (NumberFormatException e) {
        jTextField1.setText("Invalid Input"); // Hiển thị lỗi nếu không phải là số hợp lệ
    }
    }//GEN-LAST:event_jButtonCanBacHaiActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        showHistoryDialog();  // Gọi phương thức hiển thị lịch sử
           
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButtonBS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBS1ActionPerformed
        // TODO add your handling code here:
       String text = jTextField1.getText();
        if (!text.isEmpty()) {
            // Xóa ký tự cuối cùng và kiểm tra nếu kết quả là dấu thì tiếp tục xóa
            StringBuilder BS = new StringBuilder(text);
            BS.deleteCharAt(text.length() - 1);
            while (!BS.isEmpty() && (BS.charAt(BS.length() - 1) == '+' || BS.charAt(BS.length() - 1) == '-' || BS.charAt(BS.length() - 1) == '*' || BS.charAt(BS.length() - 1) == '/')) {
                BS.deleteCharAt(BS.length() - 1);
            }
            jTextField1.setText(BS.toString());
        }
        
    }//GEN-LAST:event_jButtonBS1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    // Hàm hiển thị lịch sử tính toán trong JDialog
    private void showHistoryDialog() {
    JDialog historyDialog = new JDialog(this, "Lịch sử tính toán", true);
    historyDialog.setSize(400, 300);  // Đặt kích thước cửa sổ
    historyDialog.setLocationRelativeTo(this);  // Đặt cửa sổ ở giữa màn hình

    // Tạo một JTextArea để hiển thị lịch sử
    JTextArea historyArea = new JTextArea();
    historyArea.setEditable(false);  // Không cho phép chỉnh sửa
    historyArea.setText(getHistoryText());  // Lấy văn bản lịch sử

    // Đặt JTextArea vào JScrollPane để có thể cuộn
    JScrollPane scrollPane = new JScrollPane(historyArea);
    historyDialog.add(scrollPane);  // Thêm JScrollPane vào JDialog

    historyDialog.setVisible(true);  // Hiển thị cửa sổ lịch sử
}

// Hàm lấy văn bản lịch sử từ ArrayList
private String getHistoryText() {
    StringBuilder historyText = new StringBuilder();
    for (String record : history) {
        historyText.append(record).append("\n");  // Mỗi phép toán một dòng
    }
    return historyText.toString();
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
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonA;
    private javax.swing.JButton jButtonBS1;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonCanBacHai;
    private javax.swing.JButton jButtonD;
    private javax.swing.JButton jButtonE;
    private javax.swing.JButton jButtonLuyThua;
    private javax.swing.JButton jButtonM;
    private javax.swing.JButton jButtonP;
    private javax.swing.JButton jButtonPerc;
    private javax.swing.JButton jButtonS;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRadioButtonOFF;
    private javax.swing.JRadioButton jRadioButtonON;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void updateHistoryDisplay() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

   
}
