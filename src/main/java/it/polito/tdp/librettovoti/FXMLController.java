package it.polito.tdp.librettovoti;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import librettovoti.model.Libretto;
import librettovoti.model.Voto;
import javafx.event.ActionEvent;

public class FXMLController {

	private Libretto model;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtEsame;

    @FXML
    private TextField txtVoto;

    @FXML
    private TextField txtData;

    @FXML
    private TextArea txtResult;
    
    @FXML
    void handleInserisci(ActionEvent event) {
    	//leggi e controlla i dati
    	String nomeEsame= txtVoto.getText();
    	if(nomeEsame.length()==0) {
    		txtResult.setText("Errore: nome esame vuoto");
    		return;
    	}
    	String votoEsame=txtVoto.getText();
    	int votoInt=Integer.parseInt(votoEsame);
    	String dataEsame=txtData.getText();
    	LocalDate data=LocalDate.parse(dataEsame);
    	//bisogna aggiungere poi tutti i controlli per verificare che i dati siano corretti
    	//se invece dovesse controllare se dati gia stati inseriti quello lo fa il model
    	
    	
    	//esegui azione
    	Voto voto=new Voto(nomeEsame,votoInt,data);
    	model.add(voto);
    	
    	
    	//aggiorna i risultati(nella View)
    	txtResult.setText(model.toString());
    }

    @FXML
    void initialize() {
        assert txtEsame != null : "fx:id=\"txtEsame\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtVoto != null : "fx:id=\"txtVoto\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtData != null : "fx:id=\"txtData\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";

    }
    
    public void setModel(Libretto model) {
    	this.model=model;
    }
}
