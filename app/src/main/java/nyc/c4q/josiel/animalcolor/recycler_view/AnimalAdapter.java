package nyc.c4q.josiel.animalcolor.recycler_view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import nyc.c4q.josiel.animalcolor.R;
import nyc.c4q.josiel.animalcolor.backend.Animals;


public class AnimalAdapter extends RecyclerView.Adapter <AnimalViewHolder> {

    List<Animals> animalsList;

    public AnimalAdapter(List<Animals> animalsList) {
        this.animalsList = animalsList;
    }

    @Override
    public AnimalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_view, parent, false);
        return new AnimalViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(AnimalViewHolder holder, int position) {
        Animals myAnimal = animalsList.get(position);
        holder.bind(myAnimal);
    }

    @Override
    public int getItemCount() {
        return animalsList.size();
    }
}
