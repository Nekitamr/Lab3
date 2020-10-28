package nikita.melyanov.s301099466.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import nikita.melyanov.s301099466.NikitaCanvasView;
import nikita.melyanov.s301099466.R;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private NikitaCanvasView customCanvas;


    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");

    }

    public LiveData<String> getText() {
        return mText;
    }
}