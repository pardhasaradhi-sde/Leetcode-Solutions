import java.util.*;

class FoodRatings {

    // Stores food -> (rating, cuisine)
    private Map<String, Pair> foodRating;
    // Stores cuisine -> max heap of foods
    private Map<String, PriorityQueue<PairFood>> cuisinesMap;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodRating = new HashMap<>();
        cuisinesMap = new HashMap<>();

        for (int i = 0; i < foods.length; i++) {
            foodRating.put(foods[i], new Pair(ratings[i], cuisines[i]));

            cuisinesMap.putIfAbsent(cuisines[i], new PriorityQueue<>((a, b) -> {
                if (a.rating != b.rating) {
                    return b.rating - a.rating; // higher rating first
                }
                return a.food.compareTo(b.food); // lexicographically smaller first
            }));

            cuisinesMap.get(cuisines[i]).add(new PairFood(ratings[i], foods[i]));
        }
    }

    public void changeRating(String food, int newRating) {
        String cuisine = foodRating.get(food).cuisine;
        foodRating.put(food, new Pair(newRating, cuisine));
        cuisinesMap.get(cuisine).add(new PairFood(newRating, food));
    }

    public String highestRated(String cuisine) {
        PriorityQueue<PairFood> pq = cuisinesMap.get(cuisine);

        while (!pq.isEmpty()) {
            PairFood top = pq.peek();
            if (foodRating.get(top.food).rating == top.rating) {
                return top.food;
            }
            pq.poll(); // remove outdated
        }
        return "";
    }

    // Helper classes
    private static class Pair {
        int rating;
        String cuisine;

        Pair(int rating, String cuisine) {
            this.rating = rating;
            this.cuisine = cuisine;
        }
    }

    private static class PairFood {
        int rating;
        String food;

        PairFood(int rating, String food) {
            this.rating = rating;
            this.food = food;
        }
    }
}
