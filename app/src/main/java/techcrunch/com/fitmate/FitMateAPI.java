package techcrunch.com.fitmate;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

/**
 * Created by dakaugu on 3/19/16.
 */
public class FitMateAPI {

    public static final String BASE_URL = "http://c7cc0514.ngrok.io/";

    public static Retrofit builder = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public interface RestaurantApiService {

        @GET("restaurants/")
        Call<RestaurantsResponse> getRestaurantsResponse();
    }
}
