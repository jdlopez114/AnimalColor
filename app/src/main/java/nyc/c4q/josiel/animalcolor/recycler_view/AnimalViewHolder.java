package nyc.c4q.josiel.animalcolor.recycler_view;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import nyc.c4q.josiel.animalcolor.R;
import nyc.c4q.josiel.animalcolor.backend.Animals;

public class AnimalViewHolder extends RecyclerView.ViewHolder{

    TextView animalName;

    public AnimalViewHolder(View itemView) {
        super(itemView);

        animalName = (TextView) itemView.findViewById(R.id.animal_name);
    }

    public void bind (Animals animals){
        animalName.setText(animals.getName());
        animalName.setTextColor(Color.parseColor(animals.getTextColor()));
    }
}
