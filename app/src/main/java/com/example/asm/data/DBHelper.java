package com.example.asm.data;

import com.example.asm.data.model.Activity;
import com.example.asm.data.model.Application;
import com.example.asm.data.model.Association;
import com.example.asm.data.model.AssociationFile;
import com.example.asm.data.model.Material;
import com.example.asm.data.model.User;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface DBHelper {

    /**
     * 传入参数不为空，请在Activity判断
     * 登陆失败 返回 null
     * 登陆成功 返回 一个User对象
     */
    public User login(String id, String password);

    public User addUser(String id, String pass, String name);

    public boolean deleteUser(String id);

    public boolean changePass(String id, String pass);


    public ArrayList<Association> getAssociationList();

    public Association getAssociation(String name);

    public boolean addAssociation(String name, String date, String description, ArrayList<User>
            iniMember, String badgePath, String flagPath);

    public boolean deleteAssociation(String id);

    // 如果没有发现或者id有误返回null
    public ArrayList<Application> getApplicationList(String associationId);

    // 如果没有发现或者id有误返回null
    public ArrayList<AssociationFile> getAssociationFile(String associationId);

    public ArrayList<Material> getMaterial(String associationId);

    public ArrayList<Application> getJoinApplication(String associationId);

    // 没有则返回null
    public ArrayList<Application> getApplicationNeedExam();

    public ArrayList<Activity> getActivity(String id);

}
