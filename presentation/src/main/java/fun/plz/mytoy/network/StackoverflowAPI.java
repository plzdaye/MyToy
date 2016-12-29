package fun.plz.mytoy.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by plzda on 2016/11/24.
 */

public interface  StackoverflowAPI {
    @GET("/2.2/questions?order=desc&sort=creation&site=stackoverflow")
    Call<StackoverflowQuestions> loadQuestions(@Query("tagged") String tags);
}
