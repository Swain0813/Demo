package com.example.entity;

import java.util.Date;

public class TUserEntity {
    /**
     * <pre>
     * 
     * 表字段 : t_user.id
     * </pre>
     */
    private Long id;

    /**
     * <pre>
     * 用户名
     * 表字段 : t_user.user_name
     * </pre>
     */
    private String userName;

    /**
     * <pre>
     * 手机号
     * 表字段 : t_user.user_phone
     * </pre>
     */
    private String userPhone;

    /**
     * <pre>
     * 邮箱地址
     * 表字段 : t_user.user_email
     * </pre>
     */
    private String userEmail;

    /**
     * <pre>
     * 加盐后用户密码
     * 表字段 : t_user.user_pwd
     * </pre>
     */
    private String userPwd;

    /**
     * <pre>
     * MD5盐
     * 表字段 : t_user.pwd_salt
     * </pre>
     */
    private String pwdSalt;

    /**
     * <pre>
     * 创建时间
     * 表字段 : t_user.create_time
     * </pre>
     */
    private Date createTime;

    /**
     * <pre>
     * 最后修改时间
     * 表字段 : t_user.modify_time
     * </pre>
     */
    private Date modifyTime;

    /**
     * <pre>
     * 是否删除，0-未删除；1-已删除
     * 表字段 : t_user.is_delete
     * </pre>
     */
    private Byte isDelete;

    /**
     * <pre>
     * 获取：
     * 表字段：t_user.id
     * </pre>
     *
     * @return t_user.id：
     */
    public Long getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_user.id
     * </pre>
     *
     * @param id
     *            t_user.id：
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：用户名
     * 表字段：t_user.user_name
     * </pre>
     *
     * @return t_user.user_name：用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <pre>
     * 设置：用户名
     * 表字段：t_user.user_name
     * </pre>
     *
     * @param userName
     *            t_user.user_name：用户名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * <pre>
     * 获取：手机号
     * 表字段：t_user.user_phone
     * </pre>
     *
     * @return t_user.user_phone：手机号
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * <pre>
     * 设置：手机号
     * 表字段：t_user.user_phone
     * </pre>
     *
     * @param userPhone
     *            t_user.user_phone：手机号
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * <pre>
     * 获取：邮箱地址
     * 表字段：t_user.user_email
     * </pre>
     *
     * @return t_user.user_email：邮箱地址
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * <pre>
     * 设置：邮箱地址
     * 表字段：t_user.user_email
     * </pre>
     *
     * @param userEmail
     *            t_user.user_email：邮箱地址
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * <pre>
     * 获取：加盐后用户密码
     * 表字段：t_user.user_pwd
     * </pre>
     *
     * @return t_user.user_pwd：加盐后用户密码
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * <pre>
     * 设置：加盐后用户密码
     * 表字段：t_user.user_pwd
     * </pre>
     *
     * @param userPwd
     *            t_user.user_pwd：加盐后用户密码
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    /**
     * <pre>
     * 获取：MD5盐
     * 表字段：t_user.pwd_salt
     * </pre>
     *
     * @return t_user.pwd_salt：MD5盐
     */
    public String getPwdSalt() {
        return pwdSalt;
    }

    /**
     * <pre>
     * 设置：MD5盐
     * 表字段：t_user.pwd_salt
     * </pre>
     *
     * @param pwdSalt
     *            t_user.pwd_salt：MD5盐
     */
    public void setPwdSalt(String pwdSalt) {
        this.pwdSalt = pwdSalt == null ? null : pwdSalt.trim();
    }

    /**
     * <pre>
     * 获取：创建时间
     * 表字段：t_user.create_time
     * </pre>
     *
     * @return t_user.create_time：创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * <pre>
     * 设置：创建时间
     * 表字段：t_user.create_time
     * </pre>
     *
     * @param createTime
     *            t_user.create_time：创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <pre>
     * 获取：最后修改时间
     * 表字段：t_user.modify_time
     * </pre>
     *
     * @return t_user.modify_time：最后修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * <pre>
     * 设置：最后修改时间
     * 表字段：t_user.modify_time
     * </pre>
     *
     * @param modifyTime
     *            t_user.modify_time：最后修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * <pre>
     * 获取：是否删除，0-未删除；1-已删除
     * 表字段：t_user.is_delete
     * </pre>
     *
     * @return t_user.is_delete：是否删除，0-未删除；1-已删除
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * <pre>
     * 设置：是否删除，0-未删除；1-已删除
     * 表字段：t_user.is_delete
     * </pre>
     *
     * @param isDelete
     *            t_user.is_delete：是否删除，0-未删除；1-已删除
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    /**
     *
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userPwd=").append(userPwd);
        sb.append(", pwdSalt=").append(pwdSalt);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @param that
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TUserEntity other = (TUserEntity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserPhone() == null ? other.getUserPhone() == null : this.getUserPhone().equals(other.getUserPhone()))
            && (this.getUserEmail() == null ? other.getUserEmail() == null : this.getUserEmail().equals(other.getUserEmail()))
            && (this.getUserPwd() == null ? other.getUserPwd() == null : this.getUserPwd().equals(other.getUserPwd()))
            && (this.getPwdSalt() == null ? other.getPwdSalt() == null : this.getPwdSalt().equals(other.getPwdSalt()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()));
    }

    /**
     *
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserPhone() == null) ? 0 : getUserPhone().hashCode());
        result = prime * result + ((getUserEmail() == null) ? 0 : getUserEmail().hashCode());
        result = prime * result + ((getUserPwd() == null) ? 0 : getUserPwd().hashCode());
        result = prime * result + ((getPwdSalt() == null) ? 0 : getPwdSalt().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        return result;
    }
}