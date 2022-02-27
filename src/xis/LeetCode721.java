// package xis;
//
// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
//
// public class LeetCode721 {
//
//   public List<List<String>> accountsMerge(List<List<String>> accounts) {
//     HashMap<String, GraphNode> map = new HashMap<>();
//     for (List<String> list : accounts) {
//       String name = list.get(0);
//       for (int i = 1; i < list.size(); i++) {
//         String current = list.get(i);
//         map.putIfAbsent(current, new GraphNode(name));
//         for (int j = i + 1; j < list.size(); j++) {
//           String neighbor = list.get(j);
//         }
//       }
//     }
//
//   class GraphNode {
//
//     String name;
//     List<String> neighbors;
//
//     GraphNode(String name) {
//       this.name = name;
//       neighbors = new ArrayList<>();
//     }
//   }
// }
//
