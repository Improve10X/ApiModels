package com.improve10x.apimodels.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ModelApi {

    public ModelApiService createModelApiService(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://crudcrud.com/api/479dd07f8c1d482e9219f7dcb48e25f4/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ModelApiService modelApiService = retrofit.create(ModelApiService.class);
        return modelApiService;
    }
}

