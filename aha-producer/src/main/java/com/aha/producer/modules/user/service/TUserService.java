package com.aha.producer.modules.user.service;

import com.aha.producer.modules.user.entity.TUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 用户(TUser)表服务接口
 *
 * @author shoufeng
 * @since 2020-09-14 21:46:58
 */
public interface TUserService extends IService<TUser> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TUser queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUser> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    TUser insert(TUser tUser);

    /**
     * 修改数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    TUser update(TUser tUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}