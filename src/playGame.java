import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class playGame extends javax.swing.JFrame {

    Color color,ans1,ans2,ans3,ans4,temp1,temp2,temp3,temp4;
    int count=0;
    JButton prev[] = new JButton[80];   //10 chances
    JButton prevAns[] = new JButton[4];
    JButton prevHint[] = new JButton[4];
    int prevCount=0;
    int score=1000;
    
    String colorFilename = "/Users/aanchaldalmia/Documents/colorHighscore.txt";
    public playGame() {
        initComponents();
        this.setResizable(false);
        
        
        prev[0]=prev1;
        prev[1]=prev2;
        prev[2]=prev3;
        prev[3]=prev4;
        prev[4]=phint1;
        prev[5]=phint2;
        prev[6]=phint3;
        prev[7]=phint4;
        
        prev[8]=prev5;
        prev[9]=prev6;
        prev[10]=prev7;
        prev[11]=prev8;
        prev[12]=phint5;
        prev[13]=phint6;
        prev[14]=phint7;
        prev[15]=phint8;
        
        prev[16]=prev9;
        prev[17]=prev10;
        prev[18]=prev11;
        prev[19]=prev12;
        prev[20]=phint9;
        prev[21]=phint10;
        prev[22]=phint11;
        prev[23]=phint12;
        
        prev[24]=prev13;
        prev[25]=prev14;
        prev[26]=prev15;
        prev[27]=prev16;
        prev[28]=phint13;
        prev[29]=phint14;
        prev[30]=phint15;
        prev[31]=phint16;
        
        prev[32]=prev17;
        prev[33]=prev18;
        prev[34]=prev19;
        prev[35]=prev20;
        prev[36]=phint17;
        prev[37]=phint18;
        prev[38]=phint19;
        prev[39]=phint20;
        
        prev[40]=prev21;
        prev[41]=prev22;
        prev[42]=prev23;
        prev[43]=prev24;
        prev[44]=phint21;
        prev[45]=phint22;
        prev[46]=phint23;
        prev[47]=phint24;
        
        prev[48]=prev25;
        prev[49]=prev26;
        prev[50]=prev27;
        prev[51]=prev28;
        prev[52]=phint25;
        prev[53]=phint26;
        prev[54]=phint27;
        prev[55]=phint28;
        
        prev[56]=prev29;
        prev[57]=prev30;
        prev[58]=prev31;
        prev[59]=prev32;
        prev[60]=phint29;
        prev[61]=phint30;
        prev[62]=phint31;
        prev[63]=phint32;
       
        prev[64]=prev33;
        prev[65]=prev34;
        prev[66]=prev35;
        prev[67]=prev36;
        prev[68]=phint33;
        prev[69]=phint34;
        prev[70]=phint35;
        prev[71]=phint36;
        
        prev[72]=prev37;
        prev[73]=prev38;
        prev[74]=prev39;
        prev[75]=prev40;
        prev[76]=phint37;
        prev[77]=phint38;
        prev[78]=phint39;
        prev[79]=phint40;
        Random random = new Random();
        Color colorList[]={blueButton.getBackground(),greenButton.getBackground(),yellowButton.getBackground(),
        redButton.getBackground(),pinkButton.getBackground(),lightBlueButton.getBackground()};
        
        temp1=ans1=colorList[random.nextInt(colorList.length)];
        temp2=ans2=colorList[random.nextInt(colorList.length)];
        temp3=ans3=colorList[random.nextInt(colorList.length)];
        temp4=ans4=colorList[random.nextInt(colorList.length)];
        
        scoreDisplay.setText(score+"");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        black = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        scoreField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        pegPanel = new javax.swing.JPanel();
        redButton = new javax.swing.JButton();
        blueButton = new javax.swing.JButton();
        yellowButton = new javax.swing.JButton();
        greenButton = new javax.swing.JButton();
        pinkButton = new javax.swing.JButton();
        lightBlueButton = new javax.swing.JButton();
        guessPanel = new javax.swing.JPanel();
        guessButton1 = new javax.swing.JButton();
        guessButton2 = new javax.swing.JButton();
        guessButton3 = new javax.swing.JButton();
        guessButton4 = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        prevGuessPanel = new javax.swing.JPanel();
        prev1 = new javax.swing.JButton();
        prev2 = new javax.swing.JButton();
        prev3 = new javax.swing.JButton();
        prev4 = new javax.swing.JButton();
        prev5 = new javax.swing.JButton();
        prev6 = new javax.swing.JButton();
        prev7 = new javax.swing.JButton();
        prev8 = new javax.swing.JButton();
        prev9 = new javax.swing.JButton();
        prev10 = new javax.swing.JButton();
        prev11 = new javax.swing.JButton();
        prev12 = new javax.swing.JButton();
        prev13 = new javax.swing.JButton();
        prev14 = new javax.swing.JButton();
        prev15 = new javax.swing.JButton();
        prev16 = new javax.swing.JButton();
        prev17 = new javax.swing.JButton();
        prev18 = new javax.swing.JButton();
        prev19 = new javax.swing.JButton();
        prev20 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        phint1 = new javax.swing.JButton();
        phint3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        phint5 = new javax.swing.JButton();
        phint6 = new javax.swing.JButton();
        phint7 = new javax.swing.JButton();
        phint8 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        phint2 = new javax.swing.JButton();
        phint4 = new javax.swing.JButton();
        phint9 = new javax.swing.JButton();
        phint10 = new javax.swing.JButton();
        phint11 = new javax.swing.JButton();
        phint12 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        phint13 = new javax.swing.JButton();
        phint14 = new javax.swing.JButton();
        phint15 = new javax.swing.JButton();
        phint16 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        phint17 = new javax.swing.JButton();
        phint18 = new javax.swing.JButton();
        phint20 = new javax.swing.JButton();
        phint19 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        phint21 = new javax.swing.JButton();
        phint22 = new javax.swing.JButton();
        phint23 = new javax.swing.JButton();
        phint24 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        phint25 = new javax.swing.JButton();
        phint26 = new javax.swing.JButton();
        phint27 = new javax.swing.JButton();
        phint28 = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        phint29 = new javax.swing.JButton();
        phint30 = new javax.swing.JButton();
        phint31 = new javax.swing.JButton();
        phint32 = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        phint33 = new javax.swing.JButton();
        phint34 = new javax.swing.JButton();
        phint35 = new javax.swing.JButton();
        phint36 = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        phint37 = new javax.swing.JButton();
        phint38 = new javax.swing.JButton();
        phint39 = new javax.swing.JButton();
        phint40 = new javax.swing.JButton();
        prev21 = new javax.swing.JButton();
        prev22 = new javax.swing.JButton();
        prev23 = new javax.swing.JButton();
        prev24 = new javax.swing.JButton();
        prev25 = new javax.swing.JButton();
        prev26 = new javax.swing.JButton();
        prev27 = new javax.swing.JButton();
        prev28 = new javax.swing.JButton();
        prev29 = new javax.swing.JButton();
        prev30 = new javax.swing.JButton();
        prev31 = new javax.swing.JButton();
        prev32 = new javax.swing.JButton();
        prev33 = new javax.swing.JButton();
        prev34 = new javax.swing.JButton();
        prev35 = new javax.swing.JButton();
        prev36 = new javax.swing.JButton();
        prev37 = new javax.swing.JButton();
        prev38 = new javax.swing.JButton();
        prev39 = new javax.swing.JButton();
        prev40 = new javax.swing.JButton();
        hintPanel = new javax.swing.JPanel();
        hint1 = new javax.swing.JButton();
        hint2 = new javax.swing.JButton();
        hint3 = new javax.swing.JButton();
        hint4 = new javax.swing.JButton();
        Score = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        scoreDisplay = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        black.setText("jButton1");

        scoreField.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pegPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select your pegs", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        redButton.setBackground(new java.awt.Color(204, 0, 0));
        redButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redButtonActionPerformed(evt);
            }
        });

        blueButton.setBackground(new java.awt.Color(0, 0, 204));
        blueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueButtonActionPerformed(evt);
            }
        });

        yellowButton.setBackground(new java.awt.Color(255, 255, 0));
        yellowButton.setForeground(new java.awt.Color(255, 255, 0));
        yellowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowButtonActionPerformed(evt);
            }
        });

        greenButton.setBackground(new java.awt.Color(0, 204, 0));
        greenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenButtonActionPerformed(evt);
            }
        });

        pinkButton.setBackground(new java.awt.Color(255, 102, 153));
        pinkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinkButtonActionPerformed(evt);
            }
        });

        lightBlueButton.setBackground(new java.awt.Color(0, 204, 204));
        lightBlueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lightBlueButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout pegPanelLayout = new org.jdesktop.layout.GroupLayout(pegPanel);
        pegPanel.setLayout(pegPanelLayout);
        pegPanelLayout.setHorizontalGroup(
            pegPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pegPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .add(pegPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pegPanelLayout.createSequentialGroup()
                        .add(lightBlueButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 20, Short.MAX_VALUE)
                        .add(pinkButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(pegPanelLayout.createSequentialGroup()
                        .add(blueButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(redButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(pegPanelLayout.createSequentialGroup()
                        .add(greenButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(yellowButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pegPanelLayout.setVerticalGroup(
            pegPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pegPanelLayout.createSequentialGroup()
                .add(pegPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(redButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(blueButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pegPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(yellowButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(greenButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(pegPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(pinkButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lightBlueButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        guessPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Place your pegs", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        guessButton1.setBackground(new java.awt.Color(255, 255, 255));
        guessButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessButton1ActionPerformed(evt);
            }
        });

        guessButton2.setBackground(new java.awt.Color(255, 255, 255));
        guessButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessButton2ActionPerformed(evt);
            }
        });

        guessButton3.setBackground(new java.awt.Color(255, 255, 255));
        guessButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessButton3ActionPerformed(evt);
            }
        });

        guessButton4.setBackground(new java.awt.Color(255, 255, 255));
        guessButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessButton4ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout guessPanelLayout = new org.jdesktop.layout.GroupLayout(guessPanel);
        guessPanel.setLayout(guessPanelLayout);
        guessPanelLayout.setHorizontalGroup(
            guessPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(guessPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(guessButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(guessButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(guessButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(guessButton4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        guessPanelLayout.setVerticalGroup(
            guessPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(guessPanelLayout.createSequentialGroup()
                .add(guessPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(guessButton4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(guessButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(guessButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(guessButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(0, 15, Short.MAX_VALUE))
        );

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hints", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setText("jTextField1");

        jLabel2.setText("Color and");

        jLabel3.setText("position correct");

        jButton1.setBackground(java.awt.Color.magenta);

        jLabel1.setText("Color ");

        jLabel4.setText("correct");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel2))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel3)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel1)
                                    .add(jLabel4))))
                        .add(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 7, Short.MAX_VALUE)
                        .add(jLabel4)))
                .addContainerGap())
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Previous Guesses", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        prev1.setBackground(new java.awt.Color(255, 255, 255));

        prev2.setBackground(new java.awt.Color(255, 255, 255));

        prev3.setBackground(new java.awt.Color(255, 255, 255));

        prev4.setBackground(new java.awt.Color(255, 255, 255));

        prev5.setBackground(new java.awt.Color(255, 255, 255));

        prev6.setBackground(new java.awt.Color(255, 255, 255));

        prev7.setBackground(new java.awt.Color(255, 255, 255));

        prev8.setBackground(new java.awt.Color(255, 255, 255));

        prev9.setBackground(new java.awt.Color(255, 255, 255));

        prev10.setBackground(new java.awt.Color(255, 255, 255));

        prev11.setBackground(new java.awt.Color(255, 255, 255));

        prev12.setBackground(new java.awt.Color(255, 255, 255));

        prev13.setBackground(new java.awt.Color(255, 255, 255));

        prev14.setBackground(new java.awt.Color(255, 255, 255));

        prev15.setBackground(new java.awt.Color(255, 255, 255));

        prev16.setBackground(new java.awt.Color(255, 255, 255));

        prev17.setBackground(new java.awt.Color(255, 255, 255));

        prev18.setBackground(new java.awt.Color(255, 255, 255));

        prev19.setBackground(new java.awt.Color(255, 255, 255));

        prev20.setBackground(new java.awt.Color(255, 255, 255));

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(14, 14, 14)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jSeparator4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(phint15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(phint16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(phint13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(phint14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jSeparator3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(phint11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(phint12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(phint9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(phint10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(phint7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(phint8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(phint5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(phint6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(phint3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(phint1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(phint2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(phint4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(phint17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(phint18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(phint19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(phint20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                                .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                                                    .add(jSeparator5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                    .addContainerGap())
                                                .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                                                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                                        .add(phint21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                        .add(phint23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                                        .add(phint22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                        .add(phint24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                                    .add(20, 20, 20))
                                                .add(jPanel2Layout.createSequentialGroup()
                                                    .add(jSeparator6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                    .addContainerGap()))
                                            .add(jPanel2Layout.createSequentialGroup()
                                                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                                    .add(jPanel2Layout.createSequentialGroup()
                                                        .add(phint27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                        .add(phint28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                                    .add(jPanel2Layout.createSequentialGroup()
                                                        .add(phint25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                        .add(phint26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap()))
                                        .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .add(jSeparator7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap()))
                                    .add(jPanel2Layout.createSequentialGroup()
                                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jPanel2Layout.createSequentialGroup()
                                                .add(phint31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(phint32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                            .add(jPanel2Layout.createSequentialGroup()
                                                .add(phint29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(phint30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap()))
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .add(jSeparator8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap()))
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jPanel2Layout.createSequentialGroup()
                                        .add(phint35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(phint36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(jPanel2Layout.createSequentialGroup()
                                        .add(phint33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(phint34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap()))
                        .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                            .add(jSeparator9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(phint39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(phint40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(phint37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(phint38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(phint1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(phint2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(phint3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(phint4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(phint5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(phint6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(phint7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(phint8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(phint9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(phint10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(phint11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(phint12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(phint13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(phint14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(phint15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(phint16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(phint17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(phint18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(phint19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(phint20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(phint21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(phint22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(phint24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(phint23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(phint25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(phint26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(phint28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(phint27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(phint29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(phint30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(phint32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(phint31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(phint33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(phint34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(phint36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(phint35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(phint37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(phint38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(phint39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(phint40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        prev21.setBackground(new java.awt.Color(255, 255, 255));

        prev22.setBackground(new java.awt.Color(255, 255, 255));

        prev23.setBackground(new java.awt.Color(255, 255, 255));

        prev24.setBackground(new java.awt.Color(255, 255, 255));

        prev25.setBackground(new java.awt.Color(255, 255, 255));

        prev26.setBackground(new java.awt.Color(255, 255, 255));

        prev27.setBackground(new java.awt.Color(255, 255, 255));

        prev28.setBackground(new java.awt.Color(255, 255, 255));

        prev29.setBackground(new java.awt.Color(255, 255, 255));

        prev30.setBackground(new java.awt.Color(255, 255, 255));

        prev31.setBackground(new java.awt.Color(255, 255, 255));

        prev32.setBackground(new java.awt.Color(255, 255, 255));

        prev33.setBackground(new java.awt.Color(255, 255, 255));

        prev34.setBackground(new java.awt.Color(255, 255, 255));

        prev35.setBackground(new java.awt.Color(255, 255, 255));

        prev36.setBackground(new java.awt.Color(255, 255, 255));

        prev37.setBackground(new java.awt.Color(255, 255, 255));

        prev38.setBackground(new java.awt.Color(255, 255, 255));

        prev39.setBackground(new java.awt.Color(255, 255, 255));

        prev40.setBackground(new java.awt.Color(255, 255, 255));

        org.jdesktop.layout.GroupLayout prevGuessPanelLayout = new org.jdesktop.layout.GroupLayout(prevGuessPanel);
        prevGuessPanel.setLayout(prevGuessPanelLayout);
        prevGuessPanelLayout.setHorizontalGroup(
            prevGuessPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(prevGuessPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(prevGuessPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(prevGuessPanelLayout.createSequentialGroup()
                        .add(prev1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(12, 12, 12)
                        .add(prev2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(prev3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(prev4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(prevGuessPanelLayout.createSequentialGroup()
                        .add(prev5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(prev6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(prev7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(prev8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(prevGuessPanelLayout.createSequentialGroup()
                        .add(prev9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(prev10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(prev11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(prev12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(prevGuessPanelLayout.createSequentialGroup()
                        .add(prev13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(prev14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(prev15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(prev16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(prevGuessPanelLayout.createSequentialGroup()
                        .add(prev17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(prev18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(prev19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(prev20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(prevGuessPanelLayout.createSequentialGroup()
                        .add(prev21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(prev22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(prev23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(prev24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(prevGuessPanelLayout.createSequentialGroup()
                        .add(prev25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(prev26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(prev27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(prev28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(prevGuessPanelLayout.createSequentialGroup()
                        .add(prev29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(prev30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(prev31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(prev32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(prevGuessPanelLayout.createSequentialGroup()
                        .add(prev33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(prev34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(prev35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(prev36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(prevGuessPanelLayout.createSequentialGroup()
                        .add(prev37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(12, 12, 12)
                        .add(prev38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(prev39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(prev40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED, 46, Short.MAX_VALUE)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        prevGuessPanelLayout.setVerticalGroup(
            prevGuessPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, prevGuessPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(prevGuessPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(prev4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prev2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prev1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prev3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(26, 26, 26)
                .add(prevGuessPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(prev5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prev6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prev7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prev8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(26, 26, 26)
                .add(prevGuessPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(prev9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prev10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prev11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prev12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(26, 26, 26)
                .add(prevGuessPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(prev13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prev14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prev15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prev16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(26, 26, 26)
                .add(prevGuessPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(prev17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prev18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prev19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prev20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(27, 27, 27)
                .add(prevGuessPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(prev21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prev22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prev23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prev24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(30, 30, 30)
                .add(prevGuessPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(prev25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prev26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prev27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prev28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(29, 29, 29)
                .add(prevGuessPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(prev30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prev31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prev29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prev32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(27, 27, 27)
                .add(prevGuessPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(prev34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prev35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prev33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prev36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(27, 27, 27)
                .add(prevGuessPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(prev39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prev40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prev38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prev37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(prevGuessPanelLayout.createSequentialGroup()
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(prevGuessPanel);

        hintPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hints", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        hint1.setBackground(new java.awt.Color(255, 255, 255));

        hint2.setBackground(new java.awt.Color(255, 255, 255));

        hint3.setBackground(new java.awt.Color(255, 255, 255));

        hint4.setBackground(new java.awt.Color(255, 255, 255));

        org.jdesktop.layout.GroupLayout hintPanelLayout = new org.jdesktop.layout.GroupLayout(hintPanel);
        hintPanel.setLayout(hintPanelLayout);
        hintPanelLayout.setHorizontalGroup(
            hintPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(hintPanelLayout.createSequentialGroup()
                .add(16, 16, 16)
                .add(hintPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(hint3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(hint1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(hintPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(hint2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(hint4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        hintPanelLayout.setVerticalGroup(
            hintPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(hintPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(hintPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(hint2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(hint1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(hintPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(hint3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(hint4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Score.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Score.setText("Score");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        scoreDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        scoreDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 311, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(submitButton))
                    .add(layout.createSequentialGroup()
                        .add(15, 15, 15)
                        .add(hintPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(guessPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(49, 49, 49)
                                .add(backButton))
                            .add(layout.createSequentialGroup()
                                .add(30, 30, 30)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(pegPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(scoreDisplay, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                        .add(10, 10, 10))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(Score)
                        .add(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 332, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(16, 16, 16)
                        .add(pegPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(hintPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(guessPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(submitButton)
                            .add(backButton)))
                    .add(layout.createSequentialGroup()
                        .add(Score, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(scoreDisplay, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void redButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redButtonActionPerformed
       
        color=redButton.getBackground();
    }//GEN-LAST:event_redButtonActionPerformed

    private void blueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueButtonActionPerformed
   
        color=blueButton.getBackground();
      
    }//GEN-LAST:event_blueButtonActionPerformed

    private void guessButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessButton1ActionPerformed
     
        if(guessButton1.getBackground().equals(Color.WHITE))
            guessButton1.setBackground(color);
        else 
            guessButton1.setBackground(Color.WHITE);
    }//GEN-LAST:event_guessButton1ActionPerformed

    private void greenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenButtonActionPerformed
 
        color=greenButton.getBackground();
    }//GEN-LAST:event_greenButtonActionPerformed

    private void yellowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowButtonActionPerformed
   
        color=yellowButton.getBackground();
    }//GEN-LAST:event_yellowButtonActionPerformed

    private void lightBlueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lightBlueButtonActionPerformed
     
        color=lightBlueButton.getBackground();
    }//GEN-LAST:event_lightBlueButtonActionPerformed

    private void pinkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinkButtonActionPerformed
    
        color=pinkButton.getBackground();
    }//GEN-LAST:event_pinkButtonActionPerformed

    private void guessButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessButton2ActionPerformed
   
        if(guessButton2.getBackground().equals(Color.WHITE))
            guessButton2.setBackground(color);
        else 
            guessButton2.setBackground(Color.WHITE);
    }//GEN-LAST:event_guessButton2ActionPerformed

    private void guessButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessButton3ActionPerformed
 
        if(guessButton3.getBackground().equals(Color.WHITE))
            guessButton3.setBackground(color);
        else 
            guessButton3.setBackground(Color.WHITE);
    }//GEN-LAST:event_guessButton3ActionPerformed

    private void guessButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessButton4ActionPerformed
    
        if(guessButton4.getBackground().equals(Color.WHITE))
            guessButton4.setBackground(color);
        else 
            guessButton4.setBackground(Color.WHITE);
    }//GEN-LAST:event_guessButton4ActionPerformed

    public void setHintColor(int n,Color color)
    {
        switch(n)
        {
            case 0:
                hint1.setBackground(color);
                break;
            case 1:
                hint2.setBackground(color);
                break;
            case 2:
                hint3.setBackground(color);
                break;
            case 3:
                hint4.setBackground(color);
                break;
        }
    }
    
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
 
        if(guessButton1.getBackground().equals(Color.WHITE)||guessButton2.getBackground().equals(Color.WHITE)||
                guessButton3.getBackground().equals(Color.WHITE)||guessButton4.getBackground().equals(Color.WHITE))
            JOptionPane.showMessageDialog(this, "Guess 4 colors", "Error",JOptionPane.OK_OPTION);
        else
        {
   
            int flag1=0,flag2=0,flag3=0,flag4=0;
            ans1=temp1;
            ans2=temp2;
            ans3=temp3;
            ans4=temp4;
            ansClass ans = new ansClass(ans1,ans2,ans3,ans4);
            Random r=new Random();
            int n=r.nextInt(4);
            count++;
            hint1.setBackground(Color.WHITE);
            hint2.setBackground(Color.WHITE);
            hint3.setBackground(Color.WHITE);
            hint4.setBackground(Color.WHITE);
        
            if(guessButton1.getBackground().equals(ans1))
            {
                setHintColor(n,Color.BLACK);
                ans1=Color.WHITE;
                flag1=1;
            }
            if(guessButton2.getBackground().equals(ans2))
            {
                setHintColor((n+1)%4,Color.BLACK);
                ans2=Color.WHITE;
                flag2=1;
            }
            if(guessButton3.getBackground().equals(ans3))
            {
                setHintColor((n+2)%4,Color.BLACK);
                ans3=Color.WHITE;
                flag3=1;  
            }
            if(guessButton4.getBackground().equals(ans4))
            {
                setHintColor((n+3)%4,Color.BLACK);
                ans4=Color.WHITE;
                flag4=1;
            }
        
            if(flag1!=1)
            {
                if(guessButton1.getBackground().equals(ans2))
                {
                    setHintColor(n,Color.MAGENTA);
                    ans2=Color.WHITE;
                }
                else if(guessButton1.getBackground().equals(ans3))
                {
                    setHintColor(n,Color.MAGENTA);
                    ans3=Color.WHITE;
                }
                else if(guessButton1.getBackground().equals(ans4))
                {
                    setHintColor(n,Color.MAGENTA);
                    ans4=Color.WHITE;
                }
            }
        
            if(flag2!=1)
            {
                if(guessButton2.getBackground().equals(ans1))
                {
                    setHintColor((n+1)%4,Color.MAGENTA);
                    ans1=Color.WHITE;
                }
                else if(guessButton2.getBackground().equals(ans3))
                {   
                    setHintColor((n+1)%4,Color.MAGENTA);
                    ans3=Color.WHITE;
                }
                else if(guessButton2.getBackground().equals(ans4))
                {
                    setHintColor((n+1)%4,Color.MAGENTA);
                    ans4=Color.WHITE;
                }
            }
        
            if(flag3!=1)
            {
                if(guessButton3.getBackground().equals(ans1))
                {
                    setHintColor((n+2)%4,Color.MAGENTA);
                    ans1=Color.WHITE;
                }
                else if(guessButton3.getBackground().equals(ans2))
                {
                    setHintColor((n+2)%4,Color.MAGENTA);
                    ans2=Color.WHITE;
                }
                else if(guessButton3.getBackground().equals(ans4))
                {
                    setHintColor((n+2)%4,Color.MAGENTA);
                    ans4=Color.WHITE;
                }
            }
   
            if(flag4!=1)
            {
                if(guessButton4.getBackground().equals(ans1))
                {
                    setHintColor((n+3)%4,Color.MAGENTA);
                    ans1=Color.WHITE;
                }
                else if(guessButton4.getBackground().equals(ans2))
                {
                    setHintColor((n+3)%4,Color.MAGENTA);
                    ans2=Color.WHITE;
                }
                else if(guessButton4.getBackground().equals(ans3))
                {
                    setHintColor((n+3)%4,Color.MAGENTA);
                    ans3=Color.WHITE; 
                }
            }
        
            prevAns[0]=guessButton1;
            prevAns[1]=guessButton2;
            prevAns[2]=guessButton3;
            prevAns[3]=guessButton4;
        
            prevHint[0]=hint1;
            prevHint[1]=hint2;
            prevHint[2]=hint3;
            prevHint[3]=hint4;
           
            for(int i=0;i<4;i++)
            {
                prev[i+prevCount].setBackground(prevAns[i].getBackground());
            }
            for(int i=4;i<8;i++)
            {
                prev[i+prevCount].setBackground(prevHint[i-4].getBackground());
            }

            guessButton1.setBackground(Color.WHITE);
            guessButton2.setBackground(Color.WHITE);
            guessButton3.setBackground(Color.WHITE);
            guessButton4.setBackground(Color.WHITE);
            prevCount+=8;
        
            if(hint1.getBackground().equals(Color.BLACK)&&hint2.getBackground().equals(Color.BLACK)&&
                hint3.getBackground().equals(Color.BLACK)&&hint4.getBackground().equals(Color.BLACK))
            {
                Highscores highscore = new Highscores(score,colorFilename);
                this.dispose();    
            }
            else
            {
                score-=100;
                scoreDisplay.setText(score+"");     
            }
        
            if(count==10)
            {
                JOptionPane.showMessageDialog(this, "Game Over", null, JOptionPane.OK_OPTION);
                ans.setVisible(true);
            }   
        } 
    }//GEN-LAST:event_submitButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
       
        ColorOrShape colorOrShape = new ColorOrShape();
        this.dispose();;
        colorOrShape.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(playGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(playGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(playGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(playGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new playGame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Score;
    private javax.swing.JButton backButton;
    private javax.swing.JButton black;
    private javax.swing.JButton blueButton;
    private javax.swing.JButton greenButton;
    private javax.swing.JButton guessButton1;
    private javax.swing.JButton guessButton2;
    private javax.swing.JButton guessButton3;
    private javax.swing.JButton guessButton4;
    private javax.swing.JPanel guessPanel;
    private javax.swing.JButton hint1;
    private javax.swing.JButton hint2;
    private javax.swing.JButton hint3;
    private javax.swing.JButton hint4;
    private javax.swing.JPanel hintPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton lightBlueButton;
    private javax.swing.JPanel pegPanel;
    private javax.swing.JButton phint1;
    private javax.swing.JButton phint10;
    private javax.swing.JButton phint11;
    private javax.swing.JButton phint12;
    private javax.swing.JButton phint13;
    private javax.swing.JButton phint14;
    private javax.swing.JButton phint15;
    private javax.swing.JButton phint16;
    private javax.swing.JButton phint17;
    private javax.swing.JButton phint18;
    private javax.swing.JButton phint19;
    private javax.swing.JButton phint2;
    private javax.swing.JButton phint20;
    private javax.swing.JButton phint21;
    private javax.swing.JButton phint22;
    private javax.swing.JButton phint23;
    private javax.swing.JButton phint24;
    private javax.swing.JButton phint25;
    private javax.swing.JButton phint26;
    private javax.swing.JButton phint27;
    private javax.swing.JButton phint28;
    private javax.swing.JButton phint29;
    private javax.swing.JButton phint3;
    private javax.swing.JButton phint30;
    private javax.swing.JButton phint31;
    private javax.swing.JButton phint32;
    private javax.swing.JButton phint33;
    private javax.swing.JButton phint34;
    private javax.swing.JButton phint35;
    private javax.swing.JButton phint36;
    private javax.swing.JButton phint37;
    private javax.swing.JButton phint38;
    private javax.swing.JButton phint39;
    private javax.swing.JButton phint4;
    private javax.swing.JButton phint40;
    private javax.swing.JButton phint5;
    private javax.swing.JButton phint6;
    private javax.swing.JButton phint7;
    private javax.swing.JButton phint8;
    private javax.swing.JButton phint9;
    private javax.swing.JButton pinkButton;
    private javax.swing.JButton prev1;
    private javax.swing.JButton prev10;
    private javax.swing.JButton prev11;
    private javax.swing.JButton prev12;
    private javax.swing.JButton prev13;
    private javax.swing.JButton prev14;
    private javax.swing.JButton prev15;
    private javax.swing.JButton prev16;
    private javax.swing.JButton prev17;
    private javax.swing.JButton prev18;
    private javax.swing.JButton prev19;
    private javax.swing.JButton prev2;
    private javax.swing.JButton prev20;
    private javax.swing.JButton prev21;
    private javax.swing.JButton prev22;
    private javax.swing.JButton prev23;
    private javax.swing.JButton prev24;
    private javax.swing.JButton prev25;
    private javax.swing.JButton prev26;
    private javax.swing.JButton prev27;
    private javax.swing.JButton prev28;
    private javax.swing.JButton prev29;
    private javax.swing.JButton prev3;
    private javax.swing.JButton prev30;
    private javax.swing.JButton prev31;
    private javax.swing.JButton prev32;
    private javax.swing.JButton prev33;
    private javax.swing.JButton prev34;
    private javax.swing.JButton prev35;
    private javax.swing.JButton prev36;
    private javax.swing.JButton prev37;
    private javax.swing.JButton prev38;
    private javax.swing.JButton prev39;
    private javax.swing.JButton prev4;
    private javax.swing.JButton prev40;
    private javax.swing.JButton prev5;
    private javax.swing.JButton prev6;
    private javax.swing.JButton prev7;
    private javax.swing.JButton prev8;
    private javax.swing.JButton prev9;
    private javax.swing.JPanel prevGuessPanel;
    private javax.swing.JButton redButton;
    private javax.swing.JLabel scoreDisplay;
    private javax.swing.JTextField scoreField;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton yellowButton;
    // End of variables declaration//GEN-END:variables
}