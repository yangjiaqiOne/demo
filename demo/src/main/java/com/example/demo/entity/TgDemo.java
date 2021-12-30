package com.example.demo.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.io.Serializable;

/**
 * 自动构建基准字段(TgDemo)实体类
 *
 * @author makejava
 * @since 2021-12-30 14:46:30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = false)
public class TgDemo extends Model<TgDemo> implements Serializable {
    private static final long serialVersionUID = 119836035942769153L;
    /**
    * ID
    */
    private Long id;
    /**
    * 名称
    */
    private String name;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 是否已删除
    */
    private String deleted;
    /**
    * 更新时间
    */
    private Date updateTime;
    
    private Object jsonProfile;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Object getJsonProfile() {
        return jsonProfile;
    }

    public void setJsonProfile(Object jsonProfile) {
        this.jsonProfile = jsonProfile;
    }

}
