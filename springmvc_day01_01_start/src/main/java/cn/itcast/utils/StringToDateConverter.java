package cn.itcast.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String s) {
        if(s == null){
            throw new RuntimeException("请您传入值");
        }
        DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
        Date d = null;
        try {
           return df.parse(s);
        } catch (Exception e) {
            throw new RuntimeException("数据类型转换错误");
        }

    }
}
