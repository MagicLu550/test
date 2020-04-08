package cn.textwar.test;


import cn.textwar.test.dsl.DSLMethod;
import cn.textwar.test.dsl.DSLParser;
import groovy.lang.Closure;

import java.io.File;

public class Test extends DSLParser {

    public Test(File file) {
        super(file);
    }

    public static void main(String[] args) {
        Test t = new Test(new File("server.groovy"));
    }

    /**
     * server标签，为根标签
     */
    @DSLMethod
    public void server(Closure closure){
        closure.call();
    }

    /**
     *负责rpc的属性
     */
    @DSLMethod
    public void rpc(Closure closure){
        closure.call();
    }

    /**
     * 负责配置数据库
     */
    @DSLMethod
    public void database(Closure closure){
        closure.call();
    }

    @DSLMethod
    public void game(Closure closure){
        closure.call();
    }

    @DSLMethod
    public void python(Closure closure){
        closure.call();
    }

    @DSLMethod
    public void player(Closure closure){
        closure.call();
    }

    @DSLMethod
    public void born(Closure closure){
        closure.call();
    }

    @DSLMethod
    public void map(Closure closure){
        closure.call();
    }
}
