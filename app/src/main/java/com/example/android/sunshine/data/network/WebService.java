package com.example.android.sunshine.data.network;


import com.example.android.sunshine.data.POJO.Response;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WebService {

    @GET("weather")
    Call<Response> repos(
            @Query("q") String q,
            @Query("mode") String format,
            @Query("units") String units,
            @Query("cnts") String days
            );
}