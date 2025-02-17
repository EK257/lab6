public class Main {
    public static void main(String[] args) {
        Reader[] readers = new Reader[]{
                new Reader("Вова", "23", "BIO", "12.01.2000", "+79003282343"),
                new Reader("Алексей", "45", "MATH", "15.03.1999", "+79901235567"),
                new Reader("Захар", "12", "PHYS", "20.05.2001", "+79227654321"),
                new Reader("Игорь", "39", "CHEM", "10.07.1998", "+79079876543"),
                new Reader("Петр", "18", "HIST", "05.11.2002", "+79005381555")
        };

        readers[1].takeBook(6);
        readers[3].takeBook("Преступление и наказание", "Сказки");
        readers[2].returnBook(2);
        readers[0].returnBook("Война и мир", "Бородино", "Басни");
    }
}
class Reader {
    public String FIO, nombileta, fac, data, tel;

    public Reader(String FIO, String nombileta, String fac, String data, String tel){
        this.FIO = FIO;
        this.nombileta = nombileta;
        this.fac = fac;
        this.data = data;
        this.tel = tel;
    }
    public void takeBook(int c){
        if(c%10>=5 || c%10==0){System.out.println(FIO + " взял " + c + " книг");}
        else if(c%10==1){System.out.println(FIO + " взял " + c + " книгу");}
        else{System.out.println(FIO + " взял " + c + " книги");}
    }
    public void takeBook(String... values){
        System.out.print(FIO + " взял книги: ");
        String books = String.join(", ", values);
        System.out.println(books);
    }
    public void returnBook(int c){
        if(c%10>=5 || c%10==0){System.out.println(FIO + " вернул " + c + " книг");}
        else if(c%10==1){System.out.println(FIO + " вернул " + c + " книгу");}
        else{System.out.println(FIO + " вернул " + c + " книги");}
    }
    public void returnBook(String... values){
        System.out.print(FIO + " вернул книги: ");
        String books = String.join(", ", values);
        System.out.println(books);
    }
}