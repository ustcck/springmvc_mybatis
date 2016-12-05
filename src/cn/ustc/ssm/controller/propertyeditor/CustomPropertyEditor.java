package cn.ustc.ssm.controller.propertyeditor;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.CustomDateEditor;

/**
 * 自定义属性编辑器
 * Created with IntelliJ IDEA
 * Created by ustcck on 2016/12/5 17:36.
 */
public class CustomPropertyEditor implements PropertyEditorRegistrar {

    @Override
    public void registerCustomEditors(PropertyEditorRegistry binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                new SimpleDateFormat("yyyy-MM-dd HH-mm-ss"), true));

    }

}
