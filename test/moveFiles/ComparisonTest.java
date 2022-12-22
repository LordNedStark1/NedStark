package moveFiles;

import chapterTwo.Tenary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ComparisonTest {
    Tenary.Comparison comparison;
    @BeforeEach
    void startAllWith() {
      this.comparison = new Tenary.Comparison();
    }
    @Test
    public void AddInteger() {
        assertEquals(10, comparison.intAddition(2, 3, 5));
    }
    @Test
    void findMinimumOfThreeNumber(){
        assertEquals(5,comparison.smallestNumber(5,7,10));
    }
    @Test
    void productOfThreeNumber(){
        assertEquals(16, comparison.product(2,4,2));
    }
    @Test
    void findLargestNumber(){
        assertEquals(10,comparison.largestNumber(4,5,10));
    }
    @Test
    void average(){
        assertEquals(3, comparison.average(2,3,4,5));
    }
}