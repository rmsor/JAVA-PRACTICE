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
public class ReturnPublication extends javax.swing.JPanel {

    private static ReturnPublication instance = null;

    public static ReturnPublication getInstance() {

        return instance;
    }

    /**
     * Creates new form LoanCopy
     */
    public ReturnPublication() {
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
        jLabel5 = new javax.swing.JLabel();
        returnDateTF = new javax.swing.JTextField();
        returnCopyBtn = new javax.swing.JButton();
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

        jLabel5.setText("Return Date");

        returnCopyBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        returnCopyBtn.setForeground(new java.awt.Color(0, 0, 153));
        returnCopyBtn.setText("Return Copy");
        returnCopyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnCopyBtnActionPerformed(evt);
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
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(returnDateTF)
                            .addComponent(memberNoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(publicationTitleComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(copyNoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(typeComboBox, 0, 583, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(returnCopyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnCopyBtn)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void fillLoanTable(){
        DefaultTableModel loanModel=(DefaultTableModel) listLoanTable.getModel();
        String type="Loaned";
        //Fill Loan Sections
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
                    if (selectedItem.equalsIgnoreCase(cp.getPublication().getTitle()) && cp.getStatus().compareToIgnoreCase("Loaned")==0) {

                        copyNoComboBox.addItem(cp.getCopyNo());

                    }
                }

            } else if (selectedTypePub.equalsIgnoreCase("Magazine")) {

                List<Copy> copyMagList = LibrarySystemApplication.getInstance().getCopyMagazineList();

                for (Copy cp : copyMagList) {
                    if (selectedItem.equalsIgnoreCase(cp.getPublication().getTitle()) && cp.getStatus().compareToIgnoreCase("Loaned")==0) {

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

    private void returnCopyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnCopyBtnActionPerformed
        // TODO add your handling code here:
        String memberNo = memberNoComboBox.getSelectedItem().toString();
        String typePub = typeComboBox.getSelectedItem().toString();
        String pubTitle = publicationTitleComboBox.getSelectedItem().toString();
        String copyNo = copyNoComboBox.getSelectedItem().toString();
        String returnDateStrs = returnDateTF.getText();

        if (memberNo.length() == 0 || typePub.length() == 0
                || pubTitle.length() == 0 || copyNo.length() == 0
                ||  returnDateStrs.length() == 0) {
            JOptionPane.showMessageDialog(null, "Please fillup all fields");
            return;
        }

        Date returnDate = null;
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");       
        try {
            returnDate = formatter.parse(returnDateStrs);
        } catch (ParseException e) {
            e.printStackTrace();
        }        
        Member mb=LibrarySystemApplication.getInstance().searchMemberList(memberNo);


        if (typePub.equalsIgnoreCase("Book")) {
            Copy bookCopy = LibrarySystemApplication.getInstance().searchBookCopy(pubTitle,copyNo);
            mb.returnIt(bookCopy,returnDate);
            JOptionPane.showMessageDialog(null, "Successfully Returned copy of Book");

        } else if (typePub.equalsIgnoreCase("Magazine")) {
            Copy magazineCopy = LibrarySystemApplication.getInstance().searchMagazineCopy(pubTitle,copyNo);
            mb.returnIt(magazineCopy,returnDate);
            JOptionPane.showMessageDialog(null, "Successfully returned copy of Magazine");

        }
        publicationTitleComboBox.removeAllItems();
        returnDateTF.setText("");
        fillLoanTable();
        
    }//GEN-LAST:event_returnCopyBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox copyNoComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listLoanTable;
    private javax.swing.JComboBox memberNoComboBox;
    private javax.swing.JComboBox publicationTitleComboBox;
    private javax.swing.JButton returnCopyBtn;
    private javax.swing.JTextField returnDateTF;
    private javax.swing.JComboBox typeComboBox;
    // End of variables declaration//GEN-END:variables
}