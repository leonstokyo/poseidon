CREATE TABLE `sys_user`  (
     `id` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '主键',
     `username` varchar(32)  NOT NULL COMMENT '账号',
     `password` varchar(256) NOT NULL COMMENT '密码',
     `mobile` varchar(16)  NULL DEFAULT NULL COMMENT '手机号',
     `email` varchar(128)  NULL DEFAULT NULL COMMENT '邮箱',
     `status` tinyint(4) NOT NULL DEFAULT 1 COMMENT '状态 0-无效； 1-有效；',
     `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
     `update_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
     PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB  CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '账号'
