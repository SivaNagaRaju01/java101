package Interfaces;

public interface Series {
    int getNext();

    default int[] getNextArray(int n) {
        return getArray(n);
    }

    default int[] skipAndgetNextArray(int skip, int n) {
        getArray(skip);

        return getArray(n);
    }

    private int[] getArray(int n) {
        int[] vals = new int[n];

        for(int i=0; i<n; i++) vals[i] = getNext();
        
        return vals;
    }
    
    void reset();
    void setStart(int x);
}

class ByTwos implements Series {
    int start;
    int val;
    int prev;

    ByTwos() {
        start = 0;
        val = 0;
        prev = -2;
    }

    public int getNext() {
        prev = val;
        val += 2;
        return val;
    }

    public void reset() {
        val = start;
        prev = start - 2;
    }

    public void setStart(int x) {
        start = x;
        val = x;
        prev = x - 2;
    }

    int getPrevious() {
        return prev;
    }
}

class ByThree implements Series {
    int start;
    int val;

    ByThree() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 3;
        return val;
    }

    public void reset() {
        val = start;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}
