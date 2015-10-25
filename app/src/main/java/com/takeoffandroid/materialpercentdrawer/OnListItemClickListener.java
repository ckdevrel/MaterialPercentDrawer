package com.takeoffandroid.materialpercentdrawer;

import android.view.View;

/**
 * Created by Chandru-MacBook on 10/23/15.
 */
public interface OnListItemClickListener {


    void openDrawer(View v, int position, MainModel mainModel);

    void closeDrawer(View v, int position, MainModel mainModel);

}
