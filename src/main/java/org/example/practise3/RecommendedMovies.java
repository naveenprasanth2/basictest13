package org.example.practise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecommendedMovies {
    public static void main(String[] args) {
        String[] movieTitles = {"The Dark Knight", "Inception", "Interstellar", "The Matrix", "Pulp Fiction"};
        int[] durations = {152, 148, 169, 136, 154};
        int preferredDuration = 150;
        String[] recommendedMovies = recommendMovies(movieTitles, durations, preferredDuration);
// recommendedMovies should contain {"The Dark Knight", "Pulp Fiction"} since their durations are closest to 150.
        System.out.println(Arrays.toString(recommendedMovies));

    }

    private static String[] recommendMovies(String[] movieTitles, int[] durations, int preferredDuration) {
        double minRange = preferredDuration * 0.95;
        double maxRange = preferredDuration * 1.05;
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < durations.length; i++) {
            if (durations[i] < maxRange && durations[i] > minRange) {
                indices.add(i);
            }
        }
        String[] recommendedMovies = new String[indices.size()];
        for (int i = 0; i < indices.size(); i++) {
            recommendedMovies[i] = movieTitles[indices.get(i)];
        }
        if (recommendedMovies.length == 0) {
            recommendedMovies = new String[1];
            recommendedMovies[0] = movieTitles[0];
        }

        return recommendedMovies;
    }
}
