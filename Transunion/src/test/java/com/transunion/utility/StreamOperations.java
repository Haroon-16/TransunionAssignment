package com.transunion.utility;

import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {

    public List<Integer> squareNumbers(List<Integer> numbers) {
        return numbers.stream()
                      .map(n -> n * n)
                      .collect(Collectors.toList());
    }

    public List<Integer> squareEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                      .filter(n -> n % 2 == 0)
                      .map(n -> n * n)
                      .collect(Collectors.toList());
    }
}
