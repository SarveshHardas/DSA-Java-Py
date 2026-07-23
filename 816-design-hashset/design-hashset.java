class Node {
    int val;
    Node link;

    Node(int val) {
        this.val = val;
    }
}

class MyHashSet {
    Node[] bucket;

    public MyHashSet() {
        bucket = new Node[10];
    }

    int hash(int key) {
        return key % bucket.length;
    }

    public void add(int key) {
        int index = hash(key);

        if (bucket[index] == null) {
            bucket[index] = new Node(key);
            return;
        }

        Node curr = bucket[index];

        while (true) {
            if (curr.val == key) {
                return;
            }
            if (curr.link == null)
                break;
            curr = curr.link;
        }

        curr.link = new Node(key);
    }

    public void remove(int key) {
        int index = hash(key);
        Node curr = bucket[index];
        Node prev = null;

        while (curr != null) {
            if (curr.val == key) {
                if (prev == null) {
                    bucket[index] = curr.link;
                } else {
                    prev.link = curr.link;
                }

                return;
            }

            prev = curr;
            curr = curr.link;
        }
    }

    public boolean contains(int key) {
        int index = hash(key);
        Node curr = bucket[index];

        while(curr != null){
            if(curr.val == key){
                return true;
            }

            curr = curr.link;
        }

        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */