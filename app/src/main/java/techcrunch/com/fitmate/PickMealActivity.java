package techcrunch.com.fitmate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class PickMealActivity extends AppCompatActivity {

    private CardView carb_free, gluten_free, veg;
    private PrefHelper prefHelper;
    Intent mapIntent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_meal);

        prefHelper = new PrefHelper(this);
        mapIntent = new Intent(this, MainActivity.class);

        if(prefHelper.getMeal() != null){
            startActivity(mapIntent);
        }

        carb_free = (CardView) findViewById(R.id.carb_free);
        gluten_free = (CardView) findViewById(R.id.gluten_free);
        veg = (CardView) findViewById(R.id.veg);

        carb_free.setOnClickListener(carbOnClickListener);
        gluten_free.setOnClickListener(glutenOnClikcListener);
        veg.setOnClickListener(vegOnClickListener);

    }

    private View.OnClickListener carbOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            prefHelper.setMeal("Carb Free");
            startActivity(mapIntent);
        }
    };

    private View.OnClickListener glutenOnClikcListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            prefHelper.setMeal("Gluten Free");
            startActivity(mapIntent);
        }
    };

    private View.OnClickListener vegOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            prefHelper.setMeal("Vegetarian");
            startActivity(mapIntent);
        }
    };


}
