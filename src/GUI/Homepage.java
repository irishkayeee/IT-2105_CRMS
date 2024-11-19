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
        mission_button = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        vission_button = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        privacy_button = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jp1 = new javax.swing.JPanel();
        jp2 = new javax.swing.JPanel();
        jp3 = new javax.swing.JPanel();
        jp4 = new javax.swing.JPanel();
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

        mission_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mission_buttonMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Mission");

        javax.swing.GroupLayout mission_buttonLayout = new javax.swing.GroupLayout(mission_button);
        mission_button.setLayout(mission_buttonLayout);
        mission_buttonLayout.setHorizontalGroup(
            mission_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mission_buttonLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel11)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        mission_buttonLayout.setVerticalGroup(
            mission_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mission_buttonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        vission_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vission_buttonMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Vission");

        javax.swing.GroupLayout vission_buttonLayout = new javax.swing.GroupLayout(vission_button);
        vission_button.setLayout(vission_buttonLayout);
        vission_buttonLayout.setHorizontalGroup(
            vission_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vission_buttonLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel12)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        vission_buttonLayout.setVerticalGroup(
            vission_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vission_buttonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        privacy_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                privacy_buttonMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Privacy");

        javax.swing.GroupLayout privacy_buttonLayout = new javax.swing.GroupLayout(privacy_button);
        privacy_button.setLayout(privacy_buttonLayout);
        privacy_buttonLayout.setHorizontalGroup(
            privacy_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(privacy_buttonLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel13)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        privacy_buttonLayout.setVerticalGroup(
            privacy_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(privacy_buttonLayout.createSequentialGroup()
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
                .addComponent(mission_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vission_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(privacy_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(438, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(about_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mission_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(privacy_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(vission_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        about_panel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 750, -1));

        jp1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jp1Layout = new javax.swing.GroupLayout(jp1);
        jp1.setLayout(jp1Layout);
        jp1Layout.setHorizontalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jp1Layout.setVerticalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        jPanel6.add(jp1);

        jp2.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jp2Layout = new javax.swing.GroupLayout(jp2);
        jp2.setLayout(jp2Layout);
        jp2Layout.setHorizontalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jp2Layout.setVerticalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        jPanel6.add(jp2);

        jp3.setBackground(new java.awt.Color(255, 153, 255));

        javax.swing.GroupLayout jp3Layout = new javax.swing.GroupLayout(jp3);
        jp3.setLayout(jp3Layout);
        jp3Layout.setHorizontalGroup(
            jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jp3Layout.setVerticalGroup(
            jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        jPanel6.add(jp3);

        jp4.setBackground(new java.awt.Color(204, 204, 0));

        javax.swing.GroupLayout jp4Layout = new javax.swing.GroupLayout(jp4);
        jp4.setLayout(jp4Layout);
        jp4Layout.setHorizontalGroup(
            jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jp4Layout.setVerticalGroup(
            jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        jPanel6.add(jp4);

        about_panel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 750, 220));

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

    private void about_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_about_buttonMouseClicked
            jp1.setVisible(true);
            jp2.setVisible(false);
            jp3.setVisible(false);
            jp4.setVisible(false);
    }//GEN-LAST:event_about_buttonMouseClicked

    private void mission_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mission_buttonMouseClicked
            jp2.setVisible(true);
            jp1.setVisible(false);
            jp3.setVisible(false);
            jp4.setVisible(false);
    }//GEN-LAST:event_mission_buttonMouseClicked

    private void vission_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vission_buttonMouseClicked
            jp3.setVisible(true);
            jp1.setVisible(false);
            jp2.setVisible(false);
            jp4.setVisible(false);
    }//GEN-LAST:event_vission_buttonMouseClicked

    private void privacy_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_privacy_buttonMouseClicked
            jp4.setVisible(true);
            jp1.setVisible(false);
            jp2.setVisible(false);
            jp3.setVisible(false);
    }//GEN-LAST:event_privacy_buttonMouseClicked

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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jp1;
    private javax.swing.JPanel jp2;
    private javax.swing.JPanel jp3;
    private javax.swing.JPanel jp4;
    private javax.swing.JPanel mission_button;
    private javax.swing.JPanel notifications;
    private javax.swing.JPanel notifications_panel;
    private javax.swing.JPanel privacy_button;
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
    private javax.swing.JPanel vission_button;
    // End of variables declaration//GEN-END:variables
}
