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

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;

/**
 *
 * @author Y
 */
@SuppressWarnings("serial")
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
        fullScreen();
    }
    public void resize() {
    	setResizable(false);
    }
    private void addTable(javax.swing.JPanel j){
        Table t_1 = new Table();
        Table t_2 = new Table();
        Table t_3 = new Table();
        Table t_4 = new Table();
        Table t_5 = new Table();
        Table t_7 = new Table();
        Table t_6 = new Table();
        Table t_8 = new Table();
        Table t_9 = new Table();
        Table t_10 = new Table();
        Table t_11 = new Table();
        Table t_12 = new Table();
        Table t_13 = new Table();
        Table t_14 = new Table();
        Table t_15 = new Table();
        Table t_16 = new Table();
         Table t_17 = new Table();
           Table t_18 = new Table();
             Table t_19 = new Table();
               Table t_20 = new Table();
       GroupLayout groupLayout = new GroupLayout(j);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(41)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(t_1, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
							.addGap(41)
							.addComponent(t_2, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                        .addGap(41)
                                                        .addComponent(t_5, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                        .addGap(41)
                                                        .addComponent(t_6, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                )
                                                .addGroup(groupLayout.createSequentialGroup()
							.addComponent(t_9, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
							.addGap(41)
							.addComponent(t_10, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                        .addGap(41)
                                                        .addComponent(t_11, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                        .addGap(41)
                                                        .addComponent(t_12, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                )
                                                .addGroup(groupLayout.createSequentialGroup()
							.addComponent(t_13, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
							.addGap(41)
							.addComponent(t_14, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                        .addGap(41)
                                                        .addComponent(t_15, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                        .addGap(41)
                                                        .addComponent(t_16, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                )
                                                .addGroup(groupLayout.createSequentialGroup()
							.addComponent(t_17, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
							.addGap(41)
							.addComponent(t_18, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                        .addGap(41)
                                                        .addComponent(t_19, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                        .addGap(41)
                                                        .addComponent(t_20, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                )
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(t_3, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
							.addGap(41)
							.addComponent(t_4, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                        .addGap(41)
							.addComponent(t_7, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                        .addGap(41)
							.addComponent(t_8, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                ))
					.addGap(41))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(41)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(t_1, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
						.addComponent(t_2, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                                .addComponent(t_5, GroupLayout.DEFAULT_SIZE , 178, Short.MAX_VALUE)
                                                .addComponent(t_6  ,GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                                        .addGap(41)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(t_9, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
						.addComponent(t_10, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                                .addComponent(t_11, GroupLayout.DEFAULT_SIZE , 178, Short.MAX_VALUE)
                                                .addComponent(t_12  ,GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                                        .addGap(41)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(t_17, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
						.addComponent(t_18, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                                .addComponent(t_19, GroupLayout.DEFAULT_SIZE , 178, Short.MAX_VALUE)
                                                .addComponent(t_20  ,GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                                         .addGap(41)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(t_13, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
						.addComponent(t_14, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                                .addComponent(t_15, GroupLayout.DEFAULT_SIZE , 178, Short.MAX_VALUE)
                                                .addComponent(t_16  ,GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
					.addGap(41)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(t_3, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
						.addComponent(t_4, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                                .addComponent(t_7, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                                .addComponent(t_8, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                                )
					.addGap(41))
		);
                j.setLayout(groupLayout);
    }
    private void addStat(){
        stat_1 = new Stat("Số bàn trống","Lolicon","LinhKa");
       
        stat_2 = new Stat("Tổng số khách","Khách đang chờ","Khách đang ăn");
        GroupLayout gl_jPanel3 = new GroupLayout(jPanel3);
        gl_jPanel3.setHorizontalGroup(
        	gl_jPanel3.createParallelGroup(Alignment.LEADING)
        		.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        		.addGroup(gl_jPanel3.createSequentialGroup()
        			.addGap(130)
        			.addComponent(stat_1, GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
        			.addGap(130))
        		.addGroup(gl_jPanel3.createSequentialGroup()
        			.addGap(130)
        			.addComponent(stat_2, GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
        			.addGap(130))
        );
        gl_jPanel3.setVerticalGroup(
        	gl_jPanel3.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_jPanel3.createSequentialGroup()
        			.addGap(95)
        			.addComponent(stat_1, GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
        			.addGap(100)
        			.addComponent(stat_2, GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
        			.addGap(95)
        			.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
        );
        jPanel3.setLayout(gl_jPanel3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTabbedPane1.setName(""); // NOI18N
        jTabbedPane1.setRequestFocusEnabled(false);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

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
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jTabbedPane1, GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        			.addGap(0)
        			.addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        		.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        
       
        getContentPane().setLayout(layout);

        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>                        
    public void showHome(){
        this.setVisible(true);
    }
    public void unshowHome(){
        this.setVisible(false);
    }
     private void fullScreen(){
         setExtendedState(JFrame.MAXIMIZED_BOTH);
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
}
