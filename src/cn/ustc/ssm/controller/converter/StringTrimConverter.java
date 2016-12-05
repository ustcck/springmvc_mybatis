package cn.ustc.ssm.controller.converter;

import org.springframework.core.convert.converter.Converter;

/**
 * 自定义日期转换器
 * Created with IntelliJ IDEA
 * Created by ustcck on 2016/12/5 17:36.
 */
public class StringTrimConverter implements Converter<String, String> {

    @Override
    public String convert(String source) {

        try {
            //去掉字符串两边空格，如果去除后为空设置为null
            if (source != null) {
                source = source.trim();
                if (source.equals("")) {
                    return null;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return source;
    }

}
