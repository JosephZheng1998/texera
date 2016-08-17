package com.google.re2j;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

// This class tests if our wrapper classes for re2j is correct.
// It compares the results generated by our wrapper classes with those generated by the original classes.
public class RE2JWrapperTest {

    // if an array of PublicRegexp is equivalent to the original array of Regexp
    private boolean subExprEqual(Regexp[] originalSubs, PublicRegexp[] compareSubs) {
        if (originalSubs == null && compareSubs == null) {
            return true;
        } else if (originalSubs == null || compareSubs == null) {
            return false;
        } else {
            if (originalSubs.length != compareSubs.length) {
                return false;
            } else {
                for (int i = 0; i < originalSubs.length; i++) {
                    if (!isEquivalent(originalSubs[i], compareSubs[i])) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    // if an PublicRegexp object is equivalent to the original Regexp object
    private boolean isEquivalent(Regexp original, PublicRegexp compare) {
        boolean equivalent = (original.cap == compare.cap) && (original.flags == compare.flags)
                && (original.max == compare.max) && (original.min == compare.min) && (original.op == compare.op)
                && (original.name == null ? compare.name == null : original.name.equals(compare.name))
                && (Arrays.equals(original.runes, compare.runes)) && (subExprEqual(original.subs, compare.publicSubs));

        return equivalent;
    }

    private void testRE2Wrapper(String regex) {
        // test parse
        Regexp original = Parser.parse(regex, RE2.PERL);
        PublicRegexp compare = PublicParser.parse(regex, PublicRE2.PERL);
        Assert.assertTrue(isEquivalent(original, compare));
        // test simplify
        original = Simplify.simplify(original);
        compare = PublicSimplify.simplify(compare);
        Assert.assertTrue(isEquivalent(original, compare));

    }

    @Test
    public void testLiteral() {
        testRE2Wrapper("cat");
        testRE2Wrapper("dog");
    }

    @Test
    public void testAlternate() {
        testRE2Wrapper("a|b|c");
    }

    @Test
    public void testStar() {
        testRE2Wrapper("a*");
    }

    @Test
    public void testPlus() {
        testRE2Wrapper("a+");
    }

    @Test
    public void testCharClass() {
        testRE2Wrapper("[a-z]");
    }

    @Test
    public void testComplex1() {
        testRE2Wrapper("data*[bcd|pqr]");
    }

    @Test
    public void testComplex2() {
        // email address
        testRE2Wrapper("^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$");
    }

    @Test
    public void testComplex3() {
        // simple phone number
        testRE2Wrapper("[0-9]{3}-?[0-9]{3}-?[0-9]{4}");
    }

    @Test
    public void testComplex4() {
        // date
        testRE2Wrapper("(\\d|0\\d|1[0-2])\\/(\\d|[0-2]\\d|3[0-1])\\/(19\\d{2}|2\\d{3}|d{2})");
    }

}
