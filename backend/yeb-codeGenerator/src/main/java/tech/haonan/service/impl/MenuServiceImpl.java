package tech.haonan.service.impl;

import tech.haonan.entity.Menu;
import tech.haonan.mapper.MenuMapper;
import tech.haonan.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
