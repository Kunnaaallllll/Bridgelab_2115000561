class LibraryManagementBookAndAuthor{
	public static void main(String[]args){
		Author book = new Author("Physics world",1980,"HC VERMA","Physics Professor");
		book.displayInfo();
	}
}
class Book{
	private String title;
	private int publicationYear;
	Book(String title, int publicationYear){
		this.title = title;
		this.publicationYear = publicationYear;
	}
	public void displayInfo(){
		System.out.println("Book Name: "+title);
		System.out.println("Book Publication Year: "+publicationYear);
	}
}
class Author extends Book{
	private String name, bio;
	Author(String title, int publicationYear,String name, String bio){
		super(title,publicationYear);
		this.name = name;
		this.bio = bio;
	}
	public void displayInfo(){
		super.displayInfo();
		System.out.println("Book Author Name: "+name);
		System.out.println("Book Author Bio: "+bio);
	}
}