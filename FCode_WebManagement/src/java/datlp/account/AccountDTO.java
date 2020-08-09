/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datlp.account;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * @author DAT
 */
public class AccountDTO implements Serializable {
    private String username, password, fullname;
    private String studentID, email, course, gender, birthdate;
    private String phoneNumber, linkFacebook;
    private int avatar;
    private String role, major, position;
    private int isActive, isBanned;
    private String isAcceptedBy, isBannedBy;
    private Timestamp isAcceptedOn, isBannedOn;

    public AccountDTO() {
    }

    public AccountDTO(String username, String password, String fullname, String email) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLinkFacebook() {
        return linkFacebook;
    }

    public void setLinkFacebook(String linkFacebook) {
        this.linkFacebook = linkFacebook;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public int getIsBanned() {
        return isBanned;
    }

    public void setIsBanned(int isBanned) {
        this.isBanned = isBanned;
    }

    public String getIsAcceptedBy() {
        return isAcceptedBy;
    }

    public void setIsAcceptedBy(String isAcceptedBy) {
        this.isAcceptedBy = isAcceptedBy;
    }

    public String getIsBannedBy() {
        return isBannedBy;
    }

    public void setIsBannedBy(String isBannedBy) {
        this.isBannedBy = isBannedBy;
    }

    public Timestamp getIsAcceptedOn() {
        return isAcceptedOn;
    }

    public void setIsAcceptedOn(Timestamp isAcceptedOn) {
        this.isAcceptedOn = isAcceptedOn;
    }

    public Timestamp getIsBannedOn() {
        return isBannedOn;
    }

    public void setIsBannedOn(Timestamp isBannedOn) {
        this.isBannedOn = isBannedOn;
    }
    
    
    
}
