package Generics.class03KeyValue;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;



public class Pairs <X extends Number,Y>{
    private final Set<Pair<X,Y>> itens = new HashSet<>();
    public void add(X key, Y value){
        if(key==null){
            return;
        }
        Pair<X,Y> newPair = new Pair< X,Y>(key, value);
        if(itens.contains(newPair)){
            itens.remove(newPair);
        }
        itens.add(new Pair<X,Y>(key,value));
    }
    public Y getValue(X key){
        Optional<Pair<X,Y>> optionalPair= itens.stream().filter(p-> key.equals(p.getKey())).findFirst();
        if(optionalPair.isPresent()){
            return optionalPair.get().getValue();
        }
        return null;
    }
}
