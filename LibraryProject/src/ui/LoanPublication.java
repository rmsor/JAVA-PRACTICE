/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lib.Book;
import lib.Copy;
import lib.Loan;
import lib.Magazine;
import lib.Member;
import lib.Publication;

/**
 *
 * @author BISHNU
 */
public class LoanPublication extends javax.swing.JPanel {

    private static LoanPublication instance = null;

    public static LoanPublication getInstance() {

        return instance;
    }

    /**
     * Creates new form LoanCopy
     */
    public LoanPublication() {
        instance = this;
        initComponents();
    }

    public void addValueToCompontents() {
        memberNoComboBox.removeAllItems();
        List<Member> memberList = LibrarySystemApplication.getInstance().getMemberList();
        for (Member mb : memberList) {
            memberNoComboBox.addItem(mb.getMemberNo());
        }
        fillLoanTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        loanCopyBtn = new javax.swing.JButton();
        checkOutDateTF = new javax.swing.JTextField();
        memberNoComboBox = new javax.swing.JComboBox();
        publicationTitleComboBox = new javax.swing.JComboBox();
        copyNoComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        typeComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        listLoanTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setText("Member No");

        jLabel2.setText("Copy No");

        jLabel3.setText("Publication Title");

        jLabel4.setText("Check Out Date");

        loanCopyBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        loanCopyBtn.setForeground(new java.awt.Color(51, 0, 153));
        loanCopyBtn.setText("Loan Copy");
        loanCopyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanCopyBtnActionPerformed(evt);
            }
        });

        memberNoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberNoComboBoxActionPerformed(evt);
            }
        });

        publicationTitleComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publicationTitleComboBoxActionPerformed(evt);
            }
        });

        jLabel6.setText("Choose Type");

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Book", "Magazine" }));
        typeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeComboBoxActionPerformed(evt);
            }
        });

        listLoanTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Member Name", "Publication Title", "Copy Number", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(listLoanTable);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Loaned Publications");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkOutDateTF)
                            .addComponent(memberNoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(publicationTitleComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(copyNoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(typeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loanCopyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(memberNoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(publicationTitleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(copyNoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(checkOutDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loanCopyBtn)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loanCopyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanCopyBtnActionPerformed
        // TODO add your handling code here:
        String memberNo = memberNoComboBox.getSelectedItem().toString();
        String typePub = typeComboBox.getSelectedItem().toString();
        String pubTitle = publicationTitleComboBox.getSelectedItem().toString();
        String copyNo = copyNoComboBox.getSelectedItem().toString();
        String checkOutDateStr = checkOutDateTF.getText();

        if (memberNo.length() == 0 || typePub.length() == 0
                || pubTitle.length() == 0 || copyNo.length() == 0
                || checkOutDateStr.length() == 0 ) {
            JOptionPane.showMessageDialog(null, "Please fillup all fields");
            return;
        }
        Date checkOutDate = null;
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        try {
            checkOutDate = formatter.parse(checkOutDateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Member mb=LibrarySystemApplication.getInstance().searchMemberList(memberNo);        
        
        if (typePub.equalsIgnoreCase("Book")) {
            Copy bookCopy = LibrarySystemApplication.getInstance().searchBookCopy(pubTitle,copyNo);
            mb.loan(bookCopy,checkOutDate);
            JOptionPane.showMessageDialog(null, "Successfully loaned copy of Book");

        } else if (typePub.equalsIgnoreCase("Magazine")) {
            Copy magazineCopy = LibrarySystemApplication.getInstance().searchMagazineCopy(pubTitle,copyNo);
            mb.loan(magazineCopy,checkOutDate);
            JOptionPane.showMessageDialog(null, "Successfully loaned copy of Magazine");
        }
        
        
        fillLoanTable();
        
        publicationTitleComboBox.removeAllItems();
        checkOutDateTF.setText("");

    }//GEN-LAST:event_loanCopyBtnActionPerformed
    private void fillLoanTable(){
        DefaultTableModel loanModel=(DefaultTableModel) listLoanTable.getModel();
        String type="Loaned";
        loanModel.getDataVector().removeAllElements();
        loanModel.fireTableDataChanged();
        List<Member> members=LibrarySystemApplication.getInstance().getMemberList();
        for(Member mem:members){
            for(Loan ln:mem.getLoans()){
               if(ln.getCopy().getStatus().equalsIgnoreCase(type)){
                   String pubTit=ln.getCopy().getPublication().getTitle();
                   loanModel.addRow(new Object[]{mem.getFullName(),pubTit,ln.getCopy().getCopyNo(),ln.getCheckOutDate()});
               } 
            }
        }
    }
    private void typeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeComboBoxActionPerformed
        // TODO add your handling code here:

        String typePub = typeComboBox.getSelectedItem().toString();

        publicationTitleComboBox.removeAllItems();

        if (typePub.equalsIgnoreCase("Book")) {

            List<Book> bookList = LibrarySystemApplication.getInstance().getPubBookList();

            for (Book bk : bookList) {

                publicationTitleComboBox.addItem(bk.getTitle());

            }

        } else if (typePub.equalsIgnoreCase("Magazine")) {
            List<Magazine> magazineList = LibrarySystemApplication.getInstance().getPubMagazineList();

            for (Magazine magazine : magazineList) {

                publicationTitleComboBox.addItem(magazine.getTitle());

            }
        }
    }//GEN-LAST:event_typeComboBoxActionPerformed

    private void publicationTitleComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publicationTitleComboBoxActionPerformed
        // TODO add your handling code here:

        copyNoComboBox.removeAllItems();

        String selectedItem = null;
        try {
            selectedItem = publicationTitleComboBox.getSelectedItem().toString();

        } catch (Exception e) {
        }

        String selectedTypePub = typeComboBox.getSelectedItem().toString();

        if (selectedItem != null) {

            if (selectedTypePub.equalsIgnoreCase("Book")) {
                List<Copy> copyBookList = LibrarySystemApplication.getInstance().getCopyBookList();

                for (Copy cp : copyBookList) {
                    if (selectedItem.equalsIgnoreCase(cp.getPublication().getTitle()) && cp.getStatus().compareToIgnoreCase("Available")==0) {

                        copyNoComboBox.addItem(cp.getCopyNo());

                    }
                }

            } else if (selectedTypePub.equalsIgnoreCase("Magazine")) {

                List<Copy> copyMagList = LibrarySystemApplication.getInstance().getCopyMagazineList();

                for (Copy cp : copyMagList) {
                    if (selectedItem.equalsIgnoreCase(cp.getPublication().getTitle()) && cp.getStatus().compareToIgnoreCase("Available")==0) {

                        copyNoComboBox.addItem(cp.getCopyNo());

                    }
                }
            }

        }
    }//GEN-LAST:event_publicationTitleComboBoxActionPerformed

    private void memberNoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberNoComboBoxActionPerformed
        // TODO add your handling code here:

        typeComboBox.setSelectedIndex(0);
    }//GEN-LAST:event_memberNoComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField checkOutDateTF;
    private javax.swing.JComboBox copyNoComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listLoanTable;
    private javax.swing.JButton loanCopyBtn;
    private javax.swing.JComboBox memberNoComboBox;
    private javax.swing.JComboBox publicationTitleComboBox;
    private javax.swing.JComboBox typeComboBox;
    // End of variables declaration//GEN-END:variables
}
