package com.libraryoperations;

public class BorrowingSystem {
    private Library library;

    public BorrowingSystem(Library library) {
        this.library = library;
    }

    public boolean borrowBook(String title, int memberId) {
        Book book = library.findBook(title);
        Member member = library.findMember(memberId);
        if (book != null && book.isAvailable() && member != null) {
            book.setAvailable(false);
            return true;
        }
        return false;
    }

    public boolean returnBook(String title) {
        Book book = library.findBook(title);
        if (book != null && !book.isAvailable()) {
            book.setAvailable(true);
            return true;
        }
        return false;
    }
}
