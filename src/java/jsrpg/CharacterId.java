package jsrpg;
// Generated Jan 8, 2017 5:32:40 PM by Hibernate Tools 4.3.1



/**
 * CharacterId generated by hbm2java
 */
public class CharacterId  implements java.io.Serializable {


     private int id;
     private int accountId;

    public CharacterId() {
    }

    public CharacterId(int id, int accountId) {
       this.id = id;
       this.accountId = accountId;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getAccountId() {
        return this.accountId;
    }
    
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CharacterId) ) return false;
		 CharacterId castOther = ( CharacterId ) other; 
         
		 return (this.getId()==castOther.getId())
 && (this.getAccountId()==castOther.getAccountId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getId();
         result = 37 * result + this.getAccountId();
         return result;
   }   


}


