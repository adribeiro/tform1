/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1formais.view;

import trabalho1formais.App;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import trabalho1formais.model.automaton.Automaton;
import trabalho1formais.model.automaton.ViewTable;

/**
 *
 * @author nathan
 */
public class View extends javax.swing.JFrame {

    private App app;
    private DefaultListModel<String> listModel = new DefaultListModel<>();

    /**
     * Creates new form View
     */
    public View(App app) {
        this.app = app;
        initComponents();
        popupEditionGrammar = new PopupEditionGrammar(app);
        popupEditionRegex = new PopupEditionRegex(app);
        popupEditionAutomaton = new PopupEditionAutomaton(app);
    }
    
    
    private String getSelected () {
        String selected = grammarNregexList.getSelectedValue();
        String splitedId[] = selected.split(" - ");
        String id = splitedId[0];
     
        return id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addRegexButton = new javax.swing.JButton();
        addGramarButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        grammarNregexList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        determinizeAutomaton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        editItem = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        addAutomatonButton = new javax.swing.JButton();
        minimizeAutomaton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trabalho 1");

        addRegexButton.setText("Inserir Expressão Regular");
        addRegexButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRegexButtonActionPerformed(evt);
            }
        });

        addGramarButton.setText("Inserir Gramatica");
        addGramarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGramarButtonActionPerformed(evt);
            }
        });

        grammarNregexList.setModel(listModel);
        jScrollPane1.setViewportView(grammarNregexList);

        jLabel1.setText("Itens Adicionados");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel2.setText("Selecione para Editar ou converter");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        determinizeAutomaton.setText("Determinizar AFND");
        determinizeAutomaton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                determinizeAutomatonActionPerformed(evt);
            }
        });

        jButton4.setText("Converter GR Para AFND");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("União");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Interseção");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel3.setText("Automato Convertido");

        editItem.setText("Editar");
        editItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editItemActionPerformed(evt);
            }
        });

        removeButton.setText("Remover");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel4.setText("Selecione 2 Itens");

        addAutomatonButton.setText("Inserir Automato Finito");
        addAutomatonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAutomatonButtonActionPerformed(evt);
            }
        });

        minimizeAutomaton.setText("Minimizar AFD");
        minimizeAutomaton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeAutomatonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(addRegexButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel1))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(editItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(5, 5, 5)))
                    .addComponent(jLabel2)
                    .addComponent(addAutomatonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(determinizeAutomaton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator3)
                                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                .addComponent(minimizeAutomaton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(addGramarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(715, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addGramarButton, addRegexButton});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {determinizeAutomaton, jButton4, jButton5, jButton6});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(74, 74, 74)
                            .addComponent(addRegexButton)
                            .addGap(18, 18, 18)
                            .addComponent(addAutomatonButton)
                            .addGap(18, 18, 18)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(editItem)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(removeButton))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(jButton4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(determinizeAutomaton)
                            .addGap(11, 11, 11)
                            .addComponent(minimizeAutomaton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24)
                            .addComponent(jButton5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel4))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(addGramarButton)
                    .addContainerGap(550, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addRegexButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRegexButtonActionPerformed
        popupEditionRegex.show();
    }//GEN-LAST:event_addRegexButtonActionPerformed

    private void addGramarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGramarButtonActionPerformed
        popupEditionGrammar.show();
    }//GEN-LAST:event_addGramarButtonActionPerformed

    private void determinizeAutomatonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_determinizeAutomatonActionPerformed
        app.determinize(getSelected());
    }//GEN-LAST:event_determinizeAutomatonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        app.convertToAutomaton(getSelected());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
//        grammarNregexList.getSelectedValuesList();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void RegularListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegularListMouseClicked

    }//GEN-LAST:event_RegularListMouseClicked

    private void editItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editItemActionPerformed
        String selected = grammarNregexList.getSelectedValue();
        String splitedId[] = selected.split(" - ");
        String id = splitedId[0];
        String type = splitedId[1];

        if ("GR".equals(type)) {
            if (app.getGrammar(id) != null) {
                popupEditionGrammar.showEdit(app.getGrammar(id).getId(),
                        app.getGrammar(id).getSerializedGrammar());
            }
        } else if ("ER".equals(type)) {
            if (app.getRegex(id) != null) {
                popupEditionRegex.showEdit(app.getRegex(id).getId(),
                        app.getRegex(id).getRegex());
            }
        } else if ("AFND".equals(type) || "AFD".equals(type)) {
            if (app.getAutomaton(id) != null) {
                popupEditionAutomaton.showEdit(app.getAutomaton(id).getId(),
                        Automaton.toTable(app.getAutomaton(id)),app.getAutomaton(id).getAlphabet() );
            }
        } else {
//           
        }
    }//GEN-LAST:event_editItemActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
            app.removeID(getSelected());        // TODO add your handling code here:
    }//GEN-LAST:event_removeButtonActionPerformed

    private void addAutomatonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAutomatonButtonActionPerformed
        popupEditionAutomaton.show();
    }//GEN-LAST:event_addAutomatonButtonActionPerformed

    private void minimizeAutomatonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeAutomatonActionPerformed
        app.minimize(getSelected());
    }//GEN-LAST:event_minimizeAutomatonActionPerformed
    
    public void updateTable(ViewTable vt) {
        jTable1.setModel(new javax.swing.table
                .DefaultTableModel(vt.getData(), vt.getColumn()));
    }
    public void updateRegularList(String text) {
        listModel.addElement(text);
    }

    public void removeRegularList(String text) {
        listModel.removeElement(text);
    }

    public void displayError(String errorMsg) {
        JOptionPane.showMessageDialog(this, errorMsg);
    }
    /**
     * @param args the command line arguments
     */

    private PopupEditionGrammar popupEditionGrammar;
    private PopupEditionRegex popupEditionRegex;
    private PopupEditionAutomaton popupEditionAutomaton;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAutomatonButton;
    private javax.swing.JButton addGramarButton;
    private javax.swing.JButton addRegexButton;
    private javax.swing.JButton determinizeAutomaton;
    private javax.swing.JButton editItem;
    private javax.swing.JList<String> grammarNregexList;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton minimizeAutomaton;
    private javax.swing.JButton removeButton;
    // End of variables declaration//GEN-END:variables
}
