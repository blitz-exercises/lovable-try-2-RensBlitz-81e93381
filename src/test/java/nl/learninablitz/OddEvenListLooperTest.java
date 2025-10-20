package nl.learninablitz;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class OddEvenListLooperTest {

    @Test
    public void testLoopOverOddEvenList_normalCase_noExceptionThrown() {
        OddEvenListLooper looper = new OddEvenListLooper();
        assertDoesNotThrow(() -> looper.loopOverOddEvenList(Arrays.asList(1, 2, 3, 4, 5)));
    }

    @Test
    public void testLoopOverOddEvenList_emptyList_noExceptionThrown() {
        OddEvenListLooper looper = new OddEvenListLooper();
        assertDoesNotThrow(() -> looper.loopOverOddEvenList(Arrays.asList()));
    }

    @Test
    public void testLoopOverOddEvenList_nullList_throwsNullPointerException() {
        OddEvenListLooper looper = new OddEvenListLooper();
        assertThrows(NullPointerException.class, () -> looper.loopOverOddEvenList(null));
    }
}