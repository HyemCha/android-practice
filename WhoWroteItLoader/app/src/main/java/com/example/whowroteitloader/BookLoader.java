package com.example.whowroteitloader;


import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

public class BookLoader extends AsyncTaskLoader<String> {
    // 요청 문자열을 가지고 있는 멤버 변수
    private String mQueryString;

    @Nullable
    @Override
    public String loadInBackground() { // AsyncTask의 doInBackground()메서드와 유사함
        return NetworkUtils.getBookInfo(mQueryString);
    }

    public BookLoader(@NonNull Context context, String queryString) {
        super(context);
        mQueryString = queryString;
    }

    // 내가 loader를 시작할 때 시스템이 호출하는 메서드
    @Override
    protected void onStartLoading() {
        super.onStartLoading();

        forceLoad();
    }
}
