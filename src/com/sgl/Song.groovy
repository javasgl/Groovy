package com.sgl

/**
 * @author songgl
 * @since 2016-06-01 16:37
 */
class Song {
    def name;
    def age;
    def addr;
    //重写toString方法
    String toString() {
        "${name},${addr}"; //不需要return
    }
    //重写默认的getter方法
    def getName() {
        name?.toUpperCase(); //?并没有什么用?!!
    }
}
