package followfellow.liadsoft.com.guest.control.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

import followfellow.liadsoft.com.R;
import followfellow.liadsoft.com.guest.model.AlertSettingData;

/**
 * Created by user on 2016-04-16.
 */
public class GuestAlertSettingListAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<AlertSettingData> textList = new ArrayList<>();
    public GuestAlertSettingListAdapter(Context context) {
        this.context = context;
        textList.add(new AlertSettingData("message","host and guest"));
        textList.add(new AlertSettingData("reservation update","request,confirm,change and others"));
        textList.add(new AlertSettingData("account","account changes"));
        textList.add(new AlertSettingData("etc","feature updates"));
    }

    @Override
    public int getCount() {
        return textList.size();
    }

    @Override
    public Object getItem(int position) {
        return textList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView==null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_alert_setting,null);
            holder.text1 = (TextView)convertView.findViewById(R.id.alertSettingText1);
            holder.text2 = (TextView)convertView.findViewById(R.id.alertSettingText2);
            holder.sw =  (Switch)convertView.findViewById(R.id.switch1);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder)convertView.getTag();
        }
        holder.text1.setText(textList.get(position).text1);
        holder.text2.setText(textList.get(position).text2);
        return convertView;
    }

    public static class ViewHolder{
        TextView text1;
        TextView text2;
        Switch sw;
    }
}
