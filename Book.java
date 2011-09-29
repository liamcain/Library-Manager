public class Book {
    
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
}