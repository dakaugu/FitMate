package techcrunch.com.fitmate;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dakaugu on 3/19/16.
 */
public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder>{

    Context context;
    LayoutInflater inflater;
    List<Restaurant> restaurants = new ArrayList<>();

    public ListAdapter(Context context, List<Restaurant> restaurants) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.restaurants = restaurants;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.restaurant_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(restaurants.get(position));
    }

    @Override
    public int getItemCount() {
        if (restaurants != null){
            return restaurants.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView title, address, resto_type;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.image);
            title = (TextView) itemView.findViewById(R.id.resto_name);
            address = (TextView) itemView.findViewById(R.id.resto_address);
            resto_type = (TextView) itemView.findViewById(R.id.resto_type);
        }

        public void bind(Restaurant restaurant){
            PrefHelper prefHelper = new PrefHelper(context);

            title.setText(restaurant.getFields().getName());
            address.setText(restaurant.getFields().getAddress());
            resto_type.setText(prefHelper.getMeal());

            Glide.with(context)
                    .load(restaurant.getFields().getImage())
                    .into(imageView);
        }
    }
}
