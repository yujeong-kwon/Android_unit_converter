package com.example.unit_converter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout mTabLayout;
    //PagerAdapter 를 통해 Fragment 와 ViewPager 를 연결
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTabLayout = (TabLayout) findViewById(R.id.tab);

        ViewPager vp = findViewById(R.id.ViewPager);
        VPAdapter adapter = new VPAdapter(getSupportFragmentManager());
        vp.setAdapter(adapter);

        vp.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        // - ViewPager의 페이지가 변경될 때 알려주는 리스너
        //
        // - ViewPager의 페이지가 변경 될 때 TabLayout에도 알려주도록 설정
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}
            @Override
            public void onPageSelected(int position) {}
            @Override
            public void onPageScrollStateChanged(int state) {}
        });
        // - Tab이 선택 되었을 때 알려주는 리스너
        //
        // - onTabSelected() : 탭이 선택 되었을 때, 호출
        //
        // - onTabUnselected() : 탭이 선택되지 않았을 때, 호출
        //
        // - onTabReselected() : 탭이 다시 선택되었을 때, 호출
        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vp.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) { }
            @Override
            public void onTabReselected(TabLayout.Tab tab) { }
        });
    }
}