package com.tc;

public class NeighborhoodLibrary {
    public static void main(String[] args){
        /**Properties: id(int) | isbn(s) | title(s) | isCheckedOut(b) | checkedOutTo(s)
         * Methods: checkOut(name) | checkIn()
         * Use an array to hold an inventory of at least FIVE books.
         * When book checked out:
         * 1) the "checkedOutTo" variable should be set to the name provided
         * 2) "isCheckedOut" should be true
         * When book checked in:
         * 1) checkedOutTo variable should be "" (nobody)
         * 2) isCheckedOut should be false
         * SCREENS
         * Home Screen - display options:
         * show Available books -- Displays ID, isbn, title of available books + prompt user to check a book out or back to home screen of all books not checked out.
         * If user wants to check out book, prompt for name, then check book out
         * Show unavailable books -- displays id, isbn, title of all unavailable books + 'C' to check in a book, 'X' to go back home
         * Check in a book -- Prompt user for ID of book | Check in book with that ID | Go back to home screen */


    }

    class Book{
        // Properties ↓
        private int id;
        private String isbn;
        private String title;
        private boolean isCheckedOut;
        private String checkedOutTo;

        public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo){ // Constructor
            this.id = id;
            this.isbn = isbn;
            this.title = title;
            this.isCheckedOut = isCheckedOut;
            this.checkedOutTo = checkedOutTo;
        }
        // Getter / Setter, ID
        public int getId(){return this.id;}
        public void setId(int id){this.id=id;}

        // Getter / Setter, ISBN
        public String getIsbn(){return this.isbn;}
        public void setIsbn(){this.isbn=isbn;}

        // Getter / Setter Title
        public String getTitle(){return this.title;}
        public void setTitle(){this.title=title;}

        // Getter / Setter Checked Out?
        public boolean getIsCheckedOut(){return this.isCheckedOut;}
        public void setIsCheckedOut(){this.isCheckedOut=isCheckedOut;}

        // Getter / Setter Checked Out To?
        public String getCheckedOutTo(){return this.checkedOutTo;}
        public void setCheckedOutTo(){this.checkedOutTo=checkedOutTo;}


    }
}
