package com.libraryoperations;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        BorrowingSystem borrowingSystem = new BorrowingSystem(library);

        Book book1 = new Book("Java Programming", "John Doe");
        Member member1 = new Member("Alice", 1);

        library.addBook(book1);
        library.addMember(member1);

        boolean borrowed = borrowingSystem.borrowBook("Java Programming", 1);
        System.out.println("Book borrowed: " + borrowed);

        boolean returned = borrowingSystem.returnBook("Java Programming");
        System.out.println("Book returned: " + returned);
    }
}
