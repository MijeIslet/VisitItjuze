package cn.zjm.visit.itjuzi.com.fragment;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import cn.zjm.visit.itjuzi.com.R;
import cn.zjm.visit.itjuzi.com.view.ObserveScrollView;
import cn.zjm.visit.itjuzi.com.view.RoundImageView;

/**
 * Created by Android on 2016/11/4.
 */
public class FragmentMine extends Fragment implements View.OnClickListener, View.OnTouchListener {

    private View view;

    private ObserveScrollView mineScrollView;
    private RelativeLayout mineTitleBar;
    private Button mineExitUser;
    private RelativeLayout mineItemUser;
    private RoundImageView mineAvatar;
    private RelativeLayout mineItemIndent;
    private ImageView ivEmIndent;
    private ImageButton mineTabOneIb;
    private Button mineTabOneBtn;
    private ImageButton mineTabTwoIb;
    private Button mineTabTwoBtn;
    private ImageButton mineTabThreeIb;
    private Button mineTabThreeBtn;
    private ImageButton mineTabFourIb;
    private Button mineTabFourBtn;
    private TextView mineTab2Coupon;
    private TextView mineTab2Total;
    private TextView mineTab2AccountBalance;
    private RelativeLayout mineItemCollect;
    private ImageView ivMineCollect;
    private TextView mineItemCollectValue;
    private ImageView ivEmIndentCollect;
    private RelativeLayout mineItemTraveler;
    private ImageView ivMineTraveler;
    private TextView mineItemTravelerValue;
    private ImageView ivEmIndentTraveler;
    private RelativeLayout mineItemShareGift;
    private ImageView ivMineShareGift;
    private TextView mineItemShareGiftValue;
    private ImageView ivEmIndentShareGift;
    private RelativeLayout mineItemReputation;
    private ImageView ivMineReputation;
    private TextView mineItemReputationValue;
    private ImageView ivEmIndentReputation;
    private RelativeLayout mineItemCooperation;
    private ImageView ivMineCooperation;
    private TextView mineItemCooperationValue;
    private ImageView ivEmIndentCooperation;
    private RelativeLayout mineItemCleanCache;
    private ImageView ivMineCleanCache;
    private TextView mineItemCleanCacheValue;
    private ImageView ivEmIndentCleanCache;
    private RelativeLayout mineItemUpdate;
    private ImageView ivMineUpdate;
    private TextView mineItemUpdateValue;
    private ImageView ivEmIndentUpdate;
    private RelativeLayout mineItemAbout;
    private ImageView ivMineAbout;
    private TextView mineItemAboutValue;
    private ImageView ivEmIndentAbout;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2016-11-06 17:06:06 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews(View view) {
        mineScrollView = (ObserveScrollView) view.findViewById(R.id.mine_scroll);

        mineTitleBar = (RelativeLayout) view.findViewById(R.id.mine_title_bar);
        mineExitUser = (Button) view.findViewById(R.id.mine_title_btn_exit);

        mineItemUser = (RelativeLayout) view.findViewById(R.id.mine_item_user);

        mineAvatar = (RoundImageView) view.findViewById(R.id.mine_avatar);
        mineItemIndent = (RelativeLayout) view.findViewById(R.id.mine_item_indent);
        ivEmIndent = (ImageView) view.findViewById(R.id.iv_em_indent);

        mineTabOneIb = (ImageButton) view.findViewById(R.id.mine_tab_one_ib);
        mineTabOneBtn = (Button) view.findViewById(R.id.mine_tab_one_btn);
        mineTabTwoIb = (ImageButton) view.findViewById(R.id.mine_tab_two_ib);
        mineTabTwoBtn = (Button) view.findViewById(R.id.mine_tab_two_btn);
        mineTabThreeIb = (ImageButton) view.findViewById(R.id.mine_tab_three_ib);
        mineTabThreeBtn = (Button) view.findViewById(R.id.mine_tab_three_btn);
        mineTabFourIb = (ImageButton) view.findViewById(R.id.mine_tab_four_ib);
        mineTabFourBtn = (Button) view.findViewById(R.id.mine_tab_four_btn);

        mineTab2Coupon = (TextView) view.findViewById(R.id.mine_tab2_coupon);
        mineTab2Total = (TextView) view.findViewById(R.id.mine_tab2_total);
        mineTab2AccountBalance = (TextView) view.findViewById(R.id.mine_tab2_account_balance);

        mineItemCollect = (RelativeLayout) view.findViewById(R.id.mine_item_collect);
        ivMineCollect = (ImageView) view.findViewById(R.id.iv_mine_collect);
        mineItemCollectValue = (TextView) view.findViewById(R.id.mine_item_collect_value);
        ivEmIndentCollect = (ImageView) view.findViewById(R.id.iv_em_indent_collect);

        mineItemTraveler = (RelativeLayout) view.findViewById(R.id.mine_item_traveler);
        ivMineTraveler = (ImageView) view.findViewById(R.id.iv_mine_traveler);
        mineItemTravelerValue = (TextView) view.findViewById(R.id.mine_item_traveler_value);
        ivEmIndentTraveler = (ImageView) view.findViewById(R.id.iv_em_indent_traveler);

        mineItemShareGift = (RelativeLayout) view.findViewById(R.id.mine_item_share_gift);
        ivMineShareGift = (ImageView) view.findViewById(R.id.iv_mine_share_gift);
        mineItemShareGiftValue = (TextView) view.findViewById(R.id.mine_item_share_gift_value);
        ivEmIndentShareGift = (ImageView) view.findViewById(R.id.iv_em_indent_share_gift);

        mineItemReputation = (RelativeLayout) view.findViewById(R.id.mine_item_reputation);
        ivMineReputation = (ImageView) view.findViewById(R.id.iv_mine_reputation);
        mineItemReputationValue = (TextView) view.findViewById(R.id.mine_item_reputation_value);
//         ivEmIndentReputation = (ImageView) view.findViewById(R.id.iv_em_indent_reputation);

        mineItemCooperation = (RelativeLayout) view.findViewById(R.id.mine_item_cooperation);
        ivMineCooperation = (ImageView) view.findViewById(R.id.iv_mine_cooperation);
        mineItemCooperationValue = (TextView) view.findViewById(R.id.mine_item_cooperation_value);
        ivEmIndentCooperation = (ImageView) view.findViewById(R.id.iv_em_indent_cooperation);

        mineItemCleanCache = (RelativeLayout) view.findViewById(R.id.mine_item_clean_cache);
        ivMineCleanCache = (ImageView) view.findViewById(R.id.iv_mine_clean_cache);
        mineItemCleanCacheValue = (TextView) view.findViewById(R.id.mine_item_clean_cache_value);
        ivEmIndentCleanCache = (ImageView) view.findViewById(R.id.iv_em_indent_clean_cache);

        mineItemUpdate = (RelativeLayout) view.findViewById(R.id.mine_item_update);
        ivMineUpdate = (ImageView) view.findViewById(R.id.iv_mine_update);
        mineItemUpdateValue = (TextView) view.findViewById(R.id.mine_item_update_value);
        ivEmIndentUpdate = (ImageView) view.findViewById(R.id.iv_em_indent_update);

        mineItemAbout = (RelativeLayout) view.findViewById(R.id.mine_item_about);
        ivMineAbout = (ImageView) view.findViewById(R.id.iv_mine_about);
        mineItemAboutValue = (TextView) view.findViewById(R.id.mine_item_about_value);
        ivEmIndentAbout = (ImageView) view.findViewById(R.id.iv_em_indent_about);

        mineExitUser.setOnClickListener(this);

        mineItemUser.setOnClickListener(this);

        mineAvatar.setOnClickListener(this);

        mineTabOneIb.setOnClickListener(this);
        mineTabOneBtn.setOnClickListener(this);

        mineItemCollect.setOnClickListener(this);
        mineItemTraveler.setOnClickListener(this);
        mineItemShareGift.setOnClickListener(this);
        mineItemReputation.setOnClickListener(this);
        mineItemCooperation.setOnClickListener(this);
        mineItemCleanCache.setOnClickListener(this);
        mineItemUpdate.setOnClickListener(this);
        mineItemAbout.setOnClickListener(this);

        mineScrollView.setOnTouchListener(this);

        mineAvatar.setOnTouchListener(this);

        mineTabOneIb.setOnTouchListener(this);
        mineTabOneBtn.setOnTouchListener(this);
        mineTabTwoIb.setOnTouchListener(this);
        mineTabTwoBtn.setOnTouchListener(this);
        mineTabThreeIb.setOnTouchListener(this);
        mineTabThreeBtn.setOnTouchListener(this);
        mineTabFourIb.setOnTouchListener(this);
        mineTabFourBtn.setOnTouchListener(this);

        mineItemCollect.setOnTouchListener(this);
        mineItemTraveler.setOnTouchListener(this);
        mineItemShareGift.setOnTouchListener(this);
        mineItemReputation.setOnTouchListener(this);
        mineItemCooperation.setOnTouchListener(this);
        mineItemCleanCache.setOnTouchListener(this);
        mineItemUpdate.setOnTouchListener(this);
        mineItemAbout.setOnTouchListener(this);

        mineScrollView.setScrollListener(new ObserveScrollView.ScrollListener() {
            @Override
            public void scrollOritention(int l, int t, int oldl, int oldt) {
                mineTitleBar.setAlpha(t * 1F / 100);
            }
        });

        mineTitleBar.setAlpha(0);
    }


