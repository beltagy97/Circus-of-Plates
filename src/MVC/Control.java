/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author User
 */
public class Control {
    private View view;
    private Model model;
    public Control(View view , Model model)
    {
        this.view=view;
        this.model=model;
        this.view.setLevels(this.model.getLevels());
    }
    public void ShowGUI()
    {
        this.view.showGUI();
    }
    public String selectedItem()
    {
        return this.view.SelectedItem();
    }
}
