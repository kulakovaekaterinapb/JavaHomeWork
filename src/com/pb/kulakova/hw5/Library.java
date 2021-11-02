package com.pb.kulakova.hw5;

public class Library {

    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В. В", 16, ",Право", "21.10.1999", "+3806711111");
        Reader reader2 = new Reader("Иванов В.Г.", 8, "Финансы и кредит", "11.11.1997", "+3806722222");
        Reader reader3 = new Reader("Тимошенко П.А.", 74, "Туризм", "05.04.2005", "+3806733333");
        Reader[] readers = {reader1, reader2, reader3};

        Book book1 = new Book(name:"Приключения",autor:"Иванов И. И.",yearBook: "2000 г." );
        Book book2 = new Book(name:"Словарь",autor:"Сидоров А.В.",yearBook: "1980 г.");
        Book book3 = new Book(name:"Энциклопедия",autor:"Гусев К.В.",yearBook:"2010 г.");
        Book[] books = {book1, book2, book3};

        printReaders(reader1, reader2, reader3);
        printBooks(book1, book2, book3);

        public void takeBook(Book book1, Book book2, Book book3){

        reader1.takeBook(book1, book2,book3);
        reader2.takeBook();
        reader3.takeBook();

        reader1.returnBook(book1, book2,book3);
        reader2.returnBook();
        reader3.returnBook();
    }

    private static void printBooks(Book[] books) {
        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println();
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println( reader.getInfo());
        }
        System.out.println();
    }
}

}
