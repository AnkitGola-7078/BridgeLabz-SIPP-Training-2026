package Graph_ScenarioBased;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Representation {
     Map<Integer, Set<Integer>> friendGraph = new HashMap<>();

    void addFriendship(int u, int v) {
        friendGraph.computeIfAbsent(u, k -> new HashSet<>()).add(v);
        friendGraph.computeIfAbsent(v, k -> new HashSet<>()).add(u);
    }

    boolean isFriend(int u, int v) {
        return friendGraph.getOrDefault(u, Collections.emptySet()).contains(v);
    }
    public static void main(String[] args) {
        Representation graph = new Representation();
        graph.addFriendship(1, 2);
        graph.addFriendship(1, 3);
        graph.addFriendship(2, 4);

        System.out.println(graph.isFriend(1, 2)); // Output: true
        System.out.println(graph.isFriend(1, 4)); // Output: false
    }
}
