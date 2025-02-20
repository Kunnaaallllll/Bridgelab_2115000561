import java.util.*;

public class VotingSystem {
    private static Map<String,Integer> votesMap=new HashMap<>();
    private static Map<String,Integer> orderedVotesMap=new LinkedHashMap<>();
    private static Map<String,Integer> sortedVotesMap=new TreeMap<>((a,b)->votesMap.get(b)-votesMap.get(a));

    public static void addVote(String candidate) {
        votesMap.put(candidate,votesMap.getOrDefault(candidate,0)+1);
        orderedVotesMap.put(candidate,votesMap.get(candidate));
        sortedVotesMap.put(candidate,votesMap.get(candidate));
    }

    public static void displayHashMap() {
        System.out.println("HashMap (Votes):");
        votesMap.forEach((candidate,votes)->System.out.println(candidate+":"+votes));
    }

    public static void displayLinkedHashMap() {
        System.out.println("LinkedHashMap (Ordered Votes):");
        orderedVotesMap.forEach((candidate,votes)->System.out.println(candidate+":"+votes));
    }

    public static void displayTreeMap() {
        System.out.println("TreeMap (Sorted Votes):");
        sortedVotesMap.forEach((candidate,votes)->System.out.println(candidate+":"+votes));
    }

    public static void main(String[] args) {
        addVote("Kunal");
        addVote("Anuj");
        addVote("Bhagyodaya");
        addVote("Arush");
        addVote("suraj");
        addVote("ayush");

        displayHashMap();
        displayLinkedHashMap();
        displayTreeMap();
    }
}
