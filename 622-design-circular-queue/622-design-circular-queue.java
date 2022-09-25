class MyCircularQueue {
    private List<Integer> cqueue;
    private int n;
    
    
    
    public MyCircularQueue(int k) {
        cqueue = new LinkedList<>();
        n=k;
    }
    
    public boolean enQueue(int value) {
        if(cqueue.size()<n){
            cqueue.add(value);
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if(cqueue.size()>0){
            cqueue.remove(0);
            return true;
        }
        return false;
    }
    
    public int Front() {
        return cqueue.size()==0?-1:cqueue.get(0);
    }
    
    public int Rear() {
        // System.out.println(cqueue.size());
        return cqueue.size()==0?-1:cqueue.get(cqueue.size()-1);
    }
    
    public boolean isEmpty() {
        return cqueue.size()==0?true:false;
    }
    
    public boolean isFull() {
        return cqueue.size()==n?true:false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */