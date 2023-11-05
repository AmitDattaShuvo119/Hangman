/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Base64;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sun.net.www.content.audio.x_aiff;

/**
 *
 * @author asus
 */
public class FXMLDocumentController implements Initializable {

    @FXML

    private Label label;

    @FXML
    private TextField tf1;
    @FXML
    private TextField tf2;
    @FXML
    private TextField tf3;
    @FXML
    private TextField tf4;
    @FXML
    private TextField tf5;
    @FXML
    private TextField tf6;
    @FXML
    private TextField tf7;

    @FXML
    private TextField d1;
    @FXML
    private TextField d2;
    @FXML
    private TextField d3;
    @FXML
    private TextField d4;
    @FXML
    private TextField d5;
    @FXML
    private TextField d6;
    @FXML
    private TextField d7;
    @FXML
    private TextField chances;
    @FXML
    private TextField result;

    public static double getRandomIntegerBetweenRange(double min, double max) {

        double x = (int) (Math.random() * ((max - min) + 1)) + min;

        return x;

    }

    char x;
    ArrayList<String> Base = new ArrayList();
    String a;
    static int count = 7;

    public void startGame() {

        try {
            File f = new File("A.txt");
            Scanner input = new Scanner(f);
            while (input.hasNext()) {
                Base.add(input.nextLine());

            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        double z = getRandomIntegerBetweenRange(1.0, 27.0);
        int value = (int) z;
        a = Base.get(value);
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                if (i == 0) {
                    d1.setText("X");
                }
                if (i == 1) {
                    d2.setText("X");
                }
                if (i == 2) {
                    d3.setText("X");
                }
                if (i == 3) {
                    d4.setText("X");
                }
                if (i == 4) {
                    d5.setText("X");
                }
                if (i == 5) {
                    d6.setText("X");
                }
                if (i == 6) {
                    d7.setText("X");
                }
            }
        }
        chances.setText(count + "");
    }

    public String findOut(String x) {
        String res = "";
        if (a.contains(x)) {
            for (int i = 0; i < a.length(); i++) {
                char ch = a.charAt(i);
                String b = ch + "";

                if (b.contains(x)) {
                    if (i == 0) {
                        tf1.setText(b);
                    }
                    if (i == 1) {
                        tf2.setText(b);
                    }
                    if (i == 2) {
                        tf3.setText(b);
                    }
                    if (i == 3) {
                        tf4.setText(b);
                    }
                    if (i == 4) {
                        tf5.setText(b);
                    }
                    if (i == 5) {
                        tf6.setText(b);
                    }
                    if (i == 6) {
                        tf7.setText(b);
                    }
                }

            }

        } else {
            if (count > 0) {
                count--;
                chances.setText(count + "");
            } else {
                result.setText("Game over! The country's name is: " + a);
            }
        }

        return res;
    }

    public void A() {

        findOut("A");

    }

    public void B() {

        findOut("B");

    }

    public void C() {

        findOut("C");

    }

    public void D() {

        findOut("D");

    }

    public void E() {

        findOut("E");

    }

    public void F() {

        findOut("F");

    }

    public void G() {

        findOut("G");

    }

    public void H() {

        findOut("H");

    }

    public void I() {

        findOut("I");

    }

    public void J() {

        findOut("J");

    }

    public void K() {

        findOut("K");

    }

    public void L() {

        findOut("L");

    }

    public void M() {

        findOut("M");

    }

    public void N() {

        findOut("N");

    }

    public void O() {

        findOut("O");

    }

    public void P() {

        findOut("P");

    }

    public void Q() {

        findOut("Q");

    }

    public void R() {

        findOut("R");

    }

    public void S() {

        findOut("S");

    }

    public void T() {

        findOut("T");

    }

    public void U() {

        findOut("U");

    }

    public void V() {

        findOut("V");

    }

    public void W() {

        findOut("W");

    }

    public void X() {

        findOut("X");

    }

    public void Y() {

        findOut("Y");

    }

    public void Z() {

        findOut("Z");

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
