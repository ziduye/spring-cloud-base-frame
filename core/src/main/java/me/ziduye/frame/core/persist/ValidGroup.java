package me.ziduye.frame.core.persist;

import javax.validation.groups.Default;

public interface ValidGroup {
    /**
     * 保存验证组
     */
    interface Save extends Default {

    }

    /**
     * 新增验证组
     */
    interface Insert extends Default {

    }


    /**
     * 更新验证组
     */
    interface Update extends Default {

    }

}
