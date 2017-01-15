/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import java.util.ArrayList;
import java.util.List;
import jsrpg.Creature;
import jsrpg.Character;
import jsrpg.Spells;

/**
 *
 * @author User
 */
public class BattleLogicHelper {
    
    public Integer getHPfromVit(Integer vit){
        int hp = vit*10;
        return hp;
    }
    
    public List<Integer> getCreatureHP(List<Creature> cList){
        List<Integer> hpList = new ArrayList<>();
        for(int i = 0; i < cList.size(); i++){
            hpList.add(10 * cList.get(i).getVitality());
        }
        return hpList;
    }
    
    public Integer getMPfromWisInt(int wis, int intell){
        int mana = (wis + intell) * 2;
        return mana;
    }
    
    public Integer newCreatureHPafterAttack(int cretHP, Creature creature, Character chara){
        int creHP = cretHP - countAttackAmount(creature.getArmor(), chara.getStrength(), chara.getDexterity());
        return creHP;
    }
    
    private Integer countAttackAmount(int armor, int str, int dex){
        double attack = (str + dex) * (armor/100); 
        return (int) attack;
    }
    
    public Integer creatureAttacksHero(int charStr, int charVit, int creAttack){
        int armor = charStr + charVit;
        double amount = (creAttack * (armor/100));
        return (int) amount;
    }
    
    
    public List<Spells> checkWhichSpellCharCanHave(List<Spells> spellList, int intell){
        List<Spells> useableSpellsList = null;
        if(intell >= 10){
            useableSpellsList.add(spellList.get(1));
        }else if(intell >= 12){
            useableSpellsList.add(spellList.get(2));
        }else if(intell >= 14){
            useableSpellsList.add(spellList.get(0));
        }
        
        return useableSpellsList;
    }
    
    public Integer spellDMG(Spells spell, int intell){
        double amount = 0;
        amount = spell.getDamage() * intell;
        
        return (int) amount;
    }
    
    
    public Integer getXPAmountFromBattle(String zoneId, String areaId){
        int xp = 0;
        if(zoneId.equalsIgnoreCase("1")){
            xp = 100;
            if(areaId.equalsIgnoreCase("1")){
                xp += 50;
            } else if(areaId.equalsIgnoreCase("2")){
                xp += 75;
            } else if(areaId.equalsIgnoreCase("3")){
                xp += 100;
            }
        } else if(zoneId.equalsIgnoreCase("2")){
            xp = 250;
            if(areaId.equalsIgnoreCase("1")){
                xp += 50;
            } else if(areaId.equalsIgnoreCase("2")){
                xp += 75;
            } else if(areaId.equalsIgnoreCase("3")){
                xp += 100;
            }
        } else if(zoneId.equalsIgnoreCase("3")){
            xp = 400;
            if(areaId.equalsIgnoreCase("1")){
                xp += 50;
            } else if(areaId.equalsIgnoreCase("2")){
                xp += 100;
            } else if(areaId.equalsIgnoreCase("3")){
                xp += 200;
            }
        }
        return xp;
    }
    
}
