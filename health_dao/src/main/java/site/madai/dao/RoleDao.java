package site.madai.dao;

import site.madai.pojo.Role;

import java.util.List;

/**
 * @Project: site.madai.dao
 * @Author: ShaoDi Wang
 * @Date: Created in 2019-07-05 21:18
 * @Description:
 * @Version: 1.0
 */
public interface RoleDao {
    List<Role> findRoleListByUserId(Integer id);
}
