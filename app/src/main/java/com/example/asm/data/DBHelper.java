package com.example.asm.data;

import com.example.asm.data.model.Activity;
import com.example.asm.data.model.Application;
import com.example.asm.data.model.Association;
import com.example.asm.data.model.AssociationFile;
import com.example.asm.data.model.Material;
import com.example.asm.data.model.User;

import java.lang.reflect.Array;
import java.util.ArrayList;


/**
 * 用于初始登陆，角色间通用的方法，角色特有的放于Role类中
 * 该接口也是获取User的接口
 */
public interface DBHelper {

    /**
     * 传入参数不为空，请在Activity判断
     * 登陆失败 返回 null
     * 登陆成功 返回 一个User对象
     */
    public User login(Integer id, String password);

//    public User addUser(String id, String pass, String name);
//
//    public ArrayList<Association> getAssociationList();
//
//    public Association getAssociation(String name);
//
//    public ArrayList<Material> getMaterial(String associationId);
//
//    public ArrayList<Activity> getActivities(String associationName);

}
