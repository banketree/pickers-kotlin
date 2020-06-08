package cn.addapp.androidpickers;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import cn.addapp.androidpicker.R;
import cn.addapp.pickers.picker.DatePicker;

public class CustomDatePicker extends DatePicker {
    View view;
    TextView tvTitle;
    TextView tvOk;
    String title;
    String confirm;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        if (null != tvTitle)
            tvTitle.setText(title);
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
        if (null != tvTitle)
            tvOk.setText(confirm);
    }


    public CustomDatePicker(Activity activity) {
        super(activity);
        initTopView();
    }

    public CustomDatePicker(Activity activity, int mode) {
        super(activity, mode);
        initTopView();
    }


//
//    @Nullable
//    @Override
//     protected View makeContentView() {
//        View view = super.makeContentView();
//        return view;
//    }


    @Override
    public View getContentView() {
        return super.getContentView();
    }

    @NonNull
    @Override
    protected View makeCenterView() {
        View view = super.makeCenterView();
//        ((LinearLayout)view.getLayoutParams())
        return view;
    }

    @Nullable
    @Override
    protected View makeHeaderView() {
        setTopLineVisible(false);
        if (null == view) {
            return super.makeHeaderView();
        } else {
            return view;
        }

    }

    private void initTopView() {
        rightRootPadding = 30;
        setBackgroundColor(getContext().getResources().getColor(R.color.colorAccent));
        view = LayoutInflater.from(getContext()).inflate(R.layout.layout_dialog_top_button, null);
        tvTitle = view.findViewById(R.id.tv_title);
        tvOk = view.findViewById(R.id.tv_right);

        tvOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSubmit();
            }
        });
    }

    @Override
    protected void onSubmit() {
        super.onSubmit();
        this.dismiss();
    }
}
