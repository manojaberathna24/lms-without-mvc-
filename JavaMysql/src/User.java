/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manoj Aberathna
 */
class User {
    private int sno;
    private String name, address, gender, knowledge, subject;
    
    public User(int sno, String name, String address, String gender, String knowledge, String subject)
    {
        this.sno=sno;
        this.name=name;
        this.address=address;
        this.gender=gender;
        this.knowledge=knowledge;
        this.subject=subject;
        
    }

    User(int aInt, String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getsno(){
        return sno;
    }
    public String getname(){
        return name;
    }
     public String getaddress(){
        return address;
    }
      public String getgender(){
        return gender;
    }
      public String knowledge(){
        return knowledge;
    }
       public String getsubject(){
        return subject;
    }

    Object getauthor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object gettitle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
