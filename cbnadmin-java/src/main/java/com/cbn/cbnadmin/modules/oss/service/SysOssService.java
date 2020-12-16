 package com.cbn.cbnadmin.modules.oss.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cbn.cbnadmin.modules.oss.entity.SysOssEntity;
import com.cbn.cbnadmin.common.utils.PageUtils;

import java.util.Map;

/**
 * 文件上传
 *

 */
public interface SysOssService extends IService<SysOssEntity> {

	PageUtils queryPage(Map<String, Object> params);
}
