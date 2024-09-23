package org.launchcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {

    @Test
    public void emptyTest() {
        assertTrue(true);
    }

    // Test for a string with no brackets (should be considered balanced)
    @Test
    public void noBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    // Test for a balanced pair of brackets
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    // Test for a string with balanced brackets around text
    @Test
    public void bracketsAroundTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    // Test for an unbalanced pair of brackets (opening but no closing)
    @Test
    public void onlyOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    // Test for an unbalanced pair of brackets (closing but no opening)
    @Test
    public void onlyClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }

    // Test for balanced brackets with multiple pairs
    @Test
    public void multipleBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch][Code]"));
    }

    // Test for unbalanced brackets with multiple pairs
    @Test
    public void unbalancedBracketsWithMultiplePairsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch][Code"));
    }

    // Test for nested balanced brackets
    @Test
    public void nestedBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]]"));
    }

    // Test for unbalanced nested brackets
    @Test
    public void unbalancedNestedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]"));
    }
}
