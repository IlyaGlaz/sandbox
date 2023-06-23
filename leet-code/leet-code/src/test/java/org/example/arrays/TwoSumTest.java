package org.example.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoSumTest {

    TwoSum twoSum;

    @BeforeEach
    void init() {
        twoSum = new TwoSum();
    }

    @ParameterizedTest
    @MethodSource("args")
    void test(int[] arr, int target, int[] expected) {
        int[] actual = twoSum.twoSum(arr, target);

        assertArrayEquals(expected, actual);
    }

    static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1}),
                Arguments.of(new int[]{2, 4, 10, 7}, 9, new int[]{0, 3}));
    }
}