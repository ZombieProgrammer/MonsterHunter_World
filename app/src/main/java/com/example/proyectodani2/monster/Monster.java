package com.example.proyectodani2.monster;

import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;

/**
 * Created by dam2a on 30/01/18.
 */

@IgnoreExtraProperties
public class Monster {
    public String name;
    public String desc;
    public String picUrl;
    public HashMap<String, String> monsterPics;
    public String mDetailPic;
    public String weakness;
    public String detLoc;
    public String combatInfo;
//    public String weaknessInfo;
    //int imageUrl;



    public Monster() {

    }

    public Monster(String name, String desc, String picUrl, HashMap<String, String> monsterPics, String mDetailPic, String weakness) {
        this.name = name;
        this.desc = desc;
        this.picUrl = picUrl;
        this.monsterPics = monsterPics;
        this.mDetailPic = mDetailPic;
        this.weakness = weakness;
    }

    public String getCombatInfo() {
    return combatInfo;
    }

    public void setCombatInfo(String combatInfo) {
        this.combatInfo = combatInfo;
    }

    /*public String getWeaknessInfo() {
    return weaknessInfo;
    }

    public void setWeaknessInfo(String weaknessInfo) {
        this.weaknessInfo = weaknessInfo;
    }*/

    public String getDetLoc() {
        return detLoc;
    }

    public void setDetLoc(String detLoc) {
        this.detLoc = detLoc;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {this.picUrl = picUrl;    }

    public String getmDetailPic() {
        return mDetailPic;
    }

    public void setmDetailPic(String mDetailPic) {
        this.mDetailPic = mDetailPic;
    }

    public HashMap<String, String> getMonsterPics() {
        return monsterPics;
    }

    public void setMonsterPics(HashMap<String, String> monsterPics) {
        this.monsterPics = monsterPics;
    }
}
