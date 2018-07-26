package com.example.joao.periodicproject.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.joao.periodicproject.R;

/**
 * Created by João Carlos on 7/26/18.
 * Biox Pecuária Moderna
 * desenvolvedorberrante@bioxbr.com
 */
public class WrapperPeriodicElement extends ConstraintLayout {

    private TextView textTop;
    private TextView textMiddle;
    private TextView textBottom;

    private String strTextTop;
    private String strTextMiddle;
    private String strTextBottom;

    public WrapperPeriodicElement(Context context) {
        this(context, null);
    }

    public WrapperPeriodicElement(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.periodic_element, this);

        this.textTop = view.findViewById(R.id.text_top);
        this.textMiddle = view.findViewById(R.id.text_middle);
        this.textBottom = view.findViewById(R.id.text_bottom);

        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.WrapperPeriodicElement, 0, 0);
        try {
            strTextTop = array.getString(R.styleable.WrapperPeriodicElement_textTop);
            strTextMiddle = array.getString(R.styleable.WrapperPeriodicElement_textMiddle);
            strTextBottom = array.getString(R.styleable.WrapperPeriodicElement_textBottom);
        } finally {
            array.recycle();
        }


        textTop.setText(strTextTop);
        textMiddle.setText(strTextMiddle);
        textBottom.setText(strTextBottom);
    }

    public String getTextTop() {
        return strTextTop;
    }

    public String getTextMiddle() {
        return strTextMiddle;
    }

    public String getTextBottom() {
        return strTextBottom;
    }

    public void setTextTop(String text) {
        this.strTextTop = text;
        textTop.setText(strTextTop);
        invalidate();
        requestLayout();
    }

    public void setTextMiddle(String text) {
        this.strTextMiddle = text;
        textMiddle.setText(strTextMiddle);
        invalidate();
        requestLayout();
    }

    public void setTextBottom(String text) {
        this.strTextBottom = text;
        textBottom.setText(strTextBottom);
        invalidate();
        requestLayout();
    }
}
