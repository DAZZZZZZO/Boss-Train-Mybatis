package mybatisdemotest.utils;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @class: MybatisGenersatorTest
 * @Description:
 * @Author: Dazo
 * @date: 4/5/2023
 */
public class MybatisGenersatorTest {
    public static void main(String[] args) throws Exception {
        List<String> warnings = new ArrayList<>();
        boolean overwrite = true;
        InputStream configFile = MybatisGenersatorTest.class.getResourceAsStream("/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator generator = new MyBatisGenerator(config, callback, warnings);
        generator.generate(null);
        System.out.println("生成完毕！");
    }
}
