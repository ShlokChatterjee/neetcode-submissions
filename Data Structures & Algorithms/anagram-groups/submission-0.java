class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hp = new HashMap<>();

        for (String s : strs){
            int[] count= new int[26];
            for (char c: s.toCharArray()){
                count [c - 'a']++;
            }
            String key = Arrays.toString(count);
            hp.putIfAbsent(key, new ArrayList<>());
            hp.get(key).add(s);

        }
        return new ArrayList<>(hp.values());
    }
}
