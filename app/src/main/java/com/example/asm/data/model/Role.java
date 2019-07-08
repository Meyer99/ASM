package com.example.asm.data.model;

import org.litepal.LitePal;
import org.litepal.crud.LitePalSupport;

import java.util.List;

public class Role extends LitePalSupport {

    private RoleType roleType = RoleType.NONE;

    // 只在是社团管理员或成员时有用
    private String association = null;

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public void setAssociation(String association) {
        this.association = association;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public String getAssociation() {
        return association;
    }

    /**
     * 以下是各种角色不同的功能
     */

    /**
     * @return 传回的List可能是emptyList
     */
    public List<JoinApplication> getJoinApplications() {
        if (roleType != RoleType.AADMINISTRATOR) {
            return null;
        }

        return LitePal.where("associationName = ?", this.association)
                .find(JoinApplication.class);
    }

    /**
     * @param passOrNo 传入是否允许加入
     * @param applicationId 使用JoinApplication.getId()获取
     */
    public void examJoinApplication(boolean passOrNo, Integer applicationId) {

        if (roleType != RoleType.AADMINISTRATOR) {
            return;
        }


    }

}
