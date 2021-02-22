package tech.haonan.server.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import tech.haonan.server.entity.Menu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author haonan
 * @since 2021-02-20
 */
public interface IMenuService extends IService<Menu> {
 List<Menu> getMenusByAdminId();
}
