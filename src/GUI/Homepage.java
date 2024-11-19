package GUI;

public class Homepage extends javax.swing.JFrame {

    public Homepage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Subjects = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        to_do = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        notifications = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        about = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        about_panel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        about_button = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        mission_panel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        aboutinfo_panel = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        todo_panel = new javax.swing.JPanel();
        notifications_panel = new javax.swing.JPanel();
        Subjects_panels = new javax.swing.JPanel();
        subjectbtn6 = new javax.swing.JButton();
        subjectbtn5 = new javax.swing.JButton();
        subjectbtn3 = new javax.swing.JButton();
        subjectbtn7 = new javax.swing.JButton();
        subjectbtn1 = new javax.swing.JButton();
        subjectbtn2 = new javax.swing.JButton();
        subjectbtn4 = new javax.swing.JButton();
        subjectbtn8 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/banner (3).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Subjects.setBackground(new java.awt.Color(247, 247, 247));
        Subjects.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        Subjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubjectsMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Subjects");

        javax.swing.GroupLayout SubjectsLayout = new javax.swing.GroupLayout(Subjects);
        Subjects.setLayout(SubjectsLayout);
        SubjectsLayout.setHorizontalGroup(
            SubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubjectsLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SubjectsLayout.setVerticalGroup(
            SubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        to_do.setBackground(new java.awt.Color(247, 247, 247));
        to_do.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        to_do.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                to_doMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("To do");

        javax.swing.GroupLayout to_doLayout = new javax.swing.GroupLayout(to_do);
        to_do.setLayout(to_doLayout);
        to_doLayout.setHorizontalGroup(
            to_doLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(to_doLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        to_doLayout.setVerticalGroup(
            to_doLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        notifications.setBackground(new java.awt.Color(247, 247, 247));
        notifications.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        notifications.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notificationsMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Notifications");

        javax.swing.GroupLayout notificationsLayout = new javax.swing.GroupLayout(notifications);
        notifications.setLayout(notificationsLayout);
        notificationsLayout.setHorizontalGroup(
            notificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, notificationsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(43, 43, 43))
        );
        notificationsLayout.setVerticalGroup(
            notificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        about.setBackground(new java.awt.Color(255, 255, 255));
        about.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("About");

        javax.swing.GroupLayout aboutLayout = new javax.swing.GroupLayout(about);
        about.setLayout(aboutLayout);
        aboutLayout.setHorizontalGroup(
            aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aboutLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        aboutLayout.setVerticalGroup(
            aboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Untitled design.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setPreferredSize(new java.awt.Dimension(50, 42));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(about, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(notifications, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(to_do, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Subjects, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Subjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(to_do, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(notifications, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(about, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        about_panel.setBackground(new java.awt.Color(255, 255, 255));
        about_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        about_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gmailfr.png"))); // NOI18N
        about_panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 100, 90));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/encryptedfr.png"))); // NOI18N
        about_panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 160, 150));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/searchfr.png"))); // NOI18N
        about_panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 100, 110));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/serverfr.png"))); // NOI18N
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        about_panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 100, 100));

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 0), null));

        about_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                about_buttonMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("About");

        javax.swing.GroupLayout about_buttonLayout = new javax.swing.GroupLayout(about_button);
        about_button.setLayout(about_buttonLayout);
        about_buttonLayout.setHorizontalGroup(
            about_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(about_buttonLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel10)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        about_buttonLayout.setVerticalGroup(
            about_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(about_buttonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Mission");

        javax.swing.GroupLayout mission_panelLayout = new javax.swing.GroupLayout(mission_panel);
        mission_panel.setLayout(mission_panelLayout);
        mission_panelLayout.setHorizontalGroup(
            mission_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mission_panelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel11)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        mission_panelLayout.setVerticalGroup(
            mission_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mission_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Vission");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel12)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Privacy");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel13)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(about_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mission_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(438, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(about_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mission_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        about_panel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 750, -1));

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));

        jPanel7.setBackground(new java.awt.Color(255, 255, 204));

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));

        aboutinfo_panel.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField1.setText("Purpose and Objectives");
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setText("                It is a  comprehensive tool designed to assist  educational institutions in streamlining their administrative processes. This system  ");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setText("simplifies record keeping by providing an intuitive platform for managing students, data, grades, and records efficiently. ");
        jTextField3.setBorder(null);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField4.setText("About Class Record Management System");
        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setText("                The primary goal of the system is to enhance the accuracy and accessibility of class records. It empowers educators to focus more");
        jTextField5.setBorder(null);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setText("on teaching while ensuring that essential records are  maintained securely and professionaly.");
        jTextField6.setBorder(null);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout aboutinfo_panelLayout = new javax.swing.GroupLayout(aboutinfo_panel);
        aboutinfo_panel.setLayout(aboutinfo_panelLayout);
        aboutinfo_panelLayout.setHorizontalGroup(
            aboutinfo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutinfo_panelLayout.createSequentialGroup()
                .addGroup(aboutinfo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aboutinfo_panelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(aboutinfo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3)
                            .addGroup(aboutinfo_panelLayout.createSequentialGroup()
                                .addGroup(aboutinfo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(aboutinfo_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField2))
                    .addGroup(aboutinfo_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(aboutinfo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(aboutinfo_panelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE))))
                .addContainerGap())
        );
        aboutinfo_panelLayout.setVerticalGroup(
            aboutinfo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutinfo_panelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aboutinfo_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aboutinfo_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        about_panel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 220, 760, 220));

