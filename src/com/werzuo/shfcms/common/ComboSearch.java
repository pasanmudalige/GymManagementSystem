/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.common;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Deshaa
 */
public class ComboSearch {

    private ArrayList<String> ar;
    private JTextField text;

    public void setSearchableCombo(final JComboBox jComboBox, boolean mustSort, final String noReultsText) {
        ar = new ArrayList<String>();
        final int s = jComboBox.getItemCount();
        for (int i = 0; i < s; i++) {
            boolean exists = false;
            for (int j = 0; j < ar.size(); j++) {
                if (ar.get(j).equalsIgnoreCase(jComboBox.getItemAt(i) + "")) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                ar.add(jComboBox.getItemAt(i) + "");
            }
        }
        if (mustSort) {
            Collections.sort(ar);
        }
        jComboBox.setLightWeightPopupEnabled(true);
        jComboBox.setEditable(true);
        text = (JTextField) jComboBox.getEditor().getEditorComponent();
        text.addKeyListener(new KeyAdapter() {

            public void keyReleased(KeyEvent evt) {
                int key = evt.getKeyCode();
                if (!(key == KeyEvent.VK_ESCAPE || key == KeyEvent.VK_ENTER || key == KeyEvent.VK_DOWN || key == KeyEvent.VK_UP)) {
                    String s = text.getText();
                    int caret = text.getCaretPosition();
                    jComboBox.hidePopup();
                    jComboBox.removeAllItems();
                    for (int i = 0; i < ar.size(); i++) {
                        if (ar.get(i).toUpperCase().startsWith(s.substring(0, caret).toUpperCase())) {
                            jComboBox.addItem(ar.get(i));
                        }
                    }
                    jComboBox.showPopup();
                    if (jComboBox.getItemCount() == 0) {
                        jComboBox.addItem(noReultsText);
                    }
                    text.setText(s);
                    text.setCaretPosition(caret);
                } else if (key == KeyEvent.VK_ESCAPE) {
                    jComboBox.setSelectedItem(text.getText());
                    jComboBox.hidePopup();
                } else if (jComboBox.getSelectedIndex() == -1) {
                    if (jComboBox.getItemCount() == 1 && !jComboBox.getItemAt(0).equals(noReultsText)) {
                        jComboBox.setSelectedIndex(0);
                    } else if (jComboBox.getItemCount() > 1) {
                        jComboBox.setSelectedIndex(0);
                    }
                }
            }
        });
    }
}
