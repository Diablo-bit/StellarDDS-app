package com.example.stellarddsapp;


import com.example.stellarddsapp.pojofile.Data;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public class ApiClient {
    private static final String url = "https://wtx-phoenix.herokuapp.com/";

    public static  Postservice postservice =null;
    public static  Postservice getService(){
        if(postservice == null){

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            postservice =retrofit.create(Postservice.class);

        }
        return postservice;
    }

    public interface Postservice{

//       @FormUrlEncoded    // annotation that used with POST type request
//       @POST("webservices/loginwithemail/") // specify the sub url for our base url
//       public Call<Data> getData(
//               @Field("email") String email,
//               @Field("password") String password, Callback<Data> callback);


        @POST("user/login")
        @Headers("Content-Type: application/json")
        Call<Data> getData(@Query("email")String email, @Query("password")String password);


//
//       @POST("webservices/loginwithemail/")
//       @FormUrlEncoded
//       Call<Data> getData(@Body Data post);
    }


//      @POST(url)
//      Call<Data> getData(@Path("email")String email,@Path("password")String password);




}
