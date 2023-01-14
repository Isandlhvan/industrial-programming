package com.example.hellojavafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class HelloController {
    @FXML
    private TextField inputLine1;

    public String field = "";

    public void input() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("input.txt"));
        while(scan.hasNext()){
            int a = scan.nextInt();
            String b = scan.nextLine();
            hyper.add(a);
            text.add(b);
        }
    }

    public void find(int num){
        int r = 0;
        for(int i = 0; i < hyper.size(); i++){
            if(num == hyper.get(i)){
                field+= text.get(i);
            }
        }
    }

    public ArrayList<Integer> hyper = new ArrayList<>();
    public ArrayList<String> text = new ArrayList<>();

    public int temp = 0;
   // @FXML
   // private TextField inputLine2;
    //@FXML
    //private Label resultLabel;

    @FXML
    protected void onPlusButtonClick() throws FileNotFoundException {
            input();
            var stroka = inputLine1.getCharacters().toString();
            String array[] = stroka.split(" ");
            for(int i = 0; i < array.length; i++){
                var number = Integer.parseInt(array[i]);
                find(number);
            }
            //find(num2);
            ShowResultMessage(field);
            /*
            if(temp!= 0){
                var stroka = inputLine1.getCharacters().toString();
                var num2 = Integer.parseInt(stroka);
                find(num2);
                ShowResultMessage(field);
            }
            else{
                input();
                var stroka = inputLine1.getCharacters().toString();
                var num2 = Integer.parseInt(stroka);
                find(num2);
                ShowResultMessage(field);
                temp++;
            }
            var stroka = inputLine1.getCharacters().toString();
            var num2 = Integer.parseInt(stroka);
            find(num2);
            ShowResultMessage(field);
             */
        //    var str2 = inputLine2.getCharacters().toString();
         //   var num2 = Integer.parseInt(str2);
         //   var result = num1 + num2;
         //   ShowResultMessage(result);
    }

    @FXML
    protected void onMinusButtonClick() {
        try {
            var str1 = inputLine1.getCharacters().toString();
            var num1 = Integer.parseInt(str1);
         //   var str2 = inputLine2.getCharacters().toString();
           // var num2 = Integer.parseInt(str2);
           // var result = num1 - num2;
           // ShowResultMessage(result);
        }
        catch (Exception ex) {
            ShowWarningMessage("Input is null");
        }
    }
    @FXML
    protected void onMultiplyButtonClick() {
        try {
            var str1 = inputLine1.getCharacters().toString();
            var num1 = Double.parseDouble(str1);
           // var str2 = inputLine2.getCharacters().toString();
           // var num2 = Double.parseDouble(str2);
           // var result = num1 * num2;
           // ShowResultMessage(result);
        }
        catch (Exception ex) {
            ShowWarningMessage("Input is null");
        }
    }
    @FXML
    protected void onDivideButtonClick() {
        try {
            var str1 = inputLine1.getCharacters().toString();
            var num1 = Double.parseDouble(str1);
          //  var str2 = inputLine2.getCharacters().toString();
          //  var num2 = Double.parseDouble(str2);
          //  if (num2 == 0) {
          //      ShowWarningMessage("Деление на 0");
          //      return;
          //  }
          //  var result = num1 / num2;
          //  ShowResultMessage(result);
        }
        catch (Exception ex) {
            ShowWarningMessage("Input is null");
        }
    }

    private void ShowResultMessage(String result) {
        var info = new Alert(Alert.AlertType.INFORMATION);
        info.setTitle("Result");
        info.setHeaderText("Successful");
        info.setContentText(result);
        info.showAndWait();
        /*
        var contentResult = "Sum of string number: " + result;
        var info = new Alert(Alert.AlertType.INFORMATION);
        info.initStyle(StageStyle.DECORATED);
        info.setTitle("Result");
        info.setHeaderText("Successful");
        info.setContentText(contentResult);
        info.showAndWait();
         */
    }

    private void ShowWarningMessage(String message) {
        var warning = new Alert(Alert.AlertType.WARNING);
        warning.initStyle(StageStyle.DECORATED);
        warning.setTitle("Warning");
        warning.setContentText(message);
        warning.showAndWait();
    }
}