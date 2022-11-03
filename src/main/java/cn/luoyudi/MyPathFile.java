package cn.luoyudi;

import org.apache.hadoop.fs.*;

/**
 * 过滤掉文件名满足特定条件的文件
 */
class MyPathFilter implements PathFilter {
    String reg = null;

    MyPathFilter(String reg) {
        this.reg = reg;
    }

    public boolean accept(Path path) {
        if (!(path.toString().matches(reg)))
            return true;
        return false;
    }
}

