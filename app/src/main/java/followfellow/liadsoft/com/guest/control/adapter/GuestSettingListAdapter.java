package followfellow.liadsoft.com.guest.control.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import followfellow.liadsoft.com.R;

/**
 * Created by user on 2016-04-16.
 */
public class GuestSettingListAdapter extends BaseAdapter {
    private Context context;
    ArrayList<String> list = new ArrayList<>();
    public GuestSettingListAdapter(Context context) {
        this.context = context;
        list.add("Alert"); list.add("Send app Feedback");
        list.add("App Version"); list.add("Sign Out");
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_guest_setting,null);
            holder.guestSettingText = (TextView)convertView.findViewById(R.id.guestSettingText);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder)convertView.getTag();
        }
        holder.guestSettingText.setText(list.get(position));
        return convertView;
    }
    private static class ViewHolder{
        public TextView guestSettingText;
    }
}
