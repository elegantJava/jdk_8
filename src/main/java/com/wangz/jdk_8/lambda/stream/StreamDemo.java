package com.wangz.jdk_8.lambda.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName StreamDemo
 * @Auther: wz1016_vip@163.com
 * @Date: 2019/6/17 23:50
 * @Description: TODO
 */
public class StreamDemo {
    /*
     * 将要处理的元素集合看作一种流，流在管道中传输，并且可以在管道的节点上进行处理，比如筛选，排序，聚合等。
     * +--------------------+       +------+   +------+   +---+   +-------+
     * | stream of elements +-----> |filter+-> |sorted+-> |map+-> |collect|
     * +--------------------+       +------+   +------+   +---+   +-------+
     */

    /* 数据源: 流的来源。 可以是集合，数组，I/O channel， 产生器generator 等。
     * 聚合操作: 类似SQL语句一样的操作， 比如filter, map, reduce, find, match, sorted等。
     * 和以前的Collection操作不同， Stream操作还有两个基础的特征：
     *
     * 1.Pipelining: 中间操作都会返回流对象本身。 这样多个操作可以串联成一个管道， 如同流式风格（fluent style）。
     * 这样做可以对操作进行优化， 比如延迟执行(laziness)和短路( short-circuiting)。
     * 2.内部迭代： 以前对集合遍历都是通过Iterator或者For-Each的方式, 显式的在集合外部进行迭代， 这叫做外部迭代。
     * Stream提供了内部迭代的方式， 通过访问者模式(Visitor)实现。
     */

    /**集合接口有两个方法来生成流：
     * stream() − 为集合创建串行流。
     *
     * parallelStream() − 为集合创建并行流。
     */



    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        System.out.println("筛选列表: " + filtered);
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("合并字符串: " + mergedString);

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("列表中最大的数 : " + stats.getMax());
        System.out.println("列表中最小的数 : " + stats.getMin());
        System.out.println("所有数之和 : " + stats.getSum());
        System.out.println("平均数 : " + stats.getAverage());
    }
}
