package org.study.suite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.study.demo.tag.TagTest;
import org.study.demo.tag.custom.CustomTag;
import org.study.demo.tag.custom.CustomTagTest;

@Suite
// 单个类
//@SelectClasses(TagTest.class)
// 多个类
@SelectClasses({
        TagTest.class,
        CustomTagTest.class
})
public class SelectClassTest {
}