    @Override
    public void onClick(View v) {
        if (v == (View) mineExitUser) {
            //退出用户
        } else if (v == (View) mineItemUser) {
            //用户行
        } else if (v == (View) mineAvatar) {
            //我的订单
        } else if (v == (View) mineTabOneIb || v == (View) mineTabOneBtn) {
            //待付款
        } else if (v == (View) mineTabTwoIb || v == (View) mineTabTwoBtn) {
            //未出行
        } else if (v == (View) mineTabThreeIb || v == (View) mineTabThreeBtn) {
            //待评价
        } else if (v == (View) mineTabFourIb || v == (View) mineTabFourBtn) {
            //已完成
        } else if (v == (View) mineItemCollect) {
            //我的收藏
        } else if (v == (View) mineItemTraveler) {
            //常用出行人
        } else if (v == (View) mineItemShareGift) {
            //邀请有礼
        } else if (v == (View) mineItemReputation) {
            //好评有礼
        } else if (v == (View) mineItemCooperation) {
            //业务合作
        } else if (v == (View) mineItemCleanCache) {
            //清空缓存
        } else if (v == (View) mineItemUpdate) {
            //检查更新
        } else if (v == (View) mineItemAbout) {
            //关于麦淘
        }

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                if (v == (View) mineTabOneIb || v == (View) mineTabOneBtn) {
                    //待付款
                    startAnim(mineTabOneIb, mineTabOneBtn);
                } else if (v == (View) mineTabTwoIb || v == (View) mineTabTwoBtn) {
                    //未出行
                    startAnim(mineTabTwoIb, mineTabTwoBtn);
                } else if (v == (View) mineTabThreeIb || v == (View) mineTabThreeBtn) {
                    //待评价
                    startAnim(mineTabThreeIb, mineTabThreeBtn);
                } else if (v == (View) mineTabFourIb || v == (View) mineTabFourBtn) {
                    //已完成
                    startAnim(mineTabFourIb, mineTabFourBtn);
                } else if (v != (View) mineScrollView) {
                    v.setBackgroundResource(R.color.mine_item_enable_bg);
                }
                break;
            case MotionEvent.ACTION_MOVE:
            case MotionEvent.ACTION_CANCEL:
            case MotionEvent.ACTION_UP:
                if (v == (View) mineTabOneIb || v == (View) mineTabOneBtn) {
                    //待付款
                    stopAnim(mineTabOneIb, mineTabOneBtn);
                } else if (v == (View) mineTabTwoIb || v == (View) mineTabTwoBtn) {
                    //未出行
                    stopAnim(mineTabTwoIb, mineTabTwoBtn);
                } else if (v == (View) mineTabThreeIb || v == (View) mineTabThreeBtn) {
                    //待评价
                    stopAnim(mineTabThreeIb, mineTabThreeBtn);
                } else if (v == (View) mineTabFourIb || v == (View) mineTabFourBtn) {
                    //已完成
                    stopAnim(mineTabFourIb, mineTabFourBtn);
                } else if (v != (View) mineScrollView) {
                    v.setBackgroundResource(R.color.write);
                }

                break;
        }
        return false;
    }

    private void stopAnim(ImageButton ib, Button btn) {
        ScaleAnimation sa = new ScaleAnimation(0.8F, 1, 0.8F, 1, ib.getWidth() / 2, (ib.getHeight() + btn.getHeight()) / 2);
        runAnim(ib, btn, sa);
    }

    private void startAnim(ImageButton ib, Button btn) {
        ScaleAnimation sa = new ScaleAnimation(1, 0.8F, 1, 0.8F, ib.getWidth() / 2, (ib.getHeight() + btn.getHeight()) / 2);
        runAnim(ib, btn, sa);
    }

    private void runAnim(ImageButton ib, Button btn, ScaleAnimation sa) {
        sa.setDuration(200);
        sa.setFillAfter(true);
        ib.startAnimation(sa);
        btn.startAnimation(sa);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = null;
        if (view == null) {
            view = inflater.inflate(R.layout.fragment_mine, container, false);
            findViews(view);
        }
        v = view;
        return v;
    }

}
