package brymlee.evens.test;

import java.util.List;
import org.junit.Test;
import java.util.ServiceLoader;
import java.util.ServiceLoader.Provider;
import brymlee.evens.external.EvensService;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.Arrays;

import static org.junit.Assert.*;

public class EvensServiceTest{

    @Test
    public void allIntegersReturnedByEvensServiceShouldBeEven(){
        final ServiceLoader<EvensService> serviceLoader = ServiceLoader.load(EvensService.class);
        final Optional<Provider<EvensService>> evensService = serviceLoader
            .stream()
            .findFirst();
        if(!evensService.isPresent()){
            throw new RuntimeException("No EvensService found ... terminating.");
        }
        final List<Integer> actualEvens = evensService.get().get().getEvens(10);
        final List<Integer> expectedEvens = Arrays.asList(0, 2, 4, 6, 8, 10);
        assertEquals(Integer.valueOf(expectedEvens.size()), Integer.valueOf(actualEvens.size()));
        final Boolean doAllEvensMatch = IntStream.range(0, actualEvens.size())
            .mapToObj(index -> index)
            .allMatch(index -> expectedEvens.get(index).equals(actualEvens.get(index)));
        assertTrue(doAllEvensMatch);
    }

}