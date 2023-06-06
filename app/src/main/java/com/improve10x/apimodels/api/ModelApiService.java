package com.improve10x.apimodels.api;

import com.improve10x.apimodels.models.Shop;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ModelApiService {

    @GET("renukaTemplates")
    Call<List<Shop>> getItems();
}
