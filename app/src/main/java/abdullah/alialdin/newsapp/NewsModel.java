package abdullah.alialdin.newsapp;


class NewsModel {
    private String mTitle;
    private String mSection;
    private String mAuthor;
    private String mDate;
    private String mUrl;
    private String mImageUrl;

    NewsModel(String title, String section, String author, String date, String url, String imageUrl) {
        mTitle = title;
        mSection = section;
        mAuthor = author;
        mDate = date;
        mUrl = url;
        mImageUrl = imageUrl;
    }

    String getTitle() {
        return mTitle;
    }

    String getSection() {
        return mSection;
    }

    String getAuthor() {
        return mAuthor;
    }

    String getDate() {
        return mDate;
    }

    String getUrl() {
        return mUrl;
    }

    String getImageUrl() {
        return mImageUrl;
    }
}
