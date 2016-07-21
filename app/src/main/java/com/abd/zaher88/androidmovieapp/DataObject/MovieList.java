package com.abd.zaher88.androidmovieapp.DataObject;

import java.util.ArrayList;

public class MovieList{
    private int page;

    public int getPage() { return this.page; }

    public void setPage(int page) { this.page = page; }

    private ArrayList<Movie> results;

    public ArrayList<Movie> getResults() { return this.results; }

    public void setResults(ArrayList<Movie> results) { this.results = results; }

    private int total_results;

    public int getTotalResults() { return this.total_results; }

    public void setTotalResults(int total_results) { this.total_results = total_results; }

    private int total_pages;

    public int getTotalPages() { return this.total_pages; }

    public void setTotalPages(int total_pages) { this.total_pages = total_pages; }
}
