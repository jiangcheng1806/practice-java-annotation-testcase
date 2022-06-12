package com.jiangcheng1806.practice.testcase.annotation;

import java.lang.reflect.InvocationTargetException;

/**
 * @author ：jiangcheng
 * @version : 1.0.0
 * @description ：TODO
 * @date ： 2022/6/11 10:00
 */
public class QueryRequestTestcase extends BaseRequest {

    @MyNotNullAnnotation1
    private String name;
    private Boolean gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        QueryRequestTestcase testcase = new QueryRequestTestcase();
        testcase.setGender(Boolean.FALSE);
//        testcase.setName("dd");

        testcase.nullFieldValidate();

    }


}
