package nyc.c4q.josiel.animalcolor;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import nyc.c4q.josiel.animalcolor.backend.APIService;
import nyc.c4q.josiel.animalcolor.backend.AnimalResponse;
import nyc.c4q.josiel.animalcolor.backend.Animals;
import nyc.c4q.josiel.animalcolor.recycler_view.AnimalAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AnimalFragment extends Fragment {

    RecyclerView recyclerView;
    AnimalAdapter animalAdapter;
    List<Animals> animalsList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_view, container, false);
        recyclerView = (RecyclerView) root.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        fetchAnimals();
        return root;
    }

    private void fetchAnimals() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://jsjrobotics.nyc/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APIService service = retrofit.create(APIService.class);

        Call<AnimalResponse> call = service.getAnimals();
        call.enqueue(new Callback<AnimalResponse>() {

            @Override
            public void onResponse(Call<AnimalResponse> call, Response<AnimalResponse> response) {
                AnimalResponse rr = response.body();
                animalsList = rr.getAnimals();

                animalAdapter = new AnimalAdapter(animalsList);
                recyclerView.setAdapter(animalAdapter);
            }

            @Override
            public void onFailure(Call<AnimalResponse> call, Throwable t) {

            }
        });
    }
}