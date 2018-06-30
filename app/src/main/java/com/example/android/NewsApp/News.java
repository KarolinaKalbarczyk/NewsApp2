/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.NewsApp;

/**
 * An {@link News} object contains information related to a single news.
 */
public class News {

    /** Title of the article */
    private String mWebTitle;

    /** Time of the publication */
    private String mWebPublicationDate;

    /** Website URL of the article */
    private String mWebUrl;

    /** Author of the article*/
    private String mAuthor;

    /**Section of the article*/
    private String mSection;


    /**
     * Constructs a new {@link News} object.
     *  @param webTitle is the webTitle (size) of the earthquake
     * @param webPublicationDate is the date when article was publicated
     * @param webUrl is the website URL to find more details about the article
     * @param sectionName
     */
    public News(String webTitle, String webPublicationDate, String webUrl, String author, String sectionName) {
        mWebTitle = webTitle;
        mWebPublicationDate = webPublicationDate;
        mWebUrl = webUrl;
        mAuthor = author;
        mSection = sectionName;
    }

    /**
     * Returns the title of the article.
     */
    public String getTitle() {
        return mWebTitle;
    }

    /**
     * Returns the date of the article.
     */
    public String getWebPublicationDate() {
        return mWebPublicationDate;
    }

    /**
     * Returns the website URL to find more information about the article.
     */
    public String getUrl() {
        return mWebUrl;
    }

    public String getAuthor(){return mAuthor;}

    public String getSection(){return mSection;}
}
