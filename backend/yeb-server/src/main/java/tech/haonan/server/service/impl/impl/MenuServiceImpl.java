package tech.haonan.server.service.impl.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import tech.haonan.server.entity.Admin;
import tech.haonan.server.entity.Menu;
import tech.haonan.server.mapper.MenuMapper;
import tech.haonan.server.service.impl.IMenuService;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author haonan
 * @since 2021-02-20
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

    @Autowired
    private MenuMapper menuMapper;
    /**
     * 根据用户id查询列表
     * @return
     */
    @Override
    public List<Menu> getMenusByAdminId() {

        Admin admin = (Admin)(SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        return menuMapper.getMenusByAdminId(admin.getId());
    }
}
