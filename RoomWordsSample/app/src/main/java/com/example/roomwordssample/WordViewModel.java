package com.example.roomwordssample;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class WordViewModel extends AndroidViewModel {

    private WordRepository mRepository;
    private LiveData<List<Word>> mAllWords;

    public WordViewModel(@NonNull @NotNull Application application) {
        super(application);
        mRepository = new WordRepository(application);
        mAllWords = mRepository.getAllWords();
    }

    // UI로부터 구현을 완전히 가린다
    LiveData<List<Word>> getAllWords(){
        return mAllWords;
    }

    // Repository의 insert메서드를 호출하는 메서드
    // insert구현은 완벽히 UI로부터 가려진다
    public void insert(Word word) {
        mRepository.insert(word);
    }


}
