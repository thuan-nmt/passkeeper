package com.example.passkeeper.data.api;

import com.example.passkeeper.data.model.Group;
import com.example.passkeeper.data.model.ListGroup;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GroupApi {
    @GET("groups/")
    Call<ListGroup> getListGroup(@Header("Authorization") String token, @Query("page") int page);

    @POST("groups/")
    Call<Group> addGroup(@Header("Authorization") String token, @Body Group group);

    @DELETE("groups/{id}/")
    Call<Group> deleteGroup(@Header("Authorization") String token, @Path(value = "id") int id);
}
