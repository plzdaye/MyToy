package fun.plz.mytoy.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by PLZ on 2016/11/18.
 */

public class PLZRetrofit {
    final GankApi gankService;

    final static Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
            .serializeNulls()
            .create();

    PLZRetrofit(){
        OkHttpClient client = new OkHttpClient.Builder().connectTimeout(12, TimeUnit.SECONDS).build();

        Retrofit.Builder builder = new Retrofit.Builder().client(client)
                .baseUrl("http://gank.io/api/")
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create());
        Retrofit retrofit = builder.build();
        gankService = retrofit.create(GankApi.class);
    }

    public GankApi getGankService(){
        return gankService;
    }
}
