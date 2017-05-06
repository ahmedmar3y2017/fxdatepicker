package javafxapplication4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.net.URL;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class FXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private DatePicker date;

    @FXML
    void action(ActionEvent event) {
        System.out.println("Done");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // one
        Date input = new Date();
        LocalDate dd = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        // or
        LocalDate today = LocalDate.now();

        date.setValue(dd);

    }

}
