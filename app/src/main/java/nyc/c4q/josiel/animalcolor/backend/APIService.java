package nyc.c4q.josiel.animalcolor.backend;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
    @GET("/cgi-bin/12_21_2016_exam.pl") // end point is after the first slash
    Call<AnimalResponse> getAnimals();

}
