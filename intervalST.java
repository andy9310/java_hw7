class IntervalST<Key extends Comparable<Key>, Value>{
    private Node root;

    private class Node {
        private Key lo, hi, max;
        private Value val;
        private int size;
        private Node left, right;
        
        public Node(Key lo, Key hi, Value val) {
            // initializes the node if required.
        }
    }

    public IntervalST()
    {
        // initializes the tree if required.
    }
    
    public void put(Key lo, Key hi, Value val)
    {
        // insert a new interval here.
        // lo    : the starting point of the interval. lo included
        // hi    : the ending point of the interval. hi included
        // val   : the value stored in the tree.
    }
    
    public void delete(Key lo, Key hi)
    {
        // remove an interval of [lo,hi]
        // do nothing if interval not found.
    }
    
    public List<Value> intersects(Key lo, Key hi)
    {
        // return the values of all intervals within the tree which intersect with [lo,hi].
    }
    
    public static void main(String[]args)
    {
        // Example
        IntervalST<Integer, String> IST = new IntervalST<>();
        IST.put(2,5,"badminton");
        IST.put(1,5,"PDSA HW7");
        IST.put(3,5,"Lunch");
        IST.put(3,6,"Workout");
        IST.put(3,7,"Do nothing");
        IST.delete(2,5); // delete "badminton"
        System.out.println(IST.intersects(1,2));
        
        IST.put(8,8,"Dinner");
        System.out.println(IST.intersects(6,10));
        
        IST.put(3,7,"Do something"); // If an interval is identical to an existing node, then the value of that node is updated accordingly
        System.out.println(IST.intersects(7,7));
        
        IST.delete(3,7); // delete "Do something"
        System.out.println(IST.intersects(7,7));
    }
}