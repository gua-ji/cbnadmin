package com.cbn.cbnadmin.modules.oss.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cbn.cbnadmin.modules.oss.entity.SysOssEntity;
import com.cbn.cbnadmin.modules.oss.service.SysOssService;
import com.cbn.cbnadmin.common.utils.PageUtils;
import com.cbn.cbnadmin.common.utils.Query;
import com.cbn.cbnadmin.modules.oss.dao.SysOssDao;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("sysOssService")
public class SysOssServiceImpl extends ServiceImpl<SysOssDao, SysOssEntity> implements SysOssService {

	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		IPage<SysOssEntity> page = this.page(
			new Query<SysOssEntity>().getPage(params)
		);

		return new PageUtils(page);
	}
	
}
