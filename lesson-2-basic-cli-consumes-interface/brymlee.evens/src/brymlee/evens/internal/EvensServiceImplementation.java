package brymlee.evens.internal;

import java.util.stream.Collectors;
import brymlee.evens.external.EvensService;
import java.util.stream.IntStream;
import java.util.List;

public class EvensServiceImplementation implements EvensService{

    @Override 
    public List<Integer> getEvens(final Integer maxEvenInteger){
        return IntStream
            .rangeClosed(0, maxEvenInteger)
            .filter(integer -> integer % 2 == 0)
            .mapToObj(integer -> integer)
            .collect(Collectors.toList());
    }
}