/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1formais.view;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import trabalho1formais.App;
import trabalho1formais.model.automaton.ViewTable;

/**
 *
 * @author nathan
 */
public class PopupEditionAutomaton extends javax.swing.JFrame {

    private App app;
    private boolean editing;
    private String editName;
    private DefaultTableModel tableModel;
    private ArrayList<String> alphabet;

    /**
     * Creates new form popupEditionBOx
     */
    public PopupEditionAutomaton(App app) {
        this.app = app;
        initComponents();
        this.editing = false;
        this.editName = "";
        tableModel = new DefaultTableModel();
        transitionInput.setModel(tableModel);
        tableModel.addColumn("Estados");
        alphabet = new ArrayList<String>();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        saveChangesButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        transitionInput = new javax.swing.JTable();
        addColumnButton = new javax.swing.JButton();
        addRowButton = new javax.swing.JButton();
        AlphaInput = new javax.swing.JTextField();

        setTitle("Inserir Gramática");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        nameInput.setToolTipText("");
        nameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameInputActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Transições:");

        cancelButton.setBackground(new java.awt.Color(249, 248, 248));
        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        saveChangesButton.setText("Salvar");
        saveChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangesButtonActionPerformed(evt);
            }
        });

        transitionInput.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(transitionInput);

        addColumnButton.setText("Adicionar Coluna");
        addColumnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addColumnButtonActionPerformed(evt);
            }
        });

        addRowButton.setText("Adicionar Linha");
        addRowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRowButtonActionPerformed(evt);
            }
        });

        AlphaInput.setToolTipText("coluna");
        AlphaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlphaInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cancelButton)
                                    .addGap(18, 18, 18)
                                    .addComponent(saveChangesButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(AlphaInput)
                                            .addGap(18, 18, 18)
                                            .addComponent(addColumnButton))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(15, 15, 15)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(addRowButton)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addColumnButton)
                    .addComponent(AlphaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addRowButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(saveChangesButton))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void clearInputs() {
        nameInput.setText("");
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Estados");
        transitionInput.setModel(tableModel);
        AlphaInput.setText("");
        this.editing = false;
        this.editName = "";
        alphabet = new ArrayList<String>();
    }

    private void nameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameInputActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        clearInputs();
        this.hide();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void saveChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChangesButtonActionPerformed
        String name = nameInput.getText();
        if (transitionInput.isEditing()) {
            transitionInput.getCellEditor().stopCellEditing();
        }
        if ((!app.alreadyExists(name)) || (this.editing && this.editName.equals(name))) {
            app.addNewAF(name, tableModel);
            if (this.editing && !this.editName.equals(name)) {
                app.removeID(this.editName);
            }
            clearInputs();
            this.hide();

        } else {
            app.displayError("Nome inválido: Existe outra objeto com mesmo nome.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_saveChangesButtonActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed

    }//GEN-LAST:event_formMousePressed

    private void addColumnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addColumnButtonActionPerformed
        String alpha = AlphaInput.getText().replace(" ", "").toLowerCase();
        AlphaInput.setText("");
        if (!alphabet.contains(alpha) && alpha.length() > 0) {
            alphabet.add(alpha);
            tableModel.addColumn(alpha);
        }

    }//GEN-LAST:event_addColumnButtonActionPerformed

    private void addRowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRowButtonActionPerformed
        Vector rowData = null;
        tableModel.addRow(rowData);
    }//GEN-LAST:event_addRowButtonActionPerformed

    private void AlphaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlphaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlphaInputActionPerformed

    public void showEdit(String id, ViewTable table, ArrayList<Character> alphabet) {
        clearInputs();
        nameInput.setText(id);
        for(char item : alphabet){
        this.alphabet.add(item+"");
        }
        tableModel = new javax.swing.table.DefaultTableModel(table.getData(), table.getColumn());
        transitionInput.setModel(tableModel);
        AlphaInput.setText("");
        this.editing = true;
        this.editName = id;
        this.show();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AlphaInput;
    private javax.swing.JButton addColumnButton;
    private javax.swing.JButton addRowButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameInput;
    private javax.swing.JButton saveChangesButton;
    private javax.swing.JTable transitionInput;
    // End of variables declaration//GEN-END:variables
}
