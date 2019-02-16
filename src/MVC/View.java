/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class View {
    
    private String[] Levels;
    private String selected;
    public void setLevels(String[] selected)
    {
        this.Levels=selected;
    }
    public void showGUI()
    {
        JComboBox comboBox = new JComboBox(Levels);
        JOptionPane.showConfirmDialog(null, comboBox, "Choose Difficulty", JOptionPane.OK_CANCEL_OPTION);
        this.selected=(String)comboBox.getSelectedItem();
    }
    public String SelectedItem()
    {
        return this.selected;
    }
}
