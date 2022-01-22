package me.zhengjie.utils;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.cglib.core.Converter;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 *  bean 复制工具类
 * <p></p>
 *
 * @version 1.0.0
 * @description: BeanCopierUtil
 * @author: 向鹏飞
 * @since: 2022/1/15
 */
public class BeanCopierUtil {

    private static final ConcurrentMap<String, BeanCopier> BEAN_COPIER_CACHE = new ConcurrentHashMap();

    private BeanCopierUtil(){}

    public static void copy(Object source, Object target) {
        if (source != null) {
            String key = genKey(source.getClass(), target.getClass());
            BeanCopier beanCopier = (BeanCopier)BEAN_COPIER_CACHE.computeIfAbsent(key, (k) -> {
                return BeanCopier.create(source.getClass(), target.getClass(), false);
            });
            beanCopier.copy(source, target, (Converter)null);
        }
    }

    public static <T> List copyList(List<T> list, Class clazz) {
        return (List)(CollectionUtils.isEmpty(list) ? Lists.newArrayListWithCapacity(0) : JSON.parseArray(JSON.toJSONString(list), clazz));
    }

    private static String genKey(Class<?> srcClazz, Class<?> tgtClazz) {
        return srcClazz.getName() + tgtClazz.getName();
    }

}
