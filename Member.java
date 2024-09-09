package com.libraryoperations;

public class Member {
	private String name;
    private int memberId;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    // Getters
    public String getName() { return name; }
    public int getMemberId() { return memberId; }
}
