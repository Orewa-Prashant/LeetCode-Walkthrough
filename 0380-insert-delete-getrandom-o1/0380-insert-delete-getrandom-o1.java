class RandomizedSet {
    private List<Integer> list;
    private Map<Integer,Integer> map;
    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }
    
    public boolean insert(int val) {
        // System.out.println(map+"--->"+list);
        if(map.containsKey(val)  && map.get(val)>=0)return false;
        list.add(val);
        map.put(val,list.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        // System.out.println(map+"--->"+list);
        int ind = map.getOrDefault(val,-1);
        if(ind == -1) return false;
        int lastVal = list.get(list.size()-1);
        // System.out.println(lastVal+" "+ind);
        list.set(ind, lastVal);
        list.set(list.size()-1, val);
        // System.out.println(list);
        list.remove(list.size()-1);
        map.put(lastVal,ind);
        map.put(val,-1);
        // System.out.println(map+"--->"+list);
        return true;
    }
    
    public int getRandom() {
        int max = list.size();
        int min = 0;
        return list.get((int)(Math.random() * (max-min)+min));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */