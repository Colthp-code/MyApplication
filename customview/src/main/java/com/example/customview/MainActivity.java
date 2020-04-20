package com.example.customview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 获取布局文件中的LinearLayout容器
        LinearLayout root = findViewById(R.id.root);
        // 创建DrawView组件
        DrawView draw = new DrawView(this);
        // 设置自定义组件的最小宽度、高度
        draw.setMinimumWidth(300);
        draw.setMinimumHeight(500);
        root.addView(draw);
    }
}
