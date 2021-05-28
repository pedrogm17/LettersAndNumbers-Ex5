package es.ulpgc.eite.cleancode.lettersandnumbers.letters;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import es.ulpgc.eite.cleancode.lettersandnumbers.data.BaseData;
import es.ulpgc.eite.cleancode.lettersandnumbers.data.LetterData;

public class LetterListModel implements LetterListContract.Model {

  public static String TAG = LetterListModel.class.getSimpleName();

  private String data;
  private ArrayList<String> listaLetras;
  private String LETRAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";



  public LetterListModel(String data) {
    this.data = data;
  }

  @Override
  public String getLetras(){
    return LETRAS;
  }

  @Override
  public ArrayList<String> getListaLetras(){
    return listaLetras;
  }


  @Override
  public String getStoredData() {
    // Log.e(TAG, "getStoredData()");
    return data;
  }

  @Override
  public void onRestartScreen(String data) {
    // Log.e(TAG, "onRestartScreen()");
  }

  @Override
  public void onDataFromNextScreen(String data) {
    // Log.e(TAG, "onDataFromNextScreen()");
  }

  @Override
  public void onDataFromPreviousScreen(String data) {
    // Log.e(TAG, "onDataFromPreviousScreen()");
  }

  @Override
  public void addLetter(String letra){
    listaLetras.add(letra);
    data = listaLetras.get(listaLetras.size());
  }


}
