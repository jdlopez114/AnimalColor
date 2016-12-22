package nyc.c4q.josiel.animalcolor;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

import nyc.c4q.josiel.animalcolor.backend.Animals;
import nyc.c4q.josiel.animalcolor.recycler_view.AnimalAdapter;

public class AnimalFragment extends Fragment {

    RecyclerView recyclerView;
    AnimalAdapter animalAdapter;
    List<Animals> animalsList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);

        View root = inflater.inflate
    }
}
