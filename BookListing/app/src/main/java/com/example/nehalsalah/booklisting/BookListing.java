package com.example.nehalsalah.booklisting;

/**
 * An {@link BookListing} object contains information related to book.
 */
public class BookListing {

    /**
     * title of the book
     */
    private String mTitle;

    /**
     * description of the book
     */
    private String mDescription;

    /**
     * Website URL of the book
     */
    private String mUrl;

    /* number of  search result */
    private String mAuthor;

    /**
     * Constructs a new {@link BookListing} object.
     *
     * @param title       is the title of the book
     * @param description is the description of the book
     * @param author      is author name of  search result
     * @param url         is the website URL to find more details about the book
     */
    public BookListing(String title, String author, String description, String url) {
        mTitle = title;
        mDescription = description;
        mUrl = url;
        mAuthor = author;
    }

    /**
     * Returns author name of  search result.
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Returns the title of the book.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the Description of the book.
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * Returns the website URL to find more information about book.
     */
    public String getUrl() {
        return mUrl;
    }
}
