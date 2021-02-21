package tech.haonan.service.impl;

import tech.haonan.entity.Salary;
import tech.haonan.mapper.SalaryMapper;
import tech.haonan.service.ISalaryService;
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
public class SalaryServiceImpl extends ServiceImpl<SalaryMapper, Salary> implements ISalaryService {

}
