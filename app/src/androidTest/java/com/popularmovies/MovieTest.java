package com.ringkjob.popularmovies;

import android.test.suitebuilder.annotation.SmallTest;

import junit.framework.TestCase;

public class MovieTest extends TestCase {

    @SmallTest
    public void testMovie() throws Exception {
        Movie movieTest = new Movie();

        final String ACTUAL_ORIGINAL_TITLE = "Up";
        final String ACTUAL_POSTER_PATH = "/MV5BMTk3NDE2NzI4NF5BMl5BanBnXkFtZTgwNzE1MzEyMTE@._V1_SY1000_CR0,0,664,1000_AL_.jpg";
        final String ACTUAL_OVERVIEW = "Seventy-eight year old Carl Fredricksen travels to Paradise Falls in his home equipped with balloons, inadvertently taking a young stowaway.";
        final Double ACTUAL_VOTE_AVERAGE = 8.3;
        final String ACTUAL_RELEASE_DATE = " 2009-05-29";

        movieTest.setOriginalTitle(ACTUAL_ORIGINAL_TITLE);
        movieTest.setPosterPath(ACTUAL_POSTER_PATH);
        movieTest.setOverview(ACTUAL_OVERVIEW);
        movieTest.setVoteAverage(ACTUAL_VOTE_AVERAGE);
        movieTest.setReleaseDate(ACTUAL_RELEASE_DATE);


        final String EXPECTED_POSTER_PATH = "https://images-na.ssl-images-amazon.com/images/M" + ACTUAL_POSTER_PATH;
        final String EXPECTED_VOTE_AVERAGE_DETAILED = "8.3/10";

        assertEquals(ACTUAL_ORIGINAL_TITLE, movieTest.getOriginalTitle());
        assertEquals(EXPECTED_POSTER_PATH, movieTest.getPosterPath());
        assertEquals(ACTUAL_OVERVIEW, movieTest.getOverview());
        assertEquals(EXPECTED_VOTE_AVERAGE_DETAILED, movieTest.getDetailedVoteAverage());
        assertEquals(ACTUAL_RELEASE_DATE, movieTest.getReleaseDate());
    }
}