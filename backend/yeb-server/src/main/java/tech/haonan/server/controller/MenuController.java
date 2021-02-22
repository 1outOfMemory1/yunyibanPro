package tech.haonan.server.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.haonan.server.entity.Menu;
import tech.haonan.server.service.impl.IMenuService;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author haonan
 * @since 2021-02-20
 */
@RestController
@RequestMapping("/system/cfg")
@Api(tags = "菜单列表接口")
public class MenuController {
    @Autowired
    private IMenuService menuService;


    /**
     * 一个用户可以有多个角色  一个角色也可以被多个用户所拥有
     * 一个角色对多个资源有访问权限  一个资源可以被多个角色拥有
     * menu是可访问的资源 角色表(t_role) 与 资源表(t_menu)是多对多的  需要一个公共表(t_menu_role)
     * 而 用户表(t_admin) 与 角色表(t_role) 也是多对多的 需要一个公共表 (t_admin_role)
     * 这个接口就是通过id来获取用户所拥有的资源   中间隔了一层 角色来方便控制！！！
     * @return
     */
    @ApiOperation(value = "通过用户id查询菜单列表")
    @GetMapping("menu")
    public List<Menu> getMenusByAdminId(){
        return menuService.getMenusByAdminId();
    }

}
