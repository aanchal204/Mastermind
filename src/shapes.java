import java.awt.Color;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class shapes extends javax.swing.JFrame {

    String shapeFilename = "/Users/aanchaldalmia/Documents/shapeHighscore.txt";
    int score  = 1000;
    Random random;
    JLabel prev[] = new JLabel[80];             //10 chances
    JButton prevGuess[] = new JButton[4];
    JButton prevHint[] = new JButton[4];
    Icon icon;
    String buttonName;
    int  count = 0;
    int flag1, flag2, flag3, flag4;
    String ans1, ans2, ans3, ans4, temp1, temp2, temp3, temp4;

    public shapes() {
        initComponents();
 
        prev[0] = prevAns1;
        prev[1] = prevAns2;
        prev[2] = prevAns3;
        prev[3] = prevAns4;
        prev[4] = prevHint1;
        prev[5] = prevHint2;
        prev[6] = prevHint3;
        prev[7] = prevHint4;
        
        prev[8] = prevAns5;
        prev[9] = prevAns6;
        prev[10] = prevAns7;
        prev[11] = prevAns8;
        prev[12] = prevHint5;
        prev[13] = prevHint6;
        prev[14] = prevHint7;
        prev[15] = prevHint8;
        
        prev[16] = prevAns9;
        prev[17] = prevAns10;
        prev[18] = prevAns11;
        prev[19] = prevAns12;
        prev[20] = prevHint9;
        prev[21] = prevHint10;
        prev[22] = prevHint11;
        prev[23] = prevHint12;
        
        prev[24] = prevAns13;
        prev[25] = prevAns14;
        prev[26] = prevAns15;
        prev[27] = prevAns16;
        prev[28] = prevHint13;
        prev[29] = prevHint14;
        prev[30] = prevHint15;
        prev[31] = prevHint16;
        
        prev[32] = prevAns17;
        prev[33] = prevAns18;
        prev[34] = prevAns19;
        prev[35] = prevAns20;
        prev[36] = prevHint17;
        prev[37] = prevHint18;
        prev[38] = prevHint19;
        prev[39] = prevHint20;
        
        prev[40] = prevAns21;
        prev[41] = prevAns22;
        prev[42] = prevAns23;
        prev[43] = prevAns24;
        prev[44] = prevHint21;
        prev[45] = prevHint22;
        prev[46] = prevHint23;
        prev[47] = prevHint24;
        
        prev[48] = prevAns25;
        prev[49] = prevAns26;
        prev[50] = prevAns27;
        prev[51] = prevAns28;
        prev[52] = prevHint25;
        prev[53] = prevHint26;
        prev[54] = prevHint27;
        prev[55] = prevHint28;
        
        prev[56] = prevAns29;
        prev[57] = prevAns30;
        prev[58] = prevAns31;
        prev[59] = prevAns32;
        prev[60] = prevHint29;
        prev[61] = prevHint30;
        prev[62] = prevHint31;
        prev[63] = prevHint32;
        
        prev[64] = prevAns33;
        prev[65] = prevAns34;
        prev[66] = prevAns35;
        prev[67] = prevAns36;
        prev[68] = prevHint33;
        prev[69] = prevHint34;
        prev[70] = prevHint35;
        prev[71] = prevHint36;
        
        prev[72] = prevAns37;
        prev[73] = prevAns38;
        prev[74] = prevAns39;
        prev[75] = prevAns40;
        prev[76] = prevHint37;
        prev[77] = prevHint38;
        prev[78] = prevHint39;
        prev[79] = prevHint40;
        this.setBounds(50, 50, 600, 700);
        this.setBackground(Color.BLACK);
        this.setTitle("Mastermind");

        this.setResizable(true);
        redClub.setName("redClub");
        redDiamond.setName("redDiamond");
        redHeart.setName("redHeart");
        redSpade.setName("redSpade");
        blackClub.setName("blackClub");
        blackDiamond.setName("blackDiamond");
        blackHeart.setName("blackHeart");
        blackSpade.setName("blackSpade");
        guessButton1.setName("guess1");
        guessButton2.setName("guess2");
        guessButton3.setName("guess3");
        guessButton4.setName("guess4");
        hint1.setName("hint1");
        hint2.setName("hint2");
        hint3.setName("hint3");
        hint4.setName("hint4");
        random = new Random();
        String buttonList[] = {redClub.getName(), redDiamond.getName(), redHeart.getName(), redSpade.getName(), blackClub.getName(), blackDiamond.getName(), blackHeart.getName(), blackSpade.getName()};

        temp1 = ans1 = buttonList[random.nextInt(buttonList.length)];
        temp2 = ans2 = buttonList[random.nextInt(buttonList.length)];
        temp3 = ans3 = buttonList[random.nextInt(buttonList.length)];
        temp4 = ans4 = buttonList[random.nextInt(buttonList.length)];

        scoreDisplay.setText(score+"");
        System.out.println(temp1 + " " + temp2 + " " + temp3 + " " + temp4);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollPane7 = new javax.swing.JScrollPane();
        prevAn = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        prevAns = new javax.swing.JLabel();
        positionWrong1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        allCorrect = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        positionWrong = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        allWrong = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        blackClub = new javax.swing.JButton();
        blackDiamond = new javax.swing.JButton();
        blackHeart = new javax.swing.JButton();
        blackSpade = new javax.swing.JButton();
        redClub = new javax.swing.JButton();
        redDiamond = new javax.swing.JButton();
        redHeart = new javax.swing.JButton();
        redSpade = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        guessButton1 = new javax.swing.JButton();
        guessButton2 = new javax.swing.JButton();
        guessButton3 = new javax.swing.JButton();
        guessButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        hint1 = new javax.swing.JButton();
        hint2 = new javax.swing.JButton();
        hint3 = new javax.swing.JButton();
        hint4 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        prevAns1 = new javax.swing.JLabel();
        prevAns2 = new javax.swing.JLabel();
        prevAns3 = new javax.swing.JLabel();
        prevAns4 = new javax.swing.JLabel();
        prevHint1 = new javax.swing.JLabel();
        prevHint2 = new javax.swing.JLabel();
        prevHint3 = new javax.swing.JLabel();
        prevHint4 = new javax.swing.JLabel();
        prevAns5 = new javax.swing.JLabel();
        prevAns6 = new javax.swing.JLabel();
        prevAns7 = new javax.swing.JLabel();
        prevAns8 = new javax.swing.JLabel();
        prevHint5 = new javax.swing.JLabel();
        prevHint6 = new javax.swing.JLabel();
        prevHint7 = new javax.swing.JLabel();
        prevHint8 = new javax.swing.JLabel();
        prevAns9 = new javax.swing.JLabel();
        prevAns10 = new javax.swing.JLabel();
        prevAns11 = new javax.swing.JLabel();
        prevAns12 = new javax.swing.JLabel();
        prevHint9 = new javax.swing.JLabel();
        prevHint10 = new javax.swing.JLabel();
        prevHint11 = new javax.swing.JLabel();
        prevHint12 = new javax.swing.JLabel();
        prevAns13 = new javax.swing.JLabel();
        prevAns14 = new javax.swing.JLabel();
        prevAns15 = new javax.swing.JLabel();
        prevAns16 = new javax.swing.JLabel();
        prevHint13 = new javax.swing.JLabel();
        prevHint14 = new javax.swing.JLabel();
        prevHint15 = new javax.swing.JLabel();
        prevHint16 = new javax.swing.JLabel();
        prevAns17 = new javax.swing.JLabel();
        prevAns18 = new javax.swing.JLabel();
        prevAns19 = new javax.swing.JLabel();
        prevAns20 = new javax.swing.JLabel();
        prevHint18 = new javax.swing.JLabel();
        prevHint19 = new javax.swing.JLabel();
        prevHint20 = new javax.swing.JLabel();
        prevHint17 = new javax.swing.JLabel();
        prevAns21 = new javax.swing.JLabel();
        prevAns22 = new javax.swing.JLabel();
        prevAns23 = new javax.swing.JLabel();
        prevAns24 = new javax.swing.JLabel();
        prevHint21 = new javax.swing.JLabel();
        prevHint22 = new javax.swing.JLabel();
        prevHint23 = new javax.swing.JLabel();
        prevHint24 = new javax.swing.JLabel();
        prevAns25 = new javax.swing.JLabel();
        prevAns26 = new javax.swing.JLabel();
        prevAns27 = new javax.swing.JLabel();
        prevAns28 = new javax.swing.JLabel();
        prevHint25 = new javax.swing.JLabel();
        prevHint26 = new javax.swing.JLabel();
        prevHint27 = new javax.swing.JLabel();
        prevHint28 = new javax.swing.JLabel();
        prevAns29 = new javax.swing.JLabel();
        prevAns30 = new javax.swing.JLabel();
        prevAns31 = new javax.swing.JLabel();
        prevAns32 = new javax.swing.JLabel();
        prevHint29 = new javax.swing.JLabel();
        prevHint30 = new javax.swing.JLabel();
        prevHint31 = new javax.swing.JLabel();
        prevHint32 = new javax.swing.JLabel();
        prevAns33 = new javax.swing.JLabel();
        prevAns34 = new javax.swing.JLabel();
        prevAns35 = new javax.swing.JLabel();
        prevAns36 = new javax.swing.JLabel();
        prevHint33 = new javax.swing.JLabel();
        prevHint34 = new javax.swing.JLabel();
        prevHint35 = new javax.swing.JLabel();
        prevHint36 = new javax.swing.JLabel();
        prevAns37 = new javax.swing.JLabel();
        prevAns38 = new javax.swing.JLabel();
        prevAns39 = new javax.swing.JLabel();
        prevAns40 = new javax.swing.JLabel();
        prevHint37 = new javax.swing.JLabel();
        prevHint38 = new javax.swing.JLabel();
        prevHint39 = new javax.swing.JLabel();
        prevHint40 = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();
        scoreDisplay = new javax.swing.JLabel();

        prevAn.setBounds(new java.awt.Rectangle(0, 0, 50, 50));
        jScrollPane7.setViewportView(prevAn);

        prevAns.setBounds(new java.awt.Rectangle(0, 0, 50, 50));
        jScrollPane6.setViewportView(prevAns);

        positionWrong1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orangetick.jpg"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("correct. Position wrong");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Shape and color");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hints", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18))); // NOI18N

        allCorrect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/greentick.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("All correct");

        positionWrong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orangetick.jpg"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Position wrong");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("All wrong");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(allCorrect, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(46, 46, 46)
                        .add(jLabel1))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(positionWrong, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jLabel3))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(allWrong, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(45, 45, 45)
                        .add(jLabel5)))
                .add(0, 9, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(17, 17, 17)
                        .add(allCorrect, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(32, 32, 32)
                        .add(jLabel1)))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(positionWrong, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(allWrong, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(9, 9, 9)
                        .add(jLabel5))))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select your pegs", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18))); // NOI18N

        blackClub.setBackground(new java.awt.Color(255, 255, 255));
        blackClub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackclub.jpg"))); // NOI18N
        blackClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackClubActionPerformed(evt);
            }
        });

        blackDiamond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackdiamond.jpg"))); // NOI18N
        blackDiamond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackDiamondActionPerformed(evt);
            }
        });

        blackHeart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackheart.jpg"))); // NOI18N
        blackHeart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackHeartActionPerformed(evt);
            }
        });

        blackSpade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackspade.jpg"))); // NOI18N
        blackSpade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackSpadeActionPerformed(evt);
            }
        });

        redClub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redclub.jpg"))); // NOI18N
        redClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redClubActionPerformed(evt);
            }
        });

        redDiamond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reddiamond.jpg"))); // NOI18N
        redDiamond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redDiamondActionPerformed(evt);
            }
        });

        redHeart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redheart.jpg"))); // NOI18N
        redHeart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redHeartActionPerformed(evt);
            }
        });

        redSpade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redspade.jpg"))); // NOI18N
        redSpade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redSpadeActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(blackClub, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(redClub, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(redDiamond, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(redHeart, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(redSpade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(blackDiamond, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(blackHeart, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(blackSpade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(blackSpade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(blackDiamond, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(blackClub, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(blackHeart, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(redClub, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(redHeart, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(redSpade, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(redDiamond, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        );

        submit.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        guessButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessButton1ActionPerformed(evt);
            }
        });

        guessButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessButton2ActionPerformed(evt);
            }
        });

        guessButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessButton3ActionPerformed(evt);
            }
        });

        guessButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessButton4ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hints", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18))); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(12, 12, 12)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(hint1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(hint2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(hint3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(hint4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, hint1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, hint2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(hint3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(hint4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(8, 8, 8))
        );

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Previous Guesses", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18))); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jPanel4Layout.createSequentialGroup()
                                    .add(12, 12, 12)
                                    .add(prevHint1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .add(prevAns1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(prevAns9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(prevHint5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(prevHint9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(prevAns13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(prevHint13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(prevAns17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, prevHint17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, prevAns21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, prevHint21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, prevAns25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, prevHint25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(prevHint29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(prevAns29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(prevAns2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(prevAns10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(prevHint10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(prevAns14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(prevAns18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(prevHint18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(prevAns22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(prevHint22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(prevAns26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(prevHint26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel4Layout.createSequentialGroup()
                                .add(6, 6, 6)
                                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(prevAns30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(prevHint14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(prevAns6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(prevHint2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(prevHint6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(prevHint30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(12, 12, 12)
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(prevAns5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel4Layout.createSequentialGroup()
                                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(prevHint33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(prevAns33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(prevAns37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(prevHint37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(prevAns34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(prevHint34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(prevAns38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(prevHint38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(jPanel4Layout.createSequentialGroup()
                            .add(6, 6, 6)
                            .add(prevAns3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(prevAns4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4Layout.createSequentialGroup()
                            .add(prevHint3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(prevHint4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(jPanel4Layout.createSequentialGroup()
                            .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jPanel4Layout.createSequentialGroup()
                                    .add(6, 6, 6)
                                    .add(prevAns7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(prevHint7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(prevAns11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(prevAns8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(prevHint8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(prevAns12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(prevAns15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(prevAns16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(prevHint11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(prevHint12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(prevHint15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(prevHint16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(prevAns19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(prevAns20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(prevHint19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(prevHint20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(prevAns23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(prevAns24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(prevHint23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(prevHint24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(prevAns27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(prevAns28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(prevHint27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(prevHint28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(prevAns31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(prevAns32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(prevHint31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(prevHint32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(prevAns35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(prevAns36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(prevHint35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(prevHint36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(prevAns39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(prevAns40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(prevHint39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(prevHint40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(prevAns4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(prevAns3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(prevAns2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(prevAns1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(prevHint2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevHint3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevHint4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevHint1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(prevAns5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(prevAns6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(prevAns8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(prevHint6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(prevHint5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(prevHint7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(jPanel4Layout.createSequentialGroup()
                                .add(6, 6, 6)
                                .add(prevHint8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(prevAns7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(prevAns9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevAns10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevAns11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevAns12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(prevHint12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevHint11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevHint9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevHint10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(prevAns13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevAns14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevAns15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevAns16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(prevHint13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevHint14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevHint15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevHint16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(prevAns17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevAns18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevAns19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevAns20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(prevHint17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevHint18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevHint19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevHint20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(prevAns21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevAns22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevAns23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevAns24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(prevHint21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevHint22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevHint23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevHint24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(prevAns25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(prevAns26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(prevHint26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(prevHint25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel4Layout.createSequentialGroup()
                            .add(prevAns28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(prevHint28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel4Layout.createSequentialGroup()
                            .add(prevAns27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(prevHint27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(prevAns29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevAns30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevAns31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevAns32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(prevHint29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevHint30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevHint31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevHint32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(prevAns33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevAns34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevAns35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevAns36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(prevHint33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevHint34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevHint35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevHint36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(prevAns38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevAns40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevAns39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevAns37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(prevHint37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevHint38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevHint39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(prevHint40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel4);

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 268, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 370, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scoreLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        scoreLabel.setText("Score");

        scoreDisplay.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        scoreDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(96, 96, 96)
                                .add(submit))
                            .add(layout.createSequentialGroup()
                                .add(30, 30, 30)
                                .add(guessButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(guessButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(guessButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(guessButton4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(27, 27, 27)
                        .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(12, 12, 12)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createSequentialGroup()
                                        .add(18, 18, 18)
                                        .add(backButton))
                                    .add(scoreDisplay, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(layout.createSequentialGroup()
                                .add(38, 38, 38)
                                .add(scoreLabel)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(12, 12, 12)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(27, 27, 27)
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(74, 74, 74)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(guessButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(guessButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(guessButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(guessButton4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(submit)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(scoreLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(scoreDisplay, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(40, 40, 40)
                                .add(backButton))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void blackDiamondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackDiamondActionPerformed

        buttonName = blackDiamond.getName();
        icon = blackDiamond.getIcon();
    }//GEN-LAST:event_blackDiamondActionPerformed

    private void blackHeartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackHeartActionPerformed

        buttonName = blackHeart.getName();
        icon = blackHeart.getIcon();
    }//GEN-LAST:event_blackHeartActionPerformed

    private void redDiamondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redDiamondActionPerformed

        buttonName = redDiamond.getName();
        icon = redDiamond.getIcon();
    }//GEN-LAST:event_redDiamondActionPerformed

    private void blackClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackClubActionPerformed
       
        buttonName = blackClub.getName();
        icon = blackClub.getIcon();
    }//GEN-LAST:event_blackClubActionPerformed

    private void guessButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessButton1ActionPerformed

        guessButton1.setIcon(icon);
        guessButton1.setName(buttonName);
    }//GEN-LAST:event_guessButton1ActionPerformed

    private void redClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redClubActionPerformed
 
        buttonName = redClub.getName();
        icon = redClub.getIcon();
    }//GEN-LAST:event_redClubActionPerformed

    private void blackSpadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackSpadeActionPerformed

        buttonName = blackSpade.getName();
        icon = blackSpade.getIcon();
    }//GEN-LAST:event_blackSpadeActionPerformed

    private void redHeartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redHeartActionPerformed
 
        buttonName = redHeart.getName();
        icon = redHeart.getIcon();
    }//GEN-LAST:event_redHeartActionPerformed

    private void redSpadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redSpadeActionPerformed
        // TODO add your handling code here:

        buttonName = redSpade.getName();
        icon = redSpade.getIcon();
    }//GEN-LAST:event_redSpadeActionPerformed

    private void guessButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessButton2ActionPerformed
 
        guessButton2.setIcon(icon);
        guessButton2.setName(buttonName);
    }//GEN-LAST:event_guessButton2ActionPerformed

    private void guessButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessButton3ActionPerformed
        // TODO add your handling code here:

        guessButton3.setIcon(icon);
        guessButton3.setName(buttonName);
    }//GEN-LAST:event_guessButton3ActionPerformed

    private void guessButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessButton4ActionPerformed
        
        guessButton4.setIcon(icon);
        guessButton4.setName(buttonName);
    }//GEN-LAST:event_guessButton4ActionPerformed

    public void isPositionWrong(JButton button,int n)
    {
        switch(n)
        {
        case 1:
        if(button.getName().equals(ans2)||button.getName().equals(ans3)||button.getName().equals(ans4))
        { 
            hint1.setIcon(positionWrong1.getIcon());
            if(button.getName().equals(ans2))
                ans2="";
            else if(button.getName().equals(ans3))
                ans3="";
            else
                ans4="";
            flag1=1;
        }
        break;
                
        case 2:
        if(button.getName().equals(ans1)||button.getName().equals(ans3)||button.getName().equals(ans4))
        {
            hint2.setIcon(positionWrong1.getIcon());
            if(button.getName().equals(ans1))
                ans1="";
            else if(button.getName().equals(ans3))
                ans3="";
            else
                ans4="";
            flag2=1;
        }
        break;
                
        case 3:
        if(button.getName().equals(ans1)||button.getName().equals(ans2)||button.getName().equals(ans4))
        {
            hint3.setIcon(positionWrong1.getIcon());
            if(button.getName().equals(ans1))
                ans1="";
            else if(button.getName().equals(ans2))
                ans2="";
            else 
                ans4="";
            flag3=1;
        }
        break;
                
        case 4:
        if(button.getName().equals(ans1)||button.getName().equals(ans2)||button.getName().equals(ans3))
        {
            hint4.setIcon(positionWrong1.getIcon());
            if(button.getName().equals(ans1))
                ans1="";
            else if(button.getName().equals(ans2))
                ans2="";
            else
                ans3="";
            flag4=1;
        }
        break;
        }
     }
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed

        int n = random.nextInt(4);
        System.out.println(n);
        hint1.setIcon(null);
        hint2.setIcon(null);
        hint3.setIcon(null);
        hint4.setIcon(null);
        hint1.setName("");
        hint2.setName("");
        hint3.setName("");
        hint4.setName("");
        ans1 = temp1;
        ans2 = temp2;
        ans3 = temp3;
        ans4 = temp4;
 
        if (guessButton1.getName().equals("guess1") || guessButton2.getName().equals("guess2") || guessButton3.getName().equals("guess3") || guessButton4.getName().equals("guess4")) {
            JOptionPane.showMessageDialog(this, "Guess 4 pegs", "Error", JOptionPane.OK_OPTION);
        } 
        else {


            flag1 = flag2 = flag3 = flag4 = 0;
            if (guessButton1.getName().equals(ans1)) {

                hint1.setIcon(allCorrect.getIcon());
                hint1.setName(allCorrect.getName());
                ans1 = "";
                flag1 = 1;
            }
            if (guessButton2.getName().equals(ans2)) {
                hint2.setIcon(allCorrect.getIcon());
                hint2.setName(allCorrect.getName());
                ans2 = "";
                flag2 = 1;
            }
            if (guessButton3.getName().equals(ans3)) {
                hint3.setIcon(allCorrect.getIcon());
                hint3.setName(allCorrect.getName());
                ans3 = "";
                flag3 = 1;
            }
            if (guessButton4.getName().equals(ans4)) {
                hint4.setIcon(allCorrect.getIcon());
                hint4.setName(allCorrect.getName());
                ans4 = "";
                flag4 = 1;
            }
            if(flag1==1&&flag2==1&&flag3==1&&flag4==1)
            {
                Highscores highscore = new Highscores(score,shapeFilename);
                this.dispose();
            } 
            else 
            {
                if (flag1 != 1) {
                    isPositionWrong(guessButton1,1);
                }
                if (flag2 != 1) {
                    isPositionWrong(guessButton2,2);
                }
                if (flag3 != 1) {
                    isPositionWrong(guessButton3,3);
                }
                if (flag4 != 1) {
                    isPositionWrong(guessButton4,4);
                }
            }

            prevGuess[0] = guessButton1;
            prevGuess[1] = guessButton2;
            prevGuess[2] = guessButton3;
            prevGuess[3] = guessButton4;
            prevHint[0] = hint1;
            prevHint[1] = hint2;
            prevHint[2] = hint3;
            prevHint[3] = hint4;
            for (int i = 0; i < 4; i++) {
                prev[count + i].setIcon(prevGuess[i].getIcon());
            }
            for (int i = 4; i < 8; i++) {
                prev[count + i].setIcon(prevHint[i - 4].getIcon());
            }

            guessButton1.setIcon(null);
            guessButton2.setIcon(null);
            guessButton3.setIcon(null);
            guessButton4.setIcon(null);
            count += 8;;
            
            score-=100;
            scoreDisplay.setText(score+"");
        }
    }//GEN-LAST:event_submitActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
       
        ColorOrShape colorOrShape = new ColorOrShape();
        this.dispose();
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
            java.util.logging.Logger.getLogger(shapes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(shapes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(shapes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(shapes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new shapes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allCorrect;
    private javax.swing.JButton allWrong;
    private javax.swing.JButton backButton;
    private javax.swing.JButton blackClub;
    private javax.swing.JButton blackDiamond;
    private javax.swing.JButton blackHeart;
    private javax.swing.JButton blackSpade;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton guessButton1;
    private javax.swing.JButton guessButton2;
    private javax.swing.JButton guessButton3;
    private javax.swing.JButton guessButton4;
    private javax.swing.JButton hint1;
    private javax.swing.JButton hint2;
    private javax.swing.JButton hint3;
    private javax.swing.JButton hint4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JButton positionWrong;
    private javax.swing.JButton positionWrong1;
    private javax.swing.JLabel prevAn;
    private javax.swing.JLabel prevAns;
    private javax.swing.JLabel prevAns1;
    private javax.swing.JLabel prevAns10;
    private javax.swing.JLabel prevAns11;
    private javax.swing.JLabel prevAns12;
    private javax.swing.JLabel prevAns13;
    private javax.swing.JLabel prevAns14;
    private javax.swing.JLabel prevAns15;
    private javax.swing.JLabel prevAns16;
    private javax.swing.JLabel prevAns17;
    private javax.swing.JLabel prevAns18;
    private javax.swing.JLabel prevAns19;
    private javax.swing.JLabel prevAns2;
    private javax.swing.JLabel prevAns20;
    private javax.swing.JLabel prevAns21;
    private javax.swing.JLabel prevAns22;
    private javax.swing.JLabel prevAns23;
    private javax.swing.JLabel prevAns24;
    private javax.swing.JLabel prevAns25;
    private javax.swing.JLabel prevAns26;
    private javax.swing.JLabel prevAns27;
    private javax.swing.JLabel prevAns28;
    private javax.swing.JLabel prevAns29;
    private javax.swing.JLabel prevAns3;
    private javax.swing.JLabel prevAns30;
    private javax.swing.JLabel prevAns31;
    private javax.swing.JLabel prevAns32;
    private javax.swing.JLabel prevAns33;
    private javax.swing.JLabel prevAns34;
    private javax.swing.JLabel prevAns35;
    private javax.swing.JLabel prevAns36;
    private javax.swing.JLabel prevAns37;
    private javax.swing.JLabel prevAns38;
    private javax.swing.JLabel prevAns39;
    private javax.swing.JLabel prevAns4;
    private javax.swing.JLabel prevAns40;
    private javax.swing.JLabel prevAns5;
    private javax.swing.JLabel prevAns6;
    private javax.swing.JLabel prevAns7;
    private javax.swing.JLabel prevAns8;
    private javax.swing.JLabel prevAns9;
    private javax.swing.JLabel prevHint1;
    private javax.swing.JLabel prevHint10;
    private javax.swing.JLabel prevHint11;
    private javax.swing.JLabel prevHint12;
    private javax.swing.JLabel prevHint13;
    private javax.swing.JLabel prevHint14;
    private javax.swing.JLabel prevHint15;
    private javax.swing.JLabel prevHint16;
    private javax.swing.JLabel prevHint17;
    private javax.swing.JLabel prevHint18;
    private javax.swing.JLabel prevHint19;
    private javax.swing.JLabel prevHint2;
    private javax.swing.JLabel prevHint20;
    private javax.swing.JLabel prevHint21;
    private javax.swing.JLabel prevHint22;
    private javax.swing.JLabel prevHint23;
    private javax.swing.JLabel prevHint24;
    private javax.swing.JLabel prevHint25;
    private javax.swing.JLabel prevHint26;
    private javax.swing.JLabel prevHint27;
    private javax.swing.JLabel prevHint28;
    private javax.swing.JLabel prevHint29;
    private javax.swing.JLabel prevHint3;
    private javax.swing.JLabel prevHint30;
    private javax.swing.JLabel prevHint31;
    private javax.swing.JLabel prevHint32;
    private javax.swing.JLabel prevHint33;
    private javax.swing.JLabel prevHint34;
    private javax.swing.JLabel prevHint35;
    private javax.swing.JLabel prevHint36;
    private javax.swing.JLabel prevHint37;
    private javax.swing.JLabel prevHint38;
    private javax.swing.JLabel prevHint39;
    private javax.swing.JLabel prevHint4;
    private javax.swing.JLabel prevHint40;
    private javax.swing.JLabel prevHint5;
    private javax.swing.JLabel prevHint6;
    private javax.swing.JLabel prevHint7;
    private javax.swing.JLabel prevHint8;
    private javax.swing.JLabel prevHint9;
    private javax.swing.JButton redClub;
    private javax.swing.JButton redDiamond;
    private javax.swing.JButton redHeart;
    private javax.swing.JButton redSpade;
    private javax.swing.JLabel scoreDisplay;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}