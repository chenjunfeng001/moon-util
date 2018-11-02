package com.moon.util.compute.core;

import java.util.Objects;

/**
 * 连接前后获取值
 *
 * @author benshaoye
 */
final class DataGetterLinker implements AsGetter {
    final AsValuer prevGetter;
    final AsValuer valuer;

    DataGetterLinker(AsValuer prevGetter, AsValuer key) {
        this.prevGetter = Objects.requireNonNull(prevGetter);
        this.valuer = key;
    }

    @Override
    public Object use(Object data) {
        Object prevData = prevGetter.use(data);
        prevData = valuer.use(prevData);
        return prevData;
    }

    /**
     * Evaluates this predicate on the given argument.
     *
     * @param o the input argument
     * @return {@code true} if the input argument matches the predicate,
     * otherwise {@code false}
     */
    @Override
    public boolean test(Object o) {
        return false;
    }

    @Override
    public String toString() {
        return prevGetter.toString() + " " + valuer.toString();
    }
}
