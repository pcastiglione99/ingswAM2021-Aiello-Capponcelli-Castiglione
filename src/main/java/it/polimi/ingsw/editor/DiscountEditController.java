package it.polimi.ingsw.editor;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class DiscountEditController {

    public TextField discountTxt;

    private Integer number;

    public void discountInserted(ActionEvent event){
        number= Integer.parseInt(discountTxt.getText());
    }

    public Integer getNumber(){
        return this.number;
    }
}