        todo_panel.setBackground(new java.awt.Color(102, 204, 0));
        todo_panel.setPreferredSize(new java.awt.Dimension(803, 462));

        javax.swing.GroupLayout todo_panelLayout = new javax.swing.GroupLayout(todo_panel);
        todo_panel.setLayout(todo_panelLayout);
        todo_panelLayout.setHorizontalGroup(
            todo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 803, Short.MAX_VALUE)
        );
        todo_panelLayout.setVerticalGroup(
            todo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
        );

        notifications_panel.setBackground(new java.awt.Color(204, 204, 204));
        notifications_panel.setPreferredSize(new java.awt.Dimension(803, 462));

        javax.swing.GroupLayout notifications_panelLayout = new javax.swing.GroupLayout(notifications_panel);
        notifications_panel.setLayout(notifications_panelLayout);
        notifications_panelLayout.setHorizontalGroup(
            notifications_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 803, Short.MAX_VALUE)
        );
        notifications_panelLayout.setVerticalGroup(
            notifications_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
        );

        Subjects_panels.setBackground(new java.awt.Color(255, 255, 255));
        Subjects_panels.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Subjects_panels.setPreferredSize(new java.awt.Dimension(985, 544));
        Subjects_panels.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subjectbtn6.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        subjectbtn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/folder (1).png"))); // NOI18N
        subjectbtn6.setText("OOP");
        subjectbtn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        subjectbtn6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        subjectbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectbtn6ActionPerformed(evt);
            }
        });
        Subjects_panels.add(subjectbtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, 140));

        subjectbtn5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        subjectbtn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/folder (1).png"))); // NOI18N
        subjectbtn5.setText("PHYSICS");
        subjectbtn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        subjectbtn5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        subjectbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectbtn5ActionPerformed(evt);
            }
        });
        Subjects_panels.add(subjectbtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 130, 140));

        subjectbtn3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        subjectbtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/folder (1).png"))); // NOI18N
        subjectbtn3.setText("DBMS");
        subjectbtn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        subjectbtn3.setPreferredSize(new java.awt.Dimension(100, 100));
        subjectbtn3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        subjectbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectbtn3ActionPerformed(evt);
            }
        });
        Subjects_panels.add(subjectbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 130, 140));

        subjectbtn7.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        subjectbtn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/folder (1).png"))); // NOI18N
        subjectbtn7.setText("ASEAN");
        subjectbtn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        subjectbtn7.setPreferredSize(new java.awt.Dimension(100, 100));
        subjectbtn7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Subjects_panels.add(subjectbtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 130, 140));

        subjectbtn1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        subjectbtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/folder (1).png"))); // NOI18N
        subjectbtn1.setText("ADV.COMPROG");
        subjectbtn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        subjectbtn1.setPreferredSize(new java.awt.Dimension(100, 100));
        subjectbtn1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Subjects_panels.add(subjectbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 130, 140));

        subjectbtn2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        subjectbtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/folder (1).png"))); // NOI18N
        subjectbtn2.setText("NETWORKING");
        subjectbtn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        subjectbtn2.setPreferredSize(new java.awt.Dimension(100, 100));
        subjectbtn2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        subjectbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectbtn2ActionPerformed(evt);
            }
        });
        Subjects_panels.add(subjectbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 130, 140));

        subjectbtn4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        subjectbtn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/folder (1).png"))); // NOI18N
        subjectbtn4.setText("PATHFIT");
        subjectbtn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        subjectbtn4.setPreferredSize(new java.awt.Dimension(100, 100));
        subjectbtn4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        subjectbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectbtn4ActionPerformed(evt);
            }
        });
        Subjects_panels.add(subjectbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 130, 140));

        subjectbtn8.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        subjectbtn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/folder (1).png"))); // NOI18N
        subjectbtn8.setText("DISCRETE MATH");
        subjectbtn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        subjectbtn8.setPreferredSize(new java.awt.Dimension(100, 100));
        subjectbtn8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Subjects_panels.add(subjectbtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 130, 140));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Subjects_panels, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(notifications_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(todo_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(about_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Subjects_panels, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(notifications_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(todo_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(about_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubjectsMouseClicked
        Subjects_panels.setVisible(true);
        todo_panel.setVisible(false);
        notifications_panel.setVisible(false);
        about_panel.setVisible(false);
        
    }//GEN-LAST:event_SubjectsMouseClicked

    private void to_doMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_to_doMouseClicked
        todo_panel.setVisible(true);
        Subjects_panels.setVisible(false);
        notifications_panel.setVisible(false);
        about_panel.setVisible(false);
    }//GEN-LAST:event_to_doMouseClicked

    private void notificationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notificationsMouseClicked
        notifications_panel.setVisible(true);
        Subjects_panels.setVisible(false);
        todo_panel.setVisible(false);
        about_panel.setVisible(false);
    }//GEN-LAST:event_notificationsMouseClicked

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
        about_panel.setVisible(true);
        Subjects_panels.setVisible(false);
        todo_panel.setVisible(false);
        notifications_panel.setVisible(false);
    }//GEN-LAST:event_aboutMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      createclass_button  createclass_buttonFrame  = new  createclass_button();
      createclass_buttonFrame.setVisible(true);
      createclass_buttonFrame.pack();
      createclass_buttonFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void subjectbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectbtn6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectbtn6ActionPerformed

    private void subjectbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectbtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectbtn2ActionPerformed

    private void subjectbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectbtn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectbtn3ActionPerformed

    private void subjectbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectbtn5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectbtn5ActionPerformed

    private void subjectbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectbtn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectbtn4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void about_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_about_buttonMouseClicked
        aboutinfo_panel.setVisible(true);
    }//GEN-LAST:event_about_buttonMouseClicked

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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Subjects;
    private javax.swing.JPanel Subjects_panels;
    private javax.swing.JPanel about;
    private javax.swing.JPanel about_button;
    private javax.swing.JPanel about_panel;
    private javax.swing.JPanel aboutinfo_panel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JPanel mission_panel;
    private javax.swing.JPanel notifications;
    private javax.swing.JPanel notifications_panel;
    private javax.swing.JButton subjectbtn1;
    private javax.swing.JButton subjectbtn2;
    private javax.swing.JButton subjectbtn3;
    private javax.swing.JButton subjectbtn4;
    private javax.swing.JButton subjectbtn5;
    private javax.swing.JButton subjectbtn6;
    private javax.swing.JButton subjectbtn7;
    private javax.swing.JButton subjectbtn8;
    private javax.swing.JPanel to_do;
    private javax.swing.JPanel todo_panel;
    // End of variables declaration//GEN-END:variables
}
