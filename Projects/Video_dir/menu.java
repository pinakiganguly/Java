package Pinaki_Project2;
import java.applet.*;
import java.awt.*;
public class menu extends Applet {
	public void init() {
		Frame f=new Frame("this is my frame");
	    MenuBar main=new MenuBar();
	    f.setMenuBar(main);
	    Menu book=new Menu("Book");
	    Menu lang=new Menu("Language");
	    Menu film=new Menu("Film");
	    Menu search=new Menu("Search");
	  main.add(book);
	   main.add(lang);
	    main.add(film);
	    main.add(search);
	 MenuItem Cplus=new MenuItem("C++");
	 MenuItem C=new MenuItem("C");
	 MenuItem Java=new MenuItem("Java");
	 MenuItem Oracle=new MenuItem("Oracle");
	 //MenuItem Line=new MenuItem("-");
	 CheckboxMenuItem print=new CheckboxMenuItem("Print");
	 MenuItem exit=new MenuItem("Exit");
	 book.add(Cplus);
	 book.add(C);
	 book.add(Java);
	 
	 //book.add(Line);
	 book.add(Oracle);
	 MenuItem lang1=new MenuItem("French");
	 MenuItem lang2=new MenuItem("German");
	 MenuItem lang3=new MenuItem("English");
	//MenuItem undo =new MenuItem("Undo");
	lang.add(lang1);
	lang.add(lang2);
	lang.add(lang3);

	
	MenuItem Film=new MenuItem("Titanic");
	MenuItem Film1=new MenuItem("Jurrasic");
	MenuItem Film2=new MenuItem("Young Sheldon");
	film.add(Film);
	film.add(Film1);
	film.add(Film2);
	
	MenuItem Search1=new MenuItem("Yahoo");
	MenuItem Search2=new MenuItem("HotMail");
	MenuItem Search3=new MenuItem("Google");
	search.add(Search1);
	search.add(Search2);
	search.add(Search3);
	//Film more=new Film("More");
	//help.add(more);
	//more.add("commands");
	//more.add("about");
	f.setSize(400,400);

	/*addWindowListener(new WindowAdapter()
	                        { public void windowClosing(WindowEvent e)
	                            {  System.exit(0);
	                            }
	                        });*/


	 
	    
	    f.setVisible(true);
	}
}
