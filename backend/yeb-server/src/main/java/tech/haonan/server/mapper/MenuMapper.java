package tech.haonan.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import tech.haonan.server.entity.Menu;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author haonan
 * @since 2021-02-20
 */
@Mapper
public interface MenuMapper extends BaseMapper<Menu> {

    /**
     * 根据id获取
     * @param id
     * @return
     */
    List<Menu> getMenusByAdminId(Integer id);
}
