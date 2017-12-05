package com.example.aman1.moviecharacters.presenter;

import android.util.Log;

import com.example.aman1.moviecharacters.ItemListActivity;
import com.example.aman1.moviecharacters.model.CharacterWrapper;
import com.example.aman1.moviecharacters.model.RelatedTopic;
import com.example.aman1.moviecharacters.services.RequestInterface;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by aman1 on 05/12/2017.
 */

public class CharacterPresenter {
    RequestInterface requestInterface;
    ItemListActivity itemListActivity;


    public CharacterPresenter(RequestInterface requestInterface, ItemListActivity itemListActivity) {
        this.requestInterface = requestInterface;
        this.itemListActivity = itemListActivity;
    }

    public void getCharactersList(){
        requestInterface.getCharactersList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<CharacterWrapper>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(CharacterWrapper value) {

                        itemListActivity.showList(value.getRelatedTopics());
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
