package nyc.c4q.josiel.animalcolor.recycler_view;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import nyc.c4q.josiel.animalcolor.R;
import nyc.c4q.josiel.animalcolor.backend.Animals;

public class AnimalViewHolder extends RecyclerView.ViewHolder{

    TextView animalName;
//    View frag_color;

    public AnimalViewHolder(View itemView) {

        super(itemView);

        animalName = (TextView) itemView.findViewById(R.id.animal_name);
//        frag_color = itemView.findViewById(R.id.fragment_color);

    }

    public void bind (Animals animals){
        animalName.setText(animals.getName());
        animalName.setTextColor(Color.parseColor(animals.getTextColor()));
//        frag_color.setBackgroundColor(Color.parseColor(animals.getBackground()));
    }


}
