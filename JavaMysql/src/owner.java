/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manoj Aberathna
 */
public class owner {
   
    private String name, author, title;
    
    public owner(String name, String author, String title)
    {
      
        this.name=name;
        this.author=author;
        this.title=title;
        
        
        
    }

    owner(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public String getname(){
        return name;
    }
     public String getauthor(){
        return author;
    }
      public String gettitle(){
        return title;
    }
  
}
