package com.example.wa_v_er.retrofit_test.network;

import com.example.wa_v_er.retrofit_test.object.RetroPhoto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Mens_Wear {
    @GET("/menswear")
    Call<List<RetroPhoto>> getAllPhotos();
}
