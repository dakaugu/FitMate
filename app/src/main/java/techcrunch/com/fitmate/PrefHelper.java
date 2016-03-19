package techcrunch.com.fitmate;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by dakaugu on 3/19/16.
 */
public class PrefHelper {

    protected SharedPreferences mSharedPreferences;
    private static final String FITMATE_PREF = "fitmate pref";
    private static final String SAVED_MEAL = "saved meal";

    public PrefHelper(Context context) {
        mSharedPreferences = context.getSharedPreferences(FITMATE_PREF, Context.MODE_PRIVATE);
    }

    public void setMeal(String meal){
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(SAVED_MEAL, meal);
        editor.apply();
    }

    public String getMeal() {
        return mSharedPreferences.getString(SAVED_MEAL, null);
    }
}
