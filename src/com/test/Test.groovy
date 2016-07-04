package com.test

import com.sgl.Song;
/**
 * @author songgl
 * @since 2016-06-01 16:41
 */
class Test {
    static void main(args) {
        def song = new Song();
        song.setAge(26);
        song.setAddr('上海');
        song.setName('songgl');
        assert song.getAddr() =='上海';
        println song;
        println song.getName();


        def song1 = new Song();
//        println song1.name.toUpperCase(); //空指针
//        println song1.getName().toUpperCase(); //空指针
        println song.getName().toUpperCase();

    }

}
