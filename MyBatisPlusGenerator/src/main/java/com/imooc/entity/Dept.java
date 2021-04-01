package com.imooc.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 部门信息表
 * </p>
 *
 * @author muyunmiss
 * @since 2018-12-12
 */
public class Dept extends Model<Dept> {

    private static final long serialVersionUID = 1L;

    /**
     * 部门信息表主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 部门编码
     */
    private String code;
    /**
     * 类型(1:公司，2部门)
     */
    private Integer type;
    /**
     * 上一级节点ID
     */
    private Long parentId;
    /**
     * 部门名称
     */
    private String name;
    /**
     * 部门状态
     */
    private Integer status;
    /**
     * 部门排序
     */
    private Integer sort;
    /**
     * 删除标识（1:未删除，2:已删除）
     */
    private Integer isdel;
    /**
     * 备注
     */
    private String remark;
    /**
     * 部门创建时间
     */
    private Date createTime;
    /**
     * 部门创建用户ID
     */
    private String createUser;
    /**
     * 部门创建用户IP
     */
    private String createIp;
    /**
     * 部门修改时间
     */
    private Date updateTime;
    /**
     * 部门修改用户ID
     */
    private String updateUser;
    /**
     * 部门修改用户IP
     */
    private String updateIp;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getCreateIp() {
        return createIp;
    }

    public void setCreateIp(String createIp) {
        this.createIp = createIp;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getUpdateIp() {
        return updateIp;
    }

    public void setUpdateIp(String updateIp) {
        this.updateIp = updateIp;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Dept{" +
        ", id=" + id +
        ", code=" + code +
        ", type=" + type +
        ", parentId=" + parentId +
        ", name=" + name +
        ", status=" + status +
        ", sort=" + sort +
        ", isdel=" + isdel +
        ", remark=" + remark +
        ", createTime=" + createTime +
        ", createUser=" + createUser +
        ", createIp=" + createIp +
        ", updateTime=" + updateTime +
        ", updateUser=" + updateUser +
        ", updateIp=" + updateIp +
        "}";
    }
}
