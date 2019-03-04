package AdpterPattern.Demo1;

import java.io.InputStream;

/**
 * 适配器模式
 * 假如现在有两个接口：ReaderXml/XmlReader,现在需求中需要的用是ReaderXml的接口，恰好，XmlReader中有这个接口的功能，则可以用设配器模式。
 */
public class Adapter implements ReaderXml{

//    public InputStream readerXml() {
//        return xmlReader();
//    }
    public XmlReader xmlReader;
    public InputStream readerXml(){
        return xmlReader.xmlReader();
    }
}

//public class Adapter implements ReaderXml{
//    B b = new B();
//    public InputStream readerXml(){
//        return b.xmlReader();
//    }
//}
