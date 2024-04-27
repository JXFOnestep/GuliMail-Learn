package com.study.common.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author jxf study
 * @date 2024/4/27 17:53
 */
public class ListUtils {
    public static <T> List<T> distinctList(List<T> rawList) {
        return rawList.stream()
                .filter(Objects::nonNull)
                .distinct()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add(null);
        list.add("");
        list.add(" ");
        list.add("world");
        list.stream().forEach(System.out::println);
        System.out.println("===============");
        List<String> newList = ListUtils.distinctList(list);
        newList.stream().forEach(System.out::println);
        System.out.println("===============");
    }
}
