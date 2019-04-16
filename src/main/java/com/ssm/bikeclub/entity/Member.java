package com.ssm.bikeclub.entity;

import java.io.Serializable;

/**
 * @author KNIGHT
 * @date 2019-04-15
 */
public class Member implements Serializable {
    private Integer memberId;

    private String memberName;

    private String memberGender;

    private String memberCollege;

    private String memberQq;

    private String memberTel;

    private String memberPosition;

    private String memberToken;

    private String memberPassword;

    private String memberRemark;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public String getMemberGender() {
        return memberGender;
    }

    public void setMemberGender(String memberGender) {
        this.memberGender = memberGender == null ? null : memberGender.trim();
    }

    public String getMemberCollege() {
        return memberCollege;
    }

    public void setMemberCollege(String memberCollege) {
        this.memberCollege = memberCollege == null ? null : memberCollege.trim();
    }

    public String getMemberQq() {
        return memberQq;
    }

    public void setMemberQq(String memberQq) {
        this.memberQq = memberQq == null ? null : memberQq.trim();
    }

    public String getMemberTel() {
        return memberTel;
    }

    public void setMemberTel(String memberTel) {
        this.memberTel = memberTel == null ? null : memberTel.trim();
    }

    public String getMemberPosition() {
        return memberPosition;
    }

    public void setMemberPosition(String memberPosition) {
        this.memberPosition = memberPosition == null ? null : memberPosition.trim();
    }

    public String getMemberToken() {
        return memberToken;
    }

    public void setMemberToken(String memberToken) {
        this.memberToken = memberToken == null ? null : memberToken.trim();
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword == null ? null : memberPassword.trim();
    }

    public String getMemberRemark() {
        return memberRemark;
    }

    public void setMemberRemark(String memberRemark) {
        this.memberRemark = memberRemark == null ? null : memberRemark.trim();
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                ", memberGender='" + memberGender + '\'' +
                ", memberCollege='" + memberCollege + '\'' +
                ", memberQq='" + memberQq + '\'' +
                ", memberTel='" + memberTel + '\'' +
                ", memberPosition='" + memberPosition + '\'' +
                ", memberToken='" + memberToken + '\'' +
                ", memberPassword='" + memberPassword + '\'' +
                ", memberRemark='" + memberRemark + '\'' +
                '}';
    }
}