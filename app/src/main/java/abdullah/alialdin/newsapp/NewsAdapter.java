package abdullah.alialdin.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<NewsModel> {

    NewsAdapter(@NonNull Context context, List<NewsModel> news) {
        super(context, 0, news);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.news_item, parent, false);
        }
        NewsModel currentModel = getItem(position);
        TextView titleTV = convertView.findViewById(R.id.title_view);
        TextView authorTV =convertView.findViewById(R.id.author_view);
        TextView dateTV = convertView.findViewById(R.id.date_view);
        TextView sectionTV = convertView.findViewById(R.id.section_view);
        ImageView thumb = convertView.findViewById(R.id.thumbnail);
        assert currentModel != null;
        String date = currentModel.getDate();
        String[] exDate = date.split("T");
        titleTV.setText(currentModel.getTitle());
        authorTV.setText(currentModel.getAuthor());
        dateTV.setText(exDate[0]);
        sectionTV.setText(currentModel.getSection());
        Picasso.get().load(currentModel.getImageUrl()).into(thumb);
        return convertView;
    }
}
