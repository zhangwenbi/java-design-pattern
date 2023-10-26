package com.zwb.singleton;

/**
 * 懒汉式
 */
public class LazyMan {

    private static LazyMan lazyMan;

    private LazyMan() {

    }

    /**
     * 线程不安全
     *
     * @return
     */
    public static LazyMan getLazyMan() {
        if (lazyMan == null) {
            lazyMan = new LazyMan();
        }

        return lazyMan;
    }


    /**
     * 线程安全
     *
     * @return
     */
/*
    public static synchronized LazyMan getLazyMan() {
        if (lazyMan == null) {
            lazyMan = new LazyMan();
        }

        return lazyMan;
    }
*/

    /**
     * 线程安全
     *
     * @return
     */
/*    public static LazyMan getLazyMan() {
        synchronized (LazyMan.class) {
            if (lazyMan == null) {
                lazyMan = new LazyMan();
            }
        }
        return lazyMan;
    }*/

}
