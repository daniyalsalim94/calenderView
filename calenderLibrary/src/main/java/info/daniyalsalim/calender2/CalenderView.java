package info.daniyalsalim.calender2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CalenderView extends LinearLayout {
    // calendar components

    public GridView gridView;

    public ImageView ivBackMonth;
    public TextView tvMonth;
    public ImageView ivFrwdMonth;




    public CalenderView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initControl(context, attrs);
    }

    private void assignUiElements() {
        // layout is inflated, assign local variables to components

        ivBackMonth = (ImageView)findViewById( R.id.ivBackMonth );
        tvMonth = (TextView)findViewById( R.id.tvMonth );
        ivFrwdMonth = (ImageView)findViewById( R.id.ivFrwdMonth );

        gridView = findViewById(R.id.calendar_grid);
    }

    /**
     * Load control xml layout
     */
    private void initControl(Context context, AttributeSet attrs)
    {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.calender_layout, this);
        assignUiElements();
    }
}
