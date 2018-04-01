package com.gyx.concurrency.example.publish;

import com.gyx.concurrency.annoations.NoRecommend;
import com.gyx.concurrency.annoations.NoThreadSafe;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoThreadSafe
@NoRecommend
public class Escape {

    private int thisCanBeEscape = 0;

    public Escape () {
        new InnerClass();
    }

    private class InnerClass {
        //参数在对象初始化之前  this关键字可能使对象的参数逸出
        public InnerClass() {
            log.info("{}", Escape.this.thisCanBeEscape);
        }
    }

    public static void main(String[] args) {
        new Escape();
    }
}

