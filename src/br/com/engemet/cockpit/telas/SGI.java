package br.com.engemet.cockpit.telas;

public class SGI extends javax.swing.JFrame{
    
    private String[] strCor = {"Vermelhao", "Vermelho", "Amarelo", "Verde", "Verdao"};
    
    public SGI(){
        Info.sgi = this;
        
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanelFin = new javax.swing.JPanel();
        btnFin1 = new javax.swing.JButton();
        btnFin2 = new javax.swing.JButton();
        btnFin3 = new javax.swing.JButton();
        btnFin5 = new javax.swing.JButton();
        btnFin4 = new javax.swing.JButton();
        lblTituloFin = new javax.swing.JLabel();
        lblStatusFin1 = new javax.swing.JLabel();
        lblStatusFin2 = new javax.swing.JLabel();
        lblStatusFin3 = new javax.swing.JLabel();
        lblStatusFin4 = new javax.swing.JLabel();
        lblStatusFin5 = new javax.swing.JLabel();
        jPanelCli = new javax.swing.JPanel();
        btnCli5 = new javax.swing.JButton();
        btnCli4 = new javax.swing.JButton();
        btnCli3 = new javax.swing.JButton();
        btnCli2 = new javax.swing.JButton();
        btnCli1 = new javax.swing.JButton();
        btnCli7 = new javax.swing.JButton();
        btnCli6 = new javax.swing.JButton();
        lblTituloCli = new javax.swing.JLabel();
        lblStatusCli1 = new javax.swing.JLabel();
        lblStatusCli2 = new javax.swing.JLabel();
        lblStatusCli3 = new javax.swing.JLabel();
        lblStatusCli4 = new javax.swing.JLabel();
        lblStatusCli5 = new javax.swing.JLabel();
        lblStatusCli7 = new javax.swing.JLabel();
        lblStatusCli6 = new javax.swing.JLabel();
        jPanelPro = new javax.swing.JPanel();
        btnPro5 = new javax.swing.JButton();
        btnPro4 = new javax.swing.JButton();
        btnPro3 = new javax.swing.JButton();
        btnPro2 = new javax.swing.JButton();
        btnPro1 = new javax.swing.JButton();
        btnPro7 = new javax.swing.JButton();
        btnPro6 = new javax.swing.JButton();
        lblStatusPro1 = new javax.swing.JLabel();
        lblStatusPro2 = new javax.swing.JLabel();
        lblStatusPro3 = new javax.swing.JLabel();
        lblStatusPro4 = new javax.swing.JLabel();
        lblStatusPro5 = new javax.swing.JLabel();
        lblStatusPro7 = new javax.swing.JLabel();
        lblStatusPro6 = new javax.swing.JLabel();
        lblTituloPro = new javax.swing.JLabel();
        btnPro12 = new javax.swing.JButton();
        btnPro11 = new javax.swing.JButton();
        btnPro10 = new javax.swing.JButton();
        btnPro9 = new javax.swing.JButton();
        btnPro8 = new javax.swing.JButton();
        btnPro14 = new javax.swing.JButton();
        btnPro13 = new javax.swing.JButton();
        lblStatusPro8 = new javax.swing.JLabel();
        lblStatusPro9 = new javax.swing.JLabel();
        lblStatusPro10 = new javax.swing.JLabel();
        lblStatusPro11 = new javax.swing.JLabel();
        lblStatusPro12 = new javax.swing.JLabel();
        lblStatusPro13 = new javax.swing.JLabel();
        lblStatusPro14 = new javax.swing.JLabel();
        jPanelPgt = new javax.swing.JPanel();
        btnPgt5 = new javax.swing.JButton();
        btnPgt4 = new javax.swing.JButton();
        btnPgt3 = new javax.swing.JButton();
        btnPgt2 = new javax.swing.JButton();
        btnPgt1 = new javax.swing.JButton();
        btnPgt7 = new javax.swing.JButton();
        btnPgt6 = new javax.swing.JButton();
        lblStatusPgt1 = new javax.swing.JLabel();
        lblStatusPgt2 = new javax.swing.JLabel();
        lblStatusPgt3 = new javax.swing.JLabel();
        lblStatusPgt4 = new javax.swing.JLabel();
        lblStatusPgt5 = new javax.swing.JLabel();
        lblStatusPgt7 = new javax.swing.JLabel();
        lblStatusPgt6 = new javax.swing.JLabel();
        btnPgt11 = new javax.swing.JButton();
        btnPgt10 = new javax.swing.JButton();
        btnPgt9 = new javax.swing.JButton();
        btnPgt8 = new javax.swing.JButton();
        lblStatusPgt8 = new javax.swing.JLabel();
        lblStatusPgt9 = new javax.swing.JLabel();
        lblStatusPgt10 = new javax.swing.JLabel();
        lblStatusPgt11 = new javax.swing.JLabel();
        lblTituloPgt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelFin.setBackground(new java.awt.Color(0, 0, 0));
        jPanelFin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFin1.setText("Fin1");
        btnFin1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFin1ActionPerformed(evt);
            }
        });
        jPanelFin.add(btnFin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 130, 90));

        btnFin2.setText("Fin2");
        btnFin2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFin2ActionPerformed(evt);
            }
        });
        jPanelFin.add(btnFin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 130, 90));

        btnFin3.setText("Fin3");
        btnFin3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFin3ActionPerformed(evt);
            }
        });
        jPanelFin.add(btnFin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 130, 90));

        btnFin5.setText("Fin5");
        btnFin5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFin5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFin5ActionPerformed(evt);
            }
        });
        jPanelFin.add(btnFin5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 130, 90));

        btnFin4.setText("Fin4");
        btnFin4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFin4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFin4ActionPerformed(evt);
            }
        });
        jPanelFin.add(btnFin4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 130, 90));

        lblTituloFin.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTituloFin.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloFin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloFin.setText("Finanças");
        jPanelFin.add(lblTituloFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, -1));

        lblStatusFin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelFin.add(lblStatusFin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 30, 20));

        lblStatusFin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelFin.add(lblStatusFin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 30, 20));

        lblStatusFin3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelFin.add(lblStatusFin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 30, 20));

        lblStatusFin4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelFin.add(lblStatusFin4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 30, 20));

        lblStatusFin5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelFin.add(lblStatusFin5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 30, 20));

        jPanel1.add(jPanelFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 130));

        jPanelCli.setBackground(new java.awt.Color(0, 102, 0));
        jPanelCli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCli5.setText("Cli5");
        btnCli5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCli5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCli5ActionPerformed(evt);
            }
        });
        jPanelCli.add(btnCli5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 130, 90));

        btnCli4.setText("Cli4");
        btnCli4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCli4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCli4ActionPerformed(evt);
            }
        });
        jPanelCli.add(btnCli4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 130, 90));

        btnCli3.setText("Cli3");
        btnCli3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCli3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCli3ActionPerformed(evt);
            }
        });
        jPanelCli.add(btnCli3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 130, 90));

        btnCli2.setText("Cli2");
        btnCli2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCli2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCli2ActionPerformed(evt);
            }
        });
        jPanelCli.add(btnCli2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 130, 90));

        btnCli1.setText("Cli1");
        btnCli1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCli1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCli1ActionPerformed(evt);
            }
        });
        jPanelCli.add(btnCli1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 130, 90));

        btnCli7.setText("Cli7");
        btnCli7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCli7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCli7ActionPerformed(evt);
            }
        });
        jPanelCli.add(btnCli7, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 40, 130, 90));

        btnCli6.setText("Cli6");
        btnCli6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCli6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCli6ActionPerformed(evt);
            }
        });
        jPanelCli.add(btnCli6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 130, 90));

        lblTituloCli.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTituloCli.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloCli.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloCli.setText("Clientes");
        lblTituloCli.setToolTipText("");
        jPanelCli.add(lblTituloCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, -1));

        lblStatusCli1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelCli.add(lblStatusCli1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 30, 20));

        lblStatusCli2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelCli.add(lblStatusCli2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 30, 20));

        lblStatusCli3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelCli.add(lblStatusCli3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 30, 20));

        lblStatusCli4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelCli.add(lblStatusCli4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 30, 20));

        lblStatusCli5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelCli.add(lblStatusCli5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 30, 20));

        lblStatusCli7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelCli.add(lblStatusCli7, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 30, 20));

        lblStatusCli6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelCli.add(lblStatusCli6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 30, 20));

        jPanel1.add(jPanelCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 970, -1));

        jPanelPro.setBackground(new java.awt.Color(0, 0, 204));
        jPanelPro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPro5.setText("Pro5");
        btnPro5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPro5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPro5ActionPerformed(evt);
            }
        });
        jPanelPro.add(btnPro5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 130, 90));

        btnPro4.setText("Pro4");
        btnPro4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPro4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPro4ActionPerformed(evt);
            }
        });
        jPanelPro.add(btnPro4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 130, 90));

        btnPro3.setText("Pro3");
        btnPro3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPro3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPro3ActionPerformed(evt);
            }
        });
        jPanelPro.add(btnPro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 130, 90));

        btnPro2.setText("Pro2");
        btnPro2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPro2ActionPerformed(evt);
            }
        });
        jPanelPro.add(btnPro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 130, 90));

        btnPro1.setText("Pro1");
        btnPro1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPro1ActionPerformed(evt);
            }
        });
        jPanelPro.add(btnPro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 130, 90));

        btnPro7.setText("Pro7");
        btnPro7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPro7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPro7ActionPerformed(evt);
            }
        });
        jPanelPro.add(btnPro7, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 40, 130, 90));

        btnPro6.setText("Pro6");
        btnPro6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPro6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPro6ActionPerformed(evt);
            }
        });
        jPanelPro.add(btnPro6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 130, 90));

        lblStatusPro1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelPro.add(lblStatusPro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 30, 20));

        lblStatusPro2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelPro.add(lblStatusPro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 30, 20));

        lblStatusPro3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelPro.add(lblStatusPro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 30, 20));

        lblStatusPro4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelPro.add(lblStatusPro4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 30, 20));

        lblStatusPro5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelPro.add(lblStatusPro5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 30, 20));

        lblStatusPro7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelPro.add(lblStatusPro7, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 30, 20));

        lblStatusPro6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelPro.add(lblStatusPro6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 30, 20));

        lblTituloPro.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTituloPro.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloPro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloPro.setText("Processos");
        lblTituloPro.setToolTipText("");
        jPanelPro.add(lblTituloPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, -1));

        btnPro12.setText("Pro12");
        btnPro12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPro12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPro12ActionPerformed(evt);
            }
        });
        jPanelPro.add(btnPro12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 130, 90));

        btnPro11.setText("Pro11");
        btnPro11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPro11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPro11ActionPerformed(evt);
            }
        });
        jPanelPro.add(btnPro11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 130, 90));

        btnPro10.setText("Pro10");
        btnPro10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPro10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPro10ActionPerformed(evt);
            }
        });
        jPanelPro.add(btnPro10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 130, 90));

        btnPro9.setText("Pro9");
        btnPro9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPro9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPro9ActionPerformed(evt);
            }
        });
        jPanelPro.add(btnPro9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 130, 90));

        btnPro8.setText("Pro8");
        btnPro8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPro8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPro8ActionPerformed(evt);
            }
        });
        jPanelPro.add(btnPro8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 130, 90));

        btnPro14.setText("Pro14");
        btnPro14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPro14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPro14ActionPerformed(evt);
            }
        });
        jPanelPro.add(btnPro14, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 150, 130, 90));

        btnPro13.setText("Pro13");
        btnPro13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPro13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPro13ActionPerformed(evt);
            }
        });
        jPanelPro.add(btnPro13, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 130, 90));

        lblStatusPro8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelPro.add(lblStatusPro8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 30, 20));

        lblStatusPro9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelPro.add(lblStatusPro9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 30, 20));

        lblStatusPro10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelPro.add(lblStatusPro10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 30, 20));

        lblStatusPro11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelPro.add(lblStatusPro11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 30, 20));

        lblStatusPro12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelPro.add(lblStatusPro12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 30, 20));

        lblStatusPro13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelPro.add(lblStatusPro13, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 30, 20));

        lblStatusPro14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelPro.add(lblStatusPro14, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 130, 30, 20));

        jPanel1.add(jPanelPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 970, -1));

        jPanelPgt.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPgt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPgt5.setText("Pgt5");
        btnPgt5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPgt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPgt5ActionPerformed(evt);
            }
        });
        jPanelPgt.add(btnPgt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 130, 90));

        btnPgt4.setText("Pgt4");
        btnPgt4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPgt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPgt4ActionPerformed(evt);
            }
        });
        jPanelPgt.add(btnPgt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 130, 90));

        btnPgt3.setText("Pgt3");
        btnPgt3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPgt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPgt3ActionPerformed(evt);
            }
        });
        jPanelPgt.add(btnPgt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 130, 90));

        btnPgt2.setText("Pgt2");
        btnPgt2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPgt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPgt2ActionPerformed(evt);
            }
        });
        jPanelPgt.add(btnPgt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 130, 90));

        btnPgt1.setText("Pgt1");
        btnPgt1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPgt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPgt1ActionPerformed(evt);
            }
        });
        jPanelPgt.add(btnPgt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 130, 90));

        btnPgt7.setText("Pgt7");
        btnPgt7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPgt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPgt7ActionPerformed(evt);
            }
        });
        jPanelPgt.add(btnPgt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 130, 90));

        btnPgt6.setText("Pgt6");
        btnPgt6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPgt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPgt6ActionPerformed(evt);
            }
        });
        jPanelPgt.add(btnPgt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, 130, 90));

        lblStatusPgt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelPgt.add(lblStatusPgt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 30, 20));

        lblStatusPgt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelPgt.add(lblStatusPgt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 30, 20));

        lblStatusPgt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelPgt.add(lblStatusPgt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 30, 20));

        lblStatusPgt4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelPgt.add(lblStatusPgt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 30, 20));

        lblStatusPgt5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelPgt.add(lblStatusPgt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 30, 20));

        lblStatusPgt7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelPgt.add(lblStatusPgt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 30, 20));

        lblStatusPgt6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelPgt.add(lblStatusPgt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 30, 20));

        btnPgt11.setText("Pgt11");
        btnPgt11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPgt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPgt11ActionPerformed(evt);
            }
        });
        jPanelPgt.add(btnPgt11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 130, 90));

        btnPgt10.setText("Pgt10");
        btnPgt10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPgt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPgt10ActionPerformed(evt);
            }
        });
        jPanelPgt.add(btnPgt10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 130, 90));

        btnPgt9.setText("Pgt9");
        btnPgt9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPgt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPgt9ActionPerformed(evt);
            }
        });
        jPanelPgt.add(btnPgt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 130, 90));

        btnPgt8.setText("Pgt8");
        btnPgt8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPgt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPgt8ActionPerformed(evt);
            }
        });
        jPanelPgt.add(btnPgt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 130, 90));

        lblStatusPgt8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelPgt.add(lblStatusPgt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 30, 20));

        lblStatusPgt9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelPgt.add(lblStatusPgt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 30, 20));

        lblStatusPgt10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelPgt.add(lblStatusPgt10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 30, 20));

        lblStatusPgt11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelPgt.add(lblStatusPgt11, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 130, 30, 20));

        lblTituloPgt.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTituloPgt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloPgt.setText("Pessoas, Gestão & Tecnologia");
        lblTituloPgt.setToolTipText("");
        jPanelPgt.add(lblTituloPgt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, -1));

        jPanel1.add(jPanelPgt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 970, 240));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFin4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFin4ActionPerformed
        // TODO add your handling code here:
        btnFin4.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnFin4ActionPerformed

    private void btnFin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFin1ActionPerformed
        // TODO add your handling code here:
        btnFin1.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnFin1ActionPerformed

    private void btnFin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFin2ActionPerformed
        // TODO add your handling code here:
        btnFin2.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnFin2ActionPerformed

    private void btnFin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFin3ActionPerformed
        // TODO add your handling code here:
        btnFin3.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnFin3ActionPerformed

    private void btnFin5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFin5ActionPerformed
        // TODO add your handling code here:
        btnFin5.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnFin5ActionPerformed

    private void btnCli5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCli5ActionPerformed
        // TODO add your handling code here:
        btnCli5.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnCli5ActionPerformed

    private void btnCli4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCli4ActionPerformed
        // TODO add your handling code here:
        btnCli4.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnCli4ActionPerformed

    private void btnCli3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCli3ActionPerformed
        // TODO add your handling code here:
        btnCli3.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnCli3ActionPerformed

    private void btnCli2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCli2ActionPerformed
        // TODO add your handling code here:
        btnCli2.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnCli2ActionPerformed

    private void btnCli1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCli1ActionPerformed
        // TODO add your handling code here:
        btnCli1.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnCli1ActionPerformed

    private void btnCli7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCli7ActionPerformed
        // TODO add your handling code here:
        btnCli7.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnCli7ActionPerformed

    private void btnCli6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCli6ActionPerformed
        // TODO add your handling code here:
        btnCli6.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnCli6ActionPerformed

    private void btnPro5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPro5ActionPerformed
        // TODO add your handling code here:
        btnPro5.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnPro5ActionPerformed

    private void btnPro4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPro4ActionPerformed
        // TODO add your handling code here:
        btnPro4.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnPro4ActionPerformed

    private void btnPro3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPro3ActionPerformed
        // TODO add your handling code here:
        btnPro3.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnPro3ActionPerformed

    private void btnPro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPro2ActionPerformed
        // TODO add your handling code here:
        btnPro2.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnPro2ActionPerformed

    private void btnPro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPro1ActionPerformed
        // TODO add your handling code here:
        btnPro1.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnPro1ActionPerformed

    private void btnPro7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPro7ActionPerformed
        // TODO add your handling code here:
        btnPro7.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnPro7ActionPerformed

    private void btnPro6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPro6ActionPerformed
        // TODO add your handling code here:
        btnPro6.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnPro6ActionPerformed

    private void btnPro12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPro12ActionPerformed
        // TODO add your handling code here:
        btnPro12.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnPro12ActionPerformed

    private void btnPro11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPro11ActionPerformed
        // TODO add your handling code here:
        btnPro11.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnPro11ActionPerformed

    private void btnPro10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPro10ActionPerformed
        // TODO add your handling code here:
        btnPro10.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnPro10ActionPerformed

    private void btnPro9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPro9ActionPerformed
        // TODO add your handling code here:
        btnPro9.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnPro9ActionPerformed

    private void btnPro8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPro8ActionPerformed
        // TODO add your handling code here:
        btnPro8.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnPro8ActionPerformed

    private void btnPro14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPro14ActionPerformed
        // TODO add your handling code here:
        btnPro14.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnPro14ActionPerformed

    private void btnPro13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPro13ActionPerformed
        // TODO add your handling code here:
        btnPro13.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnPro13ActionPerformed

    private void btnPgt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPgt5ActionPerformed
        // TODO add your handling code here:
        btnPgt5.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnPgt5ActionPerformed

    private void btnPgt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPgt4ActionPerformed
        // TODO add your handling code here:
        btnPgt4.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnPgt4ActionPerformed

    private void btnPgt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPgt3ActionPerformed
        // TODO add your handling code here:
        btnPgt3.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnPgt3ActionPerformed

    private void btnPgt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPgt2ActionPerformed
        // TODO add your handling code here:
        btnPgt2.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnPgt2ActionPerformed

    private void btnPgt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPgt1ActionPerformed
        // TODO add your handling code here:
        btnPgt1.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnPgt1ActionPerformed

    private void btnPgt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPgt7ActionPerformed
        // TODO add your handling code here:
        btnPgt7.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnPgt7ActionPerformed

    private void btnPgt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPgt6ActionPerformed
        // TODO add your handling code here:
        btnPgt6.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnPgt6ActionPerformed

    private void btnPgt11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPgt11ActionPerformed
        // TODO add your handling code here:
        btnPgt1.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnPgt11ActionPerformed

    private void btnPgt10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPgt10ActionPerformed
        // TODO add your handling code here:
        btnPgt10.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnPgt10ActionPerformed

    private void btnPgt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPgt9ActionPerformed
        // TODO add your handling code here:
        btnPgt9.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnPgt9ActionPerformed

    private void btnPgt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPgt8ActionPerformed
        // TODO add your handling code here:
        btnPgt8.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnPgt8ActionPerformed
    
    public void setLblStatusFin1(String cor){
        if(cor.equals(strCor[0])){
            lblStatusFin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusFin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusFin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusFin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusFin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusFin2(String cor){
        if(cor.equals(strCor[0])){
            lblStatusFin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusFin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusFin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusFin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusFin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusFin3(String cor){
        if(cor.equals(strCor[0])){
            lblStatusFin3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusFin3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusFin3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusFin3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusFin3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusFin4(String cor){
        if(cor.equals(strCor[0])){
            lblStatusFin4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusFin4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusFin4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusFin4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusFin4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusFin5(String cor){
        if(cor.equals(strCor[0])){
            lblStatusFin5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusFin5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusFin5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusFin5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusFin5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusCli1(String cor){
        if(cor.equals(strCor[0])){
            lblStatusCli1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusCli1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusCli1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusCli1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusCli1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusCli2(String cor){
        if(cor.equals(strCor[0])){
            lblStatusCli2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusCli2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusCli2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusCli2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusCli2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusCli3(String cor){
        if(cor.equals(strCor[0])){
            lblStatusCli3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusCli3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusCli3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusCli3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusCli3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusCli4(String cor){
        if(cor.equals(strCor[0])){
            lblStatusCli4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusCli4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusCli4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusCli4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusCli4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusCli5(String cor){
        if(cor.equals(strCor[0])){
            lblStatusCli5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusCli5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusCli5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusCli5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusCli5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusCli6(String cor){
        if(cor.equals(strCor[0])){
            lblStatusCli6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusCli6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusCli6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusCli6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusCli6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusCli7(String cor){
        if(cor.equals(strCor[0])){
            lblStatusCli7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusCli7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusCli7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusCli7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusCli7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }
    
    public void setLblStatusPro1(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }
    
    public void setLblStatusPro2(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }
    
    public void setLblStatusPro3(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPro3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPro3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPro3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPro3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPro3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }
    
    public void setLblStatusPro4(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPro4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPro4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPro4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPro4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPro4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }
    
    public void setLblStatusPro5(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPro5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPro5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPro5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPro5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPro5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }
    
    public void setLblStatusPro6(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPro6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPro6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPro6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPro6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPro6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }
    
    public void setLblStatusPro7(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPro7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPro7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPro7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPro7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPro7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }
    
    public void setLblStatusPro8(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPro8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPro8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPro8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPro8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPro8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }
    
    public void setLblStatusPro9(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPro9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPro9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPro9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPro9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPro9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }
    
    public void setLblStatusPro10(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPro10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPro10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPro10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPro10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPro10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }
    
    public void setLblStatusPro11(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPro11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPro11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPro11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPro11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPro11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }
    
    public void setLblStatusPro12(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPro12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPro12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPro12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPro12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPro12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }
    
    public void setLblStatusPro13(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPro13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPro13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPro13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPro13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPro13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }
    
    public void setLblStatusPro14(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPro14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPro14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPro14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPro14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPro14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }
    
    public void setLblStatusPgt1(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPgt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPgt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPgt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPgt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPgt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }
    
    public void setLblStatusPgt2(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPgt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPgt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPgt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPgt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPgt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }
    
    public void setLblStatusPgt3(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPgt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPgt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPgt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPgt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPgt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }
    
    public void setLblStatusPgt4(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPgt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPgt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPgt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPgt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPgt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }
    
    public void setLblStatusPgt5(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPgt5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPgt5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPgt5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPgt5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPgt5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }
    
    public void setLblStatusPgt6(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPgt6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPgt6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPgt6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPgt6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPgt6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }
    
    public void setLblStatusPgt7(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPgt7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPgt7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPgt7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPgt7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPgt7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }
    
    public void setLblStatusPgt8(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPgt8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPgt8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPgt8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPgt8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPgt8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }
    
    public void setLblStatusPgt9(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPgt9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPgt9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPgt9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPgt9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPgt9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }
    
    public void setLblStatusPgt10(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPgt10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPgt10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPgt10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPgt10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPgt10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }
    
    public void setLblStatusPgt11(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPgt11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPgt11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPgt11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPgt11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPgt11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCli1;
    private javax.swing.JButton btnCli2;
    private javax.swing.JButton btnCli3;
    private javax.swing.JButton btnCli4;
    private javax.swing.JButton btnCli5;
    private javax.swing.JButton btnCli6;
    private javax.swing.JButton btnCli7;
    private javax.swing.JButton btnFin1;
    private javax.swing.JButton btnFin2;
    private javax.swing.JButton btnFin3;
    private javax.swing.JButton btnFin4;
    private javax.swing.JButton btnFin5;
    private javax.swing.JButton btnPgt1;
    private javax.swing.JButton btnPgt10;
    private javax.swing.JButton btnPgt11;
    private javax.swing.JButton btnPgt2;
    private javax.swing.JButton btnPgt3;
    private javax.swing.JButton btnPgt4;
    private javax.swing.JButton btnPgt5;
    private javax.swing.JButton btnPgt6;
    private javax.swing.JButton btnPgt7;
    private javax.swing.JButton btnPgt8;
    private javax.swing.JButton btnPgt9;
    private javax.swing.JButton btnPro1;
    private javax.swing.JButton btnPro10;
    private javax.swing.JButton btnPro11;
    private javax.swing.JButton btnPro12;
    private javax.swing.JButton btnPro13;
    private javax.swing.JButton btnPro14;
    private javax.swing.JButton btnPro2;
    private javax.swing.JButton btnPro3;
    private javax.swing.JButton btnPro4;
    private javax.swing.JButton btnPro5;
    private javax.swing.JButton btnPro6;
    private javax.swing.JButton btnPro7;
    private javax.swing.JButton btnPro8;
    private javax.swing.JButton btnPro9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCli;
    private javax.swing.JPanel jPanelFin;
    private javax.swing.JPanel jPanelPgt;
    private javax.swing.JPanel jPanelPro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblStatusCli1;
    private javax.swing.JLabel lblStatusCli2;
    private javax.swing.JLabel lblStatusCli3;
    private javax.swing.JLabel lblStatusCli4;
    private javax.swing.JLabel lblStatusCli5;
    private javax.swing.JLabel lblStatusCli6;
    private javax.swing.JLabel lblStatusCli7;
    private javax.swing.JLabel lblStatusFin1;
    private javax.swing.JLabel lblStatusFin2;
    private javax.swing.JLabel lblStatusFin3;
    private javax.swing.JLabel lblStatusFin4;
    private javax.swing.JLabel lblStatusFin5;
    private javax.swing.JLabel lblStatusPgt1;
    private javax.swing.JLabel lblStatusPgt10;
    private javax.swing.JLabel lblStatusPgt11;
    private javax.swing.JLabel lblStatusPgt2;
    private javax.swing.JLabel lblStatusPgt3;
    private javax.swing.JLabel lblStatusPgt4;
    private javax.swing.JLabel lblStatusPgt5;
    private javax.swing.JLabel lblStatusPgt6;
    private javax.swing.JLabel lblStatusPgt7;
    private javax.swing.JLabel lblStatusPgt8;
    private javax.swing.JLabel lblStatusPgt9;
    private javax.swing.JLabel lblStatusPro1;
    private javax.swing.JLabel lblStatusPro10;
    private javax.swing.JLabel lblStatusPro11;
    private javax.swing.JLabel lblStatusPro12;
    private javax.swing.JLabel lblStatusPro13;
    private javax.swing.JLabel lblStatusPro14;
    private javax.swing.JLabel lblStatusPro2;
    private javax.swing.JLabel lblStatusPro3;
    private javax.swing.JLabel lblStatusPro4;
    private javax.swing.JLabel lblStatusPro5;
    private javax.swing.JLabel lblStatusPro6;
    private javax.swing.JLabel lblStatusPro7;
    private javax.swing.JLabel lblStatusPro8;
    private javax.swing.JLabel lblStatusPro9;
    private javax.swing.JLabel lblTituloCli;
    private javax.swing.JLabel lblTituloFin;
    private javax.swing.JLabel lblTituloPgt;
    private javax.swing.JLabel lblTituloPro;
    // End of variables declaration//GEN-END:variables
    
    private String nome = new String();
    
    public void setBtnFin1(String nome){
        this.nome = nome;
        this.btnFin1.setText(nome);
    }
    
    public void setBtnFin1ActionCommand(String nome){
        this.nome = nome;
        this.btnFin1.setText(nome);
    }
    
    public void setBtnFin2(String nome){
        this.nome = nome;
        this.btnFin2.setText(nome);
    }
    
    public void setBtnFin2ActionCommand(String nome){
        this.nome = nome;
        this.btnFin2.setText(nome);
    }
    
    public void setBtnFin3(String nome){
        this.nome = nome;
        this.btnFin3.setText(nome);
    }
    
    public void setBtnFin3ActionCommand(String nome){
        this.nome = nome;
        this.btnFin3.setText(nome);
    }
    
    public void setBtnFin4(String nome){
        this.nome = nome;
        this.btnFin4.setText(nome);
    }
    
    public void setBtnFin4ActionCommand(String nome){
        this.nome = nome;
        this.btnFin4.setText(nome);
    }
    
    public void setBtnFin5(String nome){
        this.nome = nome;
        this.btnFin5.setText(nome);
    }
    
    public void setBtnFin5ActionCommand(String nome){
        this.nome = nome;
        this.btnFin5.setText(nome);
    }
    
    public void setBtnCli1(String nome){
        this.nome = nome;
        this.btnCli1.setText(nome);
    }
    
    public void setBtnCli1ActionCommand(String nome){
        this.nome = nome;
        this.btnCli1.setText(nome);
    }
    
    public void setBtnCli2(String nome){
        this.nome = nome;
        this.btnCli2.setText(nome);
    }
    
    public void setBtnCli2ActionCommand(String nome){
        this.nome = nome;
        this.btnCli2.setText(nome);
    }
    
    public void setBtnCli3(String nome){
        this.nome = nome;
        this.btnCli3.setText(nome);
    }
    
    public void setBtnCli3ActionCommand(String nome){
        this.nome = nome;
        this.btnCli3.setText(nome);
    }
    
    public void setBtnCli4(String nome){
        this.nome = nome;
        this.btnCli4.setText(nome);
    }
    
    public void setBtnCli4ActionCommand(String nome){
        this.nome = nome;
        this.btnCli4.setText(nome);
    }
    
    public void setBtnCli5(String nome){
        this.nome = nome;
        this.btnCli5.setText(nome);
    }
    
    public void setBtnCli5ActionCommand(String nome){
        this.nome = nome;
        this.btnCli5.setText(nome);
    }
    
    public void setBtnCli6(String nome){
        this.nome = nome;
        this.btnCli6.setText(nome);
    }
    
    public void setBtnCli6ActionCommand(String nome){
        this.nome = nome;
        this.btnCli6.setText(nome);
    }
    
    public void setBtnCli7(String nome){
        this.nome = nome;
        this.btnCli7.setText(nome);
    }
    
    public void setBtnCli7ActionCommand(String nome){
        this.nome = nome;
        this.btnCli7.setText(nome);
    }
    
    public void setBtnPro1(String nome){
        this.nome = nome;
        this.btnPro1.setText(nome);
    }
    
    public void setBtnPro1ActionCommand(String nome){
        this.nome = nome;
        this.btnPro1.setText(nome);
    }
    
    public void setBtnPro2(String nome){
        this.nome = nome;
        this.btnPro2.setText(nome);
    }
    
    public void setBtnPro2ActionCommand(String nome){
        this.nome = nome;
        this.btnPro2.setText(nome);
    }
    
    public void setBtnPro3(String nome){
        this.nome = nome;
        this.btnPro3.setText(nome);
    }
    
    public void setBtnPro3ActionCommand(String nome){
        this.nome = nome;
        this.btnPro3.setText(nome);
    }
    
    public void setBtnPro4(String nome){
        this.nome = nome;
        this.btnPro4.setText(nome);
    }
    
    public void setBtnPro4ActionCommand(String nome){
        this.nome = nome;
        this.btnPro4.setText(nome);
    }
    
    public void setBtnPro5(String nome){
        this.nome = nome;
        this.btnPro5.setText(nome);
    }
    
    public void setBtnPro5ActionCommand(String nome){
        this.nome = nome;
        this.btnPro5.setText(nome);
    }
    
    public void setBtnPro6(String nome){
        this.nome = nome;
        this.btnPro6.setText(nome);
    }
    
    public void setBtnPro6ActionCommand(String nome){
        this.nome = nome;
        this.btnPro6.setText(nome);
    }
    
    public void setBtnPro7(String nome){
        this.nome = nome;
        this.btnPro7.setText(nome);
    }
    
    public void setBtnPro7ActionCommand(String nome){
        this.nome = nome;
        this.btnPro7.setText(nome);
    }
    
    public void setBtnPro8(String nome){
        this.nome = nome;
        this.btnPro8.setText(nome);
    }
    
    public void setBtnPro8ActionCommand(String nome){
        this.nome = nome;
        this.btnPro8.setText(nome);
    }
    
    public void setBtnPro9(String nome){
        this.nome = nome;
        this.btnPro9.setText(nome);
    }
    
    public void setBtnPro9ActionCommand(String nome){
        this.nome = nome;
        this.btnPro9.setText(nome);
    }
    
    public void setBtnPro10(String nome){
        this.nome = nome;
        this.btnPro10.setText(nome);
    }
    
    public void setBtnPro10ActionCommand(String nome){
        this.nome = nome;
        this.btnPro10.setText(nome);
    }
    
    public void setBtnPro11(String nome){
        this.nome = nome;
        this.btnPro11.setText(nome);
    }
    
    public void setBtnPro11ActionCommand(String nome){
        this.nome = nome;
        this.btnPro11.setText(nome);
    }
    
    public void setBtnPro12(String nome){
        this.nome = nome;
        this.btnPro12.setText(nome);
    }
    
    public void setBtnPro12ActionCommand(String nome){
        this.nome = nome;
        this.btnPro12.setText(nome);
    }
    
    public void setBtnPro13(String nome){
        this.nome = nome;
        this.btnPro13.setText(nome);
    }
    
    public void setBtnPro13ActionCommand(String nome){
        this.nome = nome;
        this.btnPro13.setText(nome);
    }
    
    public void setBtnPro14(String nome){
        this.nome = nome;
        this.btnPro14.setText(nome);
    }
    
    public void setBtnPro14ActionCommand(String nome){
        this.nome = nome;
        this.btnPro14.setText(nome);
    }
    
    public void setBtnPgt1(String nome){
        this.nome = nome;
        this.btnPgt1.setText(nome);
    }
    
    public void setBtnPgt1ActionCommand(String nome){
        this.nome = nome;
        this.btnPgt1.setText(nome);
    }
    
    public void setBtnPgt2(String nome){
        this.nome = nome;
        this.btnPgt2.setText(nome);
    }
    
    public void setBtnPgt2ActionCommand(String nome){
        this.nome = nome;
        this.btnPgt2.setText(nome);
    }
    
    public void setBtnPgt3(String nome){
        this.nome = nome;
        this.btnPgt3.setText(nome);
    }
    
    public void setBtnPgt3ActionCommand(String nome){
        this.nome = nome;
        this.btnPgt3.setText(nome);
    }
    
    public void setBtnPgt4(String nome){
        this.nome = nome;
        this.btnPgt4.setText(nome);
    }
    
    public void setBtnPgt4ActionCommand(String nome){
        this.nome = nome;
        this.btnPgt4.setText(nome);
    }
    
    public void setBtnPgt5(String nome){
        this.nome = nome;
        this.btnPgt5.setText(nome);
    }
    
    public void setBtnPgt5ActionCommand(String nome){
        this.nome = nome;
        this.btnPgt5.setText(nome);
    }
    
    public void setBtnPgt6(String nome){
        this.nome = nome;
        this.btnPgt6.setText(nome);
    }
    
    public void setBtnPgt6ActionCommand(String nome){
        this.nome = nome;
        this.btnPgt6.setText(nome);
    }
    
    public void setBtnPgt7(String nome){
        this.nome = nome;
        this.btnPgt7.setText(nome);
    }
    
    public void setBtnPgt7ActionCommand(String nome){
        this.nome = nome;
        this.btnPgt7.setText(nome);
    }
    
    public void setBtnPgt8(String nome){
        this.nome = nome;
        this.btnPgt8.setText(nome);
    }
    
    public void setBtnPgt8ActionCommand(String nome){
        this.nome = nome;
        this.btnPgt8.setText(nome);
    }
    
    public void setBtnPgt9(String nome){
        this.nome = nome;
        this.btnPgt9.setText(nome);
    }
    
    public void setBtnPgt9ActionCommand(String nome){
        this.nome = nome;
        this.btnPgt9.setText(nome);
    }
    
    public void setBtnPgt10(String nome){
        this.nome = nome;
        this.btnPgt10.setText(nome);
    }
    
    public void setBtnPgt10ActionCommand(String nome){
        this.nome = nome;
        this.btnPgt10.setText(nome);
    }
    
    public void setBtnPgt11(String nome){
        this.nome = nome;
        this.btnPgt11.setText(nome);
    }
    
    public void setBtnPgt11ActionCommand(String nome){
        this.nome = nome;
        this.btnPgt11.setText(nome);
    }
}
