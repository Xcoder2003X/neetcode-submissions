class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

     Map<String, List<String>> map = new HashMap<>();

    for (String s : strs) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String key = new String(chars);

        // hadi pour que si l anag n existe pas dans map ajoute la , si existe ajoute la dans arraylist de la cle courante
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
    }

    return new ArrayList<>(map.values());
        
    }

}
