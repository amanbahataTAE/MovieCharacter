package com.example.aman1.moviecharacters.services;

import com.example.aman1.moviecharacters.constants.Api_Constants;
import com.example.aman1.moviecharacters.model.CharacterWrapper;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by aman1 on 05/12/2017.
 */

public interface RequestInterface {
    @GET(Api_Constants.URL)
    Observable<CharacterWrapper> getCharactersList();
}
