class SmallestInfiniteSet {
    List<Integer> list;

    public SmallestInfiniteSet() {
        list = new LinkedList<>();
        for(int i=1;i<=2001;i++)list.add(i);
    }
    
    public int popSmallest() {
        return list.remove(0);
    }
    
    public void addBack(int num) {
        int ind = Collections.binarySearch(list, num);
        if(ind<0)list.add(-ind -1,num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */