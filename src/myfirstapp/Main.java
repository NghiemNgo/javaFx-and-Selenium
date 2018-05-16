/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import javafx.application.Application; 
import javafx.collections.FXCollections; 
import javafx.collections.ObservableList; 

import javafx.geometry.Insets; 
import javafx.geometry.Pos; 

import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.CheckBox; 
import javafx.scene.control.ChoiceBox; 
import javafx.scene.control.DatePicker; 
import javafx.scene.control.Label;
import javafx.scene.control.ListView; 
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton; 
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text;
import javafx.scene.control.TextField; 
import javafx.scene.control.ToggleGroup;  
import javafx.scene.control.ToggleButton; 
import javafx.stage.Stage; 
public class Main extends Application {

    @Override 
   public void start(Stage stage) {    
    //Label for name 
    Label nameLabel = new Label("Name"); 

    //Text field for name 
    TextField nameText = new TextField();

    Label pwdLabel = new Label("Password");
    final PasswordField pwdField = new PasswordField();

    //Label for date of birth 
    Label dobLabel = new Label("Date of birth"); 

    //date picker to choose date 
    DatePicker datePicker = new DatePicker(); 

    //Label for gender
    Label genderLabel = new Label("gender"); 

    //Toggle group of radio buttons       
    ToggleGroup groupGender = new ToggleGroup(); 
    RadioButton maleRadio = new RadioButton("male"); 
    maleRadio.setToggleGroup(groupGender); 
    RadioButton femaleRadio = new RadioButton("female"); 
    femaleRadio.setToggleGroup(groupGender); 

    //Label for reservation 
    Label reservationLabel = new Label("Reservation"); 

    //Toggle button for reservation 
    ToggleButton Reservation = new ToggleButton(); 
    ToggleButton yes = new ToggleButton("Yes"); 
    ToggleButton no = new ToggleButton("No"); 
    ToggleGroup groupReservation = new ToggleGroup(); 
    yes.setToggleGroup(groupReservation);   
    no.setToggleGroup(groupReservation); 

    //Label for technologies known 
    Label technologiesLabel = new Label("Technologies Known"); 

    //check box for education 
    CheckBox javaCheckBox = new CheckBox("Java"); 
    javaCheckBox.setIndeterminate(false); 

    //check box for education 
    CheckBox dotnetCheckBox = new CheckBox("DotNet"); 
    javaCheckBox.setIndeterminate(false); 

    //Label for education 
    Label educationLabel = new Label("Educational qualification"); 

    //list View for educational qualification 
    ObservableList<String> names = FXCollections.observableArrayList( 
       "Engineering", "MCA", "MBA", "Graduation", "MTECH", "Mphil", "Phd"); 
    ListView<String> educationListView = new ListView<String>(names); 

    //Label for location 
    Label locationLabel = new Label("location"); 

    //Choice box for location 
    ChoiceBox locationchoiceBox = new ChoiceBox(); 
    locationchoiceBox.getItems().addAll
       ("Hyderabad", "Chennai", "Delhi", "Mumbai", "Vishakhapatnam"); 

    //Label for register 
    Button buttonRegister = new Button("Register");

    //Creating a Grid Pane 
    GridPane gridPane = new GridPane();    

    //Setting size for the pane 
    gridPane.setMinSize(500, 500); 

    //Setting the padding    
    gridPane.setPadding(new Insets(10, 10, 10, 10));  

    //Setting the vertical and horizontal gaps between the columns 
    gridPane.setVgap(5); 
    gridPane.setHgap(5);       

    //Setting the Grid alignment 
    gridPane.setAlignment(Pos.CENTER); 

    //Arranging all the nodes in the grid 
    gridPane.add(nameLabel, 0, 0); 
    gridPane.add(nameText, 1, 0);
    gridPane.add(pwdLabel, 0, 1); 
    gridPane.add(pwdField, 1, 1); 

    gridPane.add(dobLabel, 0, 2);       
    gridPane.add(datePicker, 1, 2); 

    gridPane.add(genderLabel, 0, 3); 
    gridPane.add(maleRadio, 1, 3);       
    gridPane.add(femaleRadio, 2, 2); 
    gridPane.add(reservationLabel, 0, 4); 
    gridPane.add(yes, 1, 4);       
    gridPane.add(no, 2, 3);  

    gridPane.add(technologiesLabel, 0, 5); 
    gridPane.add(javaCheckBox, 1, 5);       
    gridPane.add(dotnetCheckBox, 2, 4);  

    gridPane.add(educationLabel, 0, 6); 
    gridPane.add(educationListView, 1, 6);      

    gridPane.add(locationLabel, 0, 7); 
    gridPane.add(locationchoiceBox, 1, 7);    

    gridPane.add(buttonRegister, 2, 8);      

    //Styling nodes   
    buttonRegister.setStyle(
       "-fx-background-color: darkslateblue; -fx-textfill: white;"); 
    pwdLabel.setStyle("-fx-font: bold");
    nameLabel.setStyle("-fx-font: bold"); 
    dobLabel.setStyle("-fx-font: bold"); 
    genderLabel.setStyle("-fx-font: bold"); 
    reservationLabel.setStyle("-fx-font: bold"); 
    technologiesLabel.setStyle("-fx-font: bold"); 
    educationLabel.setStyle("-fx-font: bold"); 
    locationLabel.setStyle("-fx-font: bold"); 
       
      //Setting the back ground color 
    gridPane.setStyle("-fx-background-image: url('images/background.jpg');"
            + "-fx-background-size: cover;"
            + "-fx-font-size: 16pt;"
            + "-fx-font-family: 'Times New Roman';"
            + "-fx-base: rgb(132, 145, 47);");       

    //Creating a scene object 
    Scene scene = new Scene(gridPane); 

    //Setting title to the Stage 
    stage.setTitle("Registration Form"); 

    //Adding scene to the stage 
    stage.setScene(scene);  

    //Displaying the contents of the stage 
    stage.show(); 
   }      

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nghiemnv\\Documents\\NetBeansProjects\\MyFirstApp\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/login");
        driver.findElement(By.id("login_field")).sendKeys("nghiem.ngo22@gmail.com");
        driver.findElement(By.id("password")).sendKeys("abc");
        WebElement submitButton = driver.findElement(By.name("commit"));
        submitButton.click();
//        driver.get("https://github.com/pulls");
//        Thread.sleep(5000);
//	driver.quit();

//Creating a GridPane container
//        Application.launch(args);
    }
}