/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresswaiter;

/**
 *
 * @author Y
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Home() {
        initComponents();
        addStat();
        addTable(jPanel1);
        addTable(jPanel5);
        addTable(jPanel6);
    }
    private void addTable(javax.swing.JPanel j){
        Table t_1 = new Table();
        t_1.setBounds(41,41,200,204);
        j.add(t_1);
        Table t_2 = new Table();
        t_2.setBounds(282, 41, 200, 204);
        j.add(t_2);
        Table t_3 = new Table();
        t_3.setBounds(523, 41, 200, 204);
        j.add(t_3);
        Table t_4 = new Table();
        t_4.setBounds(41,286,200,204);
        j.add(t_4);
        Table t_5 = new Table();
        t_5.setBounds(282,286,200,204);
        j.add(t_5);
        Table t_6 = new Table();
        t_6.setBounds(523,286,200,204);
        j.add(t_6);
        Table t_7 = new Table();
        t_7.setBounds(41,531,200,204);
        j.add(t_7);
        Table t_8 = new Table();
        t_8.setBounds(282,531,200,204);
        j.add(t_8);
        Table t_9 = new Table();
        t_9.setBounds(523,531,200,204);
        j.add(t_9);
        Table t_10 = new Table();
        t_10.setBounds(41,776,200,204);
        j.add(t_10);
        Table t_11 = new Table();
        t_11.setBounds(282,776,200,204);
        j.add(t_11);
        Table t_12 = new Table();
        t_12.setBounds(523,776,200,204);
        j.add(t_12);
        Table t_13 = new Table();
        t_13.setBounds(41,1021,200,204);
        j.add(t_13);
        Table t_14 = new Table();
        t_14.setBounds(282,1021,200,204);
        j.add(t_14);
        Table t_15 = new Table();
        t_15.setBounds(523,1021,200,204);
        j.add(t_15);
  
    }
    private void addStat(){
        stat_1 = new Stat("Số bàn trống","Đang sử dụng","Sửa chữa");
        stat_1.setBounds(26, 10, 350, 308);
        jPanel3.add(stat_1);
        stat_2 = new Stat("Tổng số khách","Khách có chỗ","Khách đang đợi");
        stat_2.setBounds(26,330,350,308);
        jPanel3.add(stat_2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 800));

        jButton1.setText("Refresh");
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 692, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTabbedPane1.setName(""); // NOI18N
        jTabbedPane1.setRequestFocusEnabled(false);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setPreferredSize(new java.awt.Dimension(804, 1266));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 804, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1266, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        jTabbedPane1.addTab("       Tầng 1       ", jScrollPane1);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel6.setPreferredSize(new java.awt.Dimension(804, 1266));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 804, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1266, Short.MAX_VALUE)
        );

        jScrollPane3.setViewportView(jPanel6);

        jTabbedPane1.addTab("       Tầng 2      ", jScrollPane3);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel5.setPreferredSize(new java.awt.Dimension(804, 1266));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 804, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1266, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel5);

        jTabbedPane1.addTab("       Tầng 3       ", jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>                        
    public void showHome(){
        this.setVisible(true);
    }
    public void unshowHome(){
        this.setVisible(false);
    }
    Stat stat_1;
    Stat stat_2;
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration                   
}
