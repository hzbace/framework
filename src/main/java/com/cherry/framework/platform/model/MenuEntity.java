package com.cherry.framework.platform.model;

import java.io.Serializable;
import java.util.Date;

public class MenuEntity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_menu.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_menu.node_no
     *
     * @mbggenerated
     */
    private String nodeNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_menu.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_menu.url
     *
     * @mbggenerated
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_menu.icon
     *
     * @mbggenerated
     */
    private String icon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_menu.parent_id
     *
     * @mbggenerated
     */
    private Integer parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_menu.order_no
     *
     * @mbggenerated
     */
    private Integer orderNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_menu.is_short_cut
     *
     * @mbggenerated
     */
    private Integer isShortCut;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_menu.short_cut_name
     *
     * @mbggenerated
     */
    private String shortCutName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_menu.create_user
     *
     * @mbggenerated
     */
    private Integer createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_menu.create_user_name
     *
     * @mbggenerated
     */
    private String createUserName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_menu.create_date
     *
     * @mbggenerated
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_menu.update_user
     *
     * @mbggenerated
     */
    private Integer updateUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_menu.update_user_name
     *
     * @mbggenerated
     */
    private String updateUserName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_menu.update_date
     *
     * @mbggenerated
     */
    private Date updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fr_menu.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fr_menu
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_menu.id
     *
     * @return the value of fr_menu.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_menu.id
     *
     * @param id the value for fr_menu.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_menu.node_no
     *
     * @return the value of fr_menu.node_no
     *
     * @mbggenerated
     */
    public String getNodeNo() {
        return nodeNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_menu.node_no
     *
     * @param nodeNo the value for fr_menu.node_no
     *
     * @mbggenerated
     */
    public void setNodeNo(String nodeNo) {
        this.nodeNo = nodeNo == null ? null : nodeNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_menu.name
     *
     * @return the value of fr_menu.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_menu.name
     *
     * @param name the value for fr_menu.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_menu.url
     *
     * @return the value of fr_menu.url
     *
     * @mbggenerated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_menu.url
     *
     * @param url the value for fr_menu.url
     *
     * @mbggenerated
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_menu.icon
     *
     * @return the value of fr_menu.icon
     *
     * @mbggenerated
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_menu.icon
     *
     * @param icon the value for fr_menu.icon
     *
     * @mbggenerated
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_menu.parent_id
     *
     * @return the value of fr_menu.parent_id
     *
     * @mbggenerated
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_menu.parent_id
     *
     * @param parentId the value for fr_menu.parent_id
     *
     * @mbggenerated
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_menu.order_no
     *
     * @return the value of fr_menu.order_no
     *
     * @mbggenerated
     */
    public Integer getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_menu.order_no
     *
     * @param orderNo the value for fr_menu.order_no
     *
     * @mbggenerated
     */
    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_menu.is_short_cut
     *
     * @return the value of fr_menu.is_short_cut
     *
     * @mbggenerated
     */
    public Integer getIsShortCut() {
        return isShortCut;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_menu.is_short_cut
     *
     * @param isShortCut the value for fr_menu.is_short_cut
     *
     * @mbggenerated
     */
    public void setIsShortCut(Integer isShortCut) {
        this.isShortCut = isShortCut;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_menu.short_cut_name
     *
     * @return the value of fr_menu.short_cut_name
     *
     * @mbggenerated
     */
    public String getShortCutName() {
        return shortCutName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_menu.short_cut_name
     *
     * @param shortCutName the value for fr_menu.short_cut_name
     *
     * @mbggenerated
     */
    public void setShortCutName(String shortCutName) {
        this.shortCutName = shortCutName == null ? null : shortCutName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_menu.create_user
     *
     * @return the value of fr_menu.create_user
     *
     * @mbggenerated
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_menu.create_user
     *
     * @param createUser the value for fr_menu.create_user
     *
     * @mbggenerated
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_menu.create_user_name
     *
     * @return the value of fr_menu.create_user_name
     *
     * @mbggenerated
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_menu.create_user_name
     *
     * @param createUserName the value for fr_menu.create_user_name
     *
     * @mbggenerated
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_menu.create_date
     *
     * @return the value of fr_menu.create_date
     *
     * @mbggenerated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_menu.create_date
     *
     * @param createDate the value for fr_menu.create_date
     *
     * @mbggenerated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_menu.update_user
     *
     * @return the value of fr_menu.update_user
     *
     * @mbggenerated
     */
    public Integer getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_menu.update_user
     *
     * @param updateUser the value for fr_menu.update_user
     *
     * @mbggenerated
     */
    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_menu.update_user_name
     *
     * @return the value of fr_menu.update_user_name
     *
     * @mbggenerated
     */
    public String getUpdateUserName() {
        return updateUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_menu.update_user_name
     *
     * @param updateUserName the value for fr_menu.update_user_name
     *
     * @mbggenerated
     */
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName == null ? null : updateUserName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_menu.update_date
     *
     * @return the value of fr_menu.update_date
     *
     * @mbggenerated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_menu.update_date
     *
     * @param updateDate the value for fr_menu.update_date
     *
     * @mbggenerated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fr_menu.remark
     *
     * @return the value of fr_menu.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fr_menu.remark
     *
     * @param remark the value for fr_menu.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fr_menu
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", nodeNo=").append(nodeNo);
        sb.append(", name=").append(name);
        sb.append(", url=").append(url);
        sb.append(", icon=").append(icon);
        sb.append(", parentId=").append(parentId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", isShortCut=").append(isShortCut);
        sb.append(", shortCutName=").append(shortCutName);
        sb.append(", createUser=").append(createUser);
        sb.append(", createUserName=").append(createUserName);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateUserName=").append(updateUserName);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}