/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yandexprogramm;

import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author Эдуард
 */
public class interfaceProgram extends javax.swing.JFrame {

    /**
     * Creates new form interfaceProgram
     */
    public interfaceProgram() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DirectoryChooser = new javax.swing.JFileChooser();
        Button_searchStart = new javax.swing.JButton();
        ComboBox_languageSearch = new javax.swing.JComboBox();
        ComboBox_filterType = new javax.swing.JComboBox();
        ComboBox_selectedRegion = new javax.swing.JComboBox();
        Label_region = new javax.swing.JLabel();
        Label_filter = new javax.swing.JLabel();
        Label_language = new javax.swing.JLabel();
        Label_titleProgram = new javax.swing.JLabel();
        Field_requestText = new javax.swing.JTextField();
        Label_page = new javax.swing.JLabel();
        Spinner_pageNumber = new javax.swing.JSpinner();
        Label_sort = new javax.swing.JLabel();
        ComboBox_sortType = new javax.swing.JComboBox();
        Label_language1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextArea_console = new javax.swing.JTextArea();
        TextField_pathDownloads = new javax.swing.JTextField();

        DirectoryChooser.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        DirectoryChooser.setDialogTitle("Выберите каталог для сохранения страниц");
        DirectoryChooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        DirectoryChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DirectoryChooserActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Button_searchStart.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button_searchStart.setText("Начать Поиск");
        Button_searchStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_searchStartMouseClicked(evt);
            }
        });
        Button_searchStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_searchStartActionPerformed(evt);
            }
        });

        ComboBox_languageSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Русский", "Украинский", "Белорусский", "Казахский" }));
        ComboBox_languageSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_languageSearchActionPerformed(evt);
            }
        });

        ComboBox_filterType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Отключен", "Умеренный", "Семейный" }));

        ComboBox_selectedRegion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Универсальный", "Россия", "Европа", "СНГ", "Азия", "Северная Америка", "Южная Америка", "Австралия и Океания", "Африка", "Нидерланды", "Норвегия", "Польша", "Словакия", "Словения", "Финляндия", "Франция", "Чехия", "Швейцария", "Швеция", "Сербия", "Дания", "Испания", "Италия", "Германия", "Великобритания", "Австрия", "Бельгия", "Болгария", "Венгрия", "Греция", "Страны Балтии", "Турция", "Новая Зеландия", "Австралия", "Канада", "США", "Арктика и Антарктика" }));
        ComboBox_selectedRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_selectedRegionActionPerformed(evt);
            }
        });

        Label_region.setText("Регион:");

        Label_filter.setText("Фильтр:");

        Label_language.setText("Язык:");

        Label_titleProgram.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        Label_titleProgram.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_titleProgram.setText("Интерфейс для Яндекс.<XML>");

        Field_requestText.setToolTipText("");
        Field_requestText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field_requestTextActionPerformed(evt);
            }
        });
        Field_requestText.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                Field_requestTextPropertyChange(evt);
            }
        });

        Label_page.setText("Страница:");

        Spinner_pageNumber.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        Spinner_pageNumber.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Spinner_pageNumberStateChanged(evt);
            }
        });

        Label_sort.setText("Сортировка:");

        ComboBox_sortType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "По релевантности", "По времени (новые вверху)", "По времени (старые вверху)" }));
        ComboBox_sortType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_sortTypeActionPerformed(evt);
            }
        });

        Label_language1.setText("Каталог:");

        TextArea_console.setEditable(false);
        TextArea_console.setColumns(20);
        TextArea_console.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        TextArea_console.setRows(5);
        jScrollPane3.setViewportView(TextArea_console);

        TextField_pathDownloads.setText("/");
        TextField_pathDownloads.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextField_pathDownloadsMouseClicked(evt);
            }
        });
        TextField_pathDownloads.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_pathDownloadsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label_titleProgram, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(Field_requestText)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_region)
                            .addComponent(Label_filter)
                            .addComponent(Label_language, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_page)
                            .addComponent(Label_sort)
                            .addComponent(Label_language1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ComboBox_filterType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboBox_selectedRegion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboBox_languageSearch, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Spinner_pageNumber)
                            .addComponent(ComboBox_sortType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextField_pathDownloads))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button_searchStart, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Label_titleProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Field_requestText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_page)
                            .addComponent(Spinner_pageNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBox_sortType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_sort))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBox_selectedRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_region))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBox_filterType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_filter))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBox_languageSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_language))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_language1)
                            .addComponent(TextField_pathDownloads, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Button_searchStart, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_searchStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_searchStartMouseClicked

        if (Field_requestText.getText().isEmpty()) {
            writeToConsole("Пустой запрос не может быть выполнен");
        } else if (Field_requestText.getText().length() > 400) {
            writeToConsole("Слишком длинный запрос (не более 400 символов)");
        } else if (utilites.Utilites.spaceAmount(Field_requestText.getText()) >= 40) {
            writeToConsole("Слишком много слов в запросе (не более 40)");
        } else {
            writeToConsole("Запрос \"" + Field_requestText.getText() + "\" добавлен на обработку.");
            new YandexSearth(this, Field_requestText.getText(), ComboBox_selectedRegion.getSelectedIndex(), ComboBox_filterType.getSelectedIndex(), ComboBox_languageSearch.getSelectedIndex(), (Integer) Spinner_pageNumber.getValue(), ComboBox_sortType.getSelectedIndex());

        }
    }//GEN-LAST:event_Button_searchStartMouseClicked

    private void ComboBox_languageSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_languageSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_languageSearchActionPerformed

    private void ComboBox_selectedRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_selectedRegionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_selectedRegionActionPerformed

    private void Field_requestTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field_requestTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field_requestTextActionPerformed

    private void Button_searchStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_searchStartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_searchStartActionPerformed

    private void ComboBox_sortTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_sortTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_sortTypeActionPerformed

    private void Spinner_pageNumberStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Spinner_pageNumberStateChanged
    }//GEN-LAST:event_Spinner_pageNumberStateChanged

    private void Field_requestTextPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_Field_requestTextPropertyChange
        System.out.println(((javax.swing.JTextField) evt.getSource()).getText());
    }//GEN-LAST:event_Field_requestTextPropertyChange

    private void DirectoryChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DirectoryChooserActionPerformed
        TextField_pathDownloads.setText(getSaveDirectory());
    }//GEN-LAST:event_DirectoryChooserActionPerformed

    private void TextField_pathDownloadsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextField_pathDownloadsMouseClicked
 DirectoryChooser.showDialog(rootPane, "Выбрать");
    }//GEN-LAST:event_TextField_pathDownloadsMouseClicked

    private void TextField_pathDownloadsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_pathDownloadsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_pathDownloadsActionPerformed

    public synchronized void writeToConsole(String str) {
        TextArea_console.append(str + "\n");
    }
    
    
   public String getSaveDirectory(){
       return DirectoryChooser.getCurrentDirectory().getAbsolutePath();
   }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(interfaceProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaceProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaceProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaceProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaceProgram().setVisible(true);
               
                //TextField_pathDownloads.setText(DirectoryChooser.showDialog(rootPane, null));
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_searchStart;
    private javax.swing.JComboBox ComboBox_filterType;
    private javax.swing.JComboBox ComboBox_languageSearch;
    private javax.swing.JComboBox ComboBox_selectedRegion;
    private javax.swing.JComboBox ComboBox_sortType;
    private javax.swing.JFileChooser DirectoryChooser;
    private javax.swing.JTextField Field_requestText;
    private javax.swing.JLabel Label_filter;
    private javax.swing.JLabel Label_language;
    private javax.swing.JLabel Label_language1;
    private javax.swing.JLabel Label_page;
    private javax.swing.JLabel Label_region;
    private javax.swing.JLabel Label_sort;
    private javax.swing.JLabel Label_titleProgram;
    private javax.swing.JSpinner Spinner_pageNumber;
    private javax.swing.JTextArea TextArea_console;
    private javax.swing.JTextField TextField_pathDownloads;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
