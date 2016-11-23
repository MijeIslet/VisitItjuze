package cn.zjm.visit.itjuzi.com;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

import cn.zjm.visit.itjuzi.com.adapter.MainContentAdapter;
import cn.zjm.visit.itjuzi.com.fragment.FragmentHome;
import cn.zjm.visit.itjuzi.com.fragment.FragmentMine;
import cn.zjm.visit.itjuzi.com.fragment.FragmentNian;
import cn.zjm.visit.itjuzi.com.fragment.FragmentNotification;
import cn.zjm.visit.itjuzi.com.fragment.FragmentRecommend;
import cn.zjm.visit.itjuzi.com.istatic.IMainStatic;

public class MainActivity extends FragmentActivity implements View.OnClickListener, IMainStatic {

    private ImageButton mainIvHome;
    private Button mainTvHome;
    private ImageButton mainIvRecommend;
    private Button mainTvRecommend;
    private ImageButton mainIvNotification;
    private Button mainTvNotification;
    private ImageButton mainIvMine;
    private Button mainTvMine;
    private ImageButton mainIvNian;

    private FrameLayout mainContent;
    private List<Fragment> fragmentList;
    private MainContentAdapter adapter;

    private int lastMode;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2016-11-04 09:34:12 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        setContentView(R.layout.activity_main);
        mainIvHome = (ImageButton) findViewById(R.id.main_iv_home);
        mainTvHome = (Button) findViewById(R.id.main_tv_home);
        mainIvRecommend = (ImageButton) findViewById(R.id.main_iv_recommend);
        mainTvRecommend = (Button) findViewById(R.id.main_tv_recommend);
        mainIvNotification = (ImageButton) findViewById(R.id.main_iv_notification);
        mainTvNotification = (Button) findViewById(R.id.main_tv_notification);
        mainIvMine = (ImageButton) findViewById(R.id.main_iv_mine);
        mainTvMine = (Button) findViewById(R.id.main_tv_mine);
        mainIvNian = (ImageButton) findViewById(R.id.main_iv_nian);

        mainIvHome.setOnClickListener(this);
        mainTvHome.setOnClickListener(this);
        mainIvRecommend.setOnClickListener(this);
        mainTvRecommend.setOnClickListener(this);
        mainIvNotification.setOnClickListener(this);
        mainTvNotification.setOnClickListener(this);
        mainIvMine.setOnClickListener(this);
        mainTvMine.setOnClickListener(this);
        mainIvNian.setOnClickListener(this);

        updateMainMenu(MAIN_TAB_HOME);

        mainContent = (FrameLayout) findViewById(R.id.main_content);

        fragmentList = new ArrayList<Fragment>();
        fragmentList.add(new FragmentHome());
        fragmentList.add(new FragmentRecommend());
        fragmentList.add(new FragmentNian());
        fragmentList.add(new FragmentNotification());
        fragmentList.add(new FragmentMine());
        adapter = new MainContentAdapter(getSupportFragmentManager(), fragmentList);

