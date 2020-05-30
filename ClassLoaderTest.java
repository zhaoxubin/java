package frank;

import org.junit.Test;

import java.io.InputStream;

public class ClassLoaderTest {

    @Test
    public void t1(){
        //通过class获取资源或IO流：以当前class编译类的路径作为相对的位置
        InputStream is = this.getClass().getResourceAsStream("../随便2.txt");
        System.out.println(is);
        //通过classLoader获取资源或IO流：以整个项目编译的根路径作为相对位置
        //项目通过相对路径获取资源文件时，一般使用ClassLoader方式获取，不使用File和Class获取
        InputStream is2 = this.getClass().getClassLoader().getResourceAsStream("随便2.txt");
        System.out.println(is2);
    }
}
