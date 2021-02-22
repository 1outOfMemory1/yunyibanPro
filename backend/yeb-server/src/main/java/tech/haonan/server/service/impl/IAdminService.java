package tech.haonan.server.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import tech.haonan.server.entity.Admin;
import tech.haonan.server.entity.CommonResponse;
import tech.haonan.server.entity.Menu;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author haonan
 * @since 2021-02-20
 */
public interface IAdminService extends IService<Admin> {

    CommonResponse login(String username, String password, String verificationCode, HttpServletRequest request);

    Admin getAdminByUsername(String username);

}
