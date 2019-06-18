package com.wangz.jdk_8.lambda.stream;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.*;
import java.util.stream.*;

/**
 * @Author: wz1016_vip@163.com
 * @Date: 2019/6/18 11:48
 * @Description: TODO 测试Stream的所有方法
 */
public class StreamImpl{

    public Stream filter(Predicate predicate) {
        return null;
    }


    public IntStream mapToInt(ToIntFunction mapper) {
        return null;
    }


    public LongStream mapToLong(ToLongFunction mapper) {
        return null;
    }


    public DoubleStream mapToDouble(ToDoubleFunction mapper) {
        return null;
    }


    public Stream distinct() {
        return null;
    }


    public Stream sorted() {
        return null;
    }


    public Stream sorted(Comparator comparator) {
        return null;
    }


    public Stream peek(Consumer action) {
        return null;
    }


    public Stream limit(long maxSize) {
        return null;
    }


    public Stream skip(long n) {
        return null;
    }


    public void forEach(Consumer action) {

    }


    public void forEachOrdered(Consumer action) {

    }


    public Object[] toArray() {
        return new Object[0];
    }


    public Object reduce(Object identity, BinaryOperator accumulator) {
        return null;
    }


    public Optional reduce(BinaryOperator accumulator) {
        return Optional.empty();
    }


    public Optional min(Comparator comparator) {
        return Optional.empty();
    }


    public Optional max(Comparator comparator) {
        return Optional.empty();
    }


    public long count() {
        return 0;
    }


    public boolean anyMatch(Predicate predicate) {
        return false;
    }


    public boolean allMatch(Predicate predicate) {
        return false;
    }


    public boolean noneMatch(Predicate predicate) {
        return false;
    }


    public Optional findFirst() {
        return Optional.empty();
    }


    public Optional findAny() {
        return Optional.empty();
    }


    public Object collect(Collector collector) {
        return null;
    }


    public Object collect(Supplier supplier, BiConsumer accumulator, BiConsumer combiner) {
        return null;
    }


    public Object reduce(Object identity, BiFunction accumulator, BinaryOperator combiner) {
        return null;
    }


    public Object[] toArray(IntFunction generator) {
        return new Object[0];
    }


    public DoubleStream flatMapToDouble(Function mapper) {
        return null;
    }


    public LongStream flatMapToLong(Function mapper) {
        return null;
    }


    public IntStream flatMapToInt(Function mapper) {
        return null;
    }


    public Stream flatMap(Function mapper) {
        return null;
    }


    public Stream map(Function mapper) {
        return null;
    }


    public Iterator iterator() {
        return null;
    }


    public Spliterator spliterator() {
        return null;
    }


    public boolean isParallel() {
        return false;
    }


    public BaseStream sequential() {
        return null;
    }


    public BaseStream parallel() {
        return null;
    }


    public BaseStream unordered() {
        return null;
    }


    public BaseStream onClose(Runnable closeHandler) {
        return null;
    }


    public void close() {

    }
}
