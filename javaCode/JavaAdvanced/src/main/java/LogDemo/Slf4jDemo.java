/*
 * @Author: 霍格沃兹测试开发学社
 * @Desc: '更多测试开发技术探讨，请访问：https://ceshiren.com/t/topic/15860'
 */


package LogDemo;

// 导入 slf4j 依赖
import org.slf4j.*;

public class Slf4jDemo {

    public static void main(String[] args) {

        // 创建日志实例
        Logger logger = LoggerFactory.getLogger(Slf4jDemo.class);

        // 输出日志
        logger.error("hogwarts: error");
        logger.warn("hogwarts: warn");
        logger.info("hogwarts: info");
        logger.debug("hogwarts: debug");
        logger.trace("hogwarts: trace");

    }

}
