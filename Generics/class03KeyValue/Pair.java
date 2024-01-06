package Generics.class03KeyValue;

public class Pair<T,Y> {
    private T key; 
    private Y value;
    
    public Pair(T key, Y value) {
        this.key = key;
        this.value = value;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pair<?,?> other = (Pair<?,?>) obj;
        if (key == null) {
            if (other.key != null)
                return false;
        } else if (!key.equals(other.key))
            return false;
        return true;
    }

    public T getKey() {
        return key;
    }
    public void setKey(T key) {
        this.key = key;
    }
    public Y getValue() {
        return value;
    }
    public void setValue(Y value) {
        this.value = value;
    }
    
}
