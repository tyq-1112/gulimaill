package com.tyq.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import com.sun.istack.internal.NotNull;
import com.tyq.common.vaild.ListValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;

/**
 * 品牌
 *
 * @author tyq
 * @email ${email}
 * @date 2022-02-13 19:54:42
 */
@Data
@TableName("pms_brand")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BrandEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 品牌id
     */
    @TableId
    private Long brandId;
    /**
     * 品牌名
     */
    @NotBlank
    private String name;
    /**
     * 品牌logo地址
     */
    @URL(message = "logo必须是一个合法的url地址")
    private String logo;
    /**
     * 介绍
     */
    private String descript;
    /**
     * 显示状态[0-不显示；1-显示]
     */
    @ListValue(value = {0, 1})
    private Integer showStatus;
    /**
     * 检索首字母
     */
    @NotEmpty
    private String firstLetter;
    /**
     * 排序
     */
    @NotNull
    private Integer sort;

}
