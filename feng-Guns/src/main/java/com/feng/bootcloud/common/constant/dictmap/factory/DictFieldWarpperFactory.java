package com.feng.bootcloud.common.constant.dictmap.factory;

import java.lang.reflect.Method;

import com.feng.bootcloud.common.constant.factory.ConstantFactory;
import com.feng.bootcloud.common.constant.factory.IConstantFactory;
import com.feng.bootcloud.common.exception.BizExceptionEnum;
import com.feng.bootcloud.common.exception.BussinessException;

/**
 * 字段的包装创建工厂
 *
 * @author fengshuonan
 * @date 2017-05-06 15:12
 */
public class DictFieldWarpperFactory {

    public static Object createFieldWarpper(Object field, String methodName) {
        IConstantFactory me = ConstantFactory.me();
        try {
            Method method = IConstantFactory.class.getMethod(methodName, field.getClass());
            Object result = method.invoke(me, field);
            return result;
        } catch (Exception e) {
            try {
                Method method = IConstantFactory.class.getMethod(methodName, Integer.class);
                Object result = method.invoke(me, Integer.parseInt(field.toString()));
                return result;
            } catch (Exception e1) {
                throw new BussinessException(BizExceptionEnum.ERROR_WRAPPER_FIELD);
            }
        }
    }

}
