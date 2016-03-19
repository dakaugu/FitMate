package techcrunch.com.fitmate;

import retrofit2.Call;
import retrofit2.Callback;

/**
 * Created by dakaugu on 3/19/16.
 */
public class RestaurantApiHelper {

    private FitMateAPI.RestaurantApiService restaurantApiService;

    public RestaurantApiHelper(){
        restaurantApiService = FitMateAPI.builder.create(FitMateAPI.RestaurantApiService.class);
    }

    public void getRestaurants(Callback<RestaurantsResponse> callback){
        Call<RestaurantsResponse> call = restaurantApiService.getRestaurantsResponse();
        call.enqueue(callback);
    }
}
