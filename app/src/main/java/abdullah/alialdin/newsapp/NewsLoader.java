package abdullah.alialdin.newsapp;

import android.content.Context;

import android.content.AsyncTaskLoader;

import java.util.List;

public class NewsLoader extends AsyncTaskLoader<List<NewsModel>> {

    private String mUrl;

    NewsLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<NewsModel> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        return QueryUtils.fetchNewsData(mUrl);
    }
}
