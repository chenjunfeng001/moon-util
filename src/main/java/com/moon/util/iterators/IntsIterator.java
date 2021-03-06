package com.moon.util.iterators;

import java.util.Iterator;

/**
 * @author benshaoye
 * @date 2018/9/11
 */
public class IntsIterator
    extends BaseArrayIterator
    implements Iterator<Integer> {

    private int[] array;

    public IntsIterator(int[] array) {
        super(array == null ? 0 : array.length);
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.length;
    }

    @Override
    public Integer next() {
        return this.array[index++];
    }
}
