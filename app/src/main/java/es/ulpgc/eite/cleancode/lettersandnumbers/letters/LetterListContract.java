package es.ulpgc.eite.cleancode.lettersandnumbers.letters;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

import es.ulpgc.eite.cleancode.lettersandnumbers.data.BaseData;
import es.ulpgc.eite.cleancode.lettersandnumbers.data.LetterData;

public interface LetterListContract {

  interface View {
    void injectPresenter(Presenter presenter);

    void onDataUpdated(LetterListViewModel viewModel);
    void navigateToNextScreen();

  }

  interface Presenter {
    void injectView(WeakReference<View> view);
    void injectModel(Model model);

    void onResume();
    void onStart();
    void onRestart();
    void onBackPressed();
    void onPause();
    void onDestroy();

    void onClickLetterListCell(LetterData data);
    void onClickLetterListButton();
  }

  interface Model {
    String getStoredData();
    void onDataFromNextScreen(String data);
    void onRestartScreen(String data);
    void onDataFromPreviousScreen(String data);
    void addLetter(String letra);
    String getLetras();
    ArrayList<String> getListaLetras();
  }


}
