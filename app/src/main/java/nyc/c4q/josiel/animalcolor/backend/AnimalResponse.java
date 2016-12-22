package nyc.c4q.josiel.animalcolor.backend;


import java.util.List;

public class AnimalResponse {

    private List<Animals> animals;

    private String success;

    public List<Animals> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animals> animals) {
        this.animals = animals;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

}
