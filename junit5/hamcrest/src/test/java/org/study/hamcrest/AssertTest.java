package org.study.hamcrest;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.AnyOf.anyOf;
import static org.hamcrest.core.CombinableMatcher.both;
import static org.hamcrest.core.CombinableMatcher.either;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.Is.isA;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsEqual.equalToObject;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.core.StringEndsWith.endsWith;
import static org.hamcrest.core.StringStartsWith.startsWith;

public class AssertTest {

    /**
     *  is
     */
    @Test
    void UsingIsForMatch(){
        String testString = "hamcrest core is match";
        // is就是一个增强效果
        assertThat(testString,is("hamcrest core is match"));
        assertThat(testString,is(equalTo("hamcrest core is match")));
    }

    /**
     *  equalTo
     */
    @Test
    void UsingEqualToForMatch(){
        //T 泛型
        String actualString = "equalTo match";
        List<String> actualList = Arrays.asList("equalTo", "match");
        Object original = 100;
        List<String> stringList = Arrays.asList("equalTo", "match");

        assertThat(actualString, is(equalTo("equalTo match")));
        assertThat(actualList, is(equalTo(stringList)));
        assertThat(original, equalToObject(100));
    }

    /**
     * not
     * 检查给定对象的不相等性
     */
    @Test
    void UsingNotForMatch(){
        String testString = "hamcrest not match";

        assertThat(testString, not("hamcrest other match"));
        assertThat(testString, is(not(equalTo("hamcrest other match"))));
        assertThat(testString, is(not(instanceOf(Integer.class))));

    }

    /**
     *  hasItem
     *  检查的 Iterable 集合是否与给定对象或匹配器匹配
     */
    @Test
    void UsingHasItemForMatch(){
        List<String> list = Arrays.asList("java", "hamcrest", "junit5");

        assertThat(list, hasItem("java"));
        assertThat(list, hasItem("junit5"));
        assertThat(list, hasItem(isA(String.class)));

        assertThat(list, hasItems("java", "junit5"));
        assertThat(list, hasItems(isA(String.class), endsWith("est"),containsString("j")));
    }

    /**
     * allOf
     * 断言实际对象是否与所有指定条件匹配
     */
    @Test
    void UsingAllOfForMatch(){
        String testString = "Achilles is powerful";
        assertThat(testString, allOf(
                startsWith("Achi"), endsWith("ul"), containsString("Achilles")));

    }
    @Test
    void UsingAllOfForMatch1(){
        String testString = "Achilles is powerful";
        assertThat(testString, anyOf(
                startsWith("22Achi"), endsWith("u4l"), containsString("Achilles")));

    }

    /**
     * AnyOf
     * 检查的对象匹配任何指定的条件，则匹配
     */
    @Test
    void UsingAnyOfForMatch(){
        String testString2 = "Hector killed Achilles";
        assertThat(testString2, anyOf(startsWith("Hec"), containsString("baeldung")));
    }

    /**
     * Both
     * 两个指定条件都匹配检查对象时匹配
     */
    @Test
    void UsingBothForMatch(){
        String testString = "daenerys targaryen";
        assertThat(testString, both(startsWith("dae00ne")).and(containsString("y3e0n")));

    }

    /**
     * either
     * 任一指定条件与检查对象匹配时匹配
     */
    @Test
    void UsingEitherForMatch(){
        String testString = "daenerys targaryen";
        assertThat(testString, either(startsWith("tar")).or(containsString("tar11garyen")));

    }
}




