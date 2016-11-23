package cn.zjm.visit.itjuzi.com.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import cn.zjm.visit.itjuzi.com.R;

/**
 * Created by Android on 2016/11/4.
 */
public class FragmentNotification extends Fragment implements RadioGroup.OnCheckedChangeListener {

    private View view;

    private RadioGroup notificationRadiogroup;
    private RadioButton rbMessage;
    private RadioButton rbInform;
    private RelativeLayout notificationMessage;
    private ListView notificationMessageListview;
    private RelativeLayout notificationMessageNoResultRl;
    private RelativeLayout notificationInform;
    private ListView notificationInformListview;
    private RelativeLayout notificationInformNoResultRl;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2016-11-07 16:49:39 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews(View view) {
        notificationRadiogroup = (RadioGroup) view.findViewById(R.id.notification_radiogroup);
        notificationMessage = (RelativeLayout) view.findViewById(R.id.notification_message);
        notificationMessageListview = (ListView) view.findViewById(R.id.notification_message_listview);
        notificationMessageNoResultRl = (RelativeLayout) view.findViewById(R.id.notification_message_no_result_rl);
        notificationInform = (RelativeLayout) view.findViewById(R.id.notification_inform);
        notificationInformListview = (ListView) view.findViewById(R.id.notification_inform_listview);
        notificationInformNoResultRl = (RelativeLayout) view.findViewById(R.id.notification_inform_no_result_rl);

        rbMessage = (RadioButton) notificationRadiogroup.getChildAt(0);
        rbMessage.setChecked(true);
        rbInform = (RadioButton) notificationRadiogroup.getChildAt(1);

        notificationMessageListview.setEmptyView(notificationMessageNoResultRl);
        notificationInformListview.setEmptyView(notificationInformNoResultRl);

        notificationRadiogroup.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if (rbMessage == group.getChildAt(checkedId - 1)) {
            seleterViewOrDate(notificationMessage, notificationInform);
        } else {
            seleterViewOrDate(notificationInform, notificationMessage);
        }
    }

    private void seleterViewOrDate(RelativeLayout rl1, RelativeLayout rl2) {
        rl1.setVisibility(View.VISIBLE);
        rl2.setVisibility(View.INVISIBLE);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = null;
        if (view == null) {
            view = inflater.inflate(R.layout.fragment_notification, container, false);
            findViews(view);
        }
        v = view;
        return v;
    }
}