        loadFragment(0);
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2016-11-04 09:34:12 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if (v == mainIvHome || v == mainTvHome) {
            // Handle clicks for mainIvHome
            // Handle clicks for mainTvHome
            updateMainMenu(MAIN_TAB_HOME);
            loadFragment(0);
        } else if (v == mainIvRecommend || v == mainTvRecommend) {
            // Handle clicks for mainIvRecommend
            // Handle clicks for mainTvRecommend
            updateMainMenu(MAIN_TAB_RECOMMEND);
            loadFragment(1);
        } else if (v == mainIvNotification || v == mainTvNotification) {
            // Handle clicks for mainIvNotification
            // Handle clicks for mainTvNotification
            updateMainMenu(MAIN_TAB_NOTIFICATION);
            loadFragment(3);
        } else if (v == mainIvMine || v == mainTvMine) {
            // Handle clicks for mainIvMine
            // Handle clicks for mainTvMine
            updateMainMenu(MAIN_TAB_MINE);
            loadFragment(4);
        } else if (v == mainIvNian) {
            // Handle clicks for mainIvNian
            updateMainMenu(MAIN_TAB_NIAN);
            loadFragment(2);
        }
    }

    private void updateMainMenu(int currMode) {
        if (currMode != lastMode) {
            switch (currMode) {
                case MAIN_TAB_HOME:
                    mainIvHome.setImageResource(R.drawable.main_tab_home_on);
                    mainTvHome.setText(Html.fromHtml(MAIN_TAB_TEXT_ON_START + getResources().getString(R.string.main_tab_home_textname) + MAIN_TAB_TEXT_STOP));
                    break;
                case MAIN_TAB_RECOMMEND:
                    mainIvRecommend.setImageResource(R.drawable.main_tab_recommend_on);
                    mainTvRecommend.setText(Html.fromHtml(MAIN_TAB_TEXT_ON_START + getResources().getString(R.string.main_tab_recommend_textname) + MAIN_TAB_TEXT_STOP));
                    break;
                case MAIN_TAB_NIAN:
                    mainIvNian.setImageResource(R.drawable.main_tab_nian_card_on);
                    break;
                case MAIN_TAB_NOTIFICATION:
                    mainIvNotification.setImageResource(R.drawable.main_tab_notification_on);
                    mainTvNotification.setText(Html.fromHtml(MAIN_TAB_TEXT_ON_START + getResources().getString(R.string.main_tab_notification_textname) + MAIN_TAB_TEXT_STOP));
                    break;
                case MAIN_TAB_MINE:
                    mainIvMine.setImageResource(R.drawable.main_tab_mine_on);
                    mainTvMine.setText(Html.fromHtml(MAIN_TAB_TEXT_ON_START + getResources().getString(R.string.main_tab_mine_textname) + MAIN_TAB_TEXT_STOP));
                    break;
            }
            switch (lastMode) {
                case MAIN_TAB_HOME:
                    mainIvHome.setImageResource(R.drawable.main_tab_home_off);
                    mainTvHome.setText(Html.fromHtml(MAIN_TAB_TEXT_OFF_START + getResources().getString(R.string.main_tab_home_textname) + MAIN_TAB_TEXT_STOP));
                    break;
                case MAIN_TAB_RECOMMEND:
                    mainIvRecommend.setImageResource(R.drawable.main_tab_recommend_off);
                    mainTvRecommend.setText(Html.fromHtml(MAIN_TAB_TEXT_OFF_START + getResources().getString(R.string.main_tab_recommend_textname) + MAIN_TAB_TEXT_STOP));
                    break;
                case MAIN_TAB_NIAN:
                    mainIvNian.setImageResource(R.drawable.main_tab_nian_card_off);
                    break;
                case MAIN_TAB_NOTIFICATION:
                    mainIvNotification.setImageResource(R.drawable.main_tab_notification_off);
                    mainTvNotification.setText(Html.fromHtml(MAIN_TAB_TEXT_OFF_START + getResources().getString(R.string.main_tab_notification_textname) + MAIN_TAB_TEXT_STOP));
                    break;
                case MAIN_TAB_MINE:
                    mainIvMine.setImageResource(R.drawable.main_tab_mine_off);
                    mainTvMine.setText(Html.fromHtml(MAIN_TAB_TEXT_OFF_START + getResources().getString(R.string.main_tab_mine_textname) + MAIN_TAB_TEXT_STOP));
                    break;
            }
            lastMode = currMode;
        }
    }


    private Object lastFragment;
    private int lastPosition;

    private void loadFragment(int position) {
        if (lastFragment != null) {
            adapter.destroyItem(mainContent,
                    lastPosition, lastFragment);
        }
        // 初始化
        Object objectFragment = adapter.instantiateItem(
                mainContent, position);
        // 设置显示的界面
        adapter.setPrimaryItem(mainContent, 0,
                objectFragment);
        // 更新界面
        adapter.finishUpdate(mainContent);

        lastFragment = objectFragment;
        lastPosition = position;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        findViews();

        //状态栏的高度获取
        //int height = getResources().getDimensionPixelOffset(getResources().getIdentifier("status_bar_height", "dimen", "android"));

    }

}
