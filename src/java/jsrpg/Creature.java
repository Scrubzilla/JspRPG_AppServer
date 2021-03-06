package jsrpg;
// Generated Jan 8, 2017 5:32:40 PM by Hibernate Tools 4.3.1



/**
 * Creature generated by hbm2java
 */
public class Creature  implements java.io.Serializable {


     private int id;
     private String name;
     private String type;
     private Integer strength;
     private Integer dexterity;
     private Integer vitality;
     private Integer intelligence;
     private Integer wisdom;
     private Integer charisma;
     private Integer attack;
     private Integer armor;
     private Integer refire;
     private Integer resice;
     private Integer ressarc;
     private Integer reslight;
     private Integer resdark;
     private String comment;
     private Integer itemDropId;
     private Integer itemDroprate;
     private Integer equipDropId;
     private Integer equipDroprate;

    public Creature() {
    }

	
    public Creature(int id) {
        this.id = id;
    }
    public Creature(int id, String name, String type, Integer strength, Integer dexterity, Integer vitality, Integer intelligence, Integer wisdom, Integer charisma, Integer attack, Integer armor, Integer refire, Integer resice, Integer ressarc, Integer reslight, Integer resdark, String comment, Integer itemDropId, Integer itemDroprate, Integer equipDropId, Integer equipDroprate) {
       this.id = id;
       this.name = name;
       this.type = type;
       this.strength = strength;
       this.dexterity = dexterity;
       this.vitality = vitality;
       this.intelligence = intelligence;
       this.wisdom = wisdom;
       this.charisma = charisma;
       this.attack = attack;
       this.armor = armor;
       this.refire = refire;
       this.resice = resice;
       this.ressarc = ressarc;
       this.reslight = reslight;
       this.resdark = resdark;
       this.comment = comment;
       this.itemDropId = itemDropId;
       this.itemDroprate = itemDroprate;
       this.equipDropId = equipDropId;
       this.equipDroprate = equipDroprate;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public Integer getStrength() {
        return this.strength;
    }
    
    public void setStrength(Integer strength) {
        this.strength = strength;
    }
    public Integer getDexterity() {
        return this.dexterity;
    }
    
    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }
    public Integer getVitality() {
        return this.vitality;
    }
    
    public void setVitality(Integer vitality) {
        this.vitality = vitality;
    }
    public Integer getIntelligence() {
        return this.intelligence;
    }
    
    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }
    public Integer getWisdom() {
        return this.wisdom;
    }
    
    public void setWisdom(Integer wisdom) {
        this.wisdom = wisdom;
    }
    public Integer getCharisma() {
        return this.charisma;
    }
    
    public void setCharisma(Integer charisma) {
        this.charisma = charisma;
    }
    public Integer getAttack() {
        return this.attack;
    }
    
    public void setAttack(Integer attack) {
        this.attack = attack;
    }
    public Integer getArmor() {
        return this.armor;
    }
    
    public void setArmor(Integer armor) {
        this.armor = armor;
    }
    public Integer getRefire() {
        return this.refire;
    }
    
    public void setRefire(Integer refire) {
        this.refire = refire;
    }
    public Integer getResice() {
        return this.resice;
    }
    
    public void setResice(Integer resice) {
        this.resice = resice;
    }
    public Integer getRessarc() {
        return this.ressarc;
    }
    
    public void setRessarc(Integer ressarc) {
        this.ressarc = ressarc;
    }
    public Integer getReslight() {
        return this.reslight;
    }
    
    public void setReslight(Integer reslight) {
        this.reslight = reslight;
    }
    public Integer getResdark() {
        return this.resdark;
    }
    
    public void setResdark(Integer resdark) {
        this.resdark = resdark;
    }
    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }
    public Integer getItemDropId() {
        return this.itemDropId;
    }
    
    public void setItemDropId(Integer itemDropId) {
        this.itemDropId = itemDropId;
    }
    public Integer getItemDroprate() {
        return this.itemDroprate;
    }
    
    public void setItemDroprate(Integer itemDroprate) {
        this.itemDroprate = itemDroprate;
    }
    public Integer getEquipDropId() {
        return this.equipDropId;
    }
    
    public void setEquipDropId(Integer equipDropId) {
        this.equipDropId = equipDropId;
    }
    public Integer getEquipDroprate() {
        return this.equipDroprate;
    }
    
    public void setEquipDroprate(Integer equipDroprate) {
        this.equipDroprate = equipDroprate;
    }




}


