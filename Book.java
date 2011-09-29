public class Book implements Comparable<Book>{
    
    private String title;
    private boolean out;
    
    public Book(String name){
        title = name;
        out = false;
    }
    
    public String toString(){
        if(out)
            return title + " [out],";
        else
            return title + ",";
    }
    public String getTitle(){
        return title;
    }
    public void take(){
        out = true;
    }
    public void putBack(){
        out = false;
    }
    
    public int compareTo(Book b)
       {
               if (this.getTitle().compareTo(b.getTitle()) >= 1)
                      return 1;
               if (this.getTitle().equals(b.getTitle()))
                       return 0;
               else
                       return -1;
       }


}