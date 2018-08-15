public class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    public void info(){
        System.out.println("Name of the author: "+ authorName);
        System.out.println("Title: "+ title);
        System.out.println("Descreption: "+ text);
        System.out.println("Publication: "+ publicationDate);
    }
}
