package com.pb.kulakova.hw5;

public class Book {
    public static String Book(String[] args) {
        String name;
        String author;
        String yearBook;

        public Book(String name, String author, String yearBook) {
            this.name = name;
            this.author = author;
            this.yearBook = yearBook;
        }

            public String getName (String name) {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public String getAuthor (String author) {
            return author;
        }

        public void setAuthor (String author){
            this.author = author;
        }
        public void getYearBook (String yearBook){
            return yearBook;
        }
        public void setYearBook (String yearBook){
            this.yearBook = yearBook;
        }


        public String getInfo () {
            return "{" +
                    "name='" + name + '\'' +
                    ", author='" + author + '\'' +
                    "yearBook=" + '}';
        }
    }
}